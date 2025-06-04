public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    // Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Navegador na Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
    
    // Método main para testar
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Shape of You");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("11987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://openai.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}