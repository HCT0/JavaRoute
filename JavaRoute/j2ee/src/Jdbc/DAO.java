package Jdbc;
import LOL.*;
import java.util.*;

/*
 * DAO ²ãµÄ½Ó¿Ú
 * 
 * 
 * */
public interface DAO {
	public void add(Hero hero);
	public void update(Hero hero);
	public void delete(int id);
	public Hero get(int id);
	public List<Hero> List();
	public List<Hero> list(int start ,int count);
}
