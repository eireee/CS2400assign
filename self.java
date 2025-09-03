
public class self{
    private int hp; 
    private int atk;
    private int def;
    private String name;

    public self()
    {
        name = "Iris";
        hp = 100;
        atk = 5; 
        def = 5;
    }
    public self(String name, int hp, int atk, int def)
    {
        this.name = name; 
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void sethp(int hp)
    {
        this.hp = hp;
    }
    public void setatk(int atk)
    {
        this.atk = atk;
    }
    public void setdef(int def)
    {
        this.def = def;
    }

    public String getname()
    {
        return name;
    }
    public int gethp()
    {
        return hp;
    }
    public int getatk()
    {
        return atk;
    }
    public int getdef()
    {
        return def;
    }
    public void info()
    {
        System.out.println("Stats: ");
        System.out.println("Name: " + getname());
        System.out.println("HP: " + gethp());
        System.out.println("ATK: " + getatk());
        System.out.println("DEF: " + getdef());
    };
}