package org.eclipse.papyrus.tutorial.anatomy.types.matchers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Stereotype;

public class WorkItemMatcher implements org.eclipse.gmf.runtime.emf.type.core.IElementMatcher {
	private static final String STEREOTYPE_PROPERTY__TYPE_VALUE = "WorkItem";
	private static final String STEREOTYPE_PROPERTY__TYPE = "type";
	private static final String ANATOMY_WORK_PART = "Anatomy::WorkPart";

	@Override
	public boolean matches(EObject eObject) {
		if (eObject instanceof Element) {
			Element element = (Element) eObject;			
			if (hasStereotype(element, ANATOMY_WORK_PART)) {
				Stereotype stereotype = element.getAppliedStereotype(ANATOMY_WORK_PART);
				if (stereotype != null) {
					Object obj = element.getValue(stereotype, STEREOTYPE_PROPERTY__TYPE);
					if ((obj != null) && ((obj instanceof EnumerationLiteral))) {
						EnumerationLiteral type = (EnumerationLiteral)obj;						
						return type.getName().equals(STEREOTYPE_PROPERTY__TYPE_VALUE);
					}
				}
			}
		}
		return false;
	}

	private boolean hasStereotype(Element element,String stereotyp) {
		Stereotype st = element.getAppliedStereotype(stereotyp);
		return (st != null);
	}
}
