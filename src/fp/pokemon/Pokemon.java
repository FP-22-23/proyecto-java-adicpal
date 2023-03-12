package fp.pokemon;
import java.time.LocalDate;

import fp.utiles.Checkers;

public class Pokemon implements Comparable<Pokemon> {

	private String name;
	private Integer pokedexNum;
	private FirstType type1;
	private Boolean devpsFav;
	private LocalDate designDate;
	private Double shinyRate;
	private Integer attack;
	private Integer spAttack;
	private List<Integer> catchRoutes;
	
	private Pokemon_Total_defense total_defense;
	
	public Pokemon(String name, Integer pokedexNum, FirstType type1, 
	Boolean devpsFav, LocalDate designDate, Double shinyRate, Integer attack,  		
	Integer spAttack, List<Integer> catchRoutes) {
		
		this.name = name;
		this.pokedexNum = pokedexNum;
		this.type1 = type1;
		this.devpsFav = devpsFav;
		this.designDate = designDate;
		this.shinyRate = shinyRate;
		this.catchRoutes = new LinkedList<Integer>();
		this.attack = attack;
		this.spAttack = spAttack;
		this.total_defense = total_defense;
		Checkers.check("El pokemon debe tener un número de pokedex", !pokedexNum.equals(""));
		Checkers.check("El ratio de shiny debe ser menor que 1", shinyRate<1);
		Checkers.check("El número de la pokedex debe ser anterior al 152", pokedexNum<152);
	}
	public Integer PokemonTotalAttack() {
		Integer TotalAttack = (attack+spAttack);
		return TotalAttack.intValue();
	}
	public String getname() {
		return name;
	}
	public Integer getpokedexNum() {
		return pokedexNum;
	}
	public FirstType gettype1() {
		return type1;
	}
	public Boolean getdevpsFav() {
		return devpsFav;
	}
	public LocalDate designDate() {
		return designDate;
	}
	public Double getshinyRate() {
		return shinyRate;
	}
	public Integer attack() {
		return attack;
	}
	public Integer spAttack() {
		return spAttack;
	}
	public List<Integer> catchRoutes() {
		return catchRoutes;
	}
	public Pokemon_Total_defense getPokemon_Total_defense() {
		return total_defense;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public void setpokedexNum(Integer pokedexNum) {
		Checkers.check("El pokemon debe tener un número de pokedex", !pokedexNum.equals(""));
		Checkers.check("El número de la pokedex debe ser anterior al 152", pokedexNum<152);
		this.pokedexNum = pokedexNum;
	}
	public void settype1(FirstType type1) {
		this.type1 = type1;
	}
	public void setdevpsFav(Boolean devpsFav) {
		this.devpsFav = devpsFav;
	}
	public void setdesignDate(LocalDate designDate) {
		this.designDate = designDate;
	}
	public void setshinyRate(Double shinyRate) {
		Checkers.check("El ratio de shiny debe ser menor que 1", shinyRate<1);
		this.shinyRate = shinyRate;
	}
	public void setcatchRoutes(List<Integer> catchRoutes) {
		this.catchRoutes = catchRoutes;
	}
	public void Pokemon_Total_defense(Pokemon_Total_defense total_defense) {
		this.total_defense = total_defense;
	}
	
}
