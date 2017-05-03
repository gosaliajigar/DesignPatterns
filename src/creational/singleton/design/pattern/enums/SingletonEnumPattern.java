package creational.singleton.design.pattern.enums;

/**
 * 
 * One problem with conventional Singletons are that once you implement
 * serializable interface they are no longer remain Singleton because
 * readObject() method always return a new instance just like constructor in
 * Java. You can avoid that by using readResolve() method and discarding newly
 * created instance by replacing with Singleton.<br>
 * <br>
 * This can become even more complex if your Singleton Class maintain state, as
 * you need to make them transient, but within Enum Singleton, Serialization is
 * guaranteed by JVM. Creation of Enum instance is thread-safe.<br>
 * <br>
 * Given the Serialization and thread-safety guaranteed and with couple of line
 * of code enum Singleton pattern is best way to create Singleton.
 * 
 * 
 * @author "Jigar Gosalia."
 * 
 */
public enum SingletonEnumPattern {

	INSTANCE;

	private SingletonEnumPattern() {}
}
