/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;

/**
 *
 * @author kraczlam5898
 */
public class AtLeastOne implements Criterion {

    private Criterion[] criteria;

    public AtLeastOne(Criterion... criteria) {
        this.criteria = criteria;
    }

    public boolean complies(String line) {
        for (Criterion c : criteria) {
            if (c.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
