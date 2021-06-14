
package refatoracao02;

import java.util.ArrayList;


public interface InterfaceRelatorio {
    public double somaPrecos(ArrayList<Produto> produtos);
    public double aplicarDesconto();
    public void taxaEntrega();
}