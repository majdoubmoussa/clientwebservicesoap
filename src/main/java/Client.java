import proxy.BanqueW;
import proxy.BanqueWS;

public class Client {
    public static void main(String[] args) {


        BanqueW proxy = new BanqueWS().getBanqueWPort();
        System.out.println(proxy.conversionEuroToDH(11));
        System.out.println(proxy.getCompte(1).getSolde());
        System.out.println(proxy.getComptes().get(1).getDateCreation());

    }
}
