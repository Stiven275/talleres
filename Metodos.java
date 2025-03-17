import java.util.Stack;

import javax.swing.JOptionPane;

public class Metodos {
    public void LlenarPila() {
        Stack<Tienda> pila = new Stack<>();
        boolean continuar = true;
        String agregar = "";
        while (continuar) {
            Tienda o = new Tienda();
            JOptionPane.showInputDialog("\n** Seleccione la opcion **\n1. Ingresar repuesto\n2. Buscar Repuesto\n3. Modificar repuesto\n4. Eliminar repuesto\n5 Vender repuesto");
            o.setMarca(JOptionPane.showInputDialog("Ingrese la marca"));
            o.setReferencia(JOptionPane.showInputDialog("Ingrese la referencia"));
            o.setCantidad(JOptionPane.showInputDialog("Ingrese la cantidad"));
            o.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));
            pila.push(o);
            agregar = JOptionPane.showInputDialog("Desea agregar mas registros S/N");
            if (agregar.equalsIgnoreCase("N")) {
                continuar = false;
            }

        }
        MostrarPila(pila);
        pila = Eliminar(pila);
        MostrarPila(pila);
    }


public void MostrarPila(Stack<Tienda> pila) {
    for (Tienda o : pila) {
        System.out.println("Marca: " + o.getMarca());
        System.out.println("Referencia " + o.getReferencia());
        System.out.println("Cantidad " + o.getCantidad());
        System.out.println("Precio" + o.getPrecio());
        System.out.println();
    }
}

public Stack<Tienda> Eliminar(Stack<Tienda> pila) {

    String dato = JOptionPane.showInputDialog("Ingrese el registro que desee eliminar");
    for (Tienda o : pila) {
        if (o.getMarca().equalsIgnoreCase(dato)) {
            pila.pop();

        }
    }
    return pila;

}

}