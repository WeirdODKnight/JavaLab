package com.craft.knowledges.inheritancepolymorphism;

public class InheritanceExample {
	public static void main(String... args) {

//		System.out.println("Sony :: ");
//		Sony s = new Sony();
//		s.play();

		System.out.println("\nPanasonic :: ");
		Panasonic p = new Panasonic();
		p.play();

	}
}
	class Music {

		Music() {
			System.out.println("Music::Initializing song...");
		}

		public void play() {
			System.out.println("Music:: Playing music...");
		}
	}

	class Sony extends Music {

		Sony() {
			System.out.println("Sony operations...");
		}

		

	}

	class Panasonic extends Sony{

		Panasonic() {
			System.out.println("Panasonic operations...");
		}
	}

	






