public class Auto
{
    private String scuderia;
    private String pilota;
    private int cilindrata;

    public Auto(String scuderia, String pilota, int cilindrata)
    {
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.cilindrata = cilindrata;
    }

    public String getScuderia()
    {
        return scuderia;
    }
    public void setScuderia(String scuderia)
    {
        this.scuderia = scuderia;
    }


    public String getPilota()
    {
        return pilota;
    }
    public void setPilota(String pilota)
    {
        this.pilota = pilota;
    }

    public int getCilindrata()
    {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata)
    {
        try{
            if(cilindrata <= 0)
            {
                throw new Exception("La cilindrata non può essere minore o uguale a 0!");
            }
            this.cilindrata = cilindrata;
        }catch(Exception e)
        {
            System.out.println("Errore: " + e.getMessage());
        }
    }


    // Metodo equals per confronto basato su scuderia, pilota e cilindrata
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Auto auto = (Auto) obj;
        return cilindrata == auto.cilindrata &&
                scuderia.equals(auto.scuderia) &&
                pilota.equals(auto.pilota);
    }


    @Override
    public String toString()
    {
        return "Scuderia: " + scuderia + "--Pilota: " + pilota + "--Cilindrata: " + cilindrata;
    }


}
