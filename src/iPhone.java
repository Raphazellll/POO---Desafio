public class iPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    // ReprodutorMusical methods

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // AparelhoTelefonico methods
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // NavegadorInternet methods

    @Override
    public void abrirPagina(String url) {
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

    // Main para testes
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando funcionalidades
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.pausar();

        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.abrirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desligar'");
    }
}
