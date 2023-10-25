public class test
{
    public static void main(String[] args)
    {
        address a1 = new address();
        a1.gouvernorat = "tunis";
        a1.ville = "ariana";
        a1.code_postal = 2004;
        System.out.println(a1);
        a1.code_postal = 2074;
        a1.affiche_address();
        address a2 = new address("tunis", "sidibouzid", 9100);
        a2.ville = "sfax";
        a2.affiche_address();
        chercheur ch1 = new chercheur();
        ch1.setnom("ali");
        ch1.setposte("mdw");
        ch1.affiche_chercheur();
        System.out.println(ch1);
        System.out.println((chercheur.NB));
        chercheur ch2 = new chercheur("ahmed", "resaux", 20);
        if (ch1.comparer(ch2))
        {
            System.out.println("cest le meme chercherur");
        }

        chercheur[] ch = new chercheur[]{ch1, ch2};
        bureau b1 = new bureau(100, "b", ch);
        bureau b2 = new bureau(50, "a", ch);
        bureau[] bt = new bureau[]{b1, b2};
        laboratoire l1=new laboratoire("l1", "info", bt, a1);
    }
}
