public class Iphone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public Iphone() {
        this.reprodutor = new ReprodutorMusical();
        this.telefone = new AparelhoTelefonico();
        this.navegador = new NavegadorInternet();
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
        Iphone meuiPhone = new Iphone();

        // Exemplo de uso das funcionalidades
        meuiPhone.getReprodutor().selecionarMusica("Nome da Música");
        meuiPhone.getReprodutor().tocar();

        meuiPhone.getTelefone().ligar("123456789");
        meuiPhone.getTelefone().atender();

        meuiPhone.getNavegador().exibirPagina("https://www.exemplo.com");
        meuiPhone.getNavegador().adicionarNovaAba();
    }
}