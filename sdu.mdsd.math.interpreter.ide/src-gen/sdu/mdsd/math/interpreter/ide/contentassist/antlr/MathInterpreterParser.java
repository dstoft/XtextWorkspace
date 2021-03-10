/*
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.math.interpreter.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import sdu.mdsd.math.interpreter.ide.contentassist.antlr.internal.InternalMathInterpreterParser;
import sdu.mdsd.math.interpreter.services.MathInterpreterGrammarAccess;

public class MathInterpreterParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MathInterpreterGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MathInterpreterGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpOpAccess().getAlternatives(), "rule__ExpOp__Alternatives");
			builder.put(grammarAccess.getFactorOpAccess().getAlternatives(), "rule__FactorOp__Alternatives");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getMathExpAccess().getGroup(), "rule__MathExp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0(), "rule__Exp__Group_1_0__0");
			builder.put(grammarAccess.getExpOpAccess().getGroup_0(), "rule__ExpOp__Group_0__0");
			builder.put(grammarAccess.getExpOpAccess().getGroup_1(), "rule__ExpOp__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0(), "rule__Factor__Group_1_0__0");
			builder.put(grammarAccess.getFactorOpAccess().getGroup_0(), "rule__FactorOp__Group_0__0");
			builder.put(grammarAccess.getFactorOpAccess().getGroup_1(), "rule__FactorOp__Group_1__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getMathExpAccess().getExpAssignment_2(), "rule__MathExp__ExpAssignment_2");
			builder.put(grammarAccess.getExpAccess().getLeftAssignment_0(), "rule__Exp__LeftAssignment_0");
			builder.put(grammarAccess.getExpAccess().getOperatorAssignment_1_0_0(), "rule__Exp__OperatorAssignment_1_0_0");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getLeftAssignment_0(), "rule__Factor__LeftAssignment_0");
			builder.put(grammarAccess.getFactorAccess().getOperatorAssignment_1_0_0(), "rule__Factor__OperatorAssignment_1_0_0");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
			builder.put(grammarAccess.getParenthesisAccess().getExpAssignment_1(), "rule__Parenthesis__ExpAssignment_1");
			builder.put(grammarAccess.getNumberAccess().getValueAssignment(), "rule__Number__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MathInterpreterGrammarAccess grammarAccess;

	@Override
	protected InternalMathInterpreterParser createParser() {
		InternalMathInterpreterParser result = new InternalMathInterpreterParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MathInterpreterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathInterpreterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}