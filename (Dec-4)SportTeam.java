public class SportTeam{
	public static void main(String[] args)
	{
		Sports sp = new Sports();
		System.out.println(sp.getName());
		sp.getNumberOfTeamMembers();
		
		Sports sp1 = new Soccer();
		System.out.println(sp1.getName());
		sp1.getNumberOfTeamMembers();
	}

}
class Sports
{
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    String getName()
    {
        return "Soccer Class";
    }
 void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has 11 players in " + getName() );
    }
}