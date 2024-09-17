package com;

sealed class SealedTutorial  permits car,bike{
	
	public void go() {
		System.out.println("going");
	}

}

non-sealed class car extends SealedTutorial{
	
}

final class bike extends SealedTutorial {
	
}