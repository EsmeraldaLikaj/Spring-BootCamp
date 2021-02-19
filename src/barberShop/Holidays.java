package barberShop;

import java.time.LocalDate;

public enum Holidays {
	
	FESTAT_E_VITIT_TE_RI(LocalDate.of(2021,1,1)), 
	DITA_VERES(LocalDate.of(2021,3,14)), 
	DITA_SULLTAN_NOVRUZIT(LocalDate.of(2021,3,22)), 
	PASHKET_KATOLIKE(LocalDate.of(2021,4,12)), 
	PASHKET_ORTODOKSE(LocalDate.of(2021,4,19)), 
	DITA_NDERKOMBETARE_E_PUNETOREVE(LocalDate.of(2021,5,1)), 
	DITA_E_BAJRAMIT_TE_MADH(LocalDate.of(2021,5,24)),
	DITA_E_KURBAN_BAJRAMIT(LocalDate.of(2021,7,31)),
	DITA_E_SHENJTERIMIT_TE_NENE_TEREZES(LocalDate.of(2021,9,5)),
	DITA_E_FLAMURIT_DHE_PAVARESISE(LocalDate.of(2021,11,28)),
	DITA_E_CLIRIMIT(LocalDate.of(2021,11,29)),
	DITA_KOMBETARE_E_RINISE(LocalDate.of(2021,12,8)),
	KRISHLINDJET(LocalDate.of(2021,12,25));

	private LocalDate holidayDate;
	
	private Holidays(LocalDate holidayDate)
	{
		this.holidayDate=holidayDate;
	}

	public LocalDate getHolidayDate() {
		return holidayDate;
	}
	
}
