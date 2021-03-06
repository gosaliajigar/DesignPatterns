package creational.singleton.design.pattern.serialize;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author "Jigar Gosalia"
 *
 */
public class SingletonSerializePattern implements Serializable {

	private static final long serialVersionUID = 1L;

	private SingletonSerializePattern() {
		System.out.println("Instantiated SingletonSerializePattern ... ");
	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * SingletonSerializePattern.getInstance() or the first access
	 * to SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		private static final SingletonSerializePattern INSTANCE = new SingletonSerializePattern();
	}

	/**
	 * @return
	 */
	public static SingletonSerializePattern getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/**
	 * readResolve ensures that object read from file during de-serialization
	 * returns the same instance and not a new instance of singleton object.<br>
	 * <br>
	 * readResolve is called after readObject returns.<br>
	 * <br>
	 * https://docs.oracle.com/javase/8/docs/platform/serialization/spec/input.html
	 * <br><br>
	 * @return
	 */
	protected Object readResolve() throws ObjectStreamException {
	    return getInstance();
	}
}
