public class bureau
{
    public int code;
    public String nom;
    public chercheur C[] ;
    public bureau(){}
    public bureau(int code, String nom, chercheur C[])
    {
        this.code = code;
        this.nom = nom;
        this.C= new chercheur[5];
        this.C=C;
    }

    public void affiche_bureau() {
        System.out.println("Code: " + this.code);
        System.out.println("Nom: " + this.nom);
        int i;
        for (i=0;i<C.length;i++)
        {
            this.C[i].affiche_chercheur();
        }
    }
    public String toString()
    {
        String result="code"+this.code+"nom"+this.nom;
        int i;
        for(i=0;i<C.length;i++)
        {
            result+=this.C[i].toString();
        }
        return result;
    }
}
