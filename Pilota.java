public class Pilota
{
    private String nome;
    private String cognome;
    private String nazionalita;
    private int eta;

    public Pilota (String nome, String cognome, String nazionalita, int eta)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.nazionalita = nazionalita;
        setEta(eta);
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public String getCognome()
    {
        return cognome;
    }
    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }


    public String getNazionalita()
    {
        return nazionalita;
    }
    public void setNazionalita(String nazionalita)
    {
        this.nazionalita = nazionalita;
    }


    public int getEta()
    {
        return eta;
    }
    public void setEta(int eta)
    {
        try{
            if(eta <= 0)
            {
                throw new Exception("L'età non può essere minore o uguasle a 0.");
            }
            this.eta = eta;
        }catch(Exception e)
        {
            System.out.println("Errore: " + e.getMessage());
        }
    }


    // Metodo equals per confronto basato su nome, cognome ed età
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pilota pilota = (Pilota) obj;
        return eta == pilota.eta &&
                nome.equals(pilota.nome) &&
                cognome.equals(pilota.cognome);
    }


    @Override
    public String toString()
    {
        return "Nome: " + nome + "--Cognome: " + cognome + "--Nazionalità: " + nazionalita + "--Età: " + eta;
    }

}
