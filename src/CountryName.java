
public class CountryName {

	String[] countries;
	public String getCountryName()
	{
		//use random class :P or anything 
		String[] list={"ITALY","INDIA","FRANCE","SPAIN","NIGERIA","EUCADOR","MADAGASCAR","SWITZERLAND","SWEDEN","INDONESIA",
				       "CHINA","GREECE","AUSTRIA","JAMAICA","ARGENTINA","BAHAMAS","BAHARAIN","BRAZIL","COLOMBIA","ENGLAND",
				       "CANADA","GRENADA","GUATEMALA","ETHIOPIA","HONDURAS","ISRAEL","CAMBODIA","GEORGIA","LIECHTENSTEIN","LUXEMBOURG",
				       "MONTENEGRO","MARITANIA","LEBANON","KYRGYSTAN","KAZAKHSTAN","MACEDONIA","NAMIBIA","MICRONESIA","NICARAGUA","PHILIPPINES",
				       "PORTUGAL","PARAGUAY","SEYCHELLES","ROMANIA","PALAU","PANAMA","PAKISTAN","NORWAY","POLAND","RUSSIA",
				       "TANZANIA","THAILAND","UGANDA","UZBEKISTAN","VENEZULA","ZIMBABWE","TOGO","TUNISIA","VIETNAM","SENEGAL",
				       "SCOTLAND","SLOVENIA","SLOVEKIA","DENMARK"};
		int x=(int)Math.random()*(list.length);
		return list[x];
	}
	public char getCharOfCountry(String country)
	{
		//your code here. make it so that if the country is india it should send each char only once
		return 'c';
	}
}
