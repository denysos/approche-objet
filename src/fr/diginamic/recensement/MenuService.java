package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.recensementexceptions.DepartementInconnuException;
import fr.diginamic.recensementexceptions.NombreIncorrectException;

public abstract class MenuService {
	public abstract void traiter() throws DepartementInconnuException, NombreIncorrectException;
}
