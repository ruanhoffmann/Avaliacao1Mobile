/* (a)
Implemente uma classe `Quadrado`, que possui um atributo 
`lado` de tipo `double`.

Implemente um construtor que preenche
o atributo `lado`.

Faça com que essa classe __implemente__ a
interface `Geometria`.
*/
public class Quadrado implements  Geometria{

    //atributo:
    double lado;

    //construtor:
    public Quadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public double getArea() {
        return (lado*lado)/2;
    }
}
