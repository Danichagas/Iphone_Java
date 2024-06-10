import entities.InternetBrowser;
import entities.MusicPlayer;
import entities.Telephone;

class Iphone implements MusicPlayer, Telephone, InternetBrowser {

    @Override
    public void sound() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");
    }

    @Override
    public void chooseMusic(String music) {
        System.out.println("Música selecionada " + music);
    }

    @Override
    public void toConnect(String number) {
        System.out.println("Ligando para " + number);
    }

    @Override
    public void toMeet() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void updatePage() {
        System.out.println("Página atualizada");
    }

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        // Methods MusicPlayer
        iphone.chooseMusic("Imagine - John Lennon");
        iphone.sound();
        iphone.pause();

        System.out.println();

        // Methods Telephone
        iphone.toConnect("123-456-7890");
        iphone.toMeet();
        iphone.startVoicemail();

        System.out.println();

        // Methods InternetBrowser
        iphone.displayPage("https://www.example.com");
        iphone.addNewTab();
        iphone.updatePage();
    }
}