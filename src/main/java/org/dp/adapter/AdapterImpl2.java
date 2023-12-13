package org.dp.adapter;

import org.dp.ancienne.AncienneImpl;

public class AdapterImpl2 implements Standard{
    private AncienneImpl ancienne = new AdapterImpl();
    @Override
    public void operation(double n1, double n2) {
        double p = ancienne.produit(n1,n2);
        ancienne.afficher(p);
    }
}
