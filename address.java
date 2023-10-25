public class address
{
    String gouvernorat;
    String ville;
    int code_postal;
    public address(){}
    public address(String G,String V,int CP)
    {
        this.gouvernorat=G;
        this.ville=V;
        this.code_postal=CP;
    }
    public void affiche_address()
    {
        System.out.println("le gouvernorat  "+this.gouvernorat);
        System.out.println("la ville   "+this.ville);
        System.out.println("code_postal  "+this.code_postal);
    }
    public String toString()
    {
        return "gouvernorat:"+this.gouvernorat+"  "+"ville:"+this.ville+"  "+"code_postal:"+code_postal;
    }

}


