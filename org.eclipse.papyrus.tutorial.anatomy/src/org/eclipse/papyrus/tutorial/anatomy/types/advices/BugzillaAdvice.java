package org.eclipse.papyrus.tutorial.anatomy.types.advices;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class BugzillaAdvice extends AbstractEditHelperAdvice {
	private static final String STEREOTYPE_PROPERTY__TYPE_VALUE = "Bugzilla";
	private static final String STEREOTYPE_PROPERTY__TYPE = "type";
	private static final String ANATOMY_WORK_PART = "Anatomy::WorkPart";

	@Override
	protected org.eclipse.gmf.runtime.common.core.command.ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		final Element clazz = (Element) request.getElementToConfigure();	
		return new ConfigureElementCommand(request) {
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				if (clazz.getAppliedStereotype(ANATOMY_WORK_PART) == null) {
					Stereotype stereotype = clazz.getApplicableStereotype(ANATOMY_WORK_PART);
					if (stereotype != null) {
						clazz.applyStereotype(stereotype);
						clazz.setValue(stereotype, STEREOTYPE_PROPERTY__TYPE, STEREOTYPE_PROPERTY__TYPE_VALUE);			    	  
					}
				}
				return CommandResult.newOKCommandResult(clazz);
			}
		};
	}
}
