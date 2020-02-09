/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author kraczlam5898
 */
public class LengthAtLeast implements Criterion{

    private int parameter;

    public LengthAtLeast(int parameter) {
        this.parameter = parameter;
    }
    
    @Override
    public boolean complies(String line) {
        if(line.length() >= parameter){
            return true;
        }
        return false;
    }
    
}
