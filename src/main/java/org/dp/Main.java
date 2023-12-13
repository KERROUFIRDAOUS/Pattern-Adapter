package org.dp;

import org.dp.adapter.AdapterImpl;
import org.dp.adapter.AdapterImpl2;
import org.dp.adapter.StandardImpl;

public class Main {
    public static void main(String[] args) {
        //Implémentation standard
        Client client = new Client();
        client.setStandard(new StandardImpl());
        client.traitement(7,4);

        //Implémentation Adapté en utilisant l'héritage
        Client client1 = new Client();
        client1.setStandard(new AdapterImpl());
        client1.traitement(7,4);

        //Implémentation Adapté en utilisant la composition
        Client client2 = new Client();
        client2.setStandard(new AdapterImpl2());
        client2.traitement(7,4);
    }
}