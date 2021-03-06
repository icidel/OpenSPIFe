/**
 * generated by Xtext
 */
package gov.nasa.ensemble.dictionary.xtext.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class XDictionaryLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public XDictionaryLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
