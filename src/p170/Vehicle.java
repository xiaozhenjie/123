package p170;

interface Vehicle {
	int power=1;
	void fire();
	void flameout();
	void left();
	void right();
}
interface Intercarry{
	double weight=1;
	double carry();
}
interface Interpassenger{
	int person=1;
	int passenger();
}