// Generated from D:/study/10/trpo/f4j/grammar\Java.g4 by ANTLR 4.5.1
package com.kspt.khandygo.antlr.generated;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
  public static final int
      ABSTRACT = 1, ASSERT = 2, BOOLEAN = 3, BREAK = 4, BYTE = 5, CASE = 6, CATCH = 7, CHAR = 8,
      CLASS = 9, CONST = 10, CONTINUE = 11, DEFAULT = 12, DO = 13, DOUBLE = 14, ELSE = 15,
      ENUM = 16, EXTENDS = 17, FINAL = 18, FINALLY = 19, FLOAT = 20, FOR = 21, IF = 22, GOTO = 23,
      IMPLEMENTS = 24, IMPORT = 25, INSTANCEOF = 26, INT = 27, INTERFACE = 28, LONG = 29,
      NATIVE = 30, NEW = 31, PACKAGE = 32, PRIVATE = 33, PROTECTED = 34, PUBLIC = 35, RETURN = 36,
      SHORT = 37, STATIC = 38, STRICTFP = 39, SUPER = 40, SWITCH = 41, SYNCHRONIZED = 42,
      THIS = 43, THROW = 44, THROWS = 45, TRANSIENT = 46, TRY = 47, VOID = 48, VOLATILE = 49,
      WHILE = 50, IntegerLiteral = 51, FloatingPointLiteral = 52, BooleanLiteral = 53,
      CharacterLiteral = 54, StringLiteral = 55, NullLiteral = 56, LPAREN = 57, RPAREN = 58,
      LBRACE = 59, RBRACE = 60, LBRACK = 61, RBRACK = 62, SEMI = 63, COMMA = 64, DOT = 65,
      ASSIGN = 66, GT = 67, LT = 68, BANG = 69, TILDE = 70, QUESTION = 71, COLON = 72, EQUAL = 73,
      LE = 74, GE = 75, NOTEQUAL = 76, AND = 77, OR = 78, INC = 79, DEC = 80, ADD = 81, SUB = 82,
      MUL = 83, DIV = 84, BITAND = 85, BITOR = 86, CARET = 87, MOD = 88, ADD_ASSIGN = 89,
      SUB_ASSIGN = 90, MUL_ASSIGN = 91, DIV_ASSIGN = 92, AND_ASSIGN = 93, OR_ASSIGN = 94,
      XOR_ASSIGN = 95, MOD_ASSIGN = 96, LSHIFT_ASSIGN = 97, RSHIFT_ASSIGN = 98, URSHIFT_ASSIGN = 99,
      Identifier = 100, AT = 101, ELLIPSIS = 102, TS = 103, RS = 104, NLS = 105, NPS = 106,
      SS = 107, COMMENT = 108, LINE_COMMENT = 109;

  public static final int
      RULE_compilationUnit = 0, RULE_importDeclarations = 1, RULE_typeDeclarations = 2,
      RULE_packageDeclaration = 3, RULE_annotations = 4, RULE_importDeclaration = 5,
      RULE_typeDeclaration = 6, RULE_classOrInterfaceModifiers = 7, RULE_modifier = 8,
      RULE_classOrInterfaceModifier = 9, RULE_variableModifier = 10, RULE_classDeclaration = 11,
      RULE_typeParameters = 12, RULE_commaThenTypeParameterList = 13, RULE_typeParameter = 14,
      RULE_typeBound = 15, RULE_ampThenTypeList = 16, RULE_enumDeclaration = 17,
      RULE_enumConstants = 18, RULE_commaThenEnumConstantList = 19, RULE_enumConstant = 20,
      RULE_enumBodyDeclarations = 21, RULE_classBodyDeclarations = 22, RULE_interfaceDeclaration
      = 23,
      RULE_typeList = 24, RULE_commaThenTypeList = 25, RULE_classBody = 26,
      RULE_interfaceBody = 27, RULE_interfaceBodyDeclarations = 28, RULE_classBodyDeclaration = 29,
      RULE_modifiers = 30, RULE_memberDeclaration = 31, RULE_methodDeclaration = 32,
      RULE_squareBracketsList = 33, RULE_genericMethodDeclaration = 34, RULE_constructorDeclaration
      = 35,
      RULE_genericConstructorDeclaration = 36, RULE_fieldDeclaration = 37,
      RULE_interfaceBodyDeclaration = 38,
      RULE_interfaceMemberDeclaration = 39, RULE_constDeclaration = 40,
      RULE_commaThenConstantDeclarationList = 41,
      RULE_constantDeclarator = 42, RULE_interfaceMethodDeclaration = 43,
      RULE_genericInterfaceMethodDeclaration = 44,
      RULE_variableDeclarators = 45, RULE_commaThenVariableDeclarationList = 46,
      RULE_variableDeclarator = 47, RULE_variableDeclaratorId = 48, RULE_variableInitializer = 49,
      RULE_arrayInitializer = 50, RULE_commaThenVariableInitializerList = 51,
      RULE_enumConstantName = 52, RULE_type = 53, RULE_classOrInterfaceType = 54,
      RULE_dotThenIdentifierAndTypeArgumentsList = 55, RULE_primitiveType = 56,
      RULE_typeArguments = 57, RULE_commaThenTypeArgumentsList = 58, RULE_typeArgument = 59,
      RULE_qualifiedNameList = 60, RULE_commaThenQualifiedNameList = 61, RULE_formalParameters = 62,
      RULE_formalParameterList = 63, RULE_commaThenFormalParameterList = 64,
      RULE_formalParameter = 65, RULE_lastFormalParameter = 66, RULE_variableModifiers = 67,
      RULE_methodBody = 68, RULE_constructorBody = 69, RULE_qualifiedName = 70,
      RULE_dotThenIdentifierList = 71, RULE_literal = 72, RULE_annotation = 73,
      RULE_annotationName = 74, RULE_elementValuePairs = 75, RULE_commaThenElementValuePairList
      = 76,
      RULE_elementValuePair = 77, RULE_elementValue = 78, RULE_elementValueArrayInitializer = 79,
      RULE_commaThenElementValueList = 80, RULE_annotationTypeDeclaration = 81,
      RULE_annotationTypeBody = 82, RULE_annotationTypeElementDeclarationsList = 83,
      RULE_annotationTypeElementDeclaration = 84, RULE_annotationTypeElementRest = 85,
      RULE_annotationMethodOrConstantRest = 86, RULE_annotationMethodRest = 87,
      RULE_annotationConstantRest = 88, RULE_defaultValue = 89, RULE_block = 90,
      RULE_blockStatements = 91, RULE_blockStatement = 92, RULE_localVariableDeclarationStatement
      = 93,
      RULE_localVariableDeclaration = 94, RULE_statement = 95, RULE_catchClauses = 96,
      RULE_switchBlockStatementGroups = 97, RULE_switchLabels = 98, RULE_catchClause = 99,
      RULE_catchType = 100, RULE_midThenQualifiedNameList = 101, RULE_finallyBlock = 102,
      RULE_resourceSpecification = 103, RULE_resources = 104, RULE_semicolonThenResourceList = 105,
      RULE_resource = 106, RULE_switchBlockStatementGroup = 107, RULE_switchLabel = 108,
      RULE_forControl = 109, RULE_forInit = 110, RULE_enhancedForControl = 111,
      RULE_forUpdate = 112, RULE_parExpression = 113, RULE_expressionList = 114,
      RULE_commaThenExpressionList = 115, RULE_statementExpression = 116, RULE_constantExpression
      = 117,
      RULE_expression = 118, RULE_primary = 119, RULE_creator = 120, RULE_createdName = 121,
      RULE_dotIdThenTypeArgumentsOrDiamondList = 122, RULE_innerCreator = 123,
      RULE_arrayCreatorRest = 124, RULE_squareBracketsWithExpressionList = 125,
      RULE_classCreatorRest = 126, RULE_explicitGenericInvocation = 127,
      RULE_nonWildcardTypeArguments = 128,
      RULE_typeArgumentsOrDiamond = 129, RULE_nonWildcardTypeArgumentsOrDiamond = 130,
      RULE_superSuffix = 131, RULE_explicitGenericInvocationSuffix = 132, RULE_arguments = 133;

  public static final String[] ruleNames = {
      "compilationUnit", "importDeclarations", "typeDeclarations", "packageDeclaration",
      "annotations", "importDeclaration", "typeDeclaration", "classOrInterfaceModifiers",
      "modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration",
      "typeParameters", "commaThenTypeParameterList", "typeParameter", "typeBound",
      "ampThenTypeList", "enumDeclaration", "enumConstants", "commaThenEnumConstantList",
      "enumConstant", "enumBodyDeclarations", "classBodyDeclarations", "interfaceDeclaration",
      "typeList", "commaThenTypeList", "classBody", "interfaceBody", "interfaceBodyDeclarations",
      "classBodyDeclaration", "modifiers", "memberDeclaration", "methodDeclaration",
      "squareBracketsList", "genericMethodDeclaration", "constructorDeclaration",
      "genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration",
      "interfaceMemberDeclaration", "constDeclaration", "commaThenConstantDeclarationList",
      "constantDeclarator", "interfaceMethodDeclaration", "genericInterfaceMethodDeclaration",
      "variableDeclarators", "commaThenVariableDeclarationList", "variableDeclarator",
      "variableDeclaratorId", "variableInitializer", "arrayInitializer",
      "commaThenVariableInitializerList",
      "enumConstantName", "type", "classOrInterfaceType", "dotThenIdentifierAndTypeArgumentsList",
      "primitiveType", "typeArguments", "commaThenTypeArgumentsList", "typeArgument",
      "qualifiedNameList", "commaThenQualifiedNameList", "formalParameters",
      "formalParameterList", "commaThenFormalParameterList", "formalParameter",
      "lastFormalParameter", "variableModifiers", "methodBody", "constructorBody",
      "qualifiedName", "dotThenIdentifierList", "literal", "annotation", "annotationName",
      "elementValuePairs", "commaThenElementValuePairList", "elementValuePair",
      "elementValue", "elementValueArrayInitializer", "commaThenElementValueList",
      "annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclarationsList",
      "annotationTypeElementDeclaration", "annotationTypeElementRest",
      "annotationMethodOrConstantRest",
      "annotationMethodRest", "annotationConstantRest", "defaultValue", "block",
      "blockStatements", "blockStatement", "localVariableDeclarationStatement",
      "localVariableDeclaration", "statement", "catchClauses", "switchBlockStatementGroups",
      "switchLabels", "catchClause", "catchType", "midThenQualifiedNameList",
      "finallyBlock", "resourceSpecification", "resources", "semicolonThenResourceList",
      "resource", "switchBlockStatementGroup", "switchLabel", "forControl",
      "forInit", "enhancedForControl", "forUpdate", "parExpression", "expressionList",
      "commaThenExpressionList", "statementExpression", "constantExpression",
      "expression", "primary", "creator", "createdName", "dotIdThenTypeArgumentsOrDiamondList",
      "innerCreator", "arrayCreatorRest", "squareBracketsWithExpressionList",
      "classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments",
      "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix",
      "explicitGenericInvocationSuffix", "arguments"
  };

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;

  public static final String _serializedATN =
      "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3o\u0545\4\2\t\2\4" +
          "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
          "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
          "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
          "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
          "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
          ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
          "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
          "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
          "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
          "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" +
          "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t" +
          "k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4" +
          "w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080" +
          "\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085" +
          "\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\3\2\5\2\u0110\n\2\3\2\5\2\u0113" +
          "\n\2\3\2\5\2\u0116\n\2\3\2\3\2\3\3\6\3\u011b\n\3\r\3\16\3\u011c\3\4\6" +
          "\4\u0120\n\4\r\4\16\4\u0121\3\5\5\5\u0125\n\5\3\5\3\5\3\5\3\5\3\6\6\6" +
          "\u012c\n\6\r\6\16\6\u012d\3\7\3\7\5\7\u0132\n\7\3\7\3\7\3\7\5\7\u0137" +
          "\n\7\3\7\3\7\3\b\5\b\u013c\n\b\3\b\3\b\5\b\u0140\n\b\3\b\3\b\5\b\u0144" +
          "\n\b\3\b\3\b\5\b\u0148\n\b\3\b\3\b\5\b\u014c\n\b\3\t\6\t\u014f\n\t\r\t" +
          "\16\t\u0150\3\n\3\n\5\n\u0155\n\n\3\13\3\13\5\13\u0159\n\13\3\f\3\f\5" +
          "\f\u015d\n\f\3\r\3\r\3\r\5\r\u0162\n\r\3\r\3\r\5\r\u0166\n\r\3\r\3\r\5" +
          "\r\u016a\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u0171\n\16\3\16\3\16\3\17\3\17" +
          "\6\17\u0177\n\17\r\17\16\17\u0178\3\20\3\20\3\20\5\20\u017e\n\20\3\21" +
          "\3\21\5\21\u0182\n\21\3\22\3\22\6\22\u0186\n\22\r\22\16\22\u0187\3\23" +
          "\3\23\3\23\3\23\5\23\u018e\n\23\3\23\3\23\5\23\u0192\n\23\3\23\5\23\u0195" +
          "\n\23\3\23\5\23\u0198\n\23\3\23\3\23\3\24\3\24\5\24\u019e\n\24\3\25\3" +
          "\25\6\25\u01a2\n\25\r\25\16\25\u01a3\3\26\5\26\u01a7\n\26\3\26\3\26\5" +
          "\26\u01ab\n\26\3\26\5\26\u01ae\n\26\3\27\3\27\5\27\u01b2\n\27\3\30\6\30" +
          "\u01b5\n\30\r\30\16\30\u01b6\3\31\3\31\3\31\5\31\u01bc\n\31\3\31\3\31" +
          "\5\31\u01c0\n\31\3\31\3\31\3\32\3\32\5\32\u01c6\n\32\3\33\3\33\6\33\u01ca" +
          "\n\33\r\33\16\33\u01cb\3\34\3\34\5\34\u01d0\n\34\3\34\3\34\3\35\3\35\5" +
          "\35\u01d6\n\35\3\35\3\35\3\36\6\36\u01db\n\36\r\36\16\36\u01dc\3\37\3" +
          "\37\5\37\u01e1\n\37\3\37\3\37\5\37\u01e5\n\37\3\37\5\37\u01e8\n\37\3 " +
          "\6 \u01eb\n \r \16 \u01ec\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01f8\n!\3\"\3" +
          "\"\5\"\u01fc\n\"\3\"\3\"\3\"\5\"\u0201\n\"\3\"\3\"\5\"\u0205\n\"\3\"\3" +
          "\"\5\"\u0209\n\"\3#\3#\6#\u020d\n#\r#\16#\u020e\3$\3$\3$\3%\3%\3%\3%\5" +
          "%\u0218\n%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\5(\u0224\n(\3(\3(\5(\u0228" +
          "\n(\3)\3)\3)\3)\3)\3)\3)\5)\u0231\n)\3*\3*\3*\5*\u0236\n*\3*\3*\3+\3+" +
          "\6+\u023c\n+\r+\16+\u023d\3,\3,\5,\u0242\n,\3,\3,\3,\3-\3-\5-\u0249\n" +
          "-\3-\3-\3-\5-\u024e\n-\3-\3-\5-\u0252\n-\3-\3-\3.\3.\3.\3/\3/\5/\u025b" +
          "\n/\3\60\3\60\6\60\u025f\n\60\r\60\16\60\u0260\3\61\3\61\3\61\5\61\u0266" +
          "\n\61\3\62\3\62\5\62\u026a\n\62\3\63\3\63\5\63\u026e\n\63\3\64\3\64\3" +
          "\64\5\64\u0273\n\64\3\64\5\64\u0276\n\64\5\64\u0278\n\64\3\64\3\64\3\65" +
          "\3\65\6\65\u027e\n\65\r\65\16\65\u027f\3\66\3\66\3\67\3\67\5\67\u0286" +
          "\n\67\3\67\3\67\5\67\u028a\n\67\5\67\u028c\n\67\38\38\58\u0290\n8\38\5" +
          "8\u0293\n8\39\39\39\59\u0298\n9\69\u029a\n9\r9\169\u029b\3:\3:\3;\3;\3" +
          ";\5;\u02a3\n;\3;\3;\3<\3<\6<\u02a9\n<\r<\16<\u02aa\3=\3=\3=\3=\5=\u02b1" +
          "\n=\5=\u02b3\n=\3>\3>\5>\u02b7\n>\3?\3?\6?\u02bb\n?\r?\16?\u02bc\3@\3" +
          "@\5@\u02c1\n@\3@\3@\3A\3A\5A\u02c7\nA\3A\3A\5A\u02cb\nA\3A\5A\u02ce\n" +
          "A\3B\3B\6B\u02d2\nB\rB\16B\u02d3\3C\5C\u02d7\nC\3C\3C\3C\3D\5D\u02dd\n" +
          "D\3D\3D\3D\3D\3E\6E\u02e4\nE\rE\16E\u02e5\3F\3F\3G\3G\3H\3H\5H\u02ee\n" +
          "H\3I\3I\6I\u02f2\nI\rI\16I\u02f3\3J\3J\3K\3K\3K\3K\3K\5K\u02fd\nK\3K\5" +
          "K\u0300\nK\3L\3L\3M\3M\5M\u0306\nM\3N\3N\6N\u030a\nN\rN\16N\u030b\3O\3" +
          "O\3O\3O\3P\3P\3P\5P\u0315\nP\3Q\3Q\3Q\5Q\u031a\nQ\5Q\u031c\nQ\3Q\5Q\u031f" +
          "\nQ\3Q\3Q\3R\3R\6R\u0325\nR\rR\16R\u0326\3S\3S\3S\3S\3S\3T\3T\5T\u0330" +
          "\nT\3T\3T\3U\6U\u0335\nU\rU\16U\u0336\3V\5V\u033a\nV\3V\3V\5V\u033e\n" +
          "V\3W\3W\3W\3W\3W\3W\5W\u0346\nW\3W\3W\5W\u034a\nW\3W\3W\5W\u034e\nW\3" +
          "W\3W\5W\u0352\nW\5W\u0354\nW\3X\3X\5X\u0358\nX\3Y\3Y\3Y\3Y\5Y\u035e\n" +
          "Y\3Z\3Z\3[\3[\3[\3\\\3\\\5\\\u0367\n\\\3\\\3\\\3]\6]\u036c\n]\r]\16]\u036d" +
          "\3^\3^\3^\5^\u0373\n^\3_\3_\3_\3`\5`\u0379\n`\3`\3`\3`\3a\3a\3a\3a\3a" +
          "\5a\u0383\na\3a\3a\3a\3a\3a\3a\3a\5a\u038c\na\3a\3a\3a\3a\3a\3a\3a\3a" +
          "\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\6a\u03a1\na\ra\16a\u03a2\3a\5a\u03a6" +
          "\na\3a\5a\u03a9\na\3a\3a\3a\3a\5a\u03af\na\3a\5a\u03b2\na\3a\3a\3a\3a" +
          "\5a\u03b8\na\3a\5a\u03bb\na\3a\3a\3a\3a\3a\3a\3a\3a\5a\u03c5\na\3a\3a" +
          "\3a\3a\3a\3a\3a\5a\u03ce\na\3a\3a\3a\5a\u03d3\na\3a\3a\3a\3a\3a\3a\3a" +
          "\3a\5a\u03dd\na\3b\6b\u03e0\nb\rb\16b\u03e1\3c\6c\u03e5\nc\rc\16c\u03e6" +
          "\3d\6d\u03ea\nd\rd\16d\u03eb\3e\3e\3e\5e\u03f1\ne\3e\3e\3e\3e\3e\3f\3" +
          "f\5f\u03fa\nf\3g\3g\6g\u03fe\ng\rg\16g\u03ff\3h\3h\3h\3i\3i\3i\5i\u0408" +
          "\ni\3i\3i\3j\5j\u040d\nj\3k\3k\3k\6k\u0412\nk\rk\16k\u0413\3l\5l\u0417" +
          "\nl\3l\3l\3l\3l\3l\3m\6m\u041f\nm\rm\16m\u0420\3m\6m\u0424\nm\rm\16m\u0425" +
          "\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0432\nn\3o\3o\5o\u0436\no\3o\3o\5o" +
          "\u043a\no\3o\3o\5o\u043e\no\5o\u0440\no\3p\3p\5p\u0444\np\3q\5q\u0447" +
          "\nq\3q\3q\3q\3q\3q\3r\3r\3s\3s\3s\3s\3t\3t\5t\u0456\nt\3u\3u\6u\u045a" +
          "\nu\ru\16u\u045b\3v\3v\3w\3w\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5" +
          "x\u046f\nx\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u047f\nx\3x\3" +
          "x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3" +
          "x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u04aa\nx\3x\3x\3" +
          "x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u04bc\nx\3x\3x\3x\3x\3x\3" +
          "x\7x\u04c4\nx\fx\16x\u04c7\13x\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y" +
          "\3y\3y\3y\3y\3y\3y\5y\u04dc\ny\5y\u04de\ny\3z\3z\3z\3z\3z\3z\3z\5z\u04e7" +
          "\nz\5z\u04e9\nz\3{\3{\5{\u04ed\n{\3{\5{\u04f0\n{\3{\5{\u04f3\n{\3|\3|" +
          "\3|\5|\u04f8\n|\6|\u04fa\n|\r|\16|\u04fb\3}\3}\5}\u0500\n}\3}\3}\3~\3" +
          "~\3~\5~\u0507\n~\3~\3~\3~\3~\5~\u050d\n~\3~\5~\u0510\n~\5~\u0512\n~\3" +
          "\177\3\177\3\177\3\177\6\177\u0518\n\177\r\177\16\177\u0519\3\u0080\3" +
          "\u0080\5\u0080\u051e\n\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3" +
          "\u0082\3\u0082\3\u0083\3\u0083\3\u0083\5\u0083\u052a\n\u0083\3\u0084\3" +
          "\u0084\3\u0084\5\u0084\u052f\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5" +
          "\u0085\u0535\n\u0085\5\u0085\u0537\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086" +
          "\5\u0086\u053d\n\u0086\3\u0087\3\u0087\5\u0087\u0541\n\u0087\3\u0087\3" +
          "\u0087\3\u0087\2\3\u00ee\u0088\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36" +
          " \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082" +
          "\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a" +
          "\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2" +
          "\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca" +
          "\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2" +
          "\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa" +
          "\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\2\17\6\2  ,,\60" +
          "\60\63\63\6\2\3\3\24\24#%()\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'" +
          "\'\4\2\23\23**\3\2\65:\3\2QT\3\2GH\4\2UVZZ\3\2ST\4\2EFLM\4\2KKNN\4\2D" +
          "D[e\3\2QR\u05b7\2\u010f\3\2\2\2\4\u011a\3\2\2\2\6\u011f\3\2\2\2\b\u0124" +
          "\3\2\2\2\n\u012b\3\2\2\2\f\u012f\3\2\2\2\16\u014b\3\2\2\2\20\u014e\3\2" +
          "\2\2\22\u0154\3\2\2\2\24\u0158\3\2\2\2\26\u015c\3\2\2\2\30\u015e\3\2\2" +
          "\2\32\u016d\3\2\2\2\34\u0176\3\2\2\2\36\u017a\3\2\2\2 \u017f\3\2\2\2\"" +
          "\u0185\3\2\2\2$\u0189\3\2\2\2&\u019b\3\2\2\2(\u01a1\3\2\2\2*\u01a6\3\2" +
          "\2\2,\u01af\3\2\2\2.\u01b4\3\2\2\2\60\u01b8\3\2\2\2\62\u01c3\3\2\2\2\64" +
          "\u01c9\3\2\2\2\66\u01cd\3\2\2\28\u01d3\3\2\2\2:\u01da\3\2\2\2<\u01e7\3" +
          "\2\2\2>\u01ea\3\2\2\2@\u01f7\3\2\2\2B\u01fb\3\2\2\2D\u020c\3\2\2\2F\u0210" +
          "\3\2\2\2H\u0213\3\2\2\2J\u021b\3\2\2\2L\u021e\3\2\2\2N\u0227\3\2\2\2P" +
          "\u0230\3\2\2\2R\u0232\3\2\2\2T\u023b\3\2\2\2V\u023f\3\2\2\2X\u0248\3\2" +
          "\2\2Z\u0255\3\2\2\2\\\u0258\3\2\2\2^\u025e\3\2\2\2`\u0262\3\2\2\2b\u0267" +
          "\3\2\2\2d\u026d\3\2\2\2f\u026f\3\2\2\2h\u027d\3\2\2\2j\u0281\3\2\2\2l" +
          "\u028b\3\2\2\2n\u028d\3\2\2\2p\u0299\3\2\2\2r\u029d\3\2\2\2t\u029f\3\2" +
          "\2\2v\u02a8\3\2\2\2x\u02b2\3\2\2\2z\u02b4\3\2\2\2|\u02ba\3\2\2\2~\u02be" +
          "\3\2\2\2\u0080\u02cd\3\2\2\2\u0082\u02d1\3\2\2\2\u0084\u02d6\3\2\2\2\u0086" +
          "\u02dc\3\2\2\2\u0088\u02e3\3\2\2\2\u008a\u02e7\3\2\2\2\u008c\u02e9\3\2" +
          "\2\2\u008e\u02eb\3\2\2\2\u0090\u02f1\3\2\2\2\u0092\u02f5\3\2\2\2\u0094" +
          "\u02f7\3\2\2\2\u0096\u0301\3\2\2\2\u0098\u0303\3\2\2\2\u009a\u0309\3\2" +
          "\2\2\u009c\u030d\3\2\2\2\u009e\u0314\3\2\2\2\u00a0\u0316\3\2\2\2\u00a2" +
          "\u0324\3\2\2\2\u00a4\u0328\3\2\2\2\u00a6\u032d\3\2\2\2\u00a8\u0334\3\2" +
          "\2\2\u00aa\u033d\3\2\2\2\u00ac\u0353\3\2\2\2\u00ae\u0357\3\2\2\2\u00b0" +
          "\u0359\3\2\2\2\u00b2\u035f\3\2\2\2\u00b4\u0361\3\2\2\2\u00b6\u0364\3\2" +
          "\2\2\u00b8\u036b\3\2\2\2\u00ba\u0372\3\2\2\2\u00bc\u0374\3\2\2\2\u00be" +
          "\u0378\3\2\2\2\u00c0\u03dc\3\2\2\2\u00c2\u03df\3\2\2\2\u00c4\u03e4\3\2" +
          "\2\2\u00c6\u03e9\3\2\2\2\u00c8\u03ed\3\2\2\2\u00ca\u03f7\3\2\2\2\u00cc" +
          "\u03fd\3\2\2\2\u00ce\u0401\3\2\2\2\u00d0\u0404\3\2\2\2\u00d2\u040c\3\2" +
          "\2\2\u00d4\u040e\3\2\2\2\u00d6\u0416\3\2\2\2\u00d8\u041e\3\2\2\2\u00da" +
          "\u0431\3\2\2\2\u00dc\u043f\3\2\2\2\u00de\u0443\3\2\2\2\u00e0\u0446\3\2" +
          "\2\2\u00e2\u044d\3\2\2\2\u00e4\u044f\3\2\2\2\u00e6\u0453\3\2\2\2\u00e8" +
          "\u0459\3\2\2\2\u00ea\u045d\3\2\2\2\u00ec\u045f\3\2\2\2\u00ee\u046e\3\2" +
          "\2\2\u00f0\u04dd\3\2\2\2\u00f2\u04e8\3\2\2\2\u00f4\u04f2\3\2\2\2\u00f6" +
          "\u04f9\3\2\2\2\u00f8\u04fd\3\2\2\2\u00fa\u0503\3\2\2\2\u00fc\u0517\3\2" +
          "\2\2\u00fe\u051b\3\2\2\2\u0100\u051f\3\2\2\2\u0102\u0522\3\2\2\2\u0104" +
          "\u0529\3\2\2\2\u0106\u052e\3\2\2\2\u0108\u0536\3\2\2\2\u010a\u053c\3\2" +
          "\2\2\u010c\u053e\3\2\2\2\u010e\u0110\5\b\5\2\u010f\u010e\3\2\2\2\u010f" +
          "\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u0113\5\4\3\2\u0112\u0111\3\2" +
          "\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\5\6\4\2\u0115" +
          "\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\2" +
          "\2\3\u0118\3\3\2\2\2\u0119\u011b\5\f\7\2\u011a\u0119\3\2\2\2\u011b\u011c" +
          "\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\5\3\2\2\2\u011e" +
          "\u0120\5\16\b\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3" +
          "\2\2\2\u0121\u0122\3\2\2\2\u0122\7\3\2\2\2\u0123\u0125\5\u0094K\2\u0124" +
          "\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\"" +
          "\2\2\u0127\u0128\5\u008eH\2\u0128\u0129\7A\2\2\u0129\t\3\2\2\2\u012a\u012c" +
          "\5\u0094K\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2" +
          "\2\u012d\u012e\3\2\2\2\u012e\13\3\2\2\2\u012f\u0131\7\33\2\2\u0130\u0132" +
          "\7(\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133" +
          "\u0136\5\u008eH\2\u0134\u0135\7C\2\2\u0135\u0137\7U\2\2\u0136\u0134\3" +
          "\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7A\2\2\u0139" +
          "\r\3\2\2\2\u013a\u013c\5\20\t\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2" +
          "\2\u013c\u013d\3\2\2\2\u013d\u014c\5\30\r\2\u013e\u0140\5\20\t\2\u013f" +
          "\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u014c\5$" +
          "\23\2\u0142\u0144\5\20\t\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144" +
          "\u0145\3\2\2\2\u0145\u014c\5\60\31\2\u0146\u0148\5\20\t\2\u0147\u0146" +
          "\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\5\u00a4S" +
          "\2\u014a\u014c\7A\2\2\u014b\u013b\3\2\2\2\u014b\u013f\3\2\2\2\u014b\u0143" +
          "\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u014a\3\2\2\2\u014c\17\3\2\2\2\u014d" +
          "\u014f\5\24\13\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3" +
          "\2\2\2\u0150\u0151\3\2\2\2\u0151\21\3\2\2\2\u0152\u0155\5\24\13\2\u0153" +
          "\u0155\t\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\23\3\2\2" +
          "\2\u0156\u0159\5\u0094K\2\u0157\u0159\t\3\2\2\u0158\u0156\3\2\2\2\u0158" +
          "\u0157\3\2\2\2\u0159\25\3\2\2\2\u015a\u015d\7\24\2\2\u015b\u015d\5\u0094" +
          "K\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d\27\3\2\2\2\u015e\u015f" +
          "\7\13\2\2\u015f\u0161\7f\2\2\u0160\u0162\5\32\16\2\u0161\u0160\3\2\2\2" +
          "\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164\7\23\2\2\u0164\u0166" +
          "\5l\67\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167" +
          "\u0168\7\32\2\2\u0168\u016a\5\62\32\2\u0169\u0167\3\2\2\2\u0169\u016a" +
          "\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5\66\34\2\u016c\31\3\2\2\2\u016d" +
          "\u016e\7F\2\2\u016e\u0170\5\36\20\2\u016f\u0171\5\34\17\2\u0170\u016f" +
          "\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7E\2\2\u0173" +
          "\33\3\2\2\2\u0174\u0175\7B\2\2\u0175\u0177\5\36\20\2\u0176\u0174\3\2\2" +
          "\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\35" +
          "\3\2\2\2\u017a\u017d\7f\2\2\u017b\u017c\7\23\2\2\u017c\u017e\5 \21\2\u017d" +
          "\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\37\3\2\2\2\u017f\u0181\5l\67" +
          "\2\u0180\u0182\5\"\22\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182" +
          "!\3\2\2\2\u0183\u0184\7W\2\2\u0184\u0186\5l\67\2\u0185\u0183\3\2\2\2\u0186" +
          "\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188#\3\2\2\2" +
          "\u0189\u018a\7\22\2\2\u018a\u018d\7f\2\2\u018b\u018c\7\32\2\2\u018c\u018e" +
          "\5\62\32\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2" +
          "\u018f\u0191\7=\2\2\u0190\u0192\5&\24\2\u0191\u0190\3\2\2\2\u0191\u0192" +
          "\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0195\7B\2\2\u0194\u0193\3\2\2\2\u0194" +
          "\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0198\5,\27\2\u0197\u0196\3\2" +
          "\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7>\2\2\u019a" +
          "%\3\2\2\2\u019b\u019d\5*\26\2\u019c\u019e\5(\25\2\u019d\u019c\3\2\2\2" +
          "\u019d\u019e\3\2\2\2\u019e\'\3\2\2\2\u019f\u01a0\7B\2\2\u01a0\u01a2\5" +
          "*\26\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3" +
          "\u01a4\3\2\2\2\u01a4)\3\2\2\2\u01a5\u01a7\5\n\6\2\u01a6\u01a5\3\2\2\2" +
          "\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\7f\2\2\u01a9\u01ab" +
          "\5\u010c\u0087\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3" +
          "\2\2\2\u01ac\u01ae\5\66\34\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae" +
          "+\3\2\2\2\u01af\u01b1\7A\2\2\u01b0\u01b2\5.\30\2\u01b1\u01b0\3\2\2\2\u01b1" +
          "\u01b2\3\2\2\2\u01b2-\3\2\2\2\u01b3\u01b5\5<\37\2\u01b4\u01b3\3\2\2\2" +
          "\u01b5\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7/\3" +
          "\2\2\2\u01b8\u01b9\7\36\2\2\u01b9\u01bb\7f\2\2\u01ba\u01bc\5\32\16\2\u01bb" +
          "\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01be\7\23" +
          "\2\2\u01be\u01c0\5\62\32\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0" +
          "\u01c1\3\2\2\2\u01c1\u01c2\58\35\2\u01c2\61\3\2\2\2\u01c3\u01c5\5l\67" +
          "\2\u01c4\u01c6\5\64\33\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6" +
          "\63\3\2\2\2\u01c7\u01c8\7B\2\2\u01c8\u01ca\5l\67\2\u01c9\u01c7\3\2\2\2" +
          "\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\65" +
          "\3\2\2\2\u01cd\u01cf\7=\2\2\u01ce\u01d0\5.\30\2\u01cf\u01ce\3\2\2\2\u01cf" +
          "\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\7>\2\2\u01d2\67\3\2\2\2" +
          "\u01d3\u01d5\7=\2\2\u01d4\u01d6\5:\36\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6" +
          "\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7>\2\2\u01d89\3\2\2\2\u01d9\u01db" +
          "\5N(\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc" +
          "\u01dd\3\2\2\2\u01dd;\3\2\2\2\u01de\u01e8\7A\2\2\u01df\u01e1\7(\2\2\u01e0" +
          "\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e8\5\u00b6" +
          "\\\2\u01e3\u01e5\5> \2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6" +
          "\3\2\2\2\u01e6\u01e8\5@!\2\u01e7\u01de\3\2\2\2\u01e7\u01e0\3\2\2\2\u01e7" +
          "\u01e4\3\2\2\2\u01e8=\3\2\2\2\u01e9\u01eb\5\22\n\2\u01ea\u01e9\3\2\2\2" +
          "\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed?\3" +
          "\2\2\2\u01ee\u01f8\5B\"\2\u01ef\u01f8\5F$\2\u01f0\u01f8\5L\'\2\u01f1\u01f8" +
          "\5H%\2\u01f2\u01f8\5J&\2\u01f3\u01f8\5\60\31\2\u01f4\u01f8\5\u00a4S\2" +
          "\u01f5\u01f8\5\30\r\2\u01f6\u01f8\5$\23\2\u01f7\u01ee\3\2\2\2\u01f7\u01ef" +
          "\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f7" +
          "\u01f3\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2" +
          "\2\2\u01f8A\3\2\2\2\u01f9\u01fc\5l\67\2\u01fa\u01fc\7\62\2\2\u01fb\u01f9" +
          "\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7f\2\2\u01fe" +
          "\u0200\5~@\2\u01ff\u0201\5D#\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2" +
          "\u0201\u0204\3\2\2\2\u0202\u0203\7/\2\2\u0203\u0205\5z>\2\u0204\u0202" +
          "\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0209\5\u008aF" +
          "\2\u0207\u0209\7A\2\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209C\3" +
          "\2\2\2\u020a\u020b\7?\2\2\u020b\u020d\7@\2\2\u020c\u020a\3\2\2\2\u020d" +
          "\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020fE\3\2\2\2" +
          "\u0210\u0211\5\32\16\2\u0211\u0212\5B\"\2\u0212G\3\2\2\2\u0213\u0214\7" +
          "f\2\2\u0214\u0217\5~@\2\u0215\u0216\7/\2\2\u0216\u0218\5z>\2\u0217\u0215" +
          "\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\5\u008cG" +
          "\2\u021aI\3\2\2\2\u021b\u021c\5\32\16\2\u021c\u021d\5H%\2\u021dK\3\2\2" +
          "\2\u021e\u021f\5l\67\2\u021f\u0220\5\\/\2\u0220\u0221\7A\2\2\u0221M\3" +
          "\2\2\2\u0222\u0224\5> \2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224" +
          "\u0225\3\2\2\2\u0225\u0228\5P)\2\u0226\u0228\7A\2\2\u0227\u0223\3\2\2" +
          "\2\u0227\u0226\3\2\2\2\u0228O\3\2\2\2\u0229\u0231\5R*\2\u022a\u0231\5" +
          "X-\2\u022b\u0231\5Z.\2\u022c\u0231\5\60\31\2\u022d\u0231\5\u00a4S\2\u022e" +
          "\u0231\5\30\r\2\u022f\u0231\5$\23\2\u0230\u0229\3\2\2\2\u0230\u022a\3" +
          "\2\2\2\u0230\u022b\3\2\2\2\u0230\u022c\3\2\2\2\u0230\u022d\3\2\2\2\u0230" +
          "\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231Q\3\2\2\2\u0232\u0233\5l\67\2" +
          "\u0233\u0235\5V,\2\u0234\u0236\5T+\2\u0235\u0234\3\2\2\2\u0235\u0236\3" +
          "\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7A\2\2\u0238S\3\2\2\2\u0239\u023a" +
          "\7B\2\2\u023a\u023c\5V,\2\u023b\u0239\3\2\2\2\u023c\u023d\3\2\2\2\u023d" +
          "\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023eU\3\2\2\2\u023f\u0241\7f\2\2\u0240" +
          "\u0242\5D#\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2" +
          "\2\u0243\u0244\7D\2\2\u0244\u0245\5d\63\2\u0245W\3\2\2\2\u0246\u0249\5" +
          "l\67\2\u0247\u0249\7\62\2\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249" +
          "\u024a\3\2\2\2\u024a\u024b\7f\2\2\u024b\u024d\5~@\2\u024c\u024e\5D#\2" +
          "\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u0250" +
          "\7/\2\2\u0250\u0252\5z>\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252" +
          "\u0253\3\2\2\2\u0253\u0254\7A\2\2\u0254Y\3\2\2\2\u0255\u0256\5\32\16\2" +
          "\u0256\u0257\5X-\2\u0257[\3\2\2\2\u0258\u025a\5`\61\2\u0259\u025b\5^\60" +
          "\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b]\3\2\2\2\u025c\u025d" +
          "\7B\2\2\u025d\u025f\5`\61\2\u025e\u025c\3\2\2\2\u025f\u0260\3\2\2\2\u0260" +
          "\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261_\3\2\2\2\u0262\u0265\5b\62\2" +
          "\u0263\u0264\7D\2\2\u0264\u0266\5d\63\2\u0265\u0263\3\2\2\2\u0265\u0266" +
          "\3\2\2\2\u0266a\3\2\2\2\u0267\u0269\7f\2\2\u0268\u026a\5D#\2\u0269\u0268" +
          "\3\2\2\2\u0269\u026a\3\2\2\2\u026ac\3\2\2\2\u026b\u026e\5f\64\2\u026c" +
          "\u026e\5\u00eex\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026ee\3\2\2" +
          "\2\u026f\u0277\7=\2\2\u0270\u0272\5d\63\2\u0271\u0273\5h\65\2\u0272\u0271" +
          "\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0276\7B\2\2\u0275" +
          "\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0270\3\2" +
          "\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\7>\2\2\u027a" +
          "g\3\2\2\2\u027b\u027c\7B\2\2\u027c\u027e\5d\63\2\u027d\u027b\3\2\2\2\u027e" +
          "\u027f\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280i\3\2\2\2" +
          "\u0281\u0282\7f\2\2\u0282k\3\2\2\2\u0283\u0285\5n8\2\u0284\u0286\5D#\2" +
          "\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028c\3\2\2\2\u0287\u0289" +
          "\5r:\2\u0288\u028a\5D#\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a" +
          "\u028c\3\2\2\2\u028b\u0283\3\2\2\2\u028b\u0287\3\2\2\2\u028cm\3\2\2\2" +
          "\u028d\u028f\7f\2\2\u028e\u0290\5t;\2\u028f\u028e\3\2\2\2\u028f\u0290" +
          "\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u0293\5p9\2\u0292\u0291\3\2\2\2\u0292" +
          "\u0293\3\2\2\2\u0293o\3\2\2\2\u0294\u0295\7C\2\2\u0295\u0297\7f\2\2\u0296" +
          "\u0298\5t;\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a\3\2\2" +
          "\2\u0299\u0294\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c" +
          "\3\2\2\2\u029cq\3\2\2\2\u029d\u029e\t\4\2\2\u029es\3\2\2\2\u029f\u02a0" +
          "\7F\2\2\u02a0\u02a2\5x=\2\u02a1\u02a3\5v<\2\u02a2\u02a1\3\2\2\2\u02a2" +
          "\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\7E\2\2\u02a5u\3\2\2\2\u02a6" +
          "\u02a7\7B\2\2\u02a7\u02a9\5x=\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\3\2\2" +
          "\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02abw\3\2\2\2\u02ac\u02b3" +
          "\5l\67\2\u02ad\u02b0\7I\2\2\u02ae\u02af\t\5\2\2\u02af\u02b1\5l\67\2\u02b0" +
          "\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02ac\3\2" +
          "\2\2\u02b2\u02ad\3\2\2\2\u02b3y\3\2\2\2\u02b4\u02b6\5\u008eH\2\u02b5\u02b7" +
          "\5|?\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7{\3\2\2\2\u02b8\u02b9" +
          "\7B\2\2\u02b9\u02bb\5\u008eH\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\3\2\2\2" +
          "\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd}\3\2\2\2\u02be\u02c0\7" +
          ";\2\2\u02bf\u02c1\5\u0080A\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1" +
          "\u02c2\3\2\2\2\u02c2\u02c3\7<\2\2\u02c3\177\3\2\2\2\u02c4\u02c6\5\u0084" +
          "C\2\u02c5\u02c7\5\u0082B\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7" +
          "\u02ca\3\2\2\2\u02c8\u02c9\7B\2\2\u02c9\u02cb\5\u0086D\2\u02ca\u02c8\3" +
          "\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ce\5\u0086D\2" +
          "\u02cd\u02c4\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\u0081\3\2\2\2\u02cf\u02d0" +
          "\7B\2\2\u02d0\u02d2\5\u0084C\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3\3\2\2\2" +
          "\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u0083\3\2\2\2\u02d5\u02d7" +
          "\5\u0088E\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2" +
          "\2\u02d8\u02d9\5l\67\2\u02d9\u02da\5b\62\2\u02da\u0085\3\2\2\2\u02db\u02dd" +
          "\5\u0088E\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2" +
          "\2\u02de\u02df\5l\67\2\u02df\u02e0\7h\2\2\u02e0\u02e1\5b\62\2\u02e1\u0087" +
          "\3\2\2\2\u02e2\u02e4\5\26\f\2\u02e3\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2" +
          "\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u0089\3\2\2\2\u02e7\u02e8" +
          "\5\u00b6\\\2\u02e8\u008b\3\2\2\2\u02e9\u02ea\5\u00b6\\\2\u02ea\u008d\3" +
          "\2\2\2\u02eb\u02ed\7f\2\2\u02ec\u02ee\5\u0090I\2\u02ed\u02ec\3\2\2\2\u02ed" +
          "\u02ee\3\2\2\2\u02ee\u008f\3\2\2\2\u02ef\u02f0\7C\2\2\u02f0\u02f2\7f\2" +
          "\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4" +
          "\3\2\2\2\u02f4\u0091\3\2\2\2\u02f5\u02f6\t\6\2\2\u02f6\u0093\3\2\2\2\u02f7" +
          "\u02f8\7g\2\2\u02f8\u02ff\5\u0096L\2\u02f9\u02fc\7;\2\2\u02fa\u02fd\5" +
          "\u0098M\2\u02fb\u02fd\5\u009eP\2\u02fc\u02fa\3\2\2\2\u02fc\u02fb\3\2\2" +
          "\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\7<\2\2\u02ff\u02f9" +
          "\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0095\3\2\2\2\u0301\u0302\5\u008eH" +
          "\2\u0302\u0097\3\2\2\2\u0303\u0305\5\u009cO\2\u0304\u0306\5\u009aN\2\u0305" +
          "\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0099\3\2\2\2\u0307\u0308\7B" +
          "\2\2\u0308\u030a\5\u009cO\2\u0309\u0307\3\2\2\2\u030a\u030b\3\2\2\2\u030b" +
          "\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u009b\3\2\2\2\u030d\u030e\7f" +
          "\2\2\u030e\u030f\7D\2\2\u030f\u0310\5\u009eP\2\u0310\u009d\3\2\2\2\u0311" +
          "\u0315\5\u00eex\2\u0312\u0315\5\u0094K\2\u0313\u0315\5\u00a0Q\2\u0314" +
          "\u0311\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0313\3\2\2\2\u0315\u009f\3\2" +
          "\2\2\u0316\u031b\7=\2\2\u0317\u0319\5\u009eP\2\u0318\u031a\5\u00a2R\2" +
          "\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031c\3\2\2\2\u031b\u0317" +
          "\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u031f\7B\2\2\u031e" +
          "\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\7>" +
          "\2\2\u0321\u00a1\3\2\2\2\u0322\u0323\7B\2\2\u0323\u0325\5\u009eP\2\u0324" +
          "\u0322\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2" +
          "\2\2\u0327\u00a3\3\2\2\2\u0328\u0329\7g\2\2\u0329\u032a\7\36\2\2\u032a" +
          "\u032b\7f\2\2\u032b\u032c\5\u00a6T\2\u032c\u00a5\3\2\2\2\u032d\u032f\7" +
          "=\2\2\u032e\u0330\5\u00a8U\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330" +
          "\u0331\3\2\2\2\u0331\u0332\7>\2\2\u0332\u00a7\3\2\2\2\u0333\u0335\5\u00aa" +
          "V\2\u0334\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0334\3\2\2\2\u0336" +
          "\u0337\3\2\2\2\u0337\u00a9\3\2\2\2\u0338\u033a\5> \2\u0339\u0338\3\2\2" +
          "\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033e\5\u00acW\2\u033c" +
          "\u033e\7A\2\2\u033d\u0339\3\2\2\2\u033d\u033c\3\2\2\2\u033e\u00ab\3\2" +
          "\2\2\u033f\u0340\5l\67\2\u0340\u0341\5\u00aeX\2\u0341\u0342\7A\2\2\u0342" +
          "\u0354\3\2\2\2\u0343\u0345\5\30\r\2\u0344\u0346\7A\2\2\u0345\u0344\3\2" +
          "\2\2\u0345\u0346\3\2\2\2\u0346\u0354\3\2\2\2\u0347\u0349\5\60\31\2\u0348" +
          "\u034a\7A\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u0354\3\2" +
          "\2\2\u034b\u034d\5$\23\2\u034c\u034e\7A\2\2\u034d\u034c\3\2\2\2\u034d" +
          "\u034e\3\2\2\2\u034e\u0354\3\2\2\2\u034f\u0351\5\u00a4S\2\u0350\u0352" +
          "\7A\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353" +
          "\u033f\3\2\2\2\u0353\u0343\3\2\2\2\u0353\u0347\3\2\2\2\u0353\u034b\3\2" +
          "\2\2\u0353\u034f\3\2\2\2\u0354\u00ad\3\2\2\2\u0355\u0358\5\u00b0Y\2\u0356" +
          "\u0358\5\u00b2Z\2\u0357\u0355\3\2\2\2\u0357\u0356\3\2\2\2\u0358\u00af" +
          "\3\2\2\2\u0359\u035a\7f\2\2\u035a\u035b\7;\2\2\u035b\u035d\7<\2\2\u035c" +
          "\u035e\5\u00b4[\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u00b1" +
          "\3\2\2\2\u035f\u0360\5\\/\2\u0360\u00b3\3\2\2\2\u0361\u0362\7\16\2\2\u0362" +
          "\u0363\5\u009eP\2\u0363\u00b5\3\2\2\2\u0364\u0366\7=\2\2\u0365\u0367\5" +
          "\u00b8]\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2" +
          "\u0368\u0369\7>\2\2\u0369\u00b7\3\2\2\2\u036a\u036c\5\u00ba^\2\u036b\u036a" +
          "\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e" +
          "\u00b9\3\2\2\2\u036f\u0373\5\u00bc_\2\u0370\u0373\5\u00c0a\2\u0371\u0373" +
          "\5\16\b\2\u0372\u036f\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0371\3\2\2\2" +
          "\u0373\u00bb\3\2\2\2\u0374\u0375\5\u00be`\2\u0375\u0376\7A\2\2\u0376\u00bd" +
          "\3\2\2\2\u0377\u0379\5\u0088E\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2" +
          "\2\u0379\u037a\3\2\2\2\u037a\u037b\5l\67\2\u037b\u037c\5\\/\2\u037c\u00bf" +
          "\3\2\2\2\u037d\u03dd\5\u00b6\\\2\u037e\u037f\7\4\2\2\u037f\u0382\5\u00ee" +
          "x\2\u0380\u0381\7J\2\2\u0381\u0383\5\u00eex\2\u0382\u0380\3\2\2\2\u0382" +
          "\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\7A\2\2\u0385\u03dd\3\2" +
          "\2\2\u0386\u0387\7\30\2\2\u0387\u0388\5\u00e4s\2\u0388\u038b\5\u00c0a" +
          "\2\u0389\u038a\7\21\2\2\u038a\u038c\5\u00c0a\2\u038b\u0389\3\2\2\2\u038b" +
          "\u038c\3\2\2\2\u038c\u03dd\3\2\2\2\u038d\u038e\7\27\2\2\u038e\u038f\7" +
          ";\2\2\u038f\u0390\5\u00dco\2\u0390\u0391\7<\2\2\u0391\u0392\5\u00c0a\2" +
          "\u0392\u03dd\3\2\2\2\u0393\u0394\7\64\2\2\u0394\u0395\5\u00e4s\2\u0395" +
          "\u0396\5\u00c0a\2\u0396\u03dd\3\2\2\2\u0397\u0398\7\17\2\2\u0398\u0399" +
          "\5\u00c0a\2\u0399\u039a\7\64\2\2\u039a\u039b\5\u00e4s\2\u039b\u039c\7" +
          "A\2\2\u039c\u03dd\3\2\2\2\u039d\u039e\7\61\2\2\u039e\u03a8\5\u00b6\\\2" +
          "\u039f\u03a1\5\u00c8e\2\u03a0\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2" +
          "\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a6\5\u00ce" +
          "h\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7" +
          "\u03a9\5\u00ceh\2\u03a8\u03a0\3\2\2\2\u03a8\u03a7\3\2\2\2\u03a9\u03dd" +
          "\3\2\2\2\u03aa\u03ab\7\61\2\2\u03ab\u03ac\5\u00d0i\2\u03ac\u03ae\5\u00b6" +
          "\\\2\u03ad\u03af\5\u00c2b\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af" +
          "\u03b1\3\2\2\2\u03b0\u03b2\5\u00ceh\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2" +
          "\3\2\2\2\u03b2\u03dd\3\2\2\2\u03b3\u03b4\7+\2\2\u03b4\u03b5\5\u00e4s\2" +
          "\u03b5\u03b7\7=\2\2\u03b6\u03b8\5\u00c4c\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8" +
          "\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03bb\5\u00c6d\2\u03ba\u03b9\3\2\2" +
          "\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\7>\2\2\u03bd\u03dd" +
          "\3\2\2\2\u03be\u03bf\7,\2\2\u03bf\u03c0\5\u00e4s\2\u03c0\u03c1\5\u00b6" +
          "\\\2\u03c1\u03dd\3\2\2\2\u03c2\u03c4\7&\2\2\u03c3\u03c5\5\u00eex\2\u03c4" +
          "\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03dd\7A" +
          "\2\2\u03c7\u03c8\7.\2\2\u03c8\u03c9\5\u00eex\2\u03c9\u03ca\7A\2\2\u03ca" +
          "\u03dd\3\2\2\2\u03cb\u03cd\7\6\2\2\u03cc\u03ce\7f\2\2\u03cd\u03cc\3\2" +
          "\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03dd\7A\2\2\u03d0" +
          "\u03d2\7\r\2\2\u03d1\u03d3\7f\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2" +
          "\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03dd\7A\2\2\u03d5\u03dd\7A\2\2\u03d6\u03d7" +
          "\5\u00eav\2\u03d7\u03d8\7A\2\2\u03d8\u03dd\3\2\2\2\u03d9\u03da\7f\2\2" +
          "\u03da\u03db\7J\2\2\u03db\u03dd\5\u00c0a\2\u03dc\u037d\3\2\2\2\u03dc\u037e" +
          "\3\2\2\2\u03dc\u0386\3\2\2\2\u03dc\u038d\3\2\2\2\u03dc\u0393\3\2\2\2\u03dc" +
          "\u0397\3\2\2\2\u03dc\u039d\3\2\2\2\u03dc\u03aa\3\2\2\2\u03dc\u03b3\3\2" +
          "\2\2\u03dc\u03be\3\2\2\2\u03dc\u03c2\3\2\2\2\u03dc\u03c7\3\2\2\2\u03dc" +
          "\u03cb\3\2\2\2\u03dc\u03d0\3\2\2\2\u03dc\u03d5\3\2\2\2\u03dc\u03d6\3\2" +
          "\2\2\u03dc\u03d9\3\2\2\2\u03dd\u00c1\3\2\2\2\u03de\u03e0\5\u00c8e\2\u03df" +
          "\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2" +
          "\2\2\u03e2\u00c3\3\2\2\2\u03e3\u03e5\5\u00d8m\2\u03e4\u03e3\3\2\2\2\u03e5" +
          "\u03e6\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u00c5\3\2" +
          "\2\2\u03e8\u03ea\5\u00dan\2\u03e9\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb" +
          "\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u00c7\3\2\2\2\u03ed\u03ee\7\t" +
          "\2\2\u03ee\u03f0\7;\2\2\u03ef\u03f1\5\u0088E\2\u03f0\u03ef\3\2\2\2\u03f0" +
          "\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\5\u00caf\2\u03f3\u03f4" +
          "\7f\2\2\u03f4\u03f5\7<\2\2\u03f5\u03f6\5\u00b6\\\2\u03f6\u00c9\3\2\2\2" +
          "\u03f7\u03f9\5\u008eH\2\u03f8\u03fa\5\u00ccg\2\u03f9\u03f8\3\2\2\2\u03f9" +
          "\u03fa\3\2\2\2\u03fa\u00cb\3\2\2\2\u03fb\u03fc\7X\2\2\u03fc\u03fe\5\u008e" +
          "H\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff" +
          "\u0400\3\2\2\2\u0400\u00cd\3\2\2\2\u0401\u0402\7\25\2\2\u0402\u0403\5" +
          "\u00b6\\\2\u0403\u00cf\3\2\2\2\u0404\u0405\7;\2\2\u0405\u0407\5\u00d2" +
          "j\2\u0406\u0408\7A\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409" +
          "\3\2\2\2\u0409\u040a\7<\2\2\u040a\u00d1\3\2\2\2\u040b\u040d\5\u00d4k\2" +
          "\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u00d3\3\2\2\2\u040e\u0411" +
          "\5\u00d6l\2\u040f\u0410\7A\2\2\u0410\u0412\5\u00d6l\2\u0411\u040f\3\2" +
          "\2\2\u0412\u0413\3\2\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414" +
          "\u00d5\3\2\2\2\u0415\u0417\5\u0088E\2\u0416\u0415\3\2\2\2\u0416\u0417" +
          "\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\5n8\2\u0419\u041a\5b\62\2\u041a" +
          "\u041b\7D\2\2\u041b\u041c\5\u00eex\2\u041c\u00d7\3\2\2\2\u041d\u041f\5" +
          "\u00dan\2\u041e\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u041e\3\2\2\2" +
          "\u0420\u0421\3\2\2\2\u0421\u0423\3\2\2\2\u0422\u0424\5\u00ba^\2\u0423" +
          "\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2" +
          "\2\2\u0426\u00d9\3\2\2\2\u0427\u0428\7\b\2\2\u0428\u0429\5\u00ecw\2\u0429" +
          "\u042a\7J\2\2\u042a\u0432\3\2\2\2\u042b\u042c\7\b\2\2\u042c\u042d\5j\66" +
          "\2\u042d\u042e\7J\2\2\u042e\u0432\3\2\2\2\u042f\u0430\7\16\2\2\u0430\u0432" +
          "\7J\2\2\u0431\u0427\3\2\2\2\u0431\u042b\3\2\2\2\u0431\u042f\3\2\2\2\u0432" +
          "\u00db\3\2\2\2\u0433\u0440\5\u00e0q\2\u0434\u0436\5\u00dep\2\u0435\u0434" +
          "\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0439\7A\2\2\u0438" +
          "\u043a\5\u00eex\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b" +
          "\3\2\2\2\u043b\u043d\7A\2\2\u043c\u043e\5\u00e2r\2\u043d\u043c\3\2\2\2" +
          "\u043d\u043e\3\2\2\2\u043e\u0440\3\2\2\2\u043f\u0433\3\2\2\2\u043f\u0435" +
          "\3\2\2\2\u0440\u00dd\3\2\2\2\u0441\u0444\5\u00be`\2\u0442\u0444\5\u00e6" +
          "t\2\u0443\u0441\3\2\2\2\u0443\u0442\3\2\2\2\u0444\u00df\3\2\2\2\u0445" +
          "\u0447\5\u0088E\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448" +
          "\3\2\2\2\u0448\u0449\5l\67\2\u0449\u044a\5b\62\2\u044a\u044b\7J\2\2\u044b" +
          "\u044c\5\u00eex\2\u044c\u00e1\3\2\2\2\u044d\u044e\5\u00e6t\2\u044e\u00e3" +
          "\3\2\2\2\u044f\u0450\7;\2\2\u0450\u0451\5\u00eex\2\u0451\u0452\7<\2\2" +
          "\u0452\u00e5\3\2\2\2\u0453\u0455\5\u00eex\2\u0454\u0456\5\u00e8u\2\u0455" +
          "\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u00e7\3\2\2\2\u0457\u0458\7B" +
          "\2\2\u0458\u045a\5\u00eex\2\u0459\u0457\3\2\2\2\u045a\u045b\3\2\2\2\u045b" +
          "\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u00e9\3\2\2\2\u045d\u045e\5\u00ee" +
          "x\2\u045e\u00eb\3\2\2\2\u045f\u0460\5\u00eex\2\u0460\u00ed\3\2\2\2\u0461" +
          "\u0462\bx\1\2\u0462\u0463\7;\2\2\u0463\u0464\5l\67\2\u0464\u0465\7<\2" +
          "\2\u0465\u0466\5\u00eex\23\u0466\u046f\3\2\2\2\u0467\u0468\t\7\2\2\u0468" +
          "\u046f\5\u00eex\21\u0469\u046a\t\b\2\2\u046a\u046f\5\u00eex\20\u046b\u046f" +
          "\5\u00f0y\2\u046c\u046d\7!\2\2\u046d\u046f\5\u00f2z\2\u046e\u0461\3\2" +
          "\2\2\u046e\u0467\3\2\2\2\u046e\u0469\3\2\2\2\u046e\u046b\3\2\2\2\u046e" +
          "\u046c\3\2\2\2\u046f\u04c5\3\2\2\2\u0470\u0471\f\17\2\2\u0471\u0472\t" +
          "\t\2\2\u0472\u04c4\5\u00eex\20\u0473\u0474\f\16\2\2\u0474\u0475\t\n\2" +
          "\2\u0475\u04c4\5\u00eex\17\u0476\u047e\f\r\2\2\u0477\u0478\7F\2\2\u0478" +
          "\u047f\7F\2\2\u0479\u047a\7E\2\2\u047a\u047b\7E\2\2\u047b\u047f\7E\2\2" +
          "\u047c\u047d\7E\2\2\u047d\u047f\7E\2\2\u047e\u0477\3\2\2\2\u047e\u0479" +
          "\3\2\2\2\u047e\u047c\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u04c4\5\u00eex" +
          "\16\u0481\u0482\f\f\2\2\u0482\u0483\t\13\2\2\u0483\u04c4\5\u00eex\r\u0484" +
          "\u0485\f\n\2\2\u0485\u0486\t\f\2\2\u0486\u04c4\5\u00eex\13\u0487\u0488" +
          "\f\t\2\2\u0488\u0489\7W\2\2\u0489\u04c4\5\u00eex\n\u048a\u048b\f\b\2\2" +
          "\u048b\u048c\7Y\2\2\u048c\u04c4\5\u00eex\t\u048d\u048e\f\7\2\2\u048e\u048f" +
          "\7X\2\2\u048f\u04c4\5\u00eex\b\u0490\u0491\f\6\2\2\u0491\u0492\7O\2\2" +
          "\u0492\u04c4\5\u00eex\7\u0493\u0494\f\5\2\2\u0494\u0495\7P\2\2\u0495\u04c4" +
          "\5\u00eex\6\u0496\u0497\f\4\2\2\u0497\u0498\7I\2\2\u0498\u0499\5\u00ee" +
          "x\2\u0499\u049a\7J\2\2\u049a\u049b\5\u00eex\5\u049b\u04c4\3\2\2\2\u049c" +
          "\u049d\f\3\2\2\u049d\u049e\t\r\2\2\u049e\u04c4\5\u00eex\3\u049f\u04a0" +
          "\f\33\2\2\u04a0\u04a1\7C\2\2\u04a1\u04c4\7f\2\2\u04a2\u04a3\f\32\2\2\u04a3" +
          "\u04a4\7C\2\2\u04a4\u04c4\7-\2\2\u04a5\u04a6\f\31\2\2\u04a6\u04a7\7C\2" +
          "\2\u04a7\u04a9\7!\2\2\u04a8\u04aa\5\u0102\u0082\2\u04a9\u04a8\3\2\2\2" +
          "\u04a9\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04c4\5\u00f8}\2\u04ac" +
          "\u04ad\f\30\2\2\u04ad\u04ae\7C\2\2\u04ae\u04af\7*\2\2\u04af\u04c4\5\u0108" +
          "\u0085\2\u04b0\u04b1\f\27\2\2\u04b1\u04b2\7C\2\2\u04b2\u04c4\5\u0100\u0081" +
          "\2\u04b3\u04b4\f\26\2\2\u04b4\u04b5\7?\2\2\u04b5\u04b6\5\u00eex\2\u04b6" +
          "\u04b7\7@\2\2\u04b7\u04c4\3\2\2\2\u04b8\u04b9\f\25\2\2\u04b9\u04bb\7;" +
          "\2\2\u04ba\u04bc\5\u00e6t\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc" +
          "\u04bd\3\2\2\2\u04bd\u04c4\7<\2\2\u04be\u04bf\f\22\2\2\u04bf\u04c4\t\16" +
          "\2\2\u04c0\u04c1\f\13\2\2\u04c1\u04c2\7\34\2\2\u04c2\u04c4\5l\67\2\u04c3" +
          "\u0470\3\2\2\2\u04c3\u0473\3\2\2\2\u04c3\u0476\3\2\2\2\u04c3\u0481\3\2" +
          "\2\2\u04c3\u0484\3\2\2\2\u04c3\u0487\3\2\2\2\u04c3\u048a\3\2\2\2\u04c3" +
          "\u048d\3\2\2\2\u04c3\u0490\3\2\2\2\u04c3\u0493\3\2\2\2\u04c3\u0496\3\2" +
          "\2\2\u04c3\u049c\3\2\2\2\u04c3\u049f\3\2\2\2\u04c3\u04a2\3\2\2\2\u04c3" +
          "\u04a5\3\2\2\2\u04c3\u04ac\3\2\2\2\u04c3\u04b0\3\2\2\2\u04c3\u04b3\3\2" +
          "\2\2\u04c3\u04b8\3\2\2\2\u04c3\u04be\3\2\2\2\u04c3\u04c0\3\2\2\2\u04c4" +
          "\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u00ef\3\2" +
          "\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04c9\7;\2\2\u04c9\u04ca\5\u00eex\2\u04ca" +
          "\u04cb\7<\2\2\u04cb\u04de\3\2\2\2\u04cc\u04de\7-\2\2\u04cd\u04de\7*\2" +
          "\2\u04ce\u04de\5\u0092J\2\u04cf\u04de\7f\2\2\u04d0\u04d1\5l\67\2\u04d1" +
          "\u04d2\7C\2\2\u04d2\u04d3\7\13\2\2\u04d3\u04de\3\2\2\2\u04d4\u04d5\7\62" +
          "\2\2\u04d5\u04d6\7C\2\2\u04d6\u04de\7\13\2\2\u04d7\u04db\5\u0102\u0082" +
          "\2\u04d8\u04dc\5\u010a\u0086\2\u04d9\u04da\7-\2\2\u04da\u04dc\5\u010c" +
          "\u0087\2\u04db\u04d8\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd" +
          "\u04c8\3\2\2\2\u04dd\u04cc\3\2\2\2\u04dd\u04cd\3\2\2\2\u04dd\u04ce\3\2" +
          "\2\2\u04dd\u04cf\3\2\2\2\u04dd\u04d0\3\2\2\2\u04dd\u04d4\3\2\2\2\u04dd" +
          "\u04d7\3\2\2\2\u04de\u00f1\3\2\2\2\u04df\u04e0\5\u0102\u0082\2\u04e0\u04e1" +
          "\5\u00f4{\2\u04e1\u04e2\5\u00fe\u0080\2\u04e2\u04e9\3\2\2\2\u04e3\u04e6" +
          "\5\u00f4{\2\u04e4\u04e7\5\u00fa~\2\u04e5\u04e7\5\u00fe\u0080\2\u04e6\u04e4" +
          "\3\2\2\2\u04e6\u04e5\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04df\3\2\2\2\u04e8" +
          "\u04e3\3\2\2\2\u04e9\u00f3\3\2\2\2\u04ea\u04ec\7f\2\2\u04eb\u04ed\5\u0104" +
          "\u0083\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ef\3\2\2\2\u04ee" +
          "\u04f0\5\u00f6|\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f3" +
          "\3\2\2\2\u04f1\u04f3\5r:\2\u04f2\u04ea\3\2\2\2\u04f2\u04f1\3\2\2\2\u04f3" +
          "\u00f5\3\2\2\2\u04f4\u04f5\7C\2\2\u04f5\u04f7\7f\2\2\u04f6\u04f8\5\u0104" +
          "\u0083\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2\u04f9" +
          "\u04f4\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2" +
          "\2\2\u04fc\u00f7\3\2\2\2\u04fd\u04ff\7f\2\2\u04fe\u0500\5\u0106\u0084" +
          "\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502" +
          "\5\u00fe\u0080\2\u0502\u00f9\3\2\2\2\u0503\u0511\7?\2\2\u0504\u0506\7" +
          "@\2\2\u0505\u0507\5D#\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507" +
          "\u0508\3\2\2\2\u0508\u0512\5f\64\2\u0509\u050a\5\u00eex\2\u050a\u050c" +
          "\7@\2\2\u050b\u050d\5\u00fc\177\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2" +
          "\2\2\u050d\u050f\3\2\2\2\u050e\u0510\5D#\2\u050f\u050e\3\2\2\2\u050f\u0510" +
          "\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u0504\3\2\2\2\u0511\u0509\3\2\2\2\u0512" +
          "\u00fb\3\2\2\2\u0513\u0514\7?\2\2\u0514\u0515\5\u00eex\2\u0515\u0516\7" +
          "@\2\2\u0516\u0518\3\2\2\2\u0517\u0513\3\2\2\2\u0518\u0519\3\2\2\2\u0519" +
          "\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u00fd\3\2\2\2\u051b\u051d\5\u010c" +
          "\u0087\2\u051c\u051e\5\66\34\2\u051d\u051c\3\2\2\2\u051d\u051e\3\2\2\2" +
          "\u051e\u00ff\3\2\2\2\u051f\u0520\5\u0102\u0082\2\u0520\u0521\5\u010a\u0086" +
          "\2\u0521\u0101\3\2\2\2\u0522\u0523\7F\2\2\u0523\u0524\5\62\32\2\u0524" +
          "\u0525\7E\2\2\u0525\u0103\3\2\2\2\u0526\u0527\7F\2\2\u0527\u052a\7E\2" +
          "\2\u0528\u052a\5t;\2\u0529\u0526\3\2\2\2\u0529\u0528\3\2\2\2\u052a\u0105" +
          "\3\2\2\2\u052b\u052c\7F\2\2\u052c\u052f\7E\2\2\u052d\u052f\5\u0102\u0082" +
          "\2\u052e\u052b\3\2\2\2\u052e\u052d\3\2\2\2\u052f\u0107\3\2\2\2\u0530\u0537" +
          "\5\u010c\u0087\2\u0531\u0532\7C\2\2\u0532\u0534\7f\2\2\u0533\u0535\5\u010c" +
          "\u0087\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2\2\2\u0536" +
          "\u0530\3\2\2\2\u0536\u0531\3\2\2\2\u0537\u0109\3\2\2\2\u0538\u0539\7*" +
          "\2\2\u0539\u053d\5\u0108\u0085\2\u053a\u053b\7f\2\2\u053b\u053d\5\u010c" +
          "\u0087\2\u053c\u0538\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u010b\3\2\2\2\u053e" +
          "\u0540\7;\2\2\u053f\u0541\5\u00e6t\2\u0540\u053f\3\2\2\2\u0540\u0541\3" +
          "\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\7<\2\2\u0543\u010d\3\2\2\2\u00b8" +
          "\u010f\u0112\u0115\u011c\u0121\u0124\u012d\u0131\u0136\u013b\u013f\u0143" +
          "\u0147\u014b\u0150\u0154\u0158\u015c\u0161\u0165\u0169\u0170\u0178\u017d" +
          "\u0181\u0187\u018d\u0191\u0194\u0197\u019d\u01a3\u01a6\u01aa\u01ad\u01b1" +
          "\u01b6\u01bb\u01bf\u01c5\u01cb\u01cf\u01d5\u01dc\u01e0\u01e4\u01e7\u01ec" +
          "\u01f7\u01fb\u0200\u0204\u0208\u020e\u0217\u0223\u0227\u0230\u0235\u023d" +
          "\u0241\u0248\u024d\u0251\u025a\u0260\u0265\u0269\u026d\u0272\u0275\u0277" +
          "\u027f\u0285\u0289\u028b\u028f\u0292\u0297\u029b\u02a2\u02aa\u02b0\u02b2" +
          "\u02b6\u02bc\u02c0\u02c6\u02ca\u02cd\u02d3\u02d6\u02dc\u02e5\u02ed\u02f3" +
          "\u02fc\u02ff\u0305\u030b\u0314\u0319\u031b\u031e\u0326\u032f\u0336\u0339" +
          "\u033d\u0345\u0349\u034d\u0351\u0353\u0357\u035d\u0366\u036d\u0372\u0378" +
          "\u0382\u038b\u03a2\u03a5\u03a8\u03ae\u03b1\u03b7\u03ba\u03c4\u03cd\u03d2" +
          "\u03dc\u03e1\u03e6\u03eb\u03f0\u03f9\u03ff\u0407\u040c\u0413\u0416\u0420" +
          "\u0425\u0431\u0435\u0439\u043d\u043f\u0443\u0446\u0455\u045b\u046e\u047e" +
          "\u04a9\u04bb\u04c3\u04c5\u04db\u04dd\u04e6\u04e8\u04ec\u04ef\u04f2\u04f7" +
          "\u04fb\u04ff\u0506\u050c\u050f\u0511\u0519\u051d\u0529\u052e\u0534\u0536" +
          "\u053c\u0540";

  public static final ATN _ATN =
      new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  protected static final DFA[] _decisionToDFA;

  protected static final PredictionContextCache _sharedContextCache =
      new PredictionContextCache();

  private static final String[] _LITERAL_NAMES = {
      null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'",
      "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'",
      "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'",
      "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'",
      "'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'",
      "'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'",
      "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'",
      "'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null,
      null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'",
      "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'",
      "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'",
      "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='",
      "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null,
      "'@'", "'...'", "'\t'", "'\r'", "'\n'", "'\\u000C'", "' '"
  };

  private static final String[] _SYMBOLIC_NAMES = {
      null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
      "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE",
      "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS",
      "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE",
      "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP",
      "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT",
      "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral",
      "BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral",
      "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA",
      "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL",
      "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL",
      "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN",
      "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN",
      "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT",
      "ELLIPSIS", "TS", "RS", "NLS", "NPS", "SS", "COMMENT", "LINE_COMMENT"
  };

  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }

  public JavaParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() {
    return "Java.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public final CompilationUnitContext compilationUnit()
  throws RecognitionException {
    CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_compilationUnit);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(269);
        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
          case 1: {
            setState(268);
            packageDeclaration();
          }
          break;
        }
        setState(272);
        _la = _input.LA(1);
        if (_la == IMPORT) {
          {
            setState(271);
            importDeclarations();
          }
        }

        setState(275);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L
                << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L
                << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la == AT) {
          {
            setState(274);
            typeDeclarations();
          }
        }

        setState(277);
        match(EOF);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ImportDeclarationsContext importDeclarations()
  throws RecognitionException {
    ImportDeclarationsContext _localctx = new ImportDeclarationsContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_importDeclarations);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(280);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(279);
              importDeclaration();
            }
          }
          setState(282);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == IMPORT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeDeclarationsContext typeDeclarations()
  throws RecognitionException {
    TypeDeclarationsContext _localctx = new TypeDeclarationsContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_typeDeclarations);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(285);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(284);
              typeDeclaration();
            }
          }
          setState(287);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L
                << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L
                << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la == AT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final PackageDeclarationContext packageDeclaration()
  throws RecognitionException {
    PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_packageDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(290);
        _la = _input.LA(1);
        if (_la == AT) {
          {
            setState(289);
            annotation();
          }
        }

        setState(292);
        match(PACKAGE);
        setState(293);
        qualifiedName();
        setState(294);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationsContext annotations()
  throws RecognitionException {
    AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_annotations);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(297);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(296);
              annotation();
            }
          }
          setState(299);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == AT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ImportDeclarationContext importDeclaration()
  throws RecognitionException {
    ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_importDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(301);
        match(IMPORT);
        setState(303);
        _la = _input.LA(1);
        if (_la == STATIC) {
          {
            setState(302);
            match(STATIC);
          }
        }

        setState(305);
        qualifiedName();
        setState(308);
        _la = _input.LA(1);
        if (_la == DOT) {
          {
            setState(306);
            match(DOT);
            setState(307);
            match(MUL);
          }
        }

        setState(310);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeDeclarationContext typeDeclaration()
  throws RecognitionException {
    TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_typeDeclaration);
    int _la;
    try {
      setState(329);
      switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(313);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 &&
              ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED)
                  | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
            {
              setState(312);
              classOrInterfaceModifiers();
            }
          }

          setState(315);
          classDeclaration();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(317);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 &&
              ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED)
                  | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
            {
              setState(316);
              classOrInterfaceModifiers();
            }
          }

          setState(319);
          enumDeclaration();
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(321);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 &&
              ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED)
                  | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
            {
              setState(320);
              classOrInterfaceModifiers();
            }
          }

          setState(323);
          interfaceDeclaration();
        }
        break;
        case 4:
          enterOuterAlt(_localctx, 4);
        {
          setState(325);
          switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
            case 1: {
              setState(324);
              classOrInterfaceModifiers();
            }
            break;
          }
          setState(327);
          annotationTypeDeclaration();
        }
        break;
        case 5:
          enterOuterAlt(_localctx, 5);
        {
          setState(328);
          match(SEMI);
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers()
  throws RecognitionException {
    ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx,
        getState());
    enterRule(_localctx, 14, RULE_classOrInterfaceModifiers);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(332);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(331);
                classOrInterfaceModifier();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(334);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ModifierContext modifier()
  throws RecognitionException {
    ModifierContext _localctx = new ModifierContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_modifier);
    int _la;
    try {
      setState(338);
      switch (_input.LA(1)) {
        case ABSTRACT:
        case FINAL:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:
        case STRICTFP:
        case AT:
          enterOuterAlt(_localctx, 1);
        {
          setState(336);
          classOrInterfaceModifier();
        }
        break;
        case NATIVE:
        case SYNCHRONIZED:
        case TRANSIENT:
        case VOLATILE:
          enterOuterAlt(_localctx, 2);
        {
          setState(337);
          _la = _input.LA(1);
          if (!((((_la) & ~0x3f) == 0 &&
              ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L
                  << VOLATILE))) != 0))) {
            _errHandler.recoverInline(this);
          } else {
            consume();
          }
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ClassOrInterfaceModifierContext classOrInterfaceModifier()
  throws RecognitionException {
    ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx,
        getState());
    enterRule(_localctx, 18, RULE_classOrInterfaceModifier);
    int _la;
    try {
      setState(342);
      switch (_input.LA(1)) {
        case AT:
          enterOuterAlt(_localctx, 1);
        {
          setState(340);
          annotation();
        }
        break;
        case ABSTRACT:
        case FINAL:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:
        case STRICTFP:
          enterOuterAlt(_localctx, 2);
        {
          setState(341);
          _la = _input.LA(1);
          if (!((((_la) & ~0x3f) == 0 &&
              ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED)
                  | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0))) {
            _errHandler.recoverInline(this);
          } else {
            consume();
          }
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final VariableModifierContext variableModifier()
  throws RecognitionException {
    VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_variableModifier);
    try {
      setState(346);
      switch (_input.LA(1)) {
        case FINAL:
          enterOuterAlt(_localctx, 1);
        {
          setState(344);
          match(FINAL);
        }
        break;
        case AT:
          enterOuterAlt(_localctx, 2);
        {
          setState(345);
          annotation();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ClassDeclarationContext classDeclaration()
  throws RecognitionException {
    ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_classDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(348);
        match(CLASS);
        setState(349);
        match(Identifier);
        setState(351);
        _la = _input.LA(1);
        if (_la == LT) {
          {
            setState(350);
            typeParameters();
          }
        }

        setState(355);
        _la = _input.LA(1);
        if (_la == EXTENDS) {
          {
            setState(353);
            match(EXTENDS);
            setState(354);
            type();
          }
        }

        setState(359);
        _la = _input.LA(1);
        if (_la == IMPLEMENTS) {
          {
            setState(357);
            match(IMPLEMENTS);
            setState(358);
            typeList();
          }
        }

        setState(361);
        classBody();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeParametersContext typeParameters()
  throws RecognitionException {
    TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_typeParameters);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(363);
        match(LT);
        setState(364);
        typeParameter();
        setState(366);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(365);
            commaThenTypeParameterList();
          }
        }

        setState(368);
        match(GT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenTypeParameterListContext commaThenTypeParameterList()
  throws RecognitionException {
    CommaThenTypeParameterListContext _localctx = new CommaThenTypeParameterListContext(_ctx,
        getState());
    enterRule(_localctx, 26, RULE_commaThenTypeParameterList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(372);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(370);
              match(COMMA);
              setState(371);
              typeParameter();
            }
          }
          setState(374);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == COMMA);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeParameterContext typeParameter()
  throws RecognitionException {
    TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_typeParameter);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(376);
        match(Identifier);
        setState(379);
        _la = _input.LA(1);
        if (_la == EXTENDS) {
          {
            setState(377);
            match(EXTENDS);
            setState(378);
            typeBound();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeBoundContext typeBound()
  throws RecognitionException {
    TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_typeBound);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(381);
        type();
        setState(383);
        _la = _input.LA(1);
        if (_la == BITAND) {
          {
            setState(382);
            ampThenTypeList();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AmpThenTypeListContext ampThenTypeList()
  throws RecognitionException {
    AmpThenTypeListContext _localctx = new AmpThenTypeListContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_ampThenTypeList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(387);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(385);
              match(BITAND);
              setState(386);
              type();
            }
          }
          setState(389);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == BITAND);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final EnumDeclarationContext enumDeclaration()
  throws RecognitionException {
    EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_enumDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(391);
        match(ENUM);
        setState(392);
        match(Identifier);
        setState(395);
        _la = _input.LA(1);
        if (_la == IMPLEMENTS) {
          {
            setState(393);
            match(IMPLEMENTS);
            setState(394);
            typeList();
          }
        }

        setState(397);
        match(LBRACE);
        setState(399);
        _la = _input.LA(1);
        if (_la == Identifier || _la == AT) {
          {
            setState(398);
            enumConstants();
          }
        }

        setState(402);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(401);
            match(COMMA);
          }
        }

        setState(405);
        _la = _input.LA(1);
        if (_la == SEMI) {
          {
            setState(404);
            enumBodyDeclarations();
          }
        }

        setState(407);
        match(RBRACE);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final EnumConstantsContext enumConstants()
  throws RecognitionException {
    EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_enumConstants);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(409);
        enumConstant();
        setState(411);
        switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
          case 1: {
            setState(410);
            commaThenEnumConstantList();
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenEnumConstantListContext commaThenEnumConstantList()
  throws RecognitionException {
    CommaThenEnumConstantListContext _localctx = new CommaThenEnumConstantListContext(_ctx,
        getState());
    enterRule(_localctx, 38, RULE_commaThenEnumConstantList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(415);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(413);
                match(COMMA);
                setState(414);
                enumConstant();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(417);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final EnumConstantContext enumConstant()
  throws RecognitionException {
    EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_enumConstant);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(420);
        _la = _input.LA(1);
        if (_la == AT) {
          {
            setState(419);
            annotations();
          }
        }

        setState(422);
        match(Identifier);
        setState(424);
        _la = _input.LA(1);
        if (_la == LPAREN) {
          {
            setState(423);
            arguments();
          }
        }

        setState(427);
        _la = _input.LA(1);
        if (_la == LBRACE) {
          {
            setState(426);
            classBody();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final EnumBodyDeclarationsContext enumBodyDeclarations()
  throws RecognitionException {
    EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_enumBodyDeclarations);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(429);
        match(SEMI);
        setState(431);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L
                << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L
                << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L
                << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP)
                | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L
                << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT
                - 68)))) != 0)) {
          {
            setState(430);
            classBodyDeclarations();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ClassBodyDeclarationsContext classBodyDeclarations()
  throws RecognitionException {
    ClassBodyDeclarationsContext _localctx = new ClassBodyDeclarationsContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_classBodyDeclarations);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(434);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(433);
              classBodyDeclaration();
            }
          }
          setState(436);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L
                << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L
                << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L
                << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP)
                | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L
                << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT
                - 68)))) != 0));
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final InterfaceDeclarationContext interfaceDeclaration()
  throws RecognitionException {
    InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_interfaceDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(438);
        match(INTERFACE);
        setState(439);
        match(Identifier);
        setState(441);
        _la = _input.LA(1);
        if (_la == LT) {
          {
            setState(440);
            typeParameters();
          }
        }

        setState(445);
        _la = _input.LA(1);
        if (_la == EXTENDS) {
          {
            setState(443);
            match(EXTENDS);
            setState(444);
            typeList();
          }
        }

        setState(447);
        interfaceBody();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeListContext typeList()
  throws RecognitionException {
    TypeListContext _localctx = new TypeListContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_typeList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(449);
        type();
        setState(451);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(450);
            commaThenTypeList();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenTypeListContext commaThenTypeList()
  throws RecognitionException {
    CommaThenTypeListContext _localctx = new CommaThenTypeListContext(_ctx, getState());
    enterRule(_localctx, 50, RULE_commaThenTypeList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(455);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(453);
              match(COMMA);
              setState(454);
              type();
            }
          }
          setState(457);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == COMMA);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ClassBodyContext classBody()
  throws RecognitionException {
    ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
    enterRule(_localctx, 52, RULE_classBody);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(459);
        match(LBRACE);
        setState(461);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L
                << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L
                << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L
                << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP)
                | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L
                << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT
                - 68)))) != 0)) {
          {
            setState(460);
            classBodyDeclarations();
          }
        }

        setState(463);
        match(RBRACE);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final InterfaceBodyContext interfaceBody()
  throws RecognitionException {
    InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
    enterRule(_localctx, 54, RULE_interfaceBody);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(465);
        match(LBRACE);
        setState(467);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L
                << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L
                << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L
                << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP)
                | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L
                << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT
                - 68)))) != 0)) {
          {
            setState(466);
            interfaceBodyDeclarations();
          }
        }

        setState(469);
        match(RBRACE);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final InterfaceBodyDeclarationsContext interfaceBodyDeclarations()
  throws RecognitionException {
    InterfaceBodyDeclarationsContext _localctx = new InterfaceBodyDeclarationsContext(_ctx,
        getState());
    enterRule(_localctx, 56, RULE_interfaceBodyDeclarations);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(472);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(471);
              interfaceBodyDeclaration();
            }
          }
          setState(474);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L
                << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L
                << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L
                << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP)
                | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L
                << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT
                - 68)))) != 0));
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ClassBodyDeclarationContext classBodyDeclaration()
  throws RecognitionException {
    ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
    enterRule(_localctx, 58, RULE_classBodyDeclaration);
    int _la;
    try {
      setState(485);
      switch (getInterpreter().adaptivePredict(_input, 46, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(476);
          match(SEMI);
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(478);
          _la = _input.LA(1);
          if (_la == STATIC) {
            {
              setState(477);
              match(STATIC);
            }
          }

          setState(480);
          block();
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(482);
          switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
            case 1: {
              setState(481);
              modifiers();
            }
            break;
          }
          setState(484);
          memberDeclaration();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ModifiersContext modifiers()
  throws RecognitionException {
    ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
    enterRule(_localctx, 60, RULE_modifiers);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(488);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(487);
                modifier();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(490);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final MemberDeclarationContext memberDeclaration()
  throws RecognitionException {
    MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
    enterRule(_localctx, 62, RULE_memberDeclaration);
    try {
      setState(501);
      switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(492);
          methodDeclaration();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(493);
          genericMethodDeclaration();
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(494);
          fieldDeclaration();
        }
        break;
        case 4:
          enterOuterAlt(_localctx, 4);
        {
          setState(495);
          constructorDeclaration();
        }
        break;
        case 5:
          enterOuterAlt(_localctx, 5);
        {
          setState(496);
          genericConstructorDeclaration();
        }
        break;
        case 6:
          enterOuterAlt(_localctx, 6);
        {
          setState(497);
          interfaceDeclaration();
        }
        break;
        case 7:
          enterOuterAlt(_localctx, 7);
        {
          setState(498);
          annotationTypeDeclaration();
        }
        break;
        case 8:
          enterOuterAlt(_localctx, 8);
        {
          setState(499);
          classDeclaration();
        }
        break;
        case 9:
          enterOuterAlt(_localctx, 9);
        {
          setState(500);
          enumDeclaration();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final MethodDeclarationContext methodDeclaration()
  throws RecognitionException {
    MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
    enterRule(_localctx, 64, RULE_methodDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(505);
        switch (_input.LA(1)) {
          case BOOLEAN:
          case BYTE:
          case CHAR:
          case DOUBLE:
          case FLOAT:
          case INT:
          case LONG:
          case SHORT:
          case Identifier: {
            setState(503);
            type();
          }
          break;
          case VOID: {
            setState(504);
            match(VOID);
          }
          break;
          default:
            throw new NoViableAltException(this);
        }
        setState(507);
        match(Identifier);
        setState(508);
        formalParameters();
        setState(510);
        _la = _input.LA(1);
        if (_la == LBRACK) {
          {
            setState(509);
            squareBracketsList();
          }
        }

        setState(514);
        _la = _input.LA(1);
        if (_la == THROWS) {
          {
            setState(512);
            match(THROWS);
            setState(513);
            qualifiedNameList();
          }
        }

        setState(518);
        switch (_input.LA(1)) {
          case LBRACE: {
            setState(516);
            methodBody();
          }
          break;
          case SEMI: {
            setState(517);
            match(SEMI);
          }
          break;
          default:
            throw new NoViableAltException(this);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final SquareBracketsListContext squareBracketsList()
  throws RecognitionException {
    SquareBracketsListContext _localctx = new SquareBracketsListContext(_ctx, getState());
    enterRule(_localctx, 66, RULE_squareBracketsList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(522);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(520);
                match(LBRACK);
                setState(521);
                match(RBRACK);
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(524);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final GenericMethodDeclarationContext genericMethodDeclaration()
  throws RecognitionException {
    GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx,
        getState());
    enterRule(_localctx, 68, RULE_genericMethodDeclaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(526);
        typeParameters();
        setState(527);
        methodDeclaration();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ConstructorDeclarationContext constructorDeclaration()
  throws RecognitionException {
    ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
    enterRule(_localctx, 70, RULE_constructorDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(529);
        match(Identifier);
        setState(530);
        formalParameters();
        setState(533);
        _la = _input.LA(1);
        if (_la == THROWS) {
          {
            setState(531);
            match(THROWS);
            setState(532);
            qualifiedNameList();
          }
        }

        setState(535);
        constructorBody();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final GenericConstructorDeclarationContext genericConstructorDeclaration()
  throws RecognitionException {
    GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx,
        getState());
    enterRule(_localctx, 72, RULE_genericConstructorDeclaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(537);
        typeParameters();
        setState(538);
        constructorDeclaration();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final FieldDeclarationContext fieldDeclaration()
  throws RecognitionException {
    FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
    enterRule(_localctx, 74, RULE_fieldDeclaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(540);
        type();
        setState(541);
        variableDeclarators();
        setState(542);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final InterfaceBodyDeclarationContext interfaceBodyDeclaration()
  throws RecognitionException {
    InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx,
        getState());
    enterRule(_localctx, 76, RULE_interfaceBodyDeclaration);
    try {
      setState(549);
      switch (_input.LA(1)) {
        case ABSTRACT:
        case BOOLEAN:
        case BYTE:
        case CHAR:
        case CLASS:
        case DOUBLE:
        case ENUM:
        case FINAL:
        case FLOAT:
        case INT:
        case INTERFACE:
        case LONG:
        case NATIVE:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case SHORT:
        case STATIC:
        case STRICTFP:
        case SYNCHRONIZED:
        case TRANSIENT:
        case VOID:
        case VOLATILE:
        case LT:
        case Identifier:
        case AT:
          enterOuterAlt(_localctx, 1);
        {
          setState(545);
          switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
            case 1: {
              setState(544);
              modifiers();
            }
            break;
          }
          setState(547);
          interfaceMemberDeclaration();
        }
        break;
        case SEMI:
          enterOuterAlt(_localctx, 2);
        {
          setState(548);
          match(SEMI);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final InterfaceMemberDeclarationContext interfaceMemberDeclaration()
  throws RecognitionException {
    InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx,
        getState());
    enterRule(_localctx, 78, RULE_interfaceMemberDeclaration);
    try {
      setState(558);
      switch (getInterpreter().adaptivePredict(_input, 57, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(551);
          constDeclaration();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(552);
          interfaceMethodDeclaration();
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(553);
          genericInterfaceMethodDeclaration();
        }
        break;
        case 4:
          enterOuterAlt(_localctx, 4);
        {
          setState(554);
          interfaceDeclaration();
        }
        break;
        case 5:
          enterOuterAlt(_localctx, 5);
        {
          setState(555);
          annotationTypeDeclaration();
        }
        break;
        case 6:
          enterOuterAlt(_localctx, 6);
        {
          setState(556);
          classDeclaration();
        }
        break;
        case 7:
          enterOuterAlt(_localctx, 7);
        {
          setState(557);
          enumDeclaration();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ConstDeclarationContext constDeclaration()
  throws RecognitionException {
    ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
    enterRule(_localctx, 80, RULE_constDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(560);
        type();
        setState(561);
        constantDeclarator();
        setState(563);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(562);
            commaThenConstantDeclarationList();
          }
        }

        setState(565);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenConstantDeclarationListContext commaThenConstantDeclarationList()
  throws RecognitionException {
    CommaThenConstantDeclarationListContext _localctx = new CommaThenConstantDeclarationListContext(
        _ctx, getState());
    enterRule(_localctx, 82, RULE_commaThenConstantDeclarationList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(569);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(567);
              match(COMMA);
              setState(568);
              constantDeclarator();
            }
          }
          setState(571);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == COMMA);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ConstantDeclaratorContext constantDeclarator()
  throws RecognitionException {
    ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
    enterRule(_localctx, 84, RULE_constantDeclarator);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(573);
        match(Identifier);
        setState(575);
        _la = _input.LA(1);
        if (_la == LBRACK) {
          {
            setState(574);
            squareBracketsList();
          }
        }

        setState(577);
        match(ASSIGN);
        setState(578);
        variableInitializer();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final InterfaceMethodDeclarationContext interfaceMethodDeclaration()
  throws RecognitionException {
    InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx,
        getState());
    enterRule(_localctx, 86, RULE_interfaceMethodDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(582);
        switch (_input.LA(1)) {
          case BOOLEAN:
          case BYTE:
          case CHAR:
          case DOUBLE:
          case FLOAT:
          case INT:
          case LONG:
          case SHORT:
          case Identifier: {
            setState(580);
            type();
          }
          break;
          case VOID: {
            setState(581);
            match(VOID);
          }
          break;
          default:
            throw new NoViableAltException(this);
        }
        setState(584);
        match(Identifier);
        setState(585);
        formalParameters();
        setState(587);
        _la = _input.LA(1);
        if (_la == LBRACK) {
          {
            setState(586);
            squareBracketsList();
          }
        }

        setState(591);
        _la = _input.LA(1);
        if (_la == THROWS) {
          {
            setState(589);
            match(THROWS);
            setState(590);
            qualifiedNameList();
          }
        }

        setState(593);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration()
  throws RecognitionException {
    GenericInterfaceMethodDeclarationContext _localctx
        = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
    enterRule(_localctx, 88, RULE_genericInterfaceMethodDeclaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(595);
        typeParameters();
        setState(596);
        interfaceMethodDeclaration();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final VariableDeclaratorsContext variableDeclarators()
  throws RecognitionException {
    VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
    enterRule(_localctx, 90, RULE_variableDeclarators);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(598);
        variableDeclarator();
        setState(600);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(599);
            commaThenVariableDeclarationList();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenVariableDeclarationListContext commaThenVariableDeclarationList()
  throws RecognitionException {
    CommaThenVariableDeclarationListContext _localctx = new CommaThenVariableDeclarationListContext(
        _ctx, getState());
    enterRule(_localctx, 92, RULE_commaThenVariableDeclarationList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(604);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(602);
              match(COMMA);
              setState(603);
              variableDeclarator();
            }
          }
          setState(606);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == COMMA);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final VariableDeclaratorContext variableDeclarator()
  throws RecognitionException {
    VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
    enterRule(_localctx, 94, RULE_variableDeclarator);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(608);
        variableDeclaratorId();
        setState(611);
        _la = _input.LA(1);
        if (_la == ASSIGN) {
          {
            setState(609);
            match(ASSIGN);
            setState(610);
            variableInitializer();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final VariableDeclaratorIdContext variableDeclaratorId()
  throws RecognitionException {
    VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
    enterRule(_localctx, 96, RULE_variableDeclaratorId);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(613);
        match(Identifier);
        setState(615);
        _la = _input.LA(1);
        if (_la == LBRACK) {
          {
            setState(614);
            squareBracketsList();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final VariableInitializerContext variableInitializer()
  throws RecognitionException {
    VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
    enterRule(_localctx, 98, RULE_variableInitializer);
    try {
      setState(619);
      switch (_input.LA(1)) {
        case LBRACE:
          enterOuterAlt(_localctx, 1);
        {
          setState(617);
          arrayInitializer();
        }
        break;
        case BOOLEAN:
        case BYTE:
        case CHAR:
        case DOUBLE:
        case FLOAT:
        case INT:
        case LONG:
        case NEW:
        case SHORT:
        case SUPER:
        case THIS:
        case VOID:
        case IntegerLiteral:
        case FloatingPointLiteral:
        case BooleanLiteral:
        case CharacterLiteral:
        case StringLiteral:
        case NullLiteral:
        case LPAREN:
        case LT:
        case BANG:
        case TILDE:
        case INC:
        case DEC:
        case ADD:
        case SUB:
        case Identifier:
          enterOuterAlt(_localctx, 2);
        {
          setState(618);
          expression(0);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ArrayInitializerContext arrayInitializer()
  throws RecognitionException {
    ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
    enterRule(_localctx, 100, RULE_arrayInitializer);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(621);
        match(LBRACE);
        setState(629);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L
                << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER)
                | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L
                << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L
                << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
            || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68))
                | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68))
                | (1L << (Identifier - 68)))) != 0)) {
          {
            setState(622);
            variableInitializer();
            setState(624);
            switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
              case 1: {
                setState(623);
                commaThenVariableInitializerList();
              }
              break;
            }
            setState(627);
            _la = _input.LA(1);
            if (_la == COMMA) {
              {
                setState(626);
                match(COMMA);
              }
            }
          }
        }

        setState(631);
        match(RBRACE);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenVariableInitializerListContext commaThenVariableInitializerList()
  throws RecognitionException {
    CommaThenVariableInitializerListContext _localctx = new CommaThenVariableInitializerListContext(
        _ctx, getState());
    enterRule(_localctx, 102, RULE_commaThenVariableInitializerList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(635);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(633);
                match(COMMA);
                setState(634);
                variableInitializer();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(637);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 72, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final EnumConstantNameContext enumConstantName()
  throws RecognitionException {
    EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
    enterRule(_localctx, 104, RULE_enumConstantName);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(639);
        match(Identifier);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeContext type()
  throws RecognitionException {
    TypeContext _localctx = new TypeContext(_ctx, getState());
    enterRule(_localctx, 106, RULE_type);
    try {
      setState(649);
      switch (_input.LA(1)) {
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(641);
          classOrInterfaceType();
          setState(643);
          switch (getInterpreter().adaptivePredict(_input, 73, _ctx)) {
            case 1: {
              setState(642);
              squareBracketsList();
            }
            break;
          }
        }
        break;
        case BOOLEAN:
        case BYTE:
        case CHAR:
        case DOUBLE:
        case FLOAT:
        case INT:
        case LONG:
        case SHORT:
          enterOuterAlt(_localctx, 2);
        {
          setState(645);
          primitiveType();
          setState(647);
          switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
            case 1: {
              setState(646);
              squareBracketsList();
            }
            break;
          }
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ClassOrInterfaceTypeContext classOrInterfaceType()
  throws RecognitionException {
    ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
    enterRule(_localctx, 108, RULE_classOrInterfaceType);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(651);
        match(Identifier);
        setState(653);
        switch (getInterpreter().adaptivePredict(_input, 76, _ctx)) {
          case 1: {
            setState(652);
            typeArguments();
          }
          break;
        }
        setState(656);
        switch (getInterpreter().adaptivePredict(_input, 77, _ctx)) {
          case 1: {
            setState(655);
            dotThenIdentifierAndTypeArgumentsList();
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final DotThenIdentifierAndTypeArgumentsListContext dotThenIdentifierAndTypeArgumentsList()
  throws RecognitionException {
    DotThenIdentifierAndTypeArgumentsListContext _localctx
        = new DotThenIdentifierAndTypeArgumentsListContext(_ctx, getState());
    enterRule(_localctx, 110, RULE_dotThenIdentifierAndTypeArgumentsList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(663);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(658);
                match(DOT);
                setState(659);
                match(Identifier);
                setState(661);
                switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
                  case 1: {
                    setState(660);
                    typeArguments();
                  }
                  break;
                }
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(665);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 79, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final PrimitiveTypeContext primitiveType()
  throws RecognitionException {
    PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
    enterRule(_localctx, 112, RULE_primitiveType);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(667);
        _la = _input.LA(1);
        if (!((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L
                << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeArgumentsContext typeArguments()
  throws RecognitionException {
    TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
    enterRule(_localctx, 114, RULE_typeArguments);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(669);
        match(LT);
        setState(670);
        typeArgument();
        setState(672);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(671);
            commaThenTypeArgumentsList();
          }
        }

        setState(674);
        match(GT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenTypeArgumentsListContext commaThenTypeArgumentsList()
  throws RecognitionException {
    CommaThenTypeArgumentsListContext _localctx = new CommaThenTypeArgumentsListContext(_ctx,
        getState());
    enterRule(_localctx, 116, RULE_commaThenTypeArgumentsList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(678);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(676);
              match(COMMA);
              setState(677);
              typeArgument();
            }
          }
          setState(680);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == COMMA);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeArgumentContext typeArgument()
  throws RecognitionException {
    TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
    enterRule(_localctx, 118, RULE_typeArgument);
    int _la;
    try {
      setState(688);
      switch (_input.LA(1)) {
        case BOOLEAN:
        case BYTE:
        case CHAR:
        case DOUBLE:
        case FLOAT:
        case INT:
        case LONG:
        case SHORT:
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(682);
          type();
        }
        break;
        case QUESTION:
          enterOuterAlt(_localctx, 2);
        {
          setState(683);
          match(QUESTION);
          setState(686);
          _la = _input.LA(1);
          if (_la == EXTENDS || _la == SUPER) {
            {
              setState(684);
              _la = _input.LA(1);
              if (!(_la == EXTENDS || _la == SUPER)) {
                _errHandler.recoverInline(this);
              } else {
                consume();
              }
              setState(685);
              type();
            }
          }
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final QualifiedNameListContext qualifiedNameList()
  throws RecognitionException {
    QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
    enterRule(_localctx, 120, RULE_qualifiedNameList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(690);
        qualifiedName();
        setState(692);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(691);
            commaThenQualifiedNameList();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenQualifiedNameListContext commaThenQualifiedNameList()
  throws RecognitionException {
    CommaThenQualifiedNameListContext _localctx = new CommaThenQualifiedNameListContext(_ctx,
        getState());
    enterRule(_localctx, 122, RULE_commaThenQualifiedNameList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(696);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(694);
              match(COMMA);
              setState(695);
              qualifiedName();
            }
          }
          setState(698);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == COMMA);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final FormalParametersContext formalParameters()
  throws RecognitionException {
    FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
    enterRule(_localctx, 124, RULE_formalParameters);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(700);
        match(LPAREN);
        setState(702);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L
                << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)
            || _la == Identifier || _la == AT) {
          {
            setState(701);
            formalParameterList();
          }
        }

        setState(704);
        match(RPAREN);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final FormalParameterListContext formalParameterList()
  throws RecognitionException {
    FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
    enterRule(_localctx, 126, RULE_formalParameterList);
    int _la;
    try {
      setState(715);
      switch (getInterpreter().adaptivePredict(_input, 89, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(706);
          formalParameter();
          setState(708);
          switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
            case 1: {
              setState(707);
              commaThenFormalParameterList();
            }
            break;
          }
          setState(712);
          _la = _input.LA(1);
          if (_la == COMMA) {
            {
              setState(710);
              match(COMMA);
              setState(711);
              lastFormalParameter();
            }
          }
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(714);
          lastFormalParameter();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenFormalParameterListContext commaThenFormalParameterList()
  throws RecognitionException {
    CommaThenFormalParameterListContext _localctx = new CommaThenFormalParameterListContext(_ctx,
        getState());
    enterRule(_localctx, 128, RULE_commaThenFormalParameterList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(719);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(717);
                match(COMMA);
                setState(718);
                formalParameter();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(721);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 90, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final FormalParameterContext formalParameter()
  throws RecognitionException {
    FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
    enterRule(_localctx, 130, RULE_formalParameter);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(724);
        _la = _input.LA(1);
        if (_la == FINAL || _la == AT) {
          {
            setState(723);
            variableModifiers();
          }
        }

        setState(726);
        type();
        setState(727);
        variableDeclaratorId();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LastFormalParameterContext lastFormalParameter()
  throws RecognitionException {
    LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
    enterRule(_localctx, 132, RULE_lastFormalParameter);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(730);
        _la = _input.LA(1);
        if (_la == FINAL || _la == AT) {
          {
            setState(729);
            variableModifiers();
          }
        }

        setState(732);
        type();
        setState(733);
        match(ELLIPSIS);
        setState(734);
        variableDeclaratorId();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final VariableModifiersContext variableModifiers()
  throws RecognitionException {
    VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
    enterRule(_localctx, 134, RULE_variableModifiers);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(737);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(736);
              variableModifier();
            }
          }
          setState(739);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == FINAL || _la == AT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final MethodBodyContext methodBody()
  throws RecognitionException {
    MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
    enterRule(_localctx, 136, RULE_methodBody);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(741);
        block();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ConstructorBodyContext constructorBody()
  throws RecognitionException {
    ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
    enterRule(_localctx, 138, RULE_constructorBody);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(743);
        block();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final QualifiedNameContext qualifiedName()
  throws RecognitionException {
    QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
    enterRule(_localctx, 140, RULE_qualifiedName);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(745);
        match(Identifier);
        setState(747);
        switch (getInterpreter().adaptivePredict(_input, 94, _ctx)) {
          case 1: {
            setState(746);
            dotThenIdentifierList();
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final DotThenIdentifierListContext dotThenIdentifierList()
  throws RecognitionException {
    DotThenIdentifierListContext _localctx = new DotThenIdentifierListContext(_ctx, getState());
    enterRule(_localctx, 142, RULE_dotThenIdentifierList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(751);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(749);
                match(DOT);
                setState(750);
                match(Identifier);
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(753);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 95, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LiteralContext literal()
  throws RecognitionException {
    LiteralContext _localctx = new LiteralContext(_ctx, getState());
    enterRule(_localctx, 144, RULE_literal);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(755);
        _la = _input.LA(1);
        if (!((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L
                << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L
                << NullLiteral))) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationContext annotation()
  throws RecognitionException {
    AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
    enterRule(_localctx, 146, RULE_annotation);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(757);
        match(AT);
        setState(758);
        annotationName();
        setState(765);
        _la = _input.LA(1);
        if (_la == LPAREN) {
          {
            setState(759);
            match(LPAREN);
            setState(762);
            switch (getInterpreter().adaptivePredict(_input, 96, _ctx)) {
              case 1: {
                setState(760);
                elementValuePairs();
              }
              break;
              case 2: {
                setState(761);
                elementValue();
              }
              break;
            }
            setState(764);
            match(RPAREN);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationNameContext annotationName()
  throws RecognitionException {
    AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
    enterRule(_localctx, 148, RULE_annotationName);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(767);
        qualifiedName();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ElementValuePairsContext elementValuePairs()
  throws RecognitionException {
    ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
    enterRule(_localctx, 150, RULE_elementValuePairs);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(769);
        elementValuePair();
        setState(771);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(770);
            commaThenElementValuePairList();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenElementValuePairListContext commaThenElementValuePairList()
  throws RecognitionException {
    CommaThenElementValuePairListContext _localctx = new CommaThenElementValuePairListContext(_ctx,
        getState());
    enterRule(_localctx, 152, RULE_commaThenElementValuePairList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(775);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(773);
              match(COMMA);
              setState(774);
              elementValuePair();
            }
          }
          setState(777);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == COMMA);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ElementValuePairContext elementValuePair()
  throws RecognitionException {
    ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
    enterRule(_localctx, 154, RULE_elementValuePair);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(779);
        match(Identifier);
        setState(780);
        match(ASSIGN);
        setState(781);
        elementValue();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ElementValueContext elementValue()
  throws RecognitionException {
    ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
    enterRule(_localctx, 156, RULE_elementValue);
    try {
      setState(786);
      switch (_input.LA(1)) {
        case BOOLEAN:
        case BYTE:
        case CHAR:
        case DOUBLE:
        case FLOAT:
        case INT:
        case LONG:
        case NEW:
        case SHORT:
        case SUPER:
        case THIS:
        case VOID:
        case IntegerLiteral:
        case FloatingPointLiteral:
        case BooleanLiteral:
        case CharacterLiteral:
        case StringLiteral:
        case NullLiteral:
        case LPAREN:
        case LT:
        case BANG:
        case TILDE:
        case INC:
        case DEC:
        case ADD:
        case SUB:
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(783);
          expression(0);
        }
        break;
        case AT:
          enterOuterAlt(_localctx, 2);
        {
          setState(784);
          annotation();
        }
        break;
        case LBRACE:
          enterOuterAlt(_localctx, 3);
        {
          setState(785);
          elementValueArrayInitializer();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ElementValueArrayInitializerContext elementValueArrayInitializer()
  throws RecognitionException {
    ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx,
        getState());
    enterRule(_localctx, 158, RULE_elementValueArrayInitializer);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(788);
        match(LBRACE);
        setState(793);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L
                << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER)
                | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L
                << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L
                << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
            || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68))
                | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68))
                | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
          {
            setState(789);
            elementValue();
            setState(791);
            switch (getInterpreter().adaptivePredict(_input, 101, _ctx)) {
              case 1: {
                setState(790);
                commaThenElementValueList();
              }
              break;
            }
          }
        }

        setState(796);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(795);
            match(COMMA);
          }
        }

        setState(798);
        match(RBRACE);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenElementValueListContext commaThenElementValueList()
  throws RecognitionException {
    CommaThenElementValueListContext _localctx = new CommaThenElementValueListContext(_ctx,
        getState());
    enterRule(_localctx, 160, RULE_commaThenElementValueList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(802);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(800);
                match(COMMA);
                setState(801);
                elementValue();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(804);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 104, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationTypeDeclarationContext annotationTypeDeclaration()
  throws RecognitionException {
    AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx,
        getState());
    enterRule(_localctx, 162, RULE_annotationTypeDeclaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(806);
        match(AT);
        setState(807);
        match(INTERFACE);
        setState(808);
        match(Identifier);
        setState(809);
        annotationTypeBody();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationTypeBodyContext annotationTypeBody()
  throws RecognitionException {
    AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
    enterRule(_localctx, 164, RULE_annotationTypeBody);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(811);
        match(LBRACE);
        setState(813);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L
                << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L
                << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L
                << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP)
                | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0)
            || _la == Identifier || _la == AT) {
          {
            setState(812);
            annotationTypeElementDeclarationsList();
          }
        }

        setState(815);
        match(RBRACE);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationTypeElementDeclarationsListContext annotationTypeElementDeclarationsList()
  throws RecognitionException {
    AnnotationTypeElementDeclarationsListContext _localctx
        = new AnnotationTypeElementDeclarationsListContext(_ctx, getState());
    enterRule(_localctx, 166, RULE_annotationTypeElementDeclarationsList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(818);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(817);
              annotationTypeElementDeclaration();
            }
          }
          setState(820);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L
                << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L
                << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L
                << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP)
                | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0)
            || _la == Identifier || _la == AT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration()
  throws RecognitionException {
    AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(
        _ctx, getState());
    enterRule(_localctx, 168, RULE_annotationTypeElementDeclaration);
    try {
      setState(827);
      switch (_input.LA(1)) {
        case ABSTRACT:
        case BOOLEAN:
        case BYTE:
        case CHAR:
        case CLASS:
        case DOUBLE:
        case ENUM:
        case FINAL:
        case FLOAT:
        case INT:
        case INTERFACE:
        case LONG:
        case NATIVE:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case SHORT:
        case STATIC:
        case STRICTFP:
        case SYNCHRONIZED:
        case TRANSIENT:
        case VOLATILE:
        case Identifier:
        case AT:
          enterOuterAlt(_localctx, 1);
        {
          setState(823);
          switch (getInterpreter().adaptivePredict(_input, 107, _ctx)) {
            case 1: {
              setState(822);
              modifiers();
            }
            break;
          }
          setState(825);
          annotationTypeElementRest();
        }
        break;
        case SEMI:
          enterOuterAlt(_localctx, 2);
        {
          setState(826);
          match(SEMI);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationTypeElementRestContext annotationTypeElementRest()
  throws RecognitionException {
    AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx,
        getState());
    enterRule(_localctx, 170, RULE_annotationTypeElementRest);
    try {
      setState(849);
      switch (_input.LA(1)) {
        case BOOLEAN:
        case BYTE:
        case CHAR:
        case DOUBLE:
        case FLOAT:
        case INT:
        case LONG:
        case SHORT:
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(829);
          type();
          setState(830);
          annotationMethodOrConstantRest();
          setState(831);
          match(SEMI);
        }
        break;
        case CLASS:
          enterOuterAlt(_localctx, 2);
        {
          setState(833);
          classDeclaration();
          setState(835);
          switch (getInterpreter().adaptivePredict(_input, 109, _ctx)) {
            case 1: {
              setState(834);
              match(SEMI);
            }
            break;
          }
        }
        break;
        case INTERFACE:
          enterOuterAlt(_localctx, 3);
        {
          setState(837);
          interfaceDeclaration();
          setState(839);
          switch (getInterpreter().adaptivePredict(_input, 110, _ctx)) {
            case 1: {
              setState(838);
              match(SEMI);
            }
            break;
          }
        }
        break;
        case ENUM:
          enterOuterAlt(_localctx, 4);
        {
          setState(841);
          enumDeclaration();
          setState(843);
          switch (getInterpreter().adaptivePredict(_input, 111, _ctx)) {
            case 1: {
              setState(842);
              match(SEMI);
            }
            break;
          }
        }
        break;
        case AT:
          enterOuterAlt(_localctx, 5);
        {
          setState(845);
          annotationTypeDeclaration();
          setState(847);
          switch (getInterpreter().adaptivePredict(_input, 112, _ctx)) {
            case 1: {
              setState(846);
              match(SEMI);
            }
            break;
          }
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest()
  throws RecognitionException {
    AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(
        _ctx, getState());
    enterRule(_localctx, 172, RULE_annotationMethodOrConstantRest);
    try {
      setState(853);
      switch (getInterpreter().adaptivePredict(_input, 114, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(851);
          annotationMethodRest();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(852);
          annotationConstantRest();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationMethodRestContext annotationMethodRest()
  throws RecognitionException {
    AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
    enterRule(_localctx, 174, RULE_annotationMethodRest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(855);
        match(Identifier);
        setState(856);
        match(LPAREN);
        setState(857);
        match(RPAREN);
        setState(859);
        _la = _input.LA(1);
        if (_la == DEFAULT) {
          {
            setState(858);
            defaultValue();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final AnnotationConstantRestContext annotationConstantRest()
  throws RecognitionException {
    AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
    enterRule(_localctx, 176, RULE_annotationConstantRest);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(861);
        variableDeclarators();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final DefaultValueContext defaultValue()
  throws RecognitionException {
    DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
    enterRule(_localctx, 178, RULE_defaultValue);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(863);
        match(DEFAULT);
        setState(864);
        elementValue();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final BlockContext block()
  throws RecognitionException {
    BlockContext _localctx = new BlockContext(_ctx, getState());
    enterRule(_localctx, 180, RULE_block);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(866);
        match(LBRACE);
        setState(868);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (
                1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L
                << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF)
                | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (
                1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC)
                | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L
                << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L
                << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L
                << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN)
                | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68))
                | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68))
                | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
          {
            setState(867);
            blockStatements();
          }
        }

        setState(870);
        match(RBRACE);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final BlockStatementsContext blockStatements()
  throws RecognitionException {
    BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
    enterRule(_localctx, 182, RULE_blockStatements);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(873);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(872);
              blockStatement();
            }
          }
          setState(875);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (
                1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L
                << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF)
                | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (
                1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC)
                | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L
                << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L
                << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L
                << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN)
                | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68))
                | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68))
                | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0));
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final BlockStatementContext blockStatement()
  throws RecognitionException {
    BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
    enterRule(_localctx, 184, RULE_blockStatement);
    try {
      setState(880);
      switch (getInterpreter().adaptivePredict(_input, 118, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(877);
          localVariableDeclarationStatement();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(878);
          statement();
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(879);
          typeDeclaration();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement()
  throws RecognitionException {
    LocalVariableDeclarationStatementContext _localctx
        = new LocalVariableDeclarationStatementContext(_ctx, getState());
    enterRule(_localctx, 186, RULE_localVariableDeclarationStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(882);
        localVariableDeclaration();
        setState(883);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final LocalVariableDeclarationContext localVariableDeclaration()
  throws RecognitionException {
    LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx,
        getState());
    enterRule(_localctx, 188, RULE_localVariableDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(886);
        _la = _input.LA(1);
        if (_la == FINAL || _la == AT) {
          {
            setState(885);
            variableModifiers();
          }
        }

        setState(888);
        type();
        setState(889);
        variableDeclarators();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final StatementContext statement()
  throws RecognitionException {
    StatementContext _localctx = new StatementContext(_ctx, getState());
    enterRule(_localctx, 190, RULE_statement);
    int _la;
    try {
      setState(986);
      switch (getInterpreter().adaptivePredict(_input, 132, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(891);
          block();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(892);
          match(ASSERT);
          setState(893);
          expression(0);
          setState(896);
          _la = _input.LA(1);
          if (_la == COLON) {
            {
              setState(894);
              match(COLON);
              setState(895);
              expression(0);
            }
          }

          setState(898);
          match(SEMI);
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(900);
          match(IF);
          setState(901);
          parExpression();
          setState(902);
          statement();
          setState(905);
          switch (getInterpreter().adaptivePredict(_input, 121, _ctx)) {
            case 1: {
              setState(903);
              match(ELSE);
              setState(904);
              statement();
            }
            break;
          }
        }
        break;
        case 4:
          enterOuterAlt(_localctx, 4);
        {
          setState(907);
          match(FOR);
          setState(908);
          match(LPAREN);
          setState(909);
          forControl();
          setState(910);
          match(RPAREN);
          setState(911);
          statement();
        }
        break;
        case 5:
          enterOuterAlt(_localctx, 5);
        {
          setState(913);
          match(WHILE);
          setState(914);
          parExpression();
          setState(915);
          statement();
        }
        break;
        case 6:
          enterOuterAlt(_localctx, 6);
        {
          setState(917);
          match(DO);
          setState(918);
          statement();
          setState(919);
          match(WHILE);
          setState(920);
          parExpression();
          setState(921);
          match(SEMI);
        }
        break;
        case 7:
          enterOuterAlt(_localctx, 7);
        {
          setState(923);
          match(TRY);
          setState(924);
          block();
          setState(934);
          switch (_input.LA(1)) {
            case CATCH: {
              setState(926);
              _errHandler.sync(this);
              _la = _input.LA(1);
              do {
                {
                  {
                    setState(925);
                    catchClause();
                  }
                }
                setState(928);
                _errHandler.sync(this);
                _la = _input.LA(1);
              } while (_la == CATCH);
              setState(931);
              _la = _input.LA(1);
              if (_la == FINALLY) {
                {
                  setState(930);
                  finallyBlock();
                }
              }
            }
            break;
            case FINALLY: {
              setState(933);
              finallyBlock();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
        }
        break;
        case 8:
          enterOuterAlt(_localctx, 8);
        {
          setState(936);
          match(TRY);
          setState(937);
          resourceSpecification();
          setState(938);
          block();
          setState(940);
          _la = _input.LA(1);
          if (_la == CATCH) {
            {
              setState(939);
              catchClauses();
            }
          }

          setState(943);
          _la = _input.LA(1);
          if (_la == FINALLY) {
            {
              setState(942);
              finallyBlock();
            }
          }
        }
        break;
        case 9:
          enterOuterAlt(_localctx, 9);
        {
          setState(945);
          match(SWITCH);
          setState(946);
          parExpression();
          setState(947);
          match(LBRACE);
          setState(949);
          switch (getInterpreter().adaptivePredict(_input, 127, _ctx)) {
            case 1: {
              setState(948);
              switchBlockStatementGroups();
            }
            break;
          }
          setState(952);
          _la = _input.LA(1);
          if (_la == CASE || _la == DEFAULT) {
            {
              setState(951);
              switchLabels();
            }
          }

          setState(954);
          match(RBRACE);
        }
        break;
        case 10:
          enterOuterAlt(_localctx, 10);
        {
          setState(956);
          match(SYNCHRONIZED);
          setState(957);
          parExpression();
          setState(958);
          block();
        }
        break;
        case 11:
          enterOuterAlt(_localctx, 11);
        {
          setState(960);
          match(RETURN);
          setState(962);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 &&
              ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L
                  << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L
                  << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L
                  << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L
                  << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || (
              (((_la - 68)) & ~0x3f) == 0 &&
                  ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE
                      - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L
                      << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
            {
              setState(961);
              expression(0);
            }
          }

          setState(964);
          match(SEMI);
        }
        break;
        case 12:
          enterOuterAlt(_localctx, 12);
        {
          setState(965);
          match(THROW);
          setState(966);
          expression(0);
          setState(967);
          match(SEMI);
        }
        break;
        case 13:
          enterOuterAlt(_localctx, 13);
        {
          setState(969);
          match(BREAK);
          setState(971);
          _la = _input.LA(1);
          if (_la == Identifier) {
            {
              setState(970);
              match(Identifier);
            }
          }

          setState(973);
          match(SEMI);
        }
        break;
        case 14:
          enterOuterAlt(_localctx, 14);
        {
          setState(974);
          match(CONTINUE);
          setState(976);
          _la = _input.LA(1);
          if (_la == Identifier) {
            {
              setState(975);
              match(Identifier);
            }
          }

          setState(978);
          match(SEMI);
        }
        break;
        case 15:
          enterOuterAlt(_localctx, 15);
        {
          setState(979);
          match(SEMI);
        }
        break;
        case 16:
          enterOuterAlt(_localctx, 16);
        {
          setState(980);
          statementExpression();
          setState(981);
          match(SEMI);
        }
        break;
        case 17:
          enterOuterAlt(_localctx, 17);
        {
          setState(983);
          match(Identifier);
          setState(984);
          match(COLON);
          setState(985);
          statement();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CatchClausesContext catchClauses()
  throws RecognitionException {
    CatchClausesContext _localctx = new CatchClausesContext(_ctx, getState());
    enterRule(_localctx, 192, RULE_catchClauses);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(989);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(988);
              catchClause();
            }
          }
          setState(991);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == CATCH);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final SwitchBlockStatementGroupsContext switchBlockStatementGroups()
  throws RecognitionException {
    SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx,
        getState());
    enterRule(_localctx, 194, RULE_switchBlockStatementGroups);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(994);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(993);
                switchBlockStatementGroup();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(996);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 134, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final SwitchLabelsContext switchLabels()
  throws RecognitionException {
    SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
    enterRule(_localctx, 196, RULE_switchLabels);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(999);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(998);
              switchLabel();
            }
          }
          setState(1001);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == CASE || _la == DEFAULT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CatchClauseContext catchClause()
  throws RecognitionException {
    CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
    enterRule(_localctx, 198, RULE_catchClause);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1003);
        match(CATCH);
        setState(1004);
        match(LPAREN);
        setState(1006);
        _la = _input.LA(1);
        if (_la == FINAL || _la == AT) {
          {
            setState(1005);
            variableModifiers();
          }
        }

        setState(1008);
        catchType();
        setState(1009);
        match(Identifier);
        setState(1010);
        match(RPAREN);
        setState(1011);
        block();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CatchTypeContext catchType()
  throws RecognitionException {
    CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
    enterRule(_localctx, 200, RULE_catchType);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1013);
        qualifiedName();
        setState(1015);
        _la = _input.LA(1);
        if (_la == BITOR) {
          {
            setState(1014);
            midThenQualifiedNameList();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final MidThenQualifiedNameListContext midThenQualifiedNameList()
  throws RecognitionException {
    MidThenQualifiedNameListContext _localctx = new MidThenQualifiedNameListContext(_ctx,
        getState());
    enterRule(_localctx, 202, RULE_midThenQualifiedNameList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1019);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(1017);
              match(BITOR);
              setState(1018);
              qualifiedName();
            }
          }
          setState(1021);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == BITOR);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final FinallyBlockContext finallyBlock()
  throws RecognitionException {
    FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
    enterRule(_localctx, 204, RULE_finallyBlock);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1023);
        match(FINALLY);
        setState(1024);
        block();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ResourceSpecificationContext resourceSpecification()
  throws RecognitionException {
    ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
    enterRule(_localctx, 206, RULE_resourceSpecification);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1026);
        match(LPAREN);
        setState(1027);
        resources();
        setState(1029);
        _la = _input.LA(1);
        if (_la == SEMI) {
          {
            setState(1028);
            match(SEMI);
          }
        }

        setState(1031);
        match(RPAREN);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ResourcesContext resources()
  throws RecognitionException {
    ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
    enterRule(_localctx, 208, RULE_resources);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1034);
        _la = _input.LA(1);
        if (_la == FINAL || _la == Identifier || _la == AT) {
          {
            setState(1033);
            semicolonThenResourceList();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final SemicolonThenResourceListContext semicolonThenResourceList()
  throws RecognitionException {
    SemicolonThenResourceListContext _localctx = new SemicolonThenResourceListContext(_ctx,
        getState());
    enterRule(_localctx, 210, RULE_semicolonThenResourceList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1036);
        resource();
        setState(1039);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(1037);
                match(SEMI);
                setState(1038);
                resource();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(1041);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 141, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ResourceContext resource()
  throws RecognitionException {
    ResourceContext _localctx = new ResourceContext(_ctx, getState());
    enterRule(_localctx, 212, RULE_resource);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1044);
        _la = _input.LA(1);
        if (_la == FINAL || _la == AT) {
          {
            setState(1043);
            variableModifiers();
          }
        }

        setState(1046);
        classOrInterfaceType();
        setState(1047);
        variableDeclaratorId();
        setState(1048);
        match(ASSIGN);
        setState(1049);
        expression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final SwitchBlockStatementGroupContext switchBlockStatementGroup()
  throws RecognitionException {
    SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx,
        getState());
    enterRule(_localctx, 214, RULE_switchBlockStatementGroup);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1052);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(1051);
              switchLabel();
            }
          }
          setState(1054);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == CASE || _la == DEFAULT);
        setState(1057);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(1056);
              blockStatement();
            }
          }
          setState(1059);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (
                1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L
                << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF)
                | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (
                1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC)
                | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L
                << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L
                << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L
                << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN)
                | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 &&
            ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68))
                | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68))
                | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0));
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final SwitchLabelContext switchLabel()
  throws RecognitionException {
    SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
    enterRule(_localctx, 216, RULE_switchLabel);
    try {
      setState(1071);
      switch (getInterpreter().adaptivePredict(_input, 145, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(1061);
          match(CASE);
          setState(1062);
          constantExpression();
          setState(1063);
          match(COLON);
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(1065);
          match(CASE);
          setState(1066);
          enumConstantName();
          setState(1067);
          match(COLON);
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(1069);
          match(DEFAULT);
          setState(1070);
          match(COLON);
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ForControlContext forControl()
  throws RecognitionException {
    ForControlContext _localctx = new ForControlContext(_ctx, getState());
    enterRule(_localctx, 218, RULE_forControl);
    int _la;
    try {
      setState(1085);
      switch (getInterpreter().adaptivePredict(_input, 149, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(1073);
          enhancedForControl();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(1075);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 &&
              ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L
                  << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L
                  << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
                  | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral)
                  | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || (
              (((_la - 68)) & ~0x3f) == 0 &&
                  ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE
                      - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L
                      << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
            {
              setState(1074);
              forInit();
            }
          }

          setState(1077);
          match(SEMI);
          setState(1079);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 &&
              ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L
                  << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L
                  << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L
                  << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L
                  << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || (
              (((_la - 68)) & ~0x3f) == 0 &&
                  ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE
                      - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L
                      << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
            {
              setState(1078);
              expression(0);
            }
          }

          setState(1081);
          match(SEMI);
          setState(1083);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 &&
              ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L
                  << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L
                  << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L
                  << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L
                  << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || (
              (((_la - 68)) & ~0x3f) == 0 &&
                  ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE
                      - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L
                      << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
            {
              setState(1082);
              forUpdate();
            }
          }
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ForInitContext forInit()
  throws RecognitionException {
    ForInitContext _localctx = new ForInitContext(_ctx, getState());
    enterRule(_localctx, 220, RULE_forInit);
    try {
      setState(1089);
      switch (getInterpreter().adaptivePredict(_input, 150, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(1087);
          localVariableDeclaration();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(1088);
          expressionList();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final EnhancedForControlContext enhancedForControl()
  throws RecognitionException {
    EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
    enterRule(_localctx, 222, RULE_enhancedForControl);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1092);
        _la = _input.LA(1);
        if (_la == FINAL || _la == AT) {
          {
            setState(1091);
            variableModifiers();
          }
        }

        setState(1094);
        type();
        setState(1095);
        variableDeclaratorId();
        setState(1096);
        match(COLON);
        setState(1097);
        expression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ForUpdateContext forUpdate()
  throws RecognitionException {
    ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
    enterRule(_localctx, 224, RULE_forUpdate);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1099);
        expressionList();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ParExpressionContext parExpression()
  throws RecognitionException {
    ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
    enterRule(_localctx, 226, RULE_parExpression);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1101);
        match(LPAREN);
        setState(1102);
        expression(0);
        setState(1103);
        match(RPAREN);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExpressionListContext expressionList()
  throws RecognitionException {
    ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
    enterRule(_localctx, 228, RULE_expressionList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1105);
        expression(0);
        setState(1107);
        _la = _input.LA(1);
        if (_la == COMMA) {
          {
            setState(1106);
            commaThenExpressionList();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CommaThenExpressionListContext commaThenExpressionList()
  throws RecognitionException {
    CommaThenExpressionListContext _localctx = new CommaThenExpressionListContext(_ctx, getState());
    enterRule(_localctx, 230, RULE_commaThenExpressionList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1111);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(1109);
              match(COMMA);
              setState(1110);
              expression(0);
            }
          }
          setState(1113);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == COMMA);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final StatementExpressionContext statementExpression()
  throws RecognitionException {
    StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
    enterRule(_localctx, 232, RULE_statementExpression);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1115);
        expression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ConstantExpressionContext constantExpression()
  throws RecognitionException {
    ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
    enterRule(_localctx, 234, RULE_constantExpression);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1117);
        expression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExpressionContext expression()
  throws RecognitionException {
    return expression(0);
  }

  public final PrimaryContext primary()
  throws RecognitionException {
    PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
    enterRule(_localctx, 238, RULE_primary);
    try {
      setState(1243);
      switch (getInterpreter().adaptivePredict(_input, 161, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(1222);
          match(LPAREN);
          setState(1223);
          expression(0);
          setState(1224);
          match(RPAREN);
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(1226);
          match(THIS);
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(1227);
          match(SUPER);
        }
        break;
        case 4:
          enterOuterAlt(_localctx, 4);
        {
          setState(1228);
          literal();
        }
        break;
        case 5:
          enterOuterAlt(_localctx, 5);
        {
          setState(1229);
          match(Identifier);
        }
        break;
        case 6:
          enterOuterAlt(_localctx, 6);
        {
          setState(1230);
          type();
          setState(1231);
          match(DOT);
          setState(1232);
          match(CLASS);
        }
        break;
        case 7:
          enterOuterAlt(_localctx, 7);
        {
          setState(1234);
          match(VOID);
          setState(1235);
          match(DOT);
          setState(1236);
          match(CLASS);
        }
        break;
        case 8:
          enterOuterAlt(_localctx, 8);
        {
          setState(1237);
          nonWildcardTypeArguments();
          setState(1241);
          switch (_input.LA(1)) {
            case SUPER:
            case Identifier: {
              setState(1238);
              explicitGenericInvocationSuffix();
            }
            break;
            case THIS: {
              setState(1239);
              match(THIS);
              setState(1240);
              arguments();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CreatorContext creator()
  throws RecognitionException {
    CreatorContext _localctx = new CreatorContext(_ctx, getState());
    enterRule(_localctx, 240, RULE_creator);
    try {
      setState(1254);
      switch (_input.LA(1)) {
        case LT:
          enterOuterAlt(_localctx, 1);
        {
          setState(1245);
          nonWildcardTypeArguments();
          setState(1246);
          createdName();
          setState(1247);
          classCreatorRest();
        }
        break;
        case BOOLEAN:
        case BYTE:
        case CHAR:
        case DOUBLE:
        case FLOAT:
        case INT:
        case LONG:
        case SHORT:
        case Identifier:
          enterOuterAlt(_localctx, 2);
        {
          setState(1249);
          createdName();
          setState(1252);
          switch (_input.LA(1)) {
            case LBRACK: {
              setState(1250);
              arrayCreatorRest();
            }
            break;
            case LPAREN: {
              setState(1251);
              classCreatorRest();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final CreatedNameContext createdName()
  throws RecognitionException {
    CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
    enterRule(_localctx, 242, RULE_createdName);
    int _la;
    try {
      setState(1264);
      switch (_input.LA(1)) {
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(1256);
          match(Identifier);
          setState(1258);
          _la = _input.LA(1);
          if (_la == LT) {
            {
              setState(1257);
              typeArgumentsOrDiamond();
            }
          }

          setState(1261);
          _la = _input.LA(1);
          if (_la == DOT) {
            {
              setState(1260);
              dotIdThenTypeArgumentsOrDiamondList();
            }
          }
        }
        break;
        case BOOLEAN:
        case BYTE:
        case CHAR:
        case DOUBLE:
        case FLOAT:
        case INT:
        case LONG:
        case SHORT:
          enterOuterAlt(_localctx, 2);
        {
          setState(1263);
          primitiveType();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final DotIdThenTypeArgumentsOrDiamondListContext dotIdThenTypeArgumentsOrDiamondList()
  throws RecognitionException {
    DotIdThenTypeArgumentsOrDiamondListContext _localctx
        = new DotIdThenTypeArgumentsOrDiamondListContext(_ctx, getState());
    enterRule(_localctx, 244, RULE_dotIdThenTypeArgumentsOrDiamondList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1271);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(1266);
              match(DOT);
              setState(1267);
              match(Identifier);
              setState(1269);
              _la = _input.LA(1);
              if (_la == LT) {
                {
                  setState(1268);
                  typeArgumentsOrDiamond();
                }
              }
            }
          }
          setState(1273);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == DOT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final InnerCreatorContext innerCreator()
  throws RecognitionException {
    InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
    enterRule(_localctx, 246, RULE_innerCreator);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1275);
        match(Identifier);
        setState(1277);
        _la = _input.LA(1);
        if (_la == LT) {
          {
            setState(1276);
            nonWildcardTypeArgumentsOrDiamond();
          }
        }

        setState(1279);
        classCreatorRest();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ArrayCreatorRestContext arrayCreatorRest()
  throws RecognitionException {
    ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
    enterRule(_localctx, 248, RULE_arrayCreatorRest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1281);
        match(LBRACK);
        setState(1295);
        switch (_input.LA(1)) {
          case RBRACK: {
            setState(1282);
            match(RBRACK);
            setState(1284);
            _la = _input.LA(1);
            if (_la == LBRACK) {
              {
                setState(1283);
                squareBracketsList();
              }
            }

            setState(1286);
            arrayInitializer();
          }
          break;
          case BOOLEAN:
          case BYTE:
          case CHAR:
          case DOUBLE:
          case FLOAT:
          case INT:
          case LONG:
          case NEW:
          case SHORT:
          case SUPER:
          case THIS:
          case VOID:
          case IntegerLiteral:
          case FloatingPointLiteral:
          case BooleanLiteral:
          case CharacterLiteral:
          case StringLiteral:
          case NullLiteral:
          case LPAREN:
          case LT:
          case BANG:
          case TILDE:
          case INC:
          case DEC:
          case ADD:
          case SUB:
          case Identifier: {
            setState(1287);
            expression(0);
            setState(1288);
            match(RBRACK);
            setState(1290);
            switch (getInterpreter().adaptivePredict(_input, 171, _ctx)) {
              case 1: {
                setState(1289);
                squareBracketsWithExpressionList();
              }
              break;
            }
            setState(1293);
            switch (getInterpreter().adaptivePredict(_input, 172, _ctx)) {
              case 1: {
                setState(1292);
                squareBracketsList();
              }
              break;
            }
          }
          break;
          default:
            throw new NoViableAltException(this);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final SquareBracketsWithExpressionListContext squareBracketsWithExpressionList()
  throws RecognitionException {
    SquareBracketsWithExpressionListContext _localctx = new SquareBracketsWithExpressionListContext(
        _ctx, getState());
    enterRule(_localctx, 250, RULE_squareBracketsWithExpressionList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1301);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(1297);
                match(LBRACK);
                setState(1298);
                expression(0);
                setState(1299);
                match(RBRACK);
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(1303);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 174, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ClassCreatorRestContext classCreatorRest()
  throws RecognitionException {
    ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
    enterRule(_localctx, 252, RULE_classCreatorRest);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1305);
        arguments();
        setState(1307);
        switch (getInterpreter().adaptivePredict(_input, 175, _ctx)) {
          case 1: {
            setState(1306);
            classBody();
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExplicitGenericInvocationContext explicitGenericInvocation()
  throws RecognitionException {
    ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx,
        getState());
    enterRule(_localctx, 254, RULE_explicitGenericInvocation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1309);
        nonWildcardTypeArguments();
        setState(1310);
        explicitGenericInvocationSuffix();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments()
  throws RecognitionException {
    NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx,
        getState());
    enterRule(_localctx, 256, RULE_nonWildcardTypeArguments);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1312);
        match(LT);
        setState(1313);
        typeList();
        setState(1314);
        match(GT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond()
  throws RecognitionException {
    TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
    enterRule(_localctx, 258, RULE_typeArgumentsOrDiamond);
    try {
      setState(1319);
      switch (getInterpreter().adaptivePredict(_input, 176, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(1316);
          match(LT);
          setState(1317);
          match(GT);
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(1318);
          typeArguments();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond()
  throws RecognitionException {
    NonWildcardTypeArgumentsOrDiamondContext _localctx
        = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
    enterRule(_localctx, 260, RULE_nonWildcardTypeArgumentsOrDiamond);
    try {
      setState(1324);
      switch (getInterpreter().adaptivePredict(_input, 177, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(1321);
          match(LT);
          setState(1322);
          match(GT);
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(1323);
          nonWildcardTypeArguments();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final SuperSuffixContext superSuffix()
  throws RecognitionException {
    SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
    enterRule(_localctx, 262, RULE_superSuffix);
    try {
      setState(1332);
      switch (_input.LA(1)) {
        case LPAREN:
          enterOuterAlt(_localctx, 1);
        {
          setState(1326);
          arguments();
        }
        break;
        case DOT:
          enterOuterAlt(_localctx, 2);
        {
          setState(1327);
          match(DOT);
          setState(1328);
          match(Identifier);
          setState(1330);
          switch (getInterpreter().adaptivePredict(_input, 178, _ctx)) {
            case 1: {
              setState(1329);
              arguments();
            }
            break;
          }
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix()
  throws RecognitionException {
    ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(
        _ctx, getState());
    enterRule(_localctx, 264, RULE_explicitGenericInvocationSuffix);
    try {
      setState(1338);
      switch (_input.LA(1)) {
        case SUPER:
          enterOuterAlt(_localctx, 1);
        {
          setState(1334);
          match(SUPER);
          setState(1335);
          superSuffix();
        }
        break;
        case Identifier:
          enterOuterAlt(_localctx, 2);
        {
          setState(1336);
          match(Identifier);
          setState(1337);
          arguments();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final ArgumentsContext arguments()
  throws RecognitionException {
    ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
    enterRule(_localctx, 266, RULE_arguments);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1340);
        match(LPAREN);
        setState(1342);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 &&
            ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L
                << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER)
                | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L
                << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L
                << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || (
            (((_la - 68)) & ~0x3f) == 0 &&
                ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE
                    - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (
                    SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
          {
            setState(1341);
            expressionList();
          }
        }

        setState(1344);
        match(RPAREN);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 118:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 13);
      case 1:
        return precpred(_ctx, 12);
      case 2:
        return precpred(_ctx, 11);
      case 3:
        return precpred(_ctx, 10);
      case 4:
        return precpred(_ctx, 8);
      case 5:
        return precpred(_ctx, 7);
      case 6:
        return precpred(_ctx, 6);
      case 7:
        return precpred(_ctx, 5);
      case 8:
        return precpred(_ctx, 4);
      case 9:
        return precpred(_ctx, 3);
      case 10:
        return precpred(_ctx, 2);
      case 11:
        return precpred(_ctx, 1);
      case 12:
        return precpred(_ctx, 25);
      case 13:
        return precpred(_ctx, 24);
      case 14:
        return precpred(_ctx, 23);
      case 15:
        return precpred(_ctx, 22);
      case 16:
        return precpred(_ctx, 21);
      case 17:
        return precpred(_ctx, 20);
      case 18:
        return precpred(_ctx, 19);
      case 19:
        return precpred(_ctx, 16);
      case 20:
        return precpred(_ctx, 9);
    }
    return true;
  }

  private ExpressionContext expression(int _p)
  throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
    ExpressionContext _prevctx = _localctx;
    int _startState = 236;
    enterRecursionRule(_localctx, 236, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1132);
        switch (getInterpreter().adaptivePredict(_input, 154, _ctx)) {
          case 1: {
            setState(1120);
            match(LPAREN);
            setState(1121);
            type();
            setState(1122);
            match(RPAREN);
            setState(1123);
            expression(17);
          }
          break;
          case 2: {
            setState(1125);
            _la = _input.LA(1);
            if (!(((((_la - 79)) & ~0x3f) == 0 &&
                ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79))
                    | (1L << (SUB - 79)))) != 0))) {
              _errHandler.recoverInline(this);
            } else {
              consume();
            }
            setState(1126);
            expression(15);
          }
          break;
          case 3: {
            setState(1127);
            _la = _input.LA(1);
            if (!(_la == BANG || _la == TILDE)) {
              _errHandler.recoverInline(this);
            } else {
              consume();
            }
            setState(1128);
            expression(14);
          }
          break;
          case 4: {
            setState(1129);
            primary();
          }
          break;
          case 5: {
            setState(1130);
            match(NEW);
            setState(1131);
            creator();
          }
          break;
        }
        _ctx.stop = _input.LT(-1);
        setState(1219);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 159, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(1217);
              switch (getInterpreter().adaptivePredict(_input, 158, _ctx)) {
                case 1: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1134);
                  if (!(precpred(_ctx, 13)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                  setState(1135);
                  _la = _input.LA(1);
                  if (!(((((_la - 83)) & ~0x3f) == 0 &&
                      ((1L << (_la - 83)) & ((1L << (MUL - 83)) | (1L << (DIV - 83)) | (1L << (MOD
                          - 83)))) != 0))) {
                    _errHandler.recoverInline(this);
                  } else {
                    consume();
                  }
                  setState(1136);
                  expression(14);
                }
                break;
                case 2: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1137);
                  if (!(precpred(_ctx, 12)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                  setState(1138);
                  _la = _input.LA(1);
                  if (!(_la == ADD || _la == SUB)) {
                    _errHandler.recoverInline(this);
                  } else {
                    consume();
                  }
                  setState(1139);
                  expression(13);
                }
                break;
                case 3: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1140);
                  if (!(precpred(_ctx, 11)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                  setState(1148);
                  switch (getInterpreter().adaptivePredict(_input, 155, _ctx)) {
                    case 1: {
                      setState(1141);
                      match(LT);
                      setState(1142);
                      match(LT);
                    }
                    break;
                    case 2: {
                      setState(1143);
                      match(GT);
                      setState(1144);
                      match(GT);
                      setState(1145);
                      match(GT);
                    }
                    break;
                    case 3: {
                      setState(1146);
                      match(GT);
                      setState(1147);
                      match(GT);
                    }
                    break;
                  }
                  setState(1150);
                  expression(12);
                }
                break;
                case 4: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1151);
                  if (!(precpred(_ctx, 10)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                  setState(1152);
                  _la = _input.LA(1);
                  if (!(((((_la - 67)) & ~0x3f) == 0 &&
                      ((1L << (_la - 67)) & ((1L << (GT - 67)) | (1L << (LT - 67)) | (1L << (LE
                          - 67)) | (1L << (GE - 67)))) != 0))) {
                    _errHandler.recoverInline(this);
                  } else {
                    consume();
                  }
                  setState(1153);
                  expression(11);
                }
                break;
                case 5: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1154);
                  if (!(precpred(_ctx, 8)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                  setState(1155);
                  _la = _input.LA(1);
                  if (!(_la == EQUAL || _la == NOTEQUAL)) {
                    _errHandler.recoverInline(this);
                  } else {
                    consume();
                  }
                  setState(1156);
                  expression(9);
                }
                break;
                case 6: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1157);
                  if (!(precpred(_ctx, 7)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                  setState(1158);
                  match(BITAND);
                  setState(1159);
                  expression(8);
                }
                break;
                case 7: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1160);
                  if (!(precpred(_ctx, 6)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                  setState(1161);
                  match(CARET);
                  setState(1162);
                  expression(7);
                }
                break;
                case 8: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1163);
                  if (!(precpred(_ctx, 5)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                  setState(1164);
                  match(BITOR);
                  setState(1165);
                  expression(6);
                }
                break;
                case 9: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1166);
                  if (!(precpred(_ctx, 4)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                  setState(1167);
                  match(AND);
                  setState(1168);
                  expression(5);
                }
                break;
                case 10: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1169);
                  if (!(precpred(_ctx, 3)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                  setState(1170);
                  match(OR);
                  setState(1171);
                  expression(4);
                }
                break;
                case 11: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1172);
                  if (!(precpred(_ctx, 2)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                  setState(1173);
                  match(QUESTION);
                  setState(1174);
                  expression(0);
                  setState(1175);
                  match(COLON);
                  setState(1176);
                  expression(3);
                }
                break;
                case 12: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1178);
                  if (!(precpred(_ctx, 1)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                  setState(1179);
                  _la = _input.LA(1);
                  if (!(((((_la - 66)) & ~0x3f) == 0 &&
                      ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L
                          << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN
                          - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (
                          XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN
                          - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66))))
                          != 0))) {
                    _errHandler.recoverInline(this);
                  } else {
                    consume();
                  }
                  setState(1180);
                  expression(1);
                }
                break;
                case 13: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1181);
                  if (!(precpred(_ctx, 25)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                  setState(1182);
                  match(DOT);
                  setState(1183);
                  match(Identifier);
                }
                break;
                case 14: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1184);
                  if (!(precpred(_ctx, 24)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                  setState(1185);
                  match(DOT);
                  setState(1186);
                  match(THIS);
                }
                break;
                case 15: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1187);
                  if (!(precpred(_ctx, 23)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                  setState(1188);
                  match(DOT);
                  setState(1189);
                  match(NEW);
                  setState(1191);
                  _la = _input.LA(1);
                  if (_la == LT) {
                    {
                      setState(1190);
                      nonWildcardTypeArguments();
                    }
                  }

                  setState(1193);
                  innerCreator();
                }
                break;
                case 16: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1194);
                  if (!(precpred(_ctx, 22)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                  setState(1195);
                  match(DOT);
                  setState(1196);
                  match(SUPER);
                  setState(1197);
                  superSuffix();
                }
                break;
                case 17: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1198);
                  if (!(precpred(_ctx, 21)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                  setState(1199);
                  match(DOT);
                  setState(1200);
                  explicitGenericInvocation();
                }
                break;
                case 18: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1201);
                  if (!(precpred(_ctx, 20)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                  setState(1202);
                  match(LBRACK);
                  setState(1203);
                  expression(0);
                  setState(1204);
                  match(RBRACK);
                }
                break;
                case 19: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1206);
                  if (!(precpred(_ctx, 19)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                  setState(1207);
                  match(LPAREN);
                  setState(1209);
                  _la = _input.LA(1);
                  if ((((_la) & ~0x3f) == 0 &&
                      ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
                          | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT)
                          | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (
                          1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L
                          << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L
                          << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 &&
                      ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE
                          - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (
                          1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
                    {
                      setState(1208);
                      expressionList();
                    }
                  }

                  setState(1211);
                  match(RPAREN);
                }
                break;
                case 20: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1212);
                  if (!(precpred(_ctx, 16)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                  setState(1213);
                  _la = _input.LA(1);
                  if (!(_la == INC || _la == DEC)) {
                    _errHandler.recoverInline(this);
                  } else {
                    consume();
                  }
                }
                break;
                case 21: {
                  _localctx = new ExpressionContext(_parentctx, _parentState);
                  pushNewRecursionContext(_localctx, _startState, RULE_expression);
                  setState(1214);
                  if (!(precpred(_ctx, 9)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                  setState(1215);
                  match(INSTANCEOF);
                  setState(1216);
                  type();
                }
                break;
              }
            }
          }
          setState(1221);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 159, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  public static class CompilationUnitContext extends ParserRuleContext {
    public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode EOF() {
      return getToken(JavaParser.EOF, 0);
    }

    public PackageDeclarationContext packageDeclaration() {
      return getRuleContext(PackageDeclarationContext.class, 0);
    }

    public ImportDeclarationsContext importDeclarations() {
      return getRuleContext(ImportDeclarationsContext.class, 0);
    }

    public TypeDeclarationsContext typeDeclarations() {
      return getRuleContext(TypeDeclarationsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_compilationUnit;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterCompilationUnit(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitCompilationUnit(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCompilationUnit(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ImportDeclarationsContext extends ParserRuleContext {
    public ImportDeclarationsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ImportDeclarationContext> importDeclaration() {
      return getRuleContexts(ImportDeclarationContext.class);
    }

    public ImportDeclarationContext importDeclaration(int i) {
      return getRuleContext(ImportDeclarationContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importDeclarations;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterImportDeclarations(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitImportDeclarations(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitImportDeclarations(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeDeclarationsContext extends ParserRuleContext {
    public TypeDeclarationsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<TypeDeclarationContext> typeDeclaration() {
      return getRuleContexts(TypeDeclarationContext.class);
    }

    public TypeDeclarationContext typeDeclaration(int i) {
      return getRuleContext(TypeDeclarationContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_typeDeclarations;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeDeclarations(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeDeclarations(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitTypeDeclarations(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class PackageDeclarationContext extends ParserRuleContext {
    public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public QualifiedNameContext qualifiedName() {
      return getRuleContext(QualifiedNameContext.class, 0);
    }

    public AnnotationContext annotation() {
      return getRuleContext(AnnotationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_packageDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterPackageDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitPackageDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitPackageDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationsContext extends ParserRuleContext {
    public AnnotationsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<AnnotationContext> annotation() {
      return getRuleContexts(AnnotationContext.class);
    }

    public AnnotationContext annotation(int i) {
      return getRuleContext(AnnotationContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotations;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotations(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotations(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotations(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ImportDeclarationContext extends ParserRuleContext {
    public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public QualifiedNameContext qualifiedName() {
      return getRuleContext(QualifiedNameContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterImportDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitImportDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitImportDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeDeclarationContext extends ParserRuleContext {
    public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ClassDeclarationContext classDeclaration() {
      return getRuleContext(ClassDeclarationContext.class, 0);
    }

    public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
      return getRuleContext(ClassOrInterfaceModifiersContext.class, 0);
    }

    public EnumDeclarationContext enumDeclaration() {
      return getRuleContext(EnumDeclarationContext.class, 0);
    }

    public InterfaceDeclarationContext interfaceDeclaration() {
      return getRuleContext(InterfaceDeclarationContext.class, 0);
    }

    public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
      return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_typeDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitTypeDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ClassOrInterfaceModifiersContext extends ParserRuleContext {
    public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
      return getRuleContexts(ClassOrInterfaceModifierContext.class);
    }

    public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
      return getRuleContext(ClassOrInterfaceModifierContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classOrInterfaceModifiers;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterClassOrInterfaceModifiers(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitClassOrInterfaceModifiers(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitClassOrInterfaceModifiers(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ModifierContext extends ParserRuleContext {
    public ModifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
      return getRuleContext(ClassOrInterfaceModifierContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_modifier;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterModifier(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitModifier(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitModifier(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
    public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public AnnotationContext annotation() {
      return getRuleContext(AnnotationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classOrInterfaceModifier;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterClassOrInterfaceModifier(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitClassOrInterfaceModifier(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitClassOrInterfaceModifier(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class VariableModifierContext extends ParserRuleContext {
    public VariableModifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public AnnotationContext annotation() {
      return getRuleContext(AnnotationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableModifier;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterVariableModifier(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableModifier(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitVariableModifier(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ClassDeclarationContext extends ParserRuleContext {
    public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public ClassBodyContext classBody() {
      return getRuleContext(ClassBodyContext.class, 0);
    }

    public TypeParametersContext typeParameters() {
      return getRuleContext(TypeParametersContext.class, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public TypeListContext typeList() {
      return getRuleContext(TypeListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterClassDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitClassDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitClassDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeParametersContext extends ParserRuleContext {
    public TypeParametersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeParameterContext typeParameter() {
      return getRuleContext(TypeParameterContext.class, 0);
    }

    public CommaThenTypeParameterListContext commaThenTypeParameterList() {
      return getRuleContext(CommaThenTypeParameterListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_typeParameters;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeParameters(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeParameters(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitTypeParameters(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenTypeParameterListContext extends ParserRuleContext {
    public CommaThenTypeParameterListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<TypeParameterContext> typeParameter() {
      return getRuleContexts(TypeParameterContext.class);
    }

    public TypeParameterContext typeParameter(int i) {
      return getRuleContext(TypeParameterContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenTypeParameterList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenTypeParameterList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenTypeParameterList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenTypeParameterList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeParameterContext extends ParserRuleContext {
    public TypeParameterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public TypeBoundContext typeBound() {
      return getRuleContext(TypeBoundContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_typeParameter;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeParameter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeParameter(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitTypeParameter(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeBoundContext extends ParserRuleContext {
    public TypeBoundContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public AmpThenTypeListContext ampThenTypeList() {
      return getRuleContext(AmpThenTypeListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_typeBound;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeBound(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeBound(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitTypeBound(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AmpThenTypeListContext extends ParserRuleContext {
    public AmpThenTypeListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<TypeContext> type() {
      return getRuleContexts(TypeContext.class);
    }

    public TypeContext type(int i) {
      return getRuleContext(TypeContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_ampThenTypeList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterAmpThenTypeList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitAmpThenTypeList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAmpThenTypeList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class EnumDeclarationContext extends ParserRuleContext {
    public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode ENUM() {
      return getToken(JavaParser.ENUM, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public TypeListContext typeList() {
      return getRuleContext(TypeListContext.class, 0);
    }

    public EnumConstantsContext enumConstants() {
      return getRuleContext(EnumConstantsContext.class, 0);
    }

    public EnumBodyDeclarationsContext enumBodyDeclarations() {
      return getRuleContext(EnumBodyDeclarationsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_enumDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterEnumDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitEnumDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitEnumDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class EnumConstantsContext extends ParserRuleContext {
    public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public EnumConstantContext enumConstant() {
      return getRuleContext(EnumConstantContext.class, 0);
    }

    public CommaThenEnumConstantListContext commaThenEnumConstantList() {
      return getRuleContext(CommaThenEnumConstantListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_enumConstants;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterEnumConstants(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitEnumConstants(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitEnumConstants(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenEnumConstantListContext extends ParserRuleContext {
    public CommaThenEnumConstantListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<EnumConstantContext> enumConstant() {
      return getRuleContexts(EnumConstantContext.class);
    }

    public EnumConstantContext enumConstant(int i) {
      return getRuleContext(EnumConstantContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenEnumConstantList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenEnumConstantList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenEnumConstantList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenEnumConstantList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class EnumConstantContext extends ParserRuleContext {
    public EnumConstantContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public AnnotationsContext annotations() {
      return getRuleContext(AnnotationsContext.class, 0);
    }

    public ArgumentsContext arguments() {
      return getRuleContext(ArgumentsContext.class, 0);
    }

    public ClassBodyContext classBody() {
      return getRuleContext(ClassBodyContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_enumConstant;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterEnumConstant(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitEnumConstant(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitEnumConstant(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class EnumBodyDeclarationsContext extends ParserRuleContext {
    public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ClassBodyDeclarationsContext classBodyDeclarations() {
      return getRuleContext(ClassBodyDeclarationsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_enumBodyDeclarations;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterEnumBodyDeclarations(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitEnumBodyDeclarations(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitEnumBodyDeclarations(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ClassBodyDeclarationsContext extends ParserRuleContext {
    public ClassBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ClassBodyDeclarationContext> classBodyDeclaration() {
      return getRuleContexts(ClassBodyDeclarationContext.class);
    }

    public ClassBodyDeclarationContext classBodyDeclaration(int i) {
      return getRuleContext(ClassBodyDeclarationContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classBodyDeclarations;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterClassBodyDeclarations(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitClassBodyDeclarations(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitClassBodyDeclarations(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class InterfaceDeclarationContext extends ParserRuleContext {
    public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public InterfaceBodyContext interfaceBody() {
      return getRuleContext(InterfaceBodyContext.class, 0);
    }

    public TypeParametersContext typeParameters() {
      return getRuleContext(TypeParametersContext.class, 0);
    }

    public TypeListContext typeList() {
      return getRuleContext(TypeListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_interfaceDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterInterfaceDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitInterfaceDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitInterfaceDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeListContext extends ParserRuleContext {
    public TypeListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public CommaThenTypeListContext commaThenTypeList() {
      return getRuleContext(CommaThenTypeListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_typeList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitTypeList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenTypeListContext extends ParserRuleContext {
    public CommaThenTypeListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<TypeContext> type() {
      return getRuleContexts(TypeContext.class);
    }

    public TypeContext type(int i) {
      return getRuleContext(TypeContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenTypeList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterCommaThenTypeList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitCommaThenTypeList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenTypeList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ClassBodyContext extends ParserRuleContext {
    public ClassBodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ClassBodyDeclarationsContext classBodyDeclarations() {
      return getRuleContext(ClassBodyDeclarationsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classBody;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterClassBody(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitClassBody(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitClassBody(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class InterfaceBodyContext extends ParserRuleContext {
    public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public InterfaceBodyDeclarationsContext interfaceBodyDeclarations() {
      return getRuleContext(InterfaceBodyDeclarationsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_interfaceBody;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterInterfaceBody(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitInterfaceBody(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitInterfaceBody(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class InterfaceBodyDeclarationsContext extends ParserRuleContext {
    public InterfaceBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
      return getRuleContexts(InterfaceBodyDeclarationContext.class);
    }

    public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
      return getRuleContext(InterfaceBodyDeclarationContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_interfaceBodyDeclarations;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterInterfaceBodyDeclarations(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitInterfaceBodyDeclarations(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitInterfaceBodyDeclarations(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ClassBodyDeclarationContext extends ParserRuleContext {
    public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public MemberDeclarationContext memberDeclaration() {
      return getRuleContext(MemberDeclarationContext.class, 0);
    }

    public ModifiersContext modifiers() {
      return getRuleContext(ModifiersContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classBodyDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterClassBodyDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitClassBodyDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitClassBodyDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ModifiersContext extends ParserRuleContext {
    public ModifiersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ModifierContext> modifier() {
      return getRuleContexts(ModifierContext.class);
    }

    public ModifierContext modifier(int i) {
      return getRuleContext(ModifierContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_modifiers;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterModifiers(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitModifiers(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitModifiers(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class MemberDeclarationContext extends ParserRuleContext {
    public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public MethodDeclarationContext methodDeclaration() {
      return getRuleContext(MethodDeclarationContext.class, 0);
    }

    public GenericMethodDeclarationContext genericMethodDeclaration() {
      return getRuleContext(GenericMethodDeclarationContext.class, 0);
    }

    public FieldDeclarationContext fieldDeclaration() {
      return getRuleContext(FieldDeclarationContext.class, 0);
    }

    public ConstructorDeclarationContext constructorDeclaration() {
      return getRuleContext(ConstructorDeclarationContext.class, 0);
    }

    public GenericConstructorDeclarationContext genericConstructorDeclaration() {
      return getRuleContext(GenericConstructorDeclarationContext.class, 0);
    }

    public InterfaceDeclarationContext interfaceDeclaration() {
      return getRuleContext(InterfaceDeclarationContext.class, 0);
    }

    public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
      return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
    }

    public ClassDeclarationContext classDeclaration() {
      return getRuleContext(ClassDeclarationContext.class, 0);
    }

    public EnumDeclarationContext enumDeclaration() {
      return getRuleContext(EnumDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_memberDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterMemberDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitMemberDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitMemberDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class MethodDeclarationContext extends ParserRuleContext {
    public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public FormalParametersContext formalParameters() {
      return getRuleContext(FormalParametersContext.class, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public MethodBodyContext methodBody() {
      return getRuleContext(MethodBodyContext.class, 0);
    }

    public SquareBracketsListContext squareBracketsList() {
      return getRuleContext(SquareBracketsListContext.class, 0);
    }

    public QualifiedNameListContext qualifiedNameList() {
      return getRuleContext(QualifiedNameListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_methodDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterMethodDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitMethodDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitMethodDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class SquareBracketsListContext extends ParserRuleContext {
    public SquareBracketsListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_squareBracketsList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterSquareBracketsList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitSquareBracketsList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitSquareBracketsList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class GenericMethodDeclarationContext extends ParserRuleContext {
    public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeParametersContext typeParameters() {
      return getRuleContext(TypeParametersContext.class, 0);
    }

    public MethodDeclarationContext methodDeclaration() {
      return getRuleContext(MethodDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_genericMethodDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterGenericMethodDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitGenericMethodDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitGenericMethodDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ConstructorDeclarationContext extends ParserRuleContext {
    public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public FormalParametersContext formalParameters() {
      return getRuleContext(FormalParametersContext.class, 0);
    }

    public ConstructorBodyContext constructorBody() {
      return getRuleContext(ConstructorBodyContext.class, 0);
    }

    public QualifiedNameListContext qualifiedNameList() {
      return getRuleContext(QualifiedNameListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_constructorDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterConstructorDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitConstructorDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitConstructorDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class GenericConstructorDeclarationContext extends ParserRuleContext {
    public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeParametersContext typeParameters() {
      return getRuleContext(TypeParametersContext.class, 0);
    }

    public ConstructorDeclarationContext constructorDeclaration() {
      return getRuleContext(ConstructorDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_genericConstructorDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterGenericConstructorDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitGenericConstructorDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitGenericConstructorDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class FieldDeclarationContext extends ParserRuleContext {
    public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public VariableDeclaratorsContext variableDeclarators() {
      return getRuleContext(VariableDeclaratorsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_fieldDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterFieldDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitFieldDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitFieldDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
    public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
      return getRuleContext(InterfaceMemberDeclarationContext.class, 0);
    }

    public ModifiersContext modifiers() {
      return getRuleContext(ModifiersContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_interfaceBodyDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterInterfaceBodyDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitInterfaceBodyDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitInterfaceBodyDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
    public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ConstDeclarationContext constDeclaration() {
      return getRuleContext(ConstDeclarationContext.class, 0);
    }

    public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
      return getRuleContext(InterfaceMethodDeclarationContext.class, 0);
    }

    public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
      return getRuleContext(GenericInterfaceMethodDeclarationContext.class, 0);
    }

    public InterfaceDeclarationContext interfaceDeclaration() {
      return getRuleContext(InterfaceDeclarationContext.class, 0);
    }

    public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
      return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
    }

    public ClassDeclarationContext classDeclaration() {
      return getRuleContext(ClassDeclarationContext.class, 0);
    }

    public EnumDeclarationContext enumDeclaration() {
      return getRuleContext(EnumDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_interfaceMemberDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterInterfaceMemberDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitInterfaceMemberDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitInterfaceMemberDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ConstDeclarationContext extends ParserRuleContext {
    public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public ConstantDeclaratorContext constantDeclarator() {
      return getRuleContext(ConstantDeclaratorContext.class, 0);
    }

    public CommaThenConstantDeclarationListContext commaThenConstantDeclarationList() {
      return getRuleContext(CommaThenConstantDeclarationListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_constDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterConstDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitConstDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitConstDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenConstantDeclarationListContext extends ParserRuleContext {
    public CommaThenConstantDeclarationListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ConstantDeclaratorContext> constantDeclarator() {
      return getRuleContexts(ConstantDeclaratorContext.class);
    }

    public ConstantDeclaratorContext constantDeclarator(int i) {
      return getRuleContext(ConstantDeclaratorContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenConstantDeclarationList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenConstantDeclarationList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenConstantDeclarationList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenConstantDeclarationList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ConstantDeclaratorContext extends ParserRuleContext {
    public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public VariableInitializerContext variableInitializer() {
      return getRuleContext(VariableInitializerContext.class, 0);
    }

    public SquareBracketsListContext squareBracketsList() {
      return getRuleContext(SquareBracketsListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_constantDeclarator;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterConstantDeclarator(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitConstantDeclarator(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitConstantDeclarator(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
    public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public FormalParametersContext formalParameters() {
      return getRuleContext(FormalParametersContext.class, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public SquareBracketsListContext squareBracketsList() {
      return getRuleContext(SquareBracketsListContext.class, 0);
    }

    public QualifiedNameListContext qualifiedNameList() {
      return getRuleContext(QualifiedNameListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_interfaceMethodDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterInterfaceMethodDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitInterfaceMethodDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitInterfaceMethodDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
    public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeParametersContext typeParameters() {
      return getRuleContext(TypeParametersContext.class, 0);
    }

    public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
      return getRuleContext(InterfaceMethodDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_genericInterfaceMethodDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterGenericInterfaceMethodDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitGenericInterfaceMethodDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitGenericInterfaceMethodDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class VariableDeclaratorsContext extends ParserRuleContext {
    public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public VariableDeclaratorContext variableDeclarator() {
      return getRuleContext(VariableDeclaratorContext.class, 0);
    }

    public CommaThenVariableDeclarationListContext commaThenVariableDeclarationList() {
      return getRuleContext(CommaThenVariableDeclarationListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableDeclarators;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterVariableDeclarators(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableDeclarators(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitVariableDeclarators(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenVariableDeclarationListContext extends ParserRuleContext {
    public CommaThenVariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<VariableDeclaratorContext> variableDeclarator() {
      return getRuleContexts(VariableDeclaratorContext.class);
    }

    public VariableDeclaratorContext variableDeclarator(int i) {
      return getRuleContext(VariableDeclaratorContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenVariableDeclarationList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenVariableDeclarationList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenVariableDeclarationList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenVariableDeclarationList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class VariableDeclaratorContext extends ParserRuleContext {
    public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public VariableDeclaratorIdContext variableDeclaratorId() {
      return getRuleContext(VariableDeclaratorIdContext.class, 0);
    }

    public VariableInitializerContext variableInitializer() {
      return getRuleContext(VariableInitializerContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableDeclarator;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterVariableDeclarator(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableDeclarator(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitVariableDeclarator(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class VariableDeclaratorIdContext extends ParserRuleContext {
    public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public SquareBracketsListContext squareBracketsList() {
      return getRuleContext(SquareBracketsListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableDeclaratorId;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterVariableDeclaratorId(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitVariableDeclaratorId(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitVariableDeclaratorId(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class VariableInitializerContext extends ParserRuleContext {
    public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ArrayInitializerContext arrayInitializer() {
      return getRuleContext(ArrayInitializerContext.class, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableInitializer;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterVariableInitializer(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableInitializer(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitVariableInitializer(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ArrayInitializerContext extends ParserRuleContext {
    public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public VariableInitializerContext variableInitializer() {
      return getRuleContext(VariableInitializerContext.class, 0);
    }

    public CommaThenVariableInitializerListContext commaThenVariableInitializerList() {
      return getRuleContext(CommaThenVariableInitializerListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrayInitializer;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterArrayInitializer(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitArrayInitializer(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitArrayInitializer(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenVariableInitializerListContext extends ParserRuleContext {
    public CommaThenVariableInitializerListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<VariableInitializerContext> variableInitializer() {
      return getRuleContexts(VariableInitializerContext.class);
    }

    public VariableInitializerContext variableInitializer(int i) {
      return getRuleContext(VariableInitializerContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenVariableInitializerList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenVariableInitializerList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenVariableInitializerList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenVariableInitializerList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class EnumConstantNameContext extends ParserRuleContext {
    public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_enumConstantName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterEnumConstantName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitEnumConstantName(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitEnumConstantName(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeContext extends ParserRuleContext {
    public TypeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ClassOrInterfaceTypeContext classOrInterfaceType() {
      return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
    }

    public SquareBracketsListContext squareBracketsList() {
      return getRuleContext(SquareBracketsListContext.class, 0);
    }

    public PrimitiveTypeContext primitiveType() {
      return getRuleContext(PrimitiveTypeContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_type;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterType(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitType(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitType(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
    public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public TypeArgumentsContext typeArguments() {
      return getRuleContext(TypeArgumentsContext.class, 0);
    }

    public DotThenIdentifierAndTypeArgumentsListContext dotThenIdentifierAndTypeArgumentsList() {
      return getRuleContext(DotThenIdentifierAndTypeArgumentsListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classOrInterfaceType;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterClassOrInterfaceType(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitClassOrInterfaceType(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitClassOrInterfaceType(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class DotThenIdentifierAndTypeArgumentsListContext extends ParserRuleContext {
    public DotThenIdentifierAndTypeArgumentsListContext(
        ParserRuleContext parent,
        int invokingState) {
      super(parent, invokingState);
    }

    public List<TerminalNode> Identifier() {
      return getTokens(JavaParser.Identifier);
    }

    public TerminalNode Identifier(int i) {
      return getToken(JavaParser.Identifier, i);
    }

    public List<TypeArgumentsContext> typeArguments() {
      return getRuleContexts(TypeArgumentsContext.class);
    }

    public TypeArgumentsContext typeArguments(int i) {
      return getRuleContext(TypeArgumentsContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_dotThenIdentifierAndTypeArgumentsList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterDotThenIdentifierAndTypeArgumentsList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitDotThenIdentifierAndTypeArgumentsList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor)
          .visitDotThenIdentifierAndTypeArgumentsList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class PrimitiveTypeContext extends ParserRuleContext {
    public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_primitiveType;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterPrimitiveType(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitPrimitiveType(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitPrimitiveType(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeArgumentsContext extends ParserRuleContext {
    public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeArgumentContext typeArgument() {
      return getRuleContext(TypeArgumentContext.class, 0);
    }

    public CommaThenTypeArgumentsListContext commaThenTypeArgumentsList() {
      return getRuleContext(CommaThenTypeArgumentsListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_typeArguments;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeArguments(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeArguments(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitTypeArguments(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenTypeArgumentsListContext extends ParserRuleContext {
    public CommaThenTypeArgumentsListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<TypeArgumentContext> typeArgument() {
      return getRuleContexts(TypeArgumentContext.class);
    }

    public TypeArgumentContext typeArgument(int i) {
      return getRuleContext(TypeArgumentContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenTypeArgumentsList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenTypeArgumentsList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenTypeArgumentsList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenTypeArgumentsList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeArgumentContext extends ParserRuleContext {
    public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_typeArgument;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeArgument(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeArgument(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitTypeArgument(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class QualifiedNameListContext extends ParserRuleContext {
    public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public QualifiedNameContext qualifiedName() {
      return getRuleContext(QualifiedNameContext.class, 0);
    }

    public CommaThenQualifiedNameListContext commaThenQualifiedNameList() {
      return getRuleContext(CommaThenQualifiedNameListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_qualifiedNameList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterQualifiedNameList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitQualifiedNameList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitQualifiedNameList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenQualifiedNameListContext extends ParserRuleContext {
    public CommaThenQualifiedNameListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<QualifiedNameContext> qualifiedName() {
      return getRuleContexts(QualifiedNameContext.class);
    }

    public QualifiedNameContext qualifiedName(int i) {
      return getRuleContext(QualifiedNameContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenQualifiedNameList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenQualifiedNameList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenQualifiedNameList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenQualifiedNameList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class FormalParametersContext extends ParserRuleContext {
    public FormalParametersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_formalParameters;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterFormalParameters(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitFormalParameters(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitFormalParameters(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class FormalParameterListContext extends ParserRuleContext {
    public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public FormalParameterContext formalParameter() {
      return getRuleContext(FormalParameterContext.class, 0);
    }

    public CommaThenFormalParameterListContext commaThenFormalParameterList() {
      return getRuleContext(CommaThenFormalParameterListContext.class, 0);
    }

    public LastFormalParameterContext lastFormalParameter() {
      return getRuleContext(LastFormalParameterContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_formalParameterList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterFormalParameterList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitFormalParameterList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitFormalParameterList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenFormalParameterListContext extends ParserRuleContext {
    public CommaThenFormalParameterListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<FormalParameterContext> formalParameter() {
      return getRuleContexts(FormalParameterContext.class);
    }

    public FormalParameterContext formalParameter(int i) {
      return getRuleContext(FormalParameterContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenFormalParameterList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenFormalParameterList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenFormalParameterList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenFormalParameterList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class FormalParameterContext extends ParserRuleContext {
    public FormalParameterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public VariableDeclaratorIdContext variableDeclaratorId() {
      return getRuleContext(VariableDeclaratorIdContext.class, 0);
    }

    public VariableModifiersContext variableModifiers() {
      return getRuleContext(VariableModifiersContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_formalParameter;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterFormalParameter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitFormalParameter(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitFormalParameter(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class LastFormalParameterContext extends ParserRuleContext {
    public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public VariableDeclaratorIdContext variableDeclaratorId() {
      return getRuleContext(VariableDeclaratorIdContext.class, 0);
    }

    public VariableModifiersContext variableModifiers() {
      return getRuleContext(VariableModifiersContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_lastFormalParameter;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterLastFormalParameter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitLastFormalParameter(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitLastFormalParameter(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class VariableModifiersContext extends ParserRuleContext {
    public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<VariableModifierContext> variableModifier() {
      return getRuleContexts(VariableModifierContext.class);
    }

    public VariableModifierContext variableModifier(int i) {
      return getRuleContext(VariableModifierContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableModifiers;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterVariableModifiers(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableModifiers(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitVariableModifiers(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class MethodBodyContext extends ParserRuleContext {
    public MethodBodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_methodBody;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterMethodBody(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitMethodBody(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitMethodBody(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ConstructorBodyContext extends ParserRuleContext {
    public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_constructorBody;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterConstructorBody(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitConstructorBody(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitConstructorBody(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class QualifiedNameContext extends ParserRuleContext {
    public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public DotThenIdentifierListContext dotThenIdentifierList() {
      return getRuleContext(DotThenIdentifierListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_qualifiedName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterQualifiedName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitQualifiedName(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitQualifiedName(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class DotThenIdentifierListContext extends ParserRuleContext {
    public DotThenIdentifierListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<TerminalNode> Identifier() {
      return getTokens(JavaParser.Identifier);
    }

    public TerminalNode Identifier(int i) {
      return getToken(JavaParser.Identifier, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_dotThenIdentifierList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterDotThenIdentifierList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitDotThenIdentifierList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitDotThenIdentifierList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class LiteralContext extends ParserRuleContext {
    public LiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode IntegerLiteral() {
      return getToken(JavaParser.IntegerLiteral, 0);
    }

    public TerminalNode FloatingPointLiteral() {
      return getToken(JavaParser.FloatingPointLiteral, 0);
    }

    public TerminalNode CharacterLiteral() {
      return getToken(JavaParser.CharacterLiteral, 0);
    }

    public TerminalNode StringLiteral() {
      return getToken(JavaParser.StringLiteral, 0);
    }

    public TerminalNode BooleanLiteral() {
      return getToken(JavaParser.BooleanLiteral, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_literal;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitLiteral(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitLiteral(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationContext extends ParserRuleContext {
    public AnnotationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public AnnotationNameContext annotationName() {
      return getRuleContext(AnnotationNameContext.class, 0);
    }

    public ElementValuePairsContext elementValuePairs() {
      return getRuleContext(ElementValuePairsContext.class, 0);
    }

    public ElementValueContext elementValue() {
      return getRuleContext(ElementValueContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotation;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotation(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotation(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotation(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationNameContext extends ParserRuleContext {
    public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public QualifiedNameContext qualifiedName() {
      return getRuleContext(QualifiedNameContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotationName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationName(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotationName(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ElementValuePairsContext extends ParserRuleContext {
    public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ElementValuePairContext elementValuePair() {
      return getRuleContext(ElementValuePairContext.class, 0);
    }

    public CommaThenElementValuePairListContext commaThenElementValuePairList() {
      return getRuleContext(CommaThenElementValuePairListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_elementValuePairs;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterElementValuePairs(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitElementValuePairs(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitElementValuePairs(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenElementValuePairListContext extends ParserRuleContext {
    public CommaThenElementValuePairListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ElementValuePairContext> elementValuePair() {
      return getRuleContexts(ElementValuePairContext.class);
    }

    public ElementValuePairContext elementValuePair(int i) {
      return getRuleContext(ElementValuePairContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenElementValuePairList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenElementValuePairList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenElementValuePairList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenElementValuePairList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ElementValuePairContext extends ParserRuleContext {
    public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public ElementValueContext elementValue() {
      return getRuleContext(ElementValueContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_elementValuePair;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterElementValuePair(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitElementValuePair(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitElementValuePair(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ElementValueContext extends ParserRuleContext {
    public ElementValueContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public AnnotationContext annotation() {
      return getRuleContext(AnnotationContext.class, 0);
    }

    public ElementValueArrayInitializerContext elementValueArrayInitializer() {
      return getRuleContext(ElementValueArrayInitializerContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_elementValue;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterElementValue(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitElementValue(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitElementValue(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ElementValueArrayInitializerContext extends ParserRuleContext {
    public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ElementValueContext elementValue() {
      return getRuleContext(ElementValueContext.class, 0);
    }

    public CommaThenElementValueListContext commaThenElementValueList() {
      return getRuleContext(CommaThenElementValueListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_elementValueArrayInitializer;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterElementValueArrayInitializer(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitElementValueArrayInitializer(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitElementValueArrayInitializer(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenElementValueListContext extends ParserRuleContext {
    public CommaThenElementValueListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ElementValueContext> elementValue() {
      return getRuleContexts(ElementValueContext.class);
    }

    public ElementValueContext elementValue(int i) {
      return getRuleContext(ElementValueContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenElementValueList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenElementValueList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenElementValueList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenElementValueList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
    public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public AnnotationTypeBodyContext annotationTypeBody() {
      return getRuleContext(AnnotationTypeBodyContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotationTypeDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterAnnotationTypeDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitAnnotationTypeDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotationTypeDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationTypeBodyContext extends ParserRuleContext {
    public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public AnnotationTypeElementDeclarationsListContext annotationTypeElementDeclarationsList() {
      return getRuleContext(AnnotationTypeElementDeclarationsListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotationTypeBody;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationTypeBody(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationTypeBody(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotationTypeBody(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationTypeElementDeclarationsListContext extends ParserRuleContext {
    public AnnotationTypeElementDeclarationsListContext(
        ParserRuleContext parent,
        int invokingState) {
      super(parent, invokingState);
    }

    public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
      return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
    }

    public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
      return getRuleContext(AnnotationTypeElementDeclarationContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotationTypeElementDeclarationsList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterAnnotationTypeElementDeclarationsList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitAnnotationTypeElementDeclarationsList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor)
          .visitAnnotationTypeElementDeclarationsList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
    public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public AnnotationTypeElementRestContext annotationTypeElementRest() {
      return getRuleContext(AnnotationTypeElementRestContext.class, 0);
    }

    public ModifiersContext modifiers() {
      return getRuleContext(ModifiersContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotationTypeElementDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterAnnotationTypeElementDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitAnnotationTypeElementDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotationTypeElementDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationTypeElementRestContext extends ParserRuleContext {
    public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
      return getRuleContext(AnnotationMethodOrConstantRestContext.class, 0);
    }

    public ClassDeclarationContext classDeclaration() {
      return getRuleContext(ClassDeclarationContext.class, 0);
    }

    public InterfaceDeclarationContext interfaceDeclaration() {
      return getRuleContext(InterfaceDeclarationContext.class, 0);
    }

    public EnumDeclarationContext enumDeclaration() {
      return getRuleContext(EnumDeclarationContext.class, 0);
    }

    public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
      return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotationTypeElementRest;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterAnnotationTypeElementRest(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitAnnotationTypeElementRest(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotationTypeElementRest(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
    public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public AnnotationMethodRestContext annotationMethodRest() {
      return getRuleContext(AnnotationMethodRestContext.class, 0);
    }

    public AnnotationConstantRestContext annotationConstantRest() {
      return getRuleContext(AnnotationConstantRestContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotationMethodOrConstantRest;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterAnnotationMethodOrConstantRest(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitAnnotationMethodOrConstantRest(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotationMethodOrConstantRest(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationMethodRestContext extends ParserRuleContext {
    public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public DefaultValueContext defaultValue() {
      return getRuleContext(DefaultValueContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotationMethodRest;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterAnnotationMethodRest(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitAnnotationMethodRest(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotationMethodRest(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AnnotationConstantRestContext extends ParserRuleContext {
    public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public VariableDeclaratorsContext variableDeclarators() {
      return getRuleContext(VariableDeclaratorsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_annotationConstantRest;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterAnnotationConstantRest(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitAnnotationConstantRest(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitAnnotationConstantRest(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class DefaultValueContext extends ParserRuleContext {
    public DefaultValueContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ElementValueContext elementValue() {
      return getRuleContext(ElementValueContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_defaultValue;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterDefaultValue(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitDefaultValue(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitDefaultValue(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class BlockContext extends ParserRuleContext {
    public BlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public BlockStatementsContext blockStatements() {
      return getRuleContext(BlockStatementsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_block;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitBlock(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class BlockStatementsContext extends ParserRuleContext {
    public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<BlockStatementContext> blockStatement() {
      return getRuleContexts(BlockStatementContext.class);
    }

    public BlockStatementContext blockStatement(int i) {
      return getRuleContext(BlockStatementContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_blockStatements;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterBlockStatements(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitBlockStatements(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitBlockStatements(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class BlockStatementContext extends ParserRuleContext {
    public BlockStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
      return getRuleContext(LocalVariableDeclarationStatementContext.class, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public TypeDeclarationContext typeDeclaration() {
      return getRuleContext(TypeDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_blockStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterBlockStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitBlockStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitBlockStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
    public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public LocalVariableDeclarationContext localVariableDeclaration() {
      return getRuleContext(LocalVariableDeclarationContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_localVariableDeclarationStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterLocalVariableDeclarationStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitLocalVariableDeclarationStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitLocalVariableDeclarationStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class LocalVariableDeclarationContext extends ParserRuleContext {
    public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public VariableDeclaratorsContext variableDeclarators() {
      return getRuleContext(VariableDeclaratorsContext.class, 0);
    }

    public VariableModifiersContext variableModifiers() {
      return getRuleContext(VariableModifiersContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_localVariableDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterLocalVariableDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitLocalVariableDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitLocalVariableDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class StatementContext extends ParserRuleContext {
    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public TerminalNode ASSERT() {
      return getToken(JavaParser.ASSERT, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public ParExpressionContext parExpression() {
      return getRuleContext(ParExpressionContext.class, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public ForControlContext forControl() {
      return getRuleContext(ForControlContext.class, 0);
    }

    public FinallyBlockContext finallyBlock() {
      return getRuleContext(FinallyBlockContext.class, 0);
    }

    public List<CatchClauseContext> catchClause() {
      return getRuleContexts(CatchClauseContext.class);
    }

    public CatchClauseContext catchClause(int i) {
      return getRuleContext(CatchClauseContext.class, i);
    }

    public ResourceSpecificationContext resourceSpecification() {
      return getRuleContext(ResourceSpecificationContext.class, 0);
    }

    public CatchClausesContext catchClauses() {
      return getRuleContext(CatchClausesContext.class, 0);
    }

    public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
      return getRuleContext(SwitchBlockStatementGroupsContext.class, 0);
    }

    public SwitchLabelsContext switchLabels() {
      return getRuleContext(SwitchLabelsContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public StatementExpressionContext statementExpression() {
      return getRuleContext(StatementExpressionContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CatchClausesContext extends ParserRuleContext {
    public CatchClausesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<CatchClauseContext> catchClause() {
      return getRuleContexts(CatchClauseContext.class);
    }

    public CatchClauseContext catchClause(int i) {
      return getRuleContext(CatchClauseContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_catchClauses;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterCatchClauses(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitCatchClauses(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCatchClauses(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
    public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
      return getRuleContexts(SwitchBlockStatementGroupContext.class);
    }

    public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
      return getRuleContext(SwitchBlockStatementGroupContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_switchBlockStatementGroups;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterSwitchBlockStatementGroups(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitSwitchBlockStatementGroups(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitSwitchBlockStatementGroups(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class SwitchLabelsContext extends ParserRuleContext {
    public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<SwitchLabelContext> switchLabel() {
      return getRuleContexts(SwitchLabelContext.class);
    }

    public SwitchLabelContext switchLabel(int i) {
      return getRuleContext(SwitchLabelContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_switchLabels;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterSwitchLabels(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitSwitchLabels(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitSwitchLabels(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CatchClauseContext extends ParserRuleContext {
    public CatchClauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public CatchTypeContext catchType() {
      return getRuleContext(CatchTypeContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public VariableModifiersContext variableModifiers() {
      return getRuleContext(VariableModifiersContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_catchClause;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterCatchClause(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitCatchClause(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCatchClause(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CatchTypeContext extends ParserRuleContext {
    public CatchTypeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public QualifiedNameContext qualifiedName() {
      return getRuleContext(QualifiedNameContext.class, 0);
    }

    public MidThenQualifiedNameListContext midThenQualifiedNameList() {
      return getRuleContext(MidThenQualifiedNameListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_catchType;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterCatchType(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitCatchType(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCatchType(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class MidThenQualifiedNameListContext extends ParserRuleContext {
    public MidThenQualifiedNameListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<QualifiedNameContext> qualifiedName() {
      return getRuleContexts(QualifiedNameContext.class);
    }

    public QualifiedNameContext qualifiedName(int i) {
      return getRuleContext(QualifiedNameContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_midThenQualifiedNameList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterMidThenQualifiedNameList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitMidThenQualifiedNameList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitMidThenQualifiedNameList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class FinallyBlockContext extends ParserRuleContext {
    public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_finallyBlock;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterFinallyBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitFinallyBlock(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitFinallyBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ResourceSpecificationContext extends ParserRuleContext {
    public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ResourcesContext resources() {
      return getRuleContext(ResourcesContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_resourceSpecification;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterResourceSpecification(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitResourceSpecification(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitResourceSpecification(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ResourcesContext extends ParserRuleContext {
    public ResourcesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public SemicolonThenResourceListContext semicolonThenResourceList() {
      return getRuleContext(SemicolonThenResourceListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_resources;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterResources(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitResources(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitResources(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class SemicolonThenResourceListContext extends ParserRuleContext {
    public SemicolonThenResourceListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ResourceContext> resource() {
      return getRuleContexts(ResourceContext.class);
    }

    public ResourceContext resource(int i) {
      return getRuleContext(ResourceContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_semicolonThenResourceList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterSemicolonThenResourceList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitSemicolonThenResourceList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitSemicolonThenResourceList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ResourceContext extends ParserRuleContext {
    public ResourceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ClassOrInterfaceTypeContext classOrInterfaceType() {
      return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
    }

    public VariableDeclaratorIdContext variableDeclaratorId() {
      return getRuleContext(VariableDeclaratorIdContext.class, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public VariableModifiersContext variableModifiers() {
      return getRuleContext(VariableModifiersContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_resource;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterResource(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitResource(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitResource(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
    public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<SwitchLabelContext> switchLabel() {
      return getRuleContexts(SwitchLabelContext.class);
    }

    public SwitchLabelContext switchLabel(int i) {
      return getRuleContext(SwitchLabelContext.class, i);
    }

    public List<BlockStatementContext> blockStatement() {
      return getRuleContexts(BlockStatementContext.class);
    }

    public BlockStatementContext blockStatement(int i) {
      return getRuleContext(BlockStatementContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_switchBlockStatementGroup;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterSwitchBlockStatementGroup(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitSwitchBlockStatementGroup(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitSwitchBlockStatementGroup(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class SwitchLabelContext extends ParserRuleContext {
    public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ConstantExpressionContext constantExpression() {
      return getRuleContext(ConstantExpressionContext.class, 0);
    }

    public EnumConstantNameContext enumConstantName() {
      return getRuleContext(EnumConstantNameContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_switchLabel;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterSwitchLabel(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitSwitchLabel(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitSwitchLabel(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ForControlContext extends ParserRuleContext {
    public ForControlContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public EnhancedForControlContext enhancedForControl() {
      return getRuleContext(EnhancedForControlContext.class, 0);
    }

    public ForInitContext forInit() {
      return getRuleContext(ForInitContext.class, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public ForUpdateContext forUpdate() {
      return getRuleContext(ForUpdateContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_forControl;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterForControl(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitForControl(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitForControl(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ForInitContext extends ParserRuleContext {
    public ForInitContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public LocalVariableDeclarationContext localVariableDeclaration() {
      return getRuleContext(LocalVariableDeclarationContext.class, 0);
    }

    public ExpressionListContext expressionList() {
      return getRuleContext(ExpressionListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_forInit;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterForInit(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitForInit(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitForInit(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class EnhancedForControlContext extends ParserRuleContext {
    public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public VariableDeclaratorIdContext variableDeclaratorId() {
      return getRuleContext(VariableDeclaratorIdContext.class, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public VariableModifiersContext variableModifiers() {
      return getRuleContext(VariableModifiersContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_enhancedForControl;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterEnhancedForControl(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitEnhancedForControl(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitEnhancedForControl(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ForUpdateContext extends ParserRuleContext {
    public ForUpdateContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ExpressionListContext expressionList() {
      return getRuleContext(ExpressionListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_forUpdate;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterForUpdate(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitForUpdate(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitForUpdate(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ParExpressionContext extends ParserRuleContext {
    public ParExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_parExpression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterParExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitParExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitParExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ExpressionListContext extends ParserRuleContext {
    public ExpressionListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public CommaThenExpressionListContext commaThenExpressionList() {
      return getRuleContext(CommaThenExpressionListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expressionList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterExpressionList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitExpressionList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitExpressionList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CommaThenExpressionListContext extends ParserRuleContext {
    public CommaThenExpressionListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_commaThenExpressionList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterCommaThenExpressionList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitCommaThenExpressionList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCommaThenExpressionList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class StatementExpressionContext extends ParserRuleContext {
    public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statementExpression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterStatementExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitStatementExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitStatementExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ConstantExpressionContext extends ParserRuleContext {
    public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_constantExpression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterConstantExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitConstantExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitConstantExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ExpressionContext extends ParserRuleContext {
    public ExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public PrimaryContext primary() {
      return getRuleContext(PrimaryContext.class, 0);
    }

    public CreatorContext creator() {
      return getRuleContext(CreatorContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public InnerCreatorContext innerCreator() {
      return getRuleContext(InnerCreatorContext.class, 0);
    }

    public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
      return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
    }

    public SuperSuffixContext superSuffix() {
      return getRuleContext(SuperSuffixContext.class, 0);
    }

    public ExplicitGenericInvocationContext explicitGenericInvocation() {
      return getRuleContext(ExplicitGenericInvocationContext.class, 0);
    }

    public ExpressionListContext expressionList() {
      return getRuleContext(ExpressionListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class PrimaryContext extends ParserRuleContext {
    public PrimaryContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public LiteralContext literal() {
      return getRuleContext(LiteralContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
      return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
    }

    public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
      return getRuleContext(ExplicitGenericInvocationSuffixContext.class, 0);
    }

    public ArgumentsContext arguments() {
      return getRuleContext(ArgumentsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_primary;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterPrimary(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitPrimary(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitPrimary(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CreatorContext extends ParserRuleContext {
    public CreatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
      return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
    }

    public CreatedNameContext createdName() {
      return getRuleContext(CreatedNameContext.class, 0);
    }

    public ClassCreatorRestContext classCreatorRest() {
      return getRuleContext(ClassCreatorRestContext.class, 0);
    }

    public ArrayCreatorRestContext arrayCreatorRest() {
      return getRuleContext(ArrayCreatorRestContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_creator;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterCreator(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitCreator(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCreator(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class CreatedNameContext extends ParserRuleContext {
    public CreatedNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
      return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
    }

    public DotIdThenTypeArgumentsOrDiamondListContext dotIdThenTypeArgumentsOrDiamondList() {
      return getRuleContext(DotIdThenTypeArgumentsOrDiamondListContext.class, 0);
    }

    public PrimitiveTypeContext primitiveType() {
      return getRuleContext(PrimitiveTypeContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_createdName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterCreatedName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitCreatedName(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitCreatedName(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class DotIdThenTypeArgumentsOrDiamondListContext extends ParserRuleContext {
    public DotIdThenTypeArgumentsOrDiamondListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<TerminalNode> Identifier() {
      return getTokens(JavaParser.Identifier);
    }

    public TerminalNode Identifier(int i) {
      return getToken(JavaParser.Identifier, i);
    }

    public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
      return getRuleContexts(TypeArgumentsOrDiamondContext.class);
    }

    public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
      return getRuleContext(TypeArgumentsOrDiamondContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_dotIdThenTypeArgumentsOrDiamondList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterDotIdThenTypeArgumentsOrDiamondList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitDotIdThenTypeArgumentsOrDiamondList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitDotIdThenTypeArgumentsOrDiamondList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class InnerCreatorContext extends ParserRuleContext {
    public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public ClassCreatorRestContext classCreatorRest() {
      return getRuleContext(ClassCreatorRestContext.class, 0);
    }

    public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
      return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_innerCreator;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterInnerCreator(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitInnerCreator(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitInnerCreator(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ArrayCreatorRestContext extends ParserRuleContext {
    public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ArrayInitializerContext arrayInitializer() {
      return getRuleContext(ArrayInitializerContext.class, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public SquareBracketsListContext squareBracketsList() {
      return getRuleContext(SquareBracketsListContext.class, 0);
    }

    public SquareBracketsWithExpressionListContext squareBracketsWithExpressionList() {
      return getRuleContext(SquareBracketsWithExpressionListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrayCreatorRest;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterArrayCreatorRest(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitArrayCreatorRest(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitArrayCreatorRest(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class SquareBracketsWithExpressionListContext extends ParserRuleContext {
    public SquareBracketsWithExpressionListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    @Override
    public int getRuleIndex() {
      return RULE_squareBracketsWithExpressionList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterSquareBracketsWithExpressionList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitSquareBracketsWithExpressionList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitSquareBracketsWithExpressionList(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ClassCreatorRestContext extends ParserRuleContext {
    public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ArgumentsContext arguments() {
      return getRuleContext(ArgumentsContext.class, 0);
    }

    public ClassBodyContext classBody() {
      return getRuleContext(ClassBodyContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classCreatorRest;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterClassCreatorRest(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitClassCreatorRest(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitClassCreatorRest(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ExplicitGenericInvocationContext extends ParserRuleContext {
    public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
      return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
    }

    public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
      return getRuleContext(ExplicitGenericInvocationSuffixContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_explicitGenericInvocation;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterExplicitGenericInvocation(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitExplicitGenericInvocation(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitExplicitGenericInvocation(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
    public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeListContext typeList() {
      return getRuleContext(TypeListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_nonWildcardTypeArguments;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterNonWildcardTypeArguments(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitNonWildcardTypeArguments(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitNonWildcardTypeArguments(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
    public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public TypeArgumentsContext typeArguments() {
      return getRuleContext(TypeArgumentsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_typeArgumentsOrDiamond;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterTypeArgumentsOrDiamond(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitTypeArgumentsOrDiamond(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitTypeArgumentsOrDiamond(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
    public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
      return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_nonWildcardTypeArgumentsOrDiamond;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterNonWildcardTypeArgumentsOrDiamond(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitNonWildcardTypeArgumentsOrDiamond(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class SuperSuffixContext extends ParserRuleContext {
    public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ArgumentsContext arguments() {
      return getRuleContext(ArgumentsContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_superSuffix;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterSuperSuffix(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitSuperSuffix(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitSuperSuffix(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
    public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public SuperSuffixContext superSuffix() {
      return getRuleContext(SuperSuffixContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaParser.Identifier, 0);
    }

    public ArgumentsContext arguments() {
      return getRuleContext(ArgumentsContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_explicitGenericInvocationSuffix;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).enterExplicitGenericInvocationSuffix(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener)
        ((JavaListener) listener).exitExplicitGenericInvocationSuffix(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitExplicitGenericInvocationSuffix(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ArgumentsContext extends ParserRuleContext {
    public ArgumentsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ExpressionListContext expressionList() {
      return getRuleContext(ExpressionListContext.class, 0);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arguments;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).enterArguments(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaListener) ((JavaListener) listener).exitArguments(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaVisitor)
        return ((JavaVisitor<? extends T>) visitor).visitArguments(this);
      else return visitor.visitChildren(this);
    }
  }
}