package org.eclipse.papyrus.tutorial.anatomy.types.advices;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import Anatomy.Type;
import Anatomy.WorkPart;

public class WorkItemAdvice extends AbstractEditHelperAdvice {

	@Override
	protected org.eclipse.gmf.runtime.common.core.command.ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		final Element clazz = (Element) request.getElementToConfigure();	
		return new ConfigureElementCommand(request) {
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				 WorkPart stereotypeApplication = UMLUtil.getStereotypeApplication(clazz, WorkPart.class);
				 stereotypeApplication.setType(Type.WORK_ITEM);
				return CommandResult.newOKCommandResult(clazz);
			}
		};
	}
	
}
