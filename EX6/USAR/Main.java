import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) throws Exception {
        Carro jorge = new Carro("muito bom", 2001);
        // Carrega a classe desejada usando um URLClassLoader
        Class<?> classe = jorge.getClass();

        // Obtém todos os métodos da classe usando a reflexão
        Method[] metodos = classe.getDeclaredMethods();
        for (Method metodo : metodos) {
            System.out.println("Método da classe carro: ");
            System.out.println(metodo.getName());
        }
    }
}