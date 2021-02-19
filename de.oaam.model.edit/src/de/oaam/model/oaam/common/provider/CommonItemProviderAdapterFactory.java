/**
 */
package de.oaam.model.oaam.common.provider;

import de.oaam.model.oaam.common.util.CommonAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonItemProviderAdapterFactory extends CommonAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.AttributeString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeStringItemProvider attributeStringItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.AttributeString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeStringAdapter() {
		if (attributeStringItemProvider == null) {
			attributeStringItemProvider = new AttributeStringItemProvider(this);
		}

		return attributeStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.AttributeNumeric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeNumericItemProvider attributeNumericItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.AttributeNumeric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeNumericAdapter() {
		if (attributeNumericItemProvider == null) {
			attributeNumericItemProvider = new AttributeNumericItemProvider(this);
		}

		return attributeNumericItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.AttributeContainment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeContainmentItemProvider attributeContainmentItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.AttributeContainment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeContainmentAdapter() {
		if (attributeContainmentItemProvider == null) {
			attributeContainmentItemProvider = new AttributeContainmentItemProvider(this);
		}

		return attributeContainmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.AttributeReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeReferenceItemProvider attributeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.AttributeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeReferenceAdapter() {
		if (attributeReferenceItemProvider == null) {
			attributeReferenceItemProvider = new AttributeReferenceItemProvider(this);
		}

		return attributeReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.BoolOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolOperationItemProvider boolOperationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.BoolOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoolOperationAdapter() {
		if (boolOperationItemProvider == null) {
			boolOperationItemProvider = new BoolOperationItemProvider(this);
		}

		return boolOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.BoolNot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolNotItemProvider boolNotItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.BoolNot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoolNotAdapter() {
		if (boolNotItemProvider == null) {
			boolNotItemProvider = new BoolNotItemProvider(this);
		}

		return boolNotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.Integer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerItemProvider integerItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerAdapter() {
		if (integerItemProvider == null) {
			integerItemProvider = new IntegerItemProvider(this);
		}

		return integerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.Array} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayItemProvider arrayItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.Array}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrayAdapter() {
		if (arrayItemProvider == null) {
			arrayItemProvider = new ArrayItemProvider(this);
		}

		return arrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.Struct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructItemProvider structItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.Struct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructAdapter() {
		if (structItemProvider == null) {
			structItemProvider = new StructItemProvider(this);
		}

		return structItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.FloatingPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatingPointItemProvider floatingPointItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.FloatingPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloatingPointAdapter() {
		if (floatingPointItemProvider == null) {
			floatingPointItemProvider = new FloatingPointItemProvider(this);
		}

		return floatingPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.Byte} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByteItemProvider byteItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.Byte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createByteAdapter() {
		if (byteItemProvider == null) {
			byteItemProvider = new ByteItemProvider(this);
		}

		return byteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.Character} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterItemProvider characterItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.Character}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacterAdapter() {
		if (characterItemProvider == null) {
			characterItemProvider = new CharacterItemProvider(this);
		}

		return characterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.Boolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanItemProvider booleanItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAdapter() {
		if (booleanItemProvider == null) {
			booleanItemProvider = new BooleanItemProvider(this);
		}

		return booleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.common.SystemBelongingElementA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemBelongingElementAItemProvider systemBelongingElementAItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.common.SystemBelongingElementA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemBelongingElementAAdapter() {
		if (systemBelongingElementAItemProvider == null) {
			systemBelongingElementAItemProvider = new SystemBelongingElementAItemProvider(this);
		}

		return systemBelongingElementAItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (attributeStringItemProvider != null) attributeStringItemProvider.dispose();
		if (attributeNumericItemProvider != null) attributeNumericItemProvider.dispose();
		if (attributeContainmentItemProvider != null) attributeContainmentItemProvider.dispose();
		if (attributeReferenceItemProvider != null) attributeReferenceItemProvider.dispose();
		if (boolOperationItemProvider != null) boolOperationItemProvider.dispose();
		if (boolNotItemProvider != null) boolNotItemProvider.dispose();
		if (integerItemProvider != null) integerItemProvider.dispose();
		if (arrayItemProvider != null) arrayItemProvider.dispose();
		if (structItemProvider != null) structItemProvider.dispose();
		if (floatingPointItemProvider != null) floatingPointItemProvider.dispose();
		if (byteItemProvider != null) byteItemProvider.dispose();
		if (characterItemProvider != null) characterItemProvider.dispose();
		if (booleanItemProvider != null) booleanItemProvider.dispose();
		if (systemBelongingElementAItemProvider != null) systemBelongingElementAItemProvider.dispose();
	}

}
