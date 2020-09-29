/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`.

Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles).

Deve ter um método privado `embaralharCartas()` que chama o método 
`embaralha()` do `Baralho`, um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`).

Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na mesa (distribui uma carta do baralho e atribui a
`cartaVirada`). Esses métodos que você implementar, 
vão complementar a classe truco.

Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/
public class Truco {
    //atributos:
    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baraTruco;
    private Carta cartaVirada;

    //contrutor:

    public Truco(){
        this.jogador1 = new Jogador();
        this.jogador2 = new Jogador();
        this.baraTruco = new Baralho();
        this.cartaVirada = cartaVirada;
    }

    private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }

    private void inicializaManilha() {
        cartaVirada = baraTruco.distribuir();

    }

    private void distribuiMaos() {


       baraTruco.distribuir();

    }

    private void embaralhaCartas() {
        Baralho b = new Baralho();
        b.embaralhar();
    }
}
