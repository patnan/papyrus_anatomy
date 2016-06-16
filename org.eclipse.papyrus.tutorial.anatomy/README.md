# This plugin contains all the core of the Anatomy DSML

## How to

Here is the list of elements that should be regenerated when changing the profile

### Re-Generate the static profile
The "static profile" is the java code contained in src-gen directory
 - Open the profiles\anatomy.genmodel file
 - Right click on the root Anatomy
 - Select the "Reload..." menu
 - Select UML model
 - Valid "Ok" the warning pop-up 
(These are valid warnings that can be solved to fine tune the java generation)
 - Click "Next"
 - Click "Finish"
=> the profiles\Anatomy.ecore file should be modified
 - Right click on the root Anatomy
 - Select "Generate Model Code"
=> the java code in src-gen directory should be modified

### Re-Generate the semantic element types
 - open the profile with Papyrus
 - open the model explorer view
 - Right click on the root Anatomy
 - Select "Generate Tooling Model\Element types..."
 - Select the base element type set UMLElementTypeSet
 - Set the parent folder types
 - Set the file name anatomy-gen.elementtypesconfigurations
 - Click Finish
 => the file anatomy-gen.elementtypesconfigurations should be modified
 
### Re-Generate the diagramatic element types
 - open the profile with Papyrus
 - open the model explorer view
 - Right click on the root Anatomy
 - Select "Generate Tooling Model\Element types..."
 - Select the base element type set UMLDIElementTypeSet
 - Set the parent folder types
 - Set the file name anatomydi-gen.elementtypesconfigurations
 - Click Finish
 - open the anatomydi-gen.elementtypesconfigurations file
 - Replace all "identifier="org.eclipse.papyrus.tutorial.anatomy." by "identifier="org.eclipse.papyrus.tutorial.anatomydi." 
(It's recommended to easily differenciate the diagrammatic elements from the semantic ones) 
 => the file anatomydi-gen.elementtypesconfigurations should be modified
  
