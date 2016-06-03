// Generated from D:/study/10/trpo/f4j/grammar\Java.g4 by ANTLR 4.5.1
package com.kspt.khandygo.antlr.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link JavaParser#compilationUnit}.
   * @param ctx the parse tree
   */
  void enterCompilationUnit(JavaParser.CompilationUnitContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#compilationUnit}.
   * @param ctx the parse tree
   */
  void exitCompilationUnit(JavaParser.CompilationUnitContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#importDeclarations}.
   * @param ctx the parse tree
   */
  void enterImportDeclarations(JavaParser.ImportDeclarationsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#importDeclarations}.
   * @param ctx the parse tree
   */
  void exitImportDeclarations(JavaParser.ImportDeclarationsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#typeDeclarations}.
   * @param ctx the parse tree
   */
  void enterTypeDeclarations(JavaParser.TypeDeclarationsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#typeDeclarations}.
   * @param ctx the parse tree
   */
  void exitTypeDeclarations(JavaParser.TypeDeclarationsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#packageDeclaration}.
   * @param ctx the parse tree
   */
  void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#packageDeclaration}.
   * @param ctx the parse tree
   */
  void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotations}.
   * @param ctx the parse tree
   */
  void enterAnnotations(JavaParser.AnnotationsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotations}.
   * @param ctx the parse tree
   */
  void exitAnnotations(JavaParser.AnnotationsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#importDeclaration}.
   * @param ctx the parse tree
   */
  void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#importDeclaration}.
   * @param ctx the parse tree
   */
  void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#typeDeclaration}.
   * @param ctx the parse tree
   */
  void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#typeDeclaration}.
   * @param ctx the parse tree
   */
  void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#classOrInterfaceModifiers}.
   * @param ctx the parse tree
   */
  void enterClassOrInterfaceModifiers(JavaParser.ClassOrInterfaceModifiersContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#classOrInterfaceModifiers}.
   * @param ctx the parse tree
   */
  void exitClassOrInterfaceModifiers(JavaParser.ClassOrInterfaceModifiersContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#modifier}.
   * @param ctx the parse tree
   */
  void enterModifier(JavaParser.ModifierContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#modifier}.
   * @param ctx the parse tree
   */
  void exitModifier(JavaParser.ModifierContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#classOrInterfaceModifier}.
   * @param ctx the parse tree
   */
  void enterClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#classOrInterfaceModifier}.
   * @param ctx the parse tree
   */
  void exitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#variableModifier}.
   * @param ctx the parse tree
   */
  void enterVariableModifier(JavaParser.VariableModifierContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#variableModifier}.
   * @param ctx the parse tree
   */
  void exitVariableModifier(JavaParser.VariableModifierContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
   * @param ctx the parse tree
   */
  void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
   * @param ctx the parse tree
   */
  void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#typeParameters}.
   * @param ctx the parse tree
   */
  void enterTypeParameters(JavaParser.TypeParametersContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#typeParameters}.
   * @param ctx the parse tree
   */
  void exitTypeParameters(JavaParser.TypeParametersContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenTypeParameterList}.
   * @param ctx the parse tree
   */
  void enterCommaThenTypeParameterList(JavaParser.CommaThenTypeParameterListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenTypeParameterList}.
   * @param ctx the parse tree
   */
  void exitCommaThenTypeParameterList(JavaParser.CommaThenTypeParameterListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#typeParameter}.
   * @param ctx the parse tree
   */
  void enterTypeParameter(JavaParser.TypeParameterContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#typeParameter}.
   * @param ctx the parse tree
   */
  void exitTypeParameter(JavaParser.TypeParameterContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#typeBound}.
   * @param ctx the parse tree
   */
  void enterTypeBound(JavaParser.TypeBoundContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#typeBound}.
   * @param ctx the parse tree
   */
  void exitTypeBound(JavaParser.TypeBoundContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#ampThenTypeList}.
   * @param ctx the parse tree
   */
  void enterAmpThenTypeList(JavaParser.AmpThenTypeListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#ampThenTypeList}.
   * @param ctx the parse tree
   */
  void exitAmpThenTypeList(JavaParser.AmpThenTypeListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#enumDeclaration}.
   * @param ctx the parse tree
   */
  void enterEnumDeclaration(JavaParser.EnumDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#enumDeclaration}.
   * @param ctx the parse tree
   */
  void exitEnumDeclaration(JavaParser.EnumDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#enumConstants}.
   * @param ctx the parse tree
   */
  void enterEnumConstants(JavaParser.EnumConstantsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#enumConstants}.
   * @param ctx the parse tree
   */
  void exitEnumConstants(JavaParser.EnumConstantsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenEnumConstantList}.
   * @param ctx the parse tree
   */
  void enterCommaThenEnumConstantList(JavaParser.CommaThenEnumConstantListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenEnumConstantList}.
   * @param ctx the parse tree
   */
  void exitCommaThenEnumConstantList(JavaParser.CommaThenEnumConstantListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#enumConstant}.
   * @param ctx the parse tree
   */
  void enterEnumConstant(JavaParser.EnumConstantContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#enumConstant}.
   * @param ctx the parse tree
   */
  void exitEnumConstant(JavaParser.EnumConstantContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
   * @param ctx the parse tree
   */
  void enterEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
   * @param ctx the parse tree
   */
  void exitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#classBodyDeclarations}.
   * @param ctx the parse tree
   */
  void enterClassBodyDeclarations(JavaParser.ClassBodyDeclarationsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#classBodyDeclarations}.
   * @param ctx the parse tree
   */
  void exitClassBodyDeclarations(JavaParser.ClassBodyDeclarationsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#interfaceDeclaration}.
   * @param ctx the parse tree
   */
  void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
   * @param ctx the parse tree
   */
  void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#typeList}.
   * @param ctx the parse tree
   */
  void enterTypeList(JavaParser.TypeListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#typeList}.
   * @param ctx the parse tree
   */
  void exitTypeList(JavaParser.TypeListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenTypeList}.
   * @param ctx the parse tree
   */
  void enterCommaThenTypeList(JavaParser.CommaThenTypeListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenTypeList}.
   * @param ctx the parse tree
   */
  void exitCommaThenTypeList(JavaParser.CommaThenTypeListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#classBody}.
   * @param ctx the parse tree
   */
  void enterClassBody(JavaParser.ClassBodyContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#classBody}.
   * @param ctx the parse tree
   */
  void exitClassBody(JavaParser.ClassBodyContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#interfaceBody}.
   * @param ctx the parse tree
   */
  void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#interfaceBody}.
   * @param ctx the parse tree
   */
  void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#interfaceBodyDeclarations}.
   * @param ctx the parse tree
   */
  void enterInterfaceBodyDeclarations(JavaParser.InterfaceBodyDeclarationsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#interfaceBodyDeclarations}.
   * @param ctx the parse tree
   */
  void exitInterfaceBodyDeclarations(JavaParser.InterfaceBodyDeclarationsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#classBodyDeclaration}.
   * @param ctx the parse tree
   */
  void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#classBodyDeclaration}.
   * @param ctx the parse tree
   */
  void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#modifiers}.
   * @param ctx the parse tree
   */
  void enterModifiers(JavaParser.ModifiersContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#modifiers}.
   * @param ctx the parse tree
   */
  void exitModifiers(JavaParser.ModifiersContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#memberDeclaration}.
   * @param ctx the parse tree
   */
  void enterMemberDeclaration(JavaParser.MemberDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#memberDeclaration}.
   * @param ctx the parse tree
   */
  void exitMemberDeclaration(JavaParser.MemberDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#methodDeclaration}.
   * @param ctx the parse tree
   */
  void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#methodDeclaration}.
   * @param ctx the parse tree
   */
  void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#squareBracketsList}.
   * @param ctx the parse tree
   */
  void enterSquareBracketsList(JavaParser.SquareBracketsListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#squareBracketsList}.
   * @param ctx the parse tree
   */
  void exitSquareBracketsList(JavaParser.SquareBracketsListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#genericMethodDeclaration}.
   * @param ctx the parse tree
   */
  void enterGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#genericMethodDeclaration}.
   * @param ctx the parse tree
   */
  void exitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#constructorDeclaration}.
   * @param ctx the parse tree
   */
  void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#constructorDeclaration}.
   * @param ctx the parse tree
   */
  void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#genericConstructorDeclaration}.
   * @param ctx the parse tree
   */
  void enterGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#genericConstructorDeclaration}.
   * @param ctx the parse tree
   */
  void exitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
   * @param ctx the parse tree
   */
  void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
   * @param ctx the parse tree
   */
  void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
   * @param ctx the parse tree
   */
  void enterInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
   * @param ctx the parse tree
   */
  void exitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
   * @param ctx the parse tree
   */
  void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
   * @param ctx the parse tree
   */
  void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#constDeclaration}.
   * @param ctx the parse tree
   */
  void enterConstDeclaration(JavaParser.ConstDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#constDeclaration}.
   * @param ctx the parse tree
   */
  void exitConstDeclaration(JavaParser.ConstDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenConstantDeclarationList}.
   * @param ctx the parse tree
   */
  void enterCommaThenConstantDeclarationList(JavaParser.CommaThenConstantDeclarationListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenConstantDeclarationList}.
   * @param ctx the parse tree
   */
  void exitCommaThenConstantDeclarationList(JavaParser.CommaThenConstantDeclarationListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#constantDeclarator}.
   * @param ctx the parse tree
   */
  void enterConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#constantDeclarator}.
   * @param ctx the parse tree
   */
  void exitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
   * @param ctx the parse tree
   */
  void enterInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
   * @param ctx the parse tree
   */
  void exitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
   * @param ctx the parse tree
   */
  void enterGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
   * @param ctx the parse tree
   */
  void exitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#variableDeclarators}.
   * @param ctx the parse tree
   */
  void enterVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#variableDeclarators}.
   * @param ctx the parse tree
   */
  void exitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenVariableDeclarationList}.
   * @param ctx the parse tree
   */
  void enterCommaThenVariableDeclarationList(JavaParser.CommaThenVariableDeclarationListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenVariableDeclarationList}.
   * @param ctx the parse tree
   */
  void exitCommaThenVariableDeclarationList(JavaParser.CommaThenVariableDeclarationListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#variableDeclarator}.
   * @param ctx the parse tree
   */
  void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#variableDeclarator}.
   * @param ctx the parse tree
   */
  void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#variableDeclaratorId}.
   * @param ctx the parse tree
   */
  void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
   * @param ctx the parse tree
   */
  void exitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#variableInitializer}.
   * @param ctx the parse tree
   */
  void enterVariableInitializer(JavaParser.VariableInitializerContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#variableInitializer}.
   * @param ctx the parse tree
   */
  void exitVariableInitializer(JavaParser.VariableInitializerContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#arrayInitializer}.
   * @param ctx the parse tree
   */
  void enterArrayInitializer(JavaParser.ArrayInitializerContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#arrayInitializer}.
   * @param ctx the parse tree
   */
  void exitArrayInitializer(JavaParser.ArrayInitializerContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenVariableInitializerList}.
   * @param ctx the parse tree
   */
  void enterCommaThenVariableInitializerList(JavaParser.CommaThenVariableInitializerListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenVariableInitializerList}.
   * @param ctx the parse tree
   */
  void exitCommaThenVariableInitializerList(JavaParser.CommaThenVariableInitializerListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#enumConstantName}.
   * @param ctx the parse tree
   */
  void enterEnumConstantName(JavaParser.EnumConstantNameContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#enumConstantName}.
   * @param ctx the parse tree
   */
  void exitEnumConstantName(JavaParser.EnumConstantNameContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#type}.
   * @param ctx the parse tree
   */
  void enterType(JavaParser.TypeContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#type}.
   * @param ctx the parse tree
   */
  void exitType(JavaParser.TypeContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#classOrInterfaceType}.
   * @param ctx the parse tree
   */
  void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
   * @param ctx the parse tree
   */
  void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#dotThenIdentifierAndTypeArgumentsList}.
   * @param ctx the parse tree
   */
  void enterDotThenIdentifierAndTypeArgumentsList(JavaParser.DotThenIdentifierAndTypeArgumentsListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#dotThenIdentifierAndTypeArgumentsList}.
   * @param ctx the parse tree
   */
  void exitDotThenIdentifierAndTypeArgumentsList(JavaParser.DotThenIdentifierAndTypeArgumentsListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#primitiveType}.
   * @param ctx the parse tree
   */
  void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#primitiveType}.
   * @param ctx the parse tree
   */
  void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#typeArguments}.
   * @param ctx the parse tree
   */
  void enterTypeArguments(JavaParser.TypeArgumentsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#typeArguments}.
   * @param ctx the parse tree
   */
  void exitTypeArguments(JavaParser.TypeArgumentsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenTypeArgumentsList}.
   * @param ctx the parse tree
   */
  void enterCommaThenTypeArgumentsList(JavaParser.CommaThenTypeArgumentsListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenTypeArgumentsList}.
   * @param ctx the parse tree
   */
  void exitCommaThenTypeArgumentsList(JavaParser.CommaThenTypeArgumentsListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#typeArgument}.
   * @param ctx the parse tree
   */
  void enterTypeArgument(JavaParser.TypeArgumentContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#typeArgument}.
   * @param ctx the parse tree
   */
  void exitTypeArgument(JavaParser.TypeArgumentContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#qualifiedNameList}.
   * @param ctx the parse tree
   */
  void enterQualifiedNameList(JavaParser.QualifiedNameListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#qualifiedNameList}.
   * @param ctx the parse tree
   */
  void exitQualifiedNameList(JavaParser.QualifiedNameListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenQualifiedNameList}.
   * @param ctx the parse tree
   */
  void enterCommaThenQualifiedNameList(JavaParser.CommaThenQualifiedNameListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenQualifiedNameList}.
   * @param ctx the parse tree
   */
  void exitCommaThenQualifiedNameList(JavaParser.CommaThenQualifiedNameListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#formalParameters}.
   * @param ctx the parse tree
   */
  void enterFormalParameters(JavaParser.FormalParametersContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#formalParameters}.
   * @param ctx the parse tree
   */
  void exitFormalParameters(JavaParser.FormalParametersContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#formalParameterList}.
   * @param ctx the parse tree
   */
  void enterFormalParameterList(JavaParser.FormalParameterListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#formalParameterList}.
   * @param ctx the parse tree
   */
  void exitFormalParameterList(JavaParser.FormalParameterListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenFormalParameterList}.
   * @param ctx the parse tree
   */
  void enterCommaThenFormalParameterList(JavaParser.CommaThenFormalParameterListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenFormalParameterList}.
   * @param ctx the parse tree
   */
  void exitCommaThenFormalParameterList(JavaParser.CommaThenFormalParameterListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#formalParameter}.
   * @param ctx the parse tree
   */
  void enterFormalParameter(JavaParser.FormalParameterContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#formalParameter}.
   * @param ctx the parse tree
   */
  void exitFormalParameter(JavaParser.FormalParameterContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#lastFormalParameter}.
   * @param ctx the parse tree
   */
  void enterLastFormalParameter(JavaParser.LastFormalParameterContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#lastFormalParameter}.
   * @param ctx the parse tree
   */
  void exitLastFormalParameter(JavaParser.LastFormalParameterContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#variableModifiers}.
   * @param ctx the parse tree
   */
  void enterVariableModifiers(JavaParser.VariableModifiersContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#variableModifiers}.
   * @param ctx the parse tree
   */
  void exitVariableModifiers(JavaParser.VariableModifiersContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#methodBody}.
   * @param ctx the parse tree
   */
  void enterMethodBody(JavaParser.MethodBodyContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#methodBody}.
   * @param ctx the parse tree
   */
  void exitMethodBody(JavaParser.MethodBodyContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#constructorBody}.
   * @param ctx the parse tree
   */
  void enterConstructorBody(JavaParser.ConstructorBodyContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#constructorBody}.
   * @param ctx the parse tree
   */
  void exitConstructorBody(JavaParser.ConstructorBodyContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#qualifiedName}.
   * @param ctx the parse tree
   */
  void enterQualifiedName(JavaParser.QualifiedNameContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#qualifiedName}.
   * @param ctx the parse tree
   */
  void exitQualifiedName(JavaParser.QualifiedNameContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#dotThenIdentifierList}.
   * @param ctx the parse tree
   */
  void enterDotThenIdentifierList(JavaParser.DotThenIdentifierListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#dotThenIdentifierList}.
   * @param ctx the parse tree
   */
  void exitDotThenIdentifierList(JavaParser.DotThenIdentifierListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#literal}.
   * @param ctx the parse tree
   */
  void enterLiteral(JavaParser.LiteralContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#literal}.
   * @param ctx the parse tree
   */
  void exitLiteral(JavaParser.LiteralContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotation}.
   * @param ctx the parse tree
   */
  void enterAnnotation(JavaParser.AnnotationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotation}.
   * @param ctx the parse tree
   */
  void exitAnnotation(JavaParser.AnnotationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotationName}.
   * @param ctx the parse tree
   */
  void enterAnnotationName(JavaParser.AnnotationNameContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotationName}.
   * @param ctx the parse tree
   */
  void exitAnnotationName(JavaParser.AnnotationNameContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#elementValuePairs}.
   * @param ctx the parse tree
   */
  void enterElementValuePairs(JavaParser.ElementValuePairsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#elementValuePairs}.
   * @param ctx the parse tree
   */
  void exitElementValuePairs(JavaParser.ElementValuePairsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenElementValuePairList}.
   * @param ctx the parse tree
   */
  void enterCommaThenElementValuePairList(JavaParser.CommaThenElementValuePairListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenElementValuePairList}.
   * @param ctx the parse tree
   */
  void exitCommaThenElementValuePairList(JavaParser.CommaThenElementValuePairListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#elementValuePair}.
   * @param ctx the parse tree
   */
  void enterElementValuePair(JavaParser.ElementValuePairContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#elementValuePair}.
   * @param ctx the parse tree
   */
  void exitElementValuePair(JavaParser.ElementValuePairContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#elementValue}.
   * @param ctx the parse tree
   */
  void enterElementValue(JavaParser.ElementValueContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#elementValue}.
   * @param ctx the parse tree
   */
  void exitElementValue(JavaParser.ElementValueContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
   * @param ctx the parse tree
   */
  void enterElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
   * @param ctx the parse tree
   */
  void exitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenElementValueList}.
   * @param ctx the parse tree
   */
  void enterCommaThenElementValueList(JavaParser.CommaThenElementValueListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenElementValueList}.
   * @param ctx the parse tree
   */
  void exitCommaThenElementValueList(JavaParser.CommaThenElementValueListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
   * @param ctx the parse tree
   */
  void enterAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
   * @param ctx the parse tree
   */
  void exitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotationTypeBody}.
   * @param ctx the parse tree
   */
  void enterAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotationTypeBody}.
   * @param ctx the parse tree
   */
  void exitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotationTypeElementDeclarationsList}.
   * @param ctx the parse tree
   */
  void enterAnnotationTypeElementDeclarationsList(JavaParser.AnnotationTypeElementDeclarationsListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotationTypeElementDeclarationsList}.
   * @param ctx the parse tree
   */
  void exitAnnotationTypeElementDeclarationsList(JavaParser.AnnotationTypeElementDeclarationsListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
   * @param ctx the parse tree
   */
  void enterAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
   * @param ctx the parse tree
   */
  void exitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotationTypeElementRest}.
   * @param ctx the parse tree
   */
  void enterAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotationTypeElementRest}.
   * @param ctx the parse tree
   */
  void exitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
   * @param ctx the parse tree
   */
  void enterAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
   * @param ctx the parse tree
   */
  void exitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotationMethodRest}.
   * @param ctx the parse tree
   */
  void enterAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotationMethodRest}.
   * @param ctx the parse tree
   */
  void exitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#annotationConstantRest}.
   * @param ctx the parse tree
   */
  void enterAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#annotationConstantRest}.
   * @param ctx the parse tree
   */
  void exitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#defaultValue}.
   * @param ctx the parse tree
   */
  void enterDefaultValue(JavaParser.DefaultValueContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#defaultValue}.
   * @param ctx the parse tree
   */
  void exitDefaultValue(JavaParser.DefaultValueContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#block}.
   * @param ctx the parse tree
   */
  void enterBlock(JavaParser.BlockContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#block}.
   * @param ctx the parse tree
   */
  void exitBlock(JavaParser.BlockContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#blockStatements}.
   * @param ctx the parse tree
   */
  void enterBlockStatements(JavaParser.BlockStatementsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#blockStatements}.
   * @param ctx the parse tree
   */
  void exitBlockStatements(JavaParser.BlockStatementsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#blockStatement}.
   * @param ctx the parse tree
   */
  void enterBlockStatement(JavaParser.BlockStatementContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#blockStatement}.
   * @param ctx the parse tree
   */
  void exitBlockStatement(JavaParser.BlockStatementContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
   * @param ctx the parse tree
   */
  void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
   * @param ctx the parse tree
   */
  void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#localVariableDeclaration}.
   * @param ctx the parse tree
   */
  void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
   * @param ctx the parse tree
   */
  void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#statement}.
   * @param ctx the parse tree
   */
  void enterStatement(JavaParser.StatementContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#statement}.
   * @param ctx the parse tree
   */
  void exitStatement(JavaParser.StatementContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#catchClauses}.
   * @param ctx the parse tree
   */
  void enterCatchClauses(JavaParser.CatchClausesContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#catchClauses}.
   * @param ctx the parse tree
   */
  void exitCatchClauses(JavaParser.CatchClausesContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#switchBlockStatementGroups}.
   * @param ctx the parse tree
   */
  void enterSwitchBlockStatementGroups(JavaParser.SwitchBlockStatementGroupsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#switchBlockStatementGroups}.
   * @param ctx the parse tree
   */
  void exitSwitchBlockStatementGroups(JavaParser.SwitchBlockStatementGroupsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#switchLabels}.
   * @param ctx the parse tree
   */
  void enterSwitchLabels(JavaParser.SwitchLabelsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#switchLabels}.
   * @param ctx the parse tree
   */
  void exitSwitchLabels(JavaParser.SwitchLabelsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#catchClause}.
   * @param ctx the parse tree
   */
  void enterCatchClause(JavaParser.CatchClauseContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#catchClause}.
   * @param ctx the parse tree
   */
  void exitCatchClause(JavaParser.CatchClauseContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#catchType}.
   * @param ctx the parse tree
   */
  void enterCatchType(JavaParser.CatchTypeContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#catchType}.
   * @param ctx the parse tree
   */
  void exitCatchType(JavaParser.CatchTypeContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#midThenQualifiedNameList}.
   * @param ctx the parse tree
   */
  void enterMidThenQualifiedNameList(JavaParser.MidThenQualifiedNameListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#midThenQualifiedNameList}.
   * @param ctx the parse tree
   */
  void exitMidThenQualifiedNameList(JavaParser.MidThenQualifiedNameListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#finallyBlock}.
   * @param ctx the parse tree
   */
  void enterFinallyBlock(JavaParser.FinallyBlockContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#finallyBlock}.
   * @param ctx the parse tree
   */
  void exitFinallyBlock(JavaParser.FinallyBlockContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#resourceSpecification}.
   * @param ctx the parse tree
   */
  void enterResourceSpecification(JavaParser.ResourceSpecificationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#resourceSpecification}.
   * @param ctx the parse tree
   */
  void exitResourceSpecification(JavaParser.ResourceSpecificationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#resources}.
   * @param ctx the parse tree
   */
  void enterResources(JavaParser.ResourcesContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#resources}.
   * @param ctx the parse tree
   */
  void exitResources(JavaParser.ResourcesContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#semicolonThenResourceList}.
   * @param ctx the parse tree
   */
  void enterSemicolonThenResourceList(JavaParser.SemicolonThenResourceListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#semicolonThenResourceList}.
   * @param ctx the parse tree
   */
  void exitSemicolonThenResourceList(JavaParser.SemicolonThenResourceListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#resource}.
   * @param ctx the parse tree
   */
  void enterResource(JavaParser.ResourceContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#resource}.
   * @param ctx the parse tree
   */
  void exitResource(JavaParser.ResourceContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
   * @param ctx the parse tree
   */
  void enterSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
   * @param ctx the parse tree
   */
  void exitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#switchLabel}.
   * @param ctx the parse tree
   */
  void enterSwitchLabel(JavaParser.SwitchLabelContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#switchLabel}.
   * @param ctx the parse tree
   */
  void exitSwitchLabel(JavaParser.SwitchLabelContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#forControl}.
   * @param ctx the parse tree
   */
  void enterForControl(JavaParser.ForControlContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#forControl}.
   * @param ctx the parse tree
   */
  void exitForControl(JavaParser.ForControlContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#forInit}.
   * @param ctx the parse tree
   */
  void enterForInit(JavaParser.ForInitContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#forInit}.
   * @param ctx the parse tree
   */
  void exitForInit(JavaParser.ForInitContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#enhancedForControl}.
   * @param ctx the parse tree
   */
  void enterEnhancedForControl(JavaParser.EnhancedForControlContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#enhancedForControl}.
   * @param ctx the parse tree
   */
  void exitEnhancedForControl(JavaParser.EnhancedForControlContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#forUpdate}.
   * @param ctx the parse tree
   */
  void enterForUpdate(JavaParser.ForUpdateContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#forUpdate}.
   * @param ctx the parse tree
   */
  void exitForUpdate(JavaParser.ForUpdateContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#parExpression}.
   * @param ctx the parse tree
   */
  void enterParExpression(JavaParser.ParExpressionContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#parExpression}.
   * @param ctx the parse tree
   */
  void exitParExpression(JavaParser.ParExpressionContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#expressionList}.
   * @param ctx the parse tree
   */
  void enterExpressionList(JavaParser.ExpressionListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#expressionList}.
   * @param ctx the parse tree
   */
  void exitExpressionList(JavaParser.ExpressionListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#commaThenExpressionList}.
   * @param ctx the parse tree
   */
  void enterCommaThenExpressionList(JavaParser.CommaThenExpressionListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#commaThenExpressionList}.
   * @param ctx the parse tree
   */
  void exitCommaThenExpressionList(JavaParser.CommaThenExpressionListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#statementExpression}.
   * @param ctx the parse tree
   */
  void enterStatementExpression(JavaParser.StatementExpressionContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#statementExpression}.
   * @param ctx the parse tree
   */
  void exitStatementExpression(JavaParser.StatementExpressionContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#constantExpression}.
   * @param ctx the parse tree
   */
  void enterConstantExpression(JavaParser.ConstantExpressionContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#constantExpression}.
   * @param ctx the parse tree
   */
  void exitConstantExpression(JavaParser.ConstantExpressionContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#expression}.
   * @param ctx the parse tree
   */
  void enterExpression(JavaParser.ExpressionContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#expression}.
   * @param ctx the parse tree
   */
  void exitExpression(JavaParser.ExpressionContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#primary}.
   * @param ctx the parse tree
   */
  void enterPrimary(JavaParser.PrimaryContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#primary}.
   * @param ctx the parse tree
   */
  void exitPrimary(JavaParser.PrimaryContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#creator}.
   * @param ctx the parse tree
   */
  void enterCreator(JavaParser.CreatorContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#creator}.
   * @param ctx the parse tree
   */
  void exitCreator(JavaParser.CreatorContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#createdName}.
   * @param ctx the parse tree
   */
  void enterCreatedName(JavaParser.CreatedNameContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#createdName}.
   * @param ctx the parse tree
   */
  void exitCreatedName(JavaParser.CreatedNameContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#dotIdThenTypeArgumentsOrDiamondList}.
   * @param ctx the parse tree
   */
  void enterDotIdThenTypeArgumentsOrDiamondList(JavaParser.DotIdThenTypeArgumentsOrDiamondListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#dotIdThenTypeArgumentsOrDiamondList}.
   * @param ctx the parse tree
   */
  void exitDotIdThenTypeArgumentsOrDiamondList(JavaParser.DotIdThenTypeArgumentsOrDiamondListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#innerCreator}.
   * @param ctx the parse tree
   */
  void enterInnerCreator(JavaParser.InnerCreatorContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#innerCreator}.
   * @param ctx the parse tree
   */
  void exitInnerCreator(JavaParser.InnerCreatorContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#arrayCreatorRest}.
   * @param ctx the parse tree
   */
  void enterArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#arrayCreatorRest}.
   * @param ctx the parse tree
   */
  void exitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#squareBracketsWithExpressionList}.
   * @param ctx the parse tree
   */
  void enterSquareBracketsWithExpressionList(JavaParser.SquareBracketsWithExpressionListContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#squareBracketsWithExpressionList}.
   * @param ctx the parse tree
   */
  void exitSquareBracketsWithExpressionList(JavaParser.SquareBracketsWithExpressionListContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#classCreatorRest}.
   * @param ctx the parse tree
   */
  void enterClassCreatorRest(JavaParser.ClassCreatorRestContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#classCreatorRest}.
   * @param ctx the parse tree
   */
  void exitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#explicitGenericInvocation}.
   * @param ctx the parse tree
   */
  void enterExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#explicitGenericInvocation}.
   * @param ctx the parse tree
   */
  void exitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
   * @param ctx the parse tree
   */
  void enterNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
   * @param ctx the parse tree
   */
  void exitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
   * @param ctx the parse tree
   */
  void enterTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
   * @param ctx the parse tree
   */
  void exitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
   * @param ctx the parse tree
   */
  void enterNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
   * @param ctx the parse tree
   */
  void exitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#superSuffix}.
   * @param ctx the parse tree
   */
  void enterSuperSuffix(JavaParser.SuperSuffixContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#superSuffix}.
   * @param ctx the parse tree
   */
  void exitSuperSuffix(JavaParser.SuperSuffixContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
   * @param ctx the parse tree
   */
  void enterExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
   * @param ctx the parse tree
   */
  void exitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx);

  /**
   * Enter a parse tree produced by {@link JavaParser#arguments}.
   * @param ctx the parse tree
   */
  void enterArguments(JavaParser.ArgumentsContext ctx);

  /**
   * Exit a parse tree produced by {@link JavaParser#arguments}.
   * @param ctx the parse tree
   */
  void exitArguments(JavaParser.ArgumentsContext ctx);
}