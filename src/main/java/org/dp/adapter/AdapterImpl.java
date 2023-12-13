package org.dp.adapter;

import org.dp.ancienne.AncienneImpl;

public class AdapterImpl extends AncienneImpl implements Standard{
    @Override
    public void operation(double n1, double n2) {
        double p = produit(n1,n2);
        afficher(p);
    }
}
