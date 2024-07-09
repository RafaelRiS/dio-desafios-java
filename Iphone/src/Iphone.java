public class Iphone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public Iphone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    // Métodos de acesso aos componentes do iPhone
    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }

    public AparelhoTelefonico getTelefone() {
        return telefone;
    }

    public NavegadorInternet getNavegador() {
        return navegador;
    }

    public static void main(String[] args) {

        ReprodutorMusical meuReprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico meuTelefone = new AparelhoTelefonicoImpl();
        NavegadorInternet meuNavegador = new NavegadorInternetImpl();

        Iphone meuiPhone = new Iphone(meuReprodutor, meuTelefone, meuNavegador);

        // Requisitando funcionalidades
        meuiPhone.getReprodutor().selecionarMusica("Coldabank - Heart Strings (The Writers Block Remix)");
        meuiPhone.getReprodutor().tocar();

        meuiPhone.getTelefone().ligar("4002-8922");
        meuiPhone.getTelefone().atender();

        meuiPhone.getNavegador().exibirPagina("www.linkedin.com/in/rafaelribeiroti");
        meuiPhone.getNavegador().adicionarNovaAba();
    }
}
