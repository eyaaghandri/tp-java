public class chercheur
{
    private String nom;
    private String poste;
    private int num;
    static int NB;
    public chercheur()
    {
        NB++;
    }
    public chercheur(String N,String P,int NUM)
    {
        this.poste=P;
        this.nom=N;
        this.num=NUM;
        NB++;
    }
    public void affiche_chercheur()
    {
        System.out.println("nom:"+this.nom+"  "+"poste:"+this.poste+"  "+"num:"+this.num);
    }
    public String toSting()
    {
        return "nom:"+this.nom+"  "+"poste:"+this.poste+"  "+"num:"+this.num;
    }
    public boolean comparer(chercheur ch)
    {
        return (this.nom==ch.nom) && (this.num==ch.num) && (this.poste==ch.poste);
    }

    public void setnom(String nom)
    {
        this.nom = nom;
    }

    public String getnom()
    {
        return this.nom;
    }
    public void setposte(String poste)
    {
        this.poste = poste;
    }

    public String getposte()
    {
        return this.poste;
    }
}