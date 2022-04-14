// Generated from /home/david/eclipse-workspace/mutants/src/NTAParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NTAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN_DECLARATION=7, 
		OPEN_PARAMETER=8, OPEN_GUARD=9, OPEN_SYNC=10, OPEN_LBLTR=11, OPEN_SELECT=12, 
		OPEN_INV=13, OPEN_SYSTEM=14, OPEN=15, OPENSLASH=16, XMLDeclOpen=17, TEXT=18, 
		PI=19, NTA=20, DECLARATION=21, TEMPLATE=22, LOCATION=23, NAME=24, COLOR=25, 
		X=26, Y=27, ID=28, TRANSITION=29, SOURCE=30, TARGET=31, NAIL=32, FORMULA=33, 
		LABEL=34, INIT=35, BRANCHPOINT=36, COMMITTED=37, URGENTTAG=38, SYSTEM=39, 
		QUERIES=40, QUERY=41, QUERY_COMMENT=42, KIND=43, INVARIANT=44, SYNCHRONIZE=45, 
		GUARD=46, ASSIGNMENT=47, SELECT=48, REF=49, CLOSE=50, SPECIAL_CLOSE=51, 
		SLASH_CLOSE=52, EQUALS=53, STRING=54, Name=55, S=56, BLOCKCOMMENT=57, 
		INLINECOMMENT=58, NAT=59, CLOSE_DECLARATION=60, CLOSE_LABEL=61, CLOSE_PARAMETER=62, 
		CLOSE_SYSTEM=63, TRASH=64, URGENT=65, BROADCAST=66, META=67, CONST=68, 
		INT=69, CLOCK=70, CHANNEL=71, BOOL=72, DOUBLE=73, SCALAR=74, STRUCT=75, 
		TYPEDEF=76, PRIORITY=77, DEFAULT=78, APOSTROPHE=79, OPEN_PARENTHESIS=80, 
		CLOSE_PARENTESIS=81, OPEN_BRACKET=82, CLOSE_BRACKET=83, OPEN_CURLYBRACKET=84, 
		CLOSE_CURLYBRACKET=85, DOT=86, COMMA=87, COLON=88, SEMICOLON=89, QUESTION=90, 
		INCREMENT=91, DECREMENT=92, SYSTEMEXPR=93, ASSIGN=94, NOT=95, SNOT=96, 
		ADD=97, MINUS=98, LESS=99, LESSEQ=100, EQ=101, NOTEQ=102, GREATEEQ=103, 
		GREATER=104, PROD=105, DIV=106, MOD=107, BITOR=108, BITAND=109, XOR=110, 
		RSHIFT=111, LSHIFT=112, LAND=113, LOR=114, AND=115, OR=116, IMPLY=117, 
		MIN=118, MAX=119, FORALL=120, EXISTS=121, SUM=122, DEADLOCK=123, TRUE=124, 
		FALSE=125, FOR=126, WHILE=127, DO=128, IF=129, ELSE=130, RETURN=131, GANTT=132, 
		IDENTIFIER=133;
	public static final int
		RULE_model = 0, RULE_prolog = 1, RULE_element = 2, RULE_content = 3, RULE_reference = 4, 
		RULE_attribute = 5, RULE_chardata = 6, RULE_misc = 7, RULE_nta = 8, RULE_declaration = 9, 
		RULE_declarations = 10, RULE_expr = 11, RULE_arguments = 12, RULE_variableDecl = 13, 
		RULE_type = 14, RULE_prefix = 15, RULE_typeID = 16, RULE_fieldDecl = 17, 
		RULE_arrayDecl = 18, RULE_variableID = 19, RULE_initialiser = 20, RULE_typeDecl = 21, 
		RULE_function = 22, RULE_paramTag = 23, RULE_parameters = 24, RULE_parameter = 25, 
		RULE_block = 26, RULE_localDecl = 27, RULE_statement = 28, RULE_chanPriority = 29, 
		RULE_chanExpr = 30, RULE_forLoop = 31, RULE_iteration = 32, RULE_whileLoop = 33, 
		RULE_doWhileLoop = 34, RULE_ifStatement = 35, RULE_returnStmnt = 36, RULE_template = 37, 
		RULE_templateBody = 38, RULE_location = 39, RULE_labelLoc = 40, RULE_initRef = 41, 
		RULE_branchpoint = 42, RULE_commited = 43, RULE_urgent = 44, RULE_name = 45, 
		RULE_color = 46, RULE_coord = 47, RULE_id = 48, RULE_transition = 49, 
		RULE_source = 50, RULE_target = 51, RULE_labelUpdate = 52, RULE_labelGuard = 53, 
		RULE_labelSync = 54, RULE_labelSelect = 55, RULE_selectList = 56, RULE_anything = 57, 
		RULE_system = 58, RULE_process = 59, RULE_systemDecl = 60, RULE_ganttDecl = 61, 
		RULE_nail = 62, RULE_queries = 63, RULE_query = 64, RULE_formula = 65, 
		RULE_comment = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "prolog", "element", "content", "reference", "attribute", "chardata", 
			"misc", "nta", "declaration", "declarations", "expr", "arguments", "variableDecl", 
			"type", "prefix", "typeID", "fieldDecl", "arrayDecl", "variableID", "initialiser", 
			"typeDecl", "function", "paramTag", "parameters", "parameter", "block", 
			"localDecl", "statement", "chanPriority", "chanExpr", "forLoop", "iteration", 
			"whileLoop", "doWhileLoop", "ifStatement", "returnStmnt", "template", 
			"templateBody", "location", "labelLoc", "initRef", "branchpoint", "commited", 
			"urgent", "name", "color", "coord", "id", "transition", "source", "target", 
			"labelUpdate", "labelGuard", "labelSync", "labelSelect", "selectList", 
			"anything", "system", "process", "systemDecl", "ganttDecl", "nail", "queries", 
			"query", "formula", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'<'", "'</'", null, null, null, "'nta'", "'declaration'", 
			"'template'", "'location'", "'name'", "'color'", "'x'", "'y'", "'id'", 
			"'transition'", "'source'", "'target'", "'nail'", "'formula'", "'label'", 
			"'init'", "'branchpoint'", "'committed'", null, null, "'queries'", "'query'", 
			"'comment'", "'kind'", "'\"invariant\"'", "'\"synchronisation\"'", "'\"guard\"'", 
			"'\"assignment\"'", "'\"select\"'", "'ref'", "'>'", null, "'/>'", "'='", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'broadcast'", "'meta'", "'const'", "'int'", "'clock'", "'chan'", "'bool'", 
			"'double'", "'scalar'", "'struct'", "'typedef'", "'priority'", "'default'", 
			"'''", "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "':'", 
			"';'", "'?'", "'++'", "'--'", null, null, "'not'", "'!'", "'+'", "'-'", 
			"'&lt;'", "'&lt;='", "'=='", "'!='", "'&gt;='", "'&gt;'", "'*'", "'&#8725;'", 
			"'%'", "'|'", "'&amp;'", "'^'", "'&gt;&gt;'", "'&lt;&lt;'", "'&amp;&amp;'", 
			"'||'", "'and'", "'or'", "'imply'", "'&lt;?'", "'&gt;?'", "'forall'", 
			"'exists'", "'sum'", "'deadlock'", "'true'", "'false'", "'for'", "'while'", 
			"'do'", "'if'", "'else'", "'return'", "'gantt'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN_DECLARATION", 
			"OPEN_PARAMETER", "OPEN_GUARD", "OPEN_SYNC", "OPEN_LBLTR", "OPEN_SELECT", 
			"OPEN_INV", "OPEN_SYSTEM", "OPEN", "OPENSLASH", "XMLDeclOpen", "TEXT", 
			"PI", "NTA", "DECLARATION", "TEMPLATE", "LOCATION", "NAME", "COLOR", 
			"X", "Y", "ID", "TRANSITION", "SOURCE", "TARGET", "NAIL", "FORMULA", 
			"LABEL", "INIT", "BRANCHPOINT", "COMMITTED", "URGENTTAG", "SYSTEM", "QUERIES", 
			"QUERY", "QUERY_COMMENT", "KIND", "INVARIANT", "SYNCHRONIZE", "GUARD", 
			"ASSIGNMENT", "SELECT", "REF", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", 
			"EQUALS", "STRING", "Name", "S", "BLOCKCOMMENT", "INLINECOMMENT", "NAT", 
			"CLOSE_DECLARATION", "CLOSE_LABEL", "CLOSE_PARAMETER", "CLOSE_SYSTEM", 
			"TRASH", "URGENT", "BROADCAST", "META", "CONST", "INT", "CLOCK", "CHANNEL", 
			"BOOL", "DOUBLE", "SCALAR", "STRUCT", "TYPEDEF", "PRIORITY", "DEFAULT", 
			"APOSTROPHE", "OPEN_PARENTHESIS", "CLOSE_PARENTESIS", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_CURLYBRACKET", "CLOSE_CURLYBRACKET", "DOT", "COMMA", 
			"COLON", "SEMICOLON", "QUESTION", "INCREMENT", "DECREMENT", "SYSTEMEXPR", 
			"ASSIGN", "NOT", "SNOT", "ADD", "MINUS", "LESS", "LESSEQ", "EQ", "NOTEQ", 
			"GREATEEQ", "GREATER", "PROD", "DIV", "MOD", "BITOR", "BITAND", "XOR", 
			"RSHIFT", "LSHIFT", "LAND", "LOR", "AND", "OR", "IMPLY", "MIN", "MAX", 
			"FORALL", "EXISTS", "SUM", "DEADLOCK", "TRUE", "FALSE", "FOR", "WHILE", 
			"DO", "IF", "ELSE", "RETURN", "GANTT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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
	public String getGrammarFileName() { return "NTAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NTAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModelContext extends ParserRuleContext {
		public NtaContext nta() {
			return getRuleContext(NtaContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(134);
				prolog();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(137);
				misc();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			nta();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(144);
				misc();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode XMLDeclOpen() { return getToken(NTAParser.XMLDeclOpen, 0); }
		public TerminalNode SPECIAL_CLOSE() { return getToken(NTAParser.SPECIAL_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitProlog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitProlog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(XMLDeclOpen);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(151);
				attribute();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(SPECIAL_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> Name() { return getTokens(NTAParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(NTAParser.Name, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(NTAParser.SLASH_CLOSE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(OPEN);
				setState(160);
				match(Name);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(161);
					attribute();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(CLOSE);
				setState(168);
				content();
				setState(169);
				match(OPENSLASH);
				setState(170);
				match(Name);
				setState(171);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(OPEN);
				setState(174);
				match(Name);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(175);
					attribute();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(SLASH_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(NTAParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(NTAParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(NTAParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(NTAParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(NTAParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(NTAParser.COMMENT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(184);
				chardata();
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << OPEN) | (1L << PI))) != 0)) {
				{
				{
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN:
					{
					setState(187);
					element();
					}
					break;
				case EntityRef:
				case CharRef:
					{
					setState(188);
					reference();
					}
					break;
				case CDATA:
					{
					setState(189);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(190);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(191);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(194);
					chardata();
					}
				}

				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode EntityRef() { return getToken(NTAParser.EntityRef, 0); }
		public TerminalNode CharRef() { return getToken(NTAParser.CharRef, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==EntityRef || _la==CharRef) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(NTAParser.Name, 0); }
		public TerminalNode EQUALS() { return getToken(NTAParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(NTAParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Name);
			setState(205);
			match(EQUALS);
			setState(206);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(NTAParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(NTAParser.SEA_WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(NTAParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(NTAParser.PI, 0); }
		public TerminalNode SEA_WS() { return getToken(NTAParser.SEA_WS, 0); }
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NtaContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> NTA() { return getTokens(NTAParser.NTA); }
		public TerminalNode NTA(int i) {
			return getToken(NTAParser.NTA, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SystemContext system() {
			return getRuleContext(SystemContext.class,0);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public QueriesContext queries() {
			return getRuleContext(QueriesContext.class,0);
		}
		public NtaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterNta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitNta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitNta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NtaContext nta() throws RecognitionException {
		NtaContext _localctx = new NtaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(OPEN);
			setState(213);
			match(NTA);
			setState(214);
			match(CLOSE);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(215);
				misc();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			declaration();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(222);
				misc();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(228);
				template();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(229);
					misc();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN );
			setState(239);
			system();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(240);
				misc();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(246);
				queries();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(247);
					misc();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(255);
			match(OPENSLASH);
			setState(256);
			match(NTA);
			setState(257);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode OPEN_DECLARATION() { return getToken(NTAParser.OPEN_DECLARATION, 0); }
		public TerminalNode CLOSE_DECLARATION() { return getToken(NTAParser.CLOSE_DECLARATION, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(OPEN_DECLARATION);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (URGENT - 65)) | (1L << (BROADCAST - 65)) | (1L << (META - 65)) | (1L << (CONST - 65)) | (1L << (INT - 65)) | (1L << (CLOCK - 65)) | (1L << (CHANNEL - 65)) | (1L << (BOOL - 65)) | (1L << (DOUBLE - 65)) | (1L << (SCALAR - 65)) | (1L << (STRUCT - 65)) | (1L << (TYPEDEF - 65)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(260);
				declarations();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(CLOSE_DECLARATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunDeclContext extends DeclarationsContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunDeclContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitFunDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitFunDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclContext extends DeclarationsContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public VarDeclContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChannelPriorityContext extends DeclarationsContext {
		public ChanPriorityContext chanPriority() {
			return getRuleContext(ChanPriorityContext.class,0);
		}
		public ChannelPriorityContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterChannelPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitChannelPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitChannelPriority(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDeclarationContext extends DeclarationsContext {
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public TypeDeclarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarations);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				variableDecl();
				}
				break;
			case 2:
				_localctx = new TypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				typeDecl();
				}
				break;
			case 3:
				_localctx = new FunDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				function();
				}
				break;
			case 4:
				_localctx = new ChannelPriorityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				chanPriority();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NTAParser.IDENTIFIER, 0); }
		public TerminalNode NAT() { return getToken(NTAParser.NAT, 0); }
		public TerminalNode DOT() { return getToken(NTAParser.DOT, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(NTAParser.OPEN_PARENTHESIS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(NTAParser.CLOSE_PARENTESIS, 0); }
		public TerminalNode INCREMENT() { return getToken(NTAParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(NTAParser.DECREMENT, 0); }
		public TerminalNode MINUS() { return getToken(NTAParser.MINUS, 0); }
		public TerminalNode ADD() { return getToken(NTAParser.ADD, 0); }
		public TerminalNode SNOT() { return getToken(NTAParser.SNOT, 0); }
		public TerminalNode NOT() { return getToken(NTAParser.NOT, 0); }
		public TerminalNode FORALL() { return getToken(NTAParser.FORALL, 0); }
		public TerminalNode COLON() { return getToken(NTAParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(NTAParser.EXISTS, 0); }
		public TerminalNode SUM() { return getToken(NTAParser.SUM, 0); }
		public TerminalNode DEADLOCK() { return getToken(NTAParser.DEADLOCK, 0); }
		public TerminalNode TRUE() { return getToken(NTAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(NTAParser.FALSE, 0); }
		public TerminalNode ASSIGN() { return getToken(NTAParser.ASSIGN, 0); }
		public TerminalNode PROD() { return getToken(NTAParser.PROD, 0); }
		public TerminalNode DIV() { return getToken(NTAParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(NTAParser.MOD, 0); }
		public TerminalNode AND() { return getToken(NTAParser.AND, 0); }
		public TerminalNode OR() { return getToken(NTAParser.OR, 0); }
		public TerminalNode IMPLY() { return getToken(NTAParser.IMPLY, 0); }
		public TerminalNode EQ() { return getToken(NTAParser.EQ, 0); }
		public TerminalNode LESS() { return getToken(NTAParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(NTAParser.LESSEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(NTAParser.NOTEQ, 0); }
		public TerminalNode GREATEEQ() { return getToken(NTAParser.GREATEEQ, 0); }
		public TerminalNode GREATER() { return getToken(NTAParser.GREATER, 0); }
		public TerminalNode BITOR() { return getToken(NTAParser.BITOR, 0); }
		public TerminalNode XOR() { return getToken(NTAParser.XOR, 0); }
		public TerminalNode RSHIFT() { return getToken(NTAParser.RSHIFT, 0); }
		public TerminalNode LSHIFT() { return getToken(NTAParser.LSHIFT, 0); }
		public TerminalNode LAND() { return getToken(NTAParser.LAND, 0); }
		public TerminalNode MIN() { return getToken(NTAParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(NTAParser.MAX, 0); }
		public TerminalNode LOR() { return getToken(NTAParser.LOR, 0); }
		public TerminalNode QUESTION() { return getToken(NTAParser.QUESTION, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(NTAParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(NTAParser.CLOSE_BRACKET, 0); }
		public TerminalNode APOSTROPHE() { return getToken(NTAParser.APOSTROPHE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(275);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				setState(276);
				match(NAT);
				}
				break;
			case DOT:
				{
				setState(277);
				match(DOT);
				}
				break;
			case OPEN_PARENTHESIS:
				{
				setState(278);
				match(OPEN_PARENTHESIS);
				setState(279);
				expr(0);
				setState(280);
				match(CLOSE_PARENTESIS);
				}
				break;
			case INCREMENT:
				{
				setState(282);
				match(INCREMENT);
				setState(283);
				expr(17);
				}
				break;
			case DECREMENT:
				{
				setState(284);
				match(DECREMENT);
				setState(285);
				expr(15);
				}
				break;
			case NOT:
			case SNOT:
			case ADD:
			case MINUS:
				{
				setState(286);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (NOT - 95)) | (1L << (SNOT - 95)) | (1L << (ADD - 95)) | (1L << (MINUS - 95)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(287);
				expr(13);
				}
				break;
			case FORALL:
				{
				setState(288);
				match(FORALL);
				setState(289);
				match(OPEN_PARENTHESIS);
				setState(290);
				match(IDENTIFIER);
				setState(291);
				match(COLON);
				setState(292);
				type();
				setState(293);
				match(CLOSE_PARENTESIS);
				setState(294);
				expr(6);
				}
				break;
			case EXISTS:
				{
				setState(296);
				match(EXISTS);
				setState(297);
				match(OPEN_PARENTHESIS);
				setState(298);
				match(IDENTIFIER);
				setState(299);
				match(COLON);
				setState(300);
				type();
				setState(301);
				match(CLOSE_PARENTESIS);
				setState(302);
				expr(5);
				}
				break;
			case SUM:
				{
				setState(304);
				match(SUM);
				setState(305);
				match(OPEN_PARENTHESIS);
				setState(306);
				match(IDENTIFIER);
				setState(307);
				match(COLON);
				setState(308);
				type();
				setState(309);
				match(CLOSE_PARENTESIS);
				setState(310);
				expr(4);
				}
				break;
			case DEADLOCK:
				{
				setState(312);
				match(DEADLOCK);
				}
				break;
			case TRUE:
				{
				setState(313);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(314);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(318);
						match(ASSIGN);
						setState(319);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(321);
						_la = _input.LA(1);
						if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (ADD - 97)) | (1L << (MINUS - 97)) | (1L << (LESS - 97)) | (1L << (LESSEQ - 97)) | (1L << (EQ - 97)) | (1L << (NOTEQ - 97)) | (1L << (GREATEEQ - 97)) | (1L << (GREATER - 97)) | (1L << (PROD - 97)) | (1L << (DIV - 97)) | (1L << (MOD - 97)) | (1L << (BITOR - 97)) | (1L << (XOR - 97)) | (1L << (RSHIFT - 97)) | (1L << (LSHIFT - 97)) | (1L << (LAND - 97)) | (1L << (LOR - 97)) | (1L << (AND - 97)) | (1L << (OR - 97)) | (1L << (IMPLY - 97)) | (1L << (MIN - 97)) | (1L << (MAX - 97)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(322);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(324);
						match(QUESTION);
						setState(325);
						expr(0);
						setState(326);
						match(COLON);
						setState(327);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(330);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(333);
						match(OPEN_BRACKET);
						setState(334);
						expr(0);
						setState(335);
						match(CLOSE_BRACKET);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(338);
						match(APOSTROPHE);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(339);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(340);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(342);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(343);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(344);
						_la = _input.LA(1);
						if ( !(_la==QUESTION || _la==SNOT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(346);
						match(DOT);
						setState(347);
						match(IDENTIFIER);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(348);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(349);
						match(OPEN_PARENTHESIS);
						setState(350);
						arguments();
						setState(351);
						match(CLOSE_PARENTESIS);
						}
						break;
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NTAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NTAParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (OPEN_PARENTHESIS - 80)) | (1L << (DOT - 80)) | (1L << (INCREMENT - 80)) | (1L << (DECREMENT - 80)) | (1L << (NOT - 80)) | (1L << (SNOT - 80)) | (1L << (ADD - 80)) | (1L << (MINUS - 80)) | (1L << (FORALL - 80)) | (1L << (EXISTS - 80)) | (1L << (SUM - 80)) | (1L << (DEADLOCK - 80)) | (1L << (TRUE - 80)) | (1L << (FALSE - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(358);
				expr(0);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(359);
					match(COMMA);
					setState(360);
					expr(0);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableIDContext> variableID() {
			return getRuleContexts(VariableIDContext.class);
		}
		public VariableIDContext variableID(int i) {
			return getRuleContext(VariableIDContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(NTAParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NTAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NTAParser.COMMA, i);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			type();
			setState(369);
			variableID();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(370);
				match(COMMA);
				setState(371);
				variableID();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (URGENT - 65)) | (1L << (BROADCAST - 65)) | (1L << (META - 65)) | (1L << (CONST - 65)))) != 0)) {
				{
				setState(379);
				prefix();
				}
			}

			setState(382);
			typeID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode URGENT() { return getToken(NTAParser.URGENT, 0); }
		public TerminalNode BROADCAST() { return getToken(NTAParser.BROADCAST, 0); }
		public TerminalNode META() { return getToken(NTAParser.META, 0); }
		public TerminalNode CONST() { return getToken(NTAParser.CONST, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (URGENT - 65)) | (1L << (BROADCAST - 65)) | (1L << (META - 65)) | (1L << (CONST - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NTAParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(NTAParser.INT, 0); }
		public TerminalNode CLOCK() { return getToken(NTAParser.CLOCK, 0); }
		public TerminalNode CHANNEL() { return getToken(NTAParser.CHANNEL, 0); }
		public TerminalNode BOOL() { return getToken(NTAParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(NTAParser.DOUBLE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(NTAParser.OPEN_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(NTAParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(NTAParser.CLOSE_BRACKET, 0); }
		public TerminalNode SCALAR() { return getToken(NTAParser.SCALAR, 0); }
		public TerminalNode STRUCT() { return getToken(NTAParser.STRUCT, 0); }
		public TerminalNode OPEN_CURLYBRACKET() { return getToken(NTAParser.OPEN_CURLYBRACKET, 0); }
		public TerminalNode CLOSE_CURLYBRACKET() { return getToken(NTAParser.CLOSE_CURLYBRACKET, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public TypeIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitTypeID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitTypeID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIDContext typeID() throws RecognitionException {
		TypeIDContext _localctx = new TypeIDContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeID);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(CLOCK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(CHANNEL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				match(BOOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				match(DOUBLE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				match(INT);
				setState(393);
				match(OPEN_BRACKET);
				setState(394);
				expr(0);
				setState(395);
				match(COMMA);
				setState(396);
				expr(0);
				setState(397);
				match(CLOSE_BRACKET);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(399);
				match(SCALAR);
				setState(400);
				match(OPEN_BRACKET);
				setState(401);
				expr(0);
				setState(402);
				match(CLOSE_BRACKET);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(404);
				match(STRUCT);
				setState(405);
				match(OPEN_CURLYBRACKET);
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(406);
					fieldDecl();
					}
					}
					setState(409); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (URGENT - 65)) | (1L << (BROADCAST - 65)) | (1L << (META - 65)) | (1L << (CONST - 65)) | (1L << (INT - 65)) | (1L << (CLOCK - 65)) | (1L << (CHANNEL - 65)) | (1L << (BOOL - 65)) | (1L << (DOUBLE - 65)) | (1L << (SCALAR - 65)) | (1L << (STRUCT - 65)))) != 0) || _la==IDENTIFIER );
				setState(411);
				match(CLOSE_CURLYBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(NTAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NTAParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(NTAParser.SEMICOLON, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NTAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NTAParser.COMMA, i);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			type();
			setState(416);
			match(IDENTIFIER);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKET) {
				{
				{
				setState(417);
				arrayDecl();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(423);
				match(COMMA);
				setState(424);
				match(IDENTIFIER);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET) {
					{
					{
					setState(425);
					arrayDecl();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(NTAParser.OPEN_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NTAParser.CLOSE_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayDecl);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(OPEN_BRACKET);
				setState(439);
				expr(0);
				setState(440);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(OPEN_BRACKET);
				setState(443);
				type();
				setState(444);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NTAParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(NTAParser.ASSIGN, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public VariableIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterVariableID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitVariableID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitVariableID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIDContext variableID() throws RecognitionException {
		VariableIDContext _localctx = new VariableIDContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(IDENTIFIER);
			{
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKET) {
				{
				{
				setState(449);
				arrayDecl();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(455);
				match(ASSIGN);
				setState(456);
				initialiser();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialiserContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPEN_CURLYBRACKET() { return getToken(NTAParser.OPEN_CURLYBRACKET, 0); }
		public List<InitialiserContext> initialiser() {
			return getRuleContexts(InitialiserContext.class);
		}
		public InitialiserContext initialiser(int i) {
			return getRuleContext(InitialiserContext.class,i);
		}
		public TerminalNode CLOSE_CURLYBRACKET() { return getToken(NTAParser.CLOSE_CURLYBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NTAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NTAParser.COMMA, i);
		}
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterInitialiser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitInitialiser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitInitialiser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initialiser);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAT:
			case OPEN_PARENTHESIS:
			case DOT:
			case INCREMENT:
			case DECREMENT:
			case NOT:
			case SNOT:
			case ADD:
			case MINUS:
			case FORALL:
			case EXISTS:
			case SUM:
			case DEADLOCK:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				expr(0);
				}
				break;
			case OPEN_CURLYBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(OPEN_CURLYBRACKET);
				setState(461);
				initialiser();
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(462);
					match(COMMA);
					setState(463);
					initialiser();
					}
					}
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(469);
				match(CLOSE_CURLYBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(NTAParser.TYPEDEF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(NTAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NTAParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(NTAParser.SEMICOLON, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NTAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NTAParser.COMMA, i);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(TYPEDEF);
			setState(474);
			type();
			setState(475);
			match(IDENTIFIER);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKET) {
				{
				{
				setState(476);
				arrayDecl();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(482);
				match(COMMA);
				setState(483);
				match(IDENTIFIER);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET) {
					{
					{
					setState(484);
					arrayDecl();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NTAParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(NTAParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTESIS() { return getToken(NTAParser.CLOSE_PARENTESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			type();
			setState(498);
			match(IDENTIFIER);
			setState(499);
			match(OPEN_PARENTHESIS);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (URGENT - 65)) | (1L << (BROADCAST - 65)) | (1L << (META - 65)) | (1L << (CONST - 65)) | (1L << (INT - 65)) | (1L << (CLOCK - 65)) | (1L << (CHANNEL - 65)) | (1L << (BOOL - 65)) | (1L << (DOUBLE - 65)) | (1L << (SCALAR - 65)) | (1L << (STRUCT - 65)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(500);
				parameters();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			match(CLOSE_PARENTESIS);
			setState(507);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamTagContext extends ParserRuleContext {
		public TerminalNode OPEN_PARAMETER() { return getToken(NTAParser.OPEN_PARAMETER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CLOSE_PARAMETER() { return getToken(NTAParser.CLOSE_PARAMETER, 0); }
		public ParamTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterParamTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitParamTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitParamTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamTagContext paramTag() throws RecognitionException {
		ParamTagContext _localctx = new ParamTagContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_paramTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(OPEN_PARAMETER);
			setState(510);
			parameters();
			setState(511);
			match(CLOSE_PARAMETER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NTAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NTAParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			parameter();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(514);
				match(COMMA);
				setState(515);
				parameter();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NTAParser.IDENTIFIER, 0); }
		public TerminalNode BITAND() { return getToken(NTAParser.BITAND, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			type();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(522);
				match(BITAND);
				}
			}

			setState(525);
			match(IDENTIFIER);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKET) {
				{
				{
				setState(526);
				arrayDecl();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLYBRACKET() { return getToken(NTAParser.OPEN_CURLYBRACKET, 0); }
		public TerminalNode CLOSE_CURLYBRACKET() { return getToken(NTAParser.CLOSE_CURLYBRACKET, 0); }
		public List<LocalDeclContext> localDecl() {
			return getRuleContexts(LocalDeclContext.class);
		}
		public LocalDeclContext localDecl(int i) {
			return getRuleContext(LocalDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(OPEN_CURLYBRACKET);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(533);
					localDecl();
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (OPEN_PARENTHESIS - 80)) | (1L << (OPEN_CURLYBRACKET - 80)) | (1L << (DOT - 80)) | (1L << (SEMICOLON - 80)) | (1L << (INCREMENT - 80)) | (1L << (DECREMENT - 80)) | (1L << (NOT - 80)) | (1L << (SNOT - 80)) | (1L << (ADD - 80)) | (1L << (MINUS - 80)) | (1L << (FORALL - 80)) | (1L << (EXISTS - 80)) | (1L << (SUM - 80)) | (1L << (DEADLOCK - 80)) | (1L << (TRUE - 80)) | (1L << (FALSE - 80)) | (1L << (FOR - 80)) | (1L << (WHILE - 80)) | (1L << (DO - 80)) | (1L << (IF - 80)) | (1L << (RETURN - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				{
				setState(539);
				statement();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			match(CLOSE_CURLYBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalDeclContext extends ParserRuleContext {
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public LocalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterLocalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitLocalDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitLocalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclContext localDecl() throws RecognitionException {
		LocalDeclContext _localctx = new LocalDeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_localDecl);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				typeDecl();
				}
				break;
			case URGENT:
			case BROADCAST:
			case META:
			case CONST:
			case INT:
			case CLOCK:
			case CHANNEL:
			case BOOL:
			case DOUBLE:
			case SCALAR:
			case STRUCT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				variableDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NTAParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStmntContext returnStmnt() {
			return getRuleContext(ReturnStmntContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statement);
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(553);
				expr(0);
				setState(554);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(557);
				iteration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(558);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(559);
				doWhileLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(560);
				ifStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(561);
				returnStmnt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChanPriorityContext extends ParserRuleContext {
		public TerminalNode CHANNEL() { return getToken(NTAParser.CHANNEL, 0); }
		public TerminalNode PRIORITY() { return getToken(NTAParser.PRIORITY, 0); }
		public TerminalNode SEMICOLON() { return getToken(NTAParser.SEMICOLON, 0); }
		public List<ChanExprContext> chanExpr() {
			return getRuleContexts(ChanExprContext.class);
		}
		public ChanExprContext chanExpr(int i) {
			return getRuleContext(ChanExprContext.class,i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(NTAParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(NTAParser.DEFAULT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NTAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NTAParser.COMMA, i);
		}
		public List<TerminalNode> LESS() { return getTokens(NTAParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(NTAParser.LESS, i);
		}
		public ChanPriorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanPriority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterChanPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitChanPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitChanPriority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanPriorityContext chanPriority() throws RecognitionException {
		ChanPriorityContext _localctx = new ChanPriorityContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chanPriority);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(CHANNEL);
			setState(565);
			match(PRIORITY);
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(566);
				chanExpr(0);
				}
				break;
			case DEFAULT:
				{
				setState(567);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==LESS) {
				{
				{
				setState(570);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==LESS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(571);
					chanExpr(0);
					}
					break;
				case DEFAULT:
					{
					setState(572);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChanExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NTAParser.IDENTIFIER, 0); }
		public ChanExprContext chanExpr() {
			return getRuleContext(ChanExprContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(NTAParser.OPEN_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NTAParser.CLOSE_BRACKET, 0); }
		public ChanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterChanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitChanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitChanExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanExprContext chanExpr() throws RecognitionException {
		return chanExpr(0);
	}

	private ChanExprContext chanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ChanExprContext _localctx = new ChanExprContext(_ctx, _parentState);
		ChanExprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_chanExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(583);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChanExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_chanExpr);
					setState(585);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(586);
					match(OPEN_BRACKET);
					setState(587);
					expr(0);
					setState(588);
					match(CLOSE_BRACKET);
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(NTAParser.FOR, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(NTAParser.OPEN_PARENTHESIS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(NTAParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(NTAParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(NTAParser.CLOSE_PARENTESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(FOR);
			setState(596);
			match(OPEN_PARENTHESIS);
			setState(597);
			expr(0);
			setState(598);
			match(SEMICOLON);
			setState(599);
			expr(0);
			setState(600);
			match(SEMICOLON);
			setState(601);
			expr(0);
			setState(602);
			match(CLOSE_PARENTESIS);
			setState(603);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(NTAParser.FOR, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(NTAParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NTAParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(NTAParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(NTAParser.CLOSE_PARENTESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(FOR);
			setState(606);
			match(OPEN_PARENTHESIS);
			setState(607);
			match(IDENTIFIER);
			setState(608);
			match(COLON);
			setState(609);
			type();
			setState(610);
			match(CLOSE_PARENTESIS);
			setState(611);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(NTAParser.WHILE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(NTAParser.OPEN_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(NTAParser.CLOSE_PARENTESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(WHILE);
			setState(614);
			match(OPEN_PARENTHESIS);
			setState(615);
			expr(0);
			setState(616);
			match(CLOSE_PARENTESIS);
			setState(617);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileLoopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(NTAParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(NTAParser.WHILE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(NTAParser.OPEN_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(NTAParser.CLOSE_PARENTESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(NTAParser.SEMICOLON, 0); }
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(DO);
			setState(620);
			statement();
			setState(621);
			match(WHILE);
			setState(622);
			match(OPEN_PARENTHESIS);
			setState(623);
			expr(0);
			setState(624);
			match(CLOSE_PARENTESIS);
			setState(625);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NTAParser.IF, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(NTAParser.OPEN_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(NTAParser.CLOSE_PARENTESIS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(NTAParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(IF);
			setState(628);
			match(OPEN_PARENTHESIS);
			setState(629);
			expr(0);
			setState(630);
			match(CLOSE_PARENTESIS);
			setState(631);
			statement();
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(632);
				match(ELSE);
				setState(633);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmntContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(NTAParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(NTAParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterReturnStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitReturnStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitReturnStmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmntContext returnStmnt() throws RecognitionException {
		ReturnStmntContext _localctx = new ReturnStmntContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_returnStmnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(RETURN);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (OPEN_PARENTHESIS - 80)) | (1L << (DOT - 80)) | (1L << (INCREMENT - 80)) | (1L << (DECREMENT - 80)) | (1L << (NOT - 80)) | (1L << (SNOT - 80)) | (1L << (ADD - 80)) | (1L << (MINUS - 80)) | (1L << (FORALL - 80)) | (1L << (EXISTS - 80)) | (1L << (SUM - 80)) | (1L << (DEADLOCK - 80)) | (1L << (TRUE - 80)) | (1L << (FALSE - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(637);
				expr(0);
				}
			}

			setState(640);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> TEMPLATE() { return getTokens(NTAParser.TEMPLATE); }
		public TerminalNode TEMPLATE(int i) {
			return getToken(NTAParser.TEMPLATE, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(OPEN);
			setState(643);
			match(TEMPLATE);
			setState(644);
			match(CLOSE);
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(645);
				misc();
				}
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
			templateBody();
			setState(652);
			match(OPENSLASH);
			setState(653);
			match(TEMPLATE);
			setState(654);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBodyContext extends ParserRuleContext {
		public InitRefContext initRef() {
			return getRuleContext(InitRefContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParamTagContext paramTag() {
			return getRuleContext(ParamTagContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public List<LocationContext> location() {
			return getRuleContexts(LocationContext.class);
		}
		public LocationContext location(int i) {
			return getRuleContext(LocationContext.class,i);
		}
		public List<BranchpointContext> branchpoint() {
			return getRuleContexts(BranchpointContext.class);
		}
		public BranchpointContext branchpoint(int i) {
			return getRuleContext(BranchpointContext.class,i);
		}
		public TemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterTemplateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitTemplateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitTemplateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBodyContext templateBody() throws RecognitionException {
		TemplateBodyContext _localctx = new TemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_templateBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(656);
				name();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(657);
					misc();
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARAMETER) {
				{
				setState(665);
				paramTag();
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(666);
					misc();
					}
					}
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_DECLARATION) {
				{
				setState(674);
				declaration();
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(675);
					misc();
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(697); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						{
						setState(683);
						location();
						setState(687);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(684);
							misc();
							}
							}
							setState(689);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					case 2:
						{
						{
						setState(690);
						branchpoint();
						setState(694);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(691);
							misc();
							}
							}
							setState(696);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(699); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(701);
			initRef();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(702);
				misc();
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(708);
				transition();
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(709);
					misc();
					}
					}
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> LOCATION() { return getTokens(NTAParser.LOCATION); }
		public TerminalNode LOCATION(int i) {
			return getToken(NTAParser.LOCATION, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LabelLocContext labelLoc() {
			return getRuleContext(LabelLocContext.class,0);
		}
		public CommitedContext commited() {
			return getRuleContext(CommitedContext.class,0);
		}
		public UrgentContext urgent() {
			return getRuleContext(UrgentContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(OPEN);
			setState(721);
			match(LOCATION);
			setState(722);
			id();
			setState(723);
			coord();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(724);
				color();
				}
			}

			setState(727);
			match(CLOSE);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(728);
				misc();
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(734);
				name();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(735);
					misc();
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_INV) {
				{
				setState(743);
				labelLoc();
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(744);
					misc();
					}
					}
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(752);
				commited();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(753);
					misc();
					}
					}
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(761);
				urgent();
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(762);
					misc();
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(770);
			match(OPENSLASH);
			setState(771);
			match(LOCATION);
			setState(772);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelLocContext extends ParserRuleContext {
		public TerminalNode OPEN_INV() { return getToken(NTAParser.OPEN_INV, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_LABEL() { return getToken(NTAParser.CLOSE_LABEL, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public LabelLocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelLoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterLabelLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitLabelLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitLabelLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelLocContext labelLoc() throws RecognitionException {
		LabelLocContext _localctx = new LabelLocContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_labelLoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(OPEN_INV);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(775);
				misc();
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(781);
			expr(0);
			setState(782);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitRefContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public TerminalNode INIT() { return getToken(NTAParser.INIT, 0); }
		public TerminalNode REF() { return getToken(NTAParser.REF, 0); }
		public TerminalNode EQUALS() { return getToken(NTAParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(NTAParser.STRING, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(NTAParser.SLASH_CLOSE, 0); }
		public InitRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterInitRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitInitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitInitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitRefContext initRef() throws RecognitionException {
		InitRefContext _localctx = new InitRefContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_initRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(OPEN);
			setState(785);
			match(INIT);
			setState(786);
			match(REF);
			setState(787);
			match(EQUALS);
			setState(788);
			match(STRING);
			setState(789);
			match(SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchpointContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> BRANCHPOINT() { return getTokens(NTAParser.BRANCHPOINT); }
		public TerminalNode BRANCHPOINT(int i) {
			return getToken(NTAParser.BRANCHPOINT, i);
		}
		public TerminalNode ID() { return getToken(NTAParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(NTAParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(NTAParser.STRING, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public BranchpointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchpoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterBranchpoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitBranchpoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitBranchpoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchpointContext branchpoint() throws RecognitionException {
		BranchpointContext _localctx = new BranchpointContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_branchpoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(OPEN);
			setState(792);
			match(BRANCHPOINT);
			setState(793);
			match(ID);
			setState(794);
			match(EQUALS);
			setState(795);
			match(STRING);
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(796);
				coord();
				}
			}

			setState(799);
			match(CLOSE);
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(800);
				misc();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			match(OPENSLASH);
			setState(807);
			match(BRANCHPOINT);
			setState(808);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommitedContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public TerminalNode COMMITTED() { return getToken(NTAParser.COMMITTED, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(NTAParser.SLASH_CLOSE, 0); }
		public CommitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterCommited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitCommited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitCommited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitedContext commited() throws RecognitionException {
		CommitedContext _localctx = new CommitedContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_commited);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(OPEN);
			setState(811);
			match(COMMITTED);
			setState(812);
			match(SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrgentContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public TerminalNode URGENTTAG() { return getToken(NTAParser.URGENTTAG, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(NTAParser.SLASH_CLOSE, 0); }
		public UrgentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urgent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterUrgent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitUrgent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitUrgent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrgentContext urgent() throws RecognitionException {
		UrgentContext _localctx = new UrgentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_urgent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(OPEN);
			setState(815);
			match(URGENTTAG);
			setState(816);
			match(SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> NAME() { return getTokens(NTAParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NTAParser.NAME, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(OPEN);
			setState(819);
			match(NAME);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(820);
				coord();
				}
			}

			setState(823);
			match(CLOSE);
			setState(824);
			anything();
			setState(825);
			match(OPENSLASH);
			setState(826);
			match(NAME);
			setState(827);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(NTAParser.COLOR, 0); }
		public TerminalNode EQUALS() { return getToken(NTAParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(NTAParser.STRING, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(COLOR);
			setState(830);
			match(EQUALS);
			setState(831);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoordContext extends ParserRuleContext {
		public List<TerminalNode> EQUALS() { return getTokens(NTAParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(NTAParser.EQUALS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(NTAParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(NTAParser.STRING, i);
		}
		public List<TerminalNode> X() { return getTokens(NTAParser.X); }
		public TerminalNode X(int i) {
			return getToken(NTAParser.X, i);
		}
		public List<TerminalNode> Y() { return getTokens(NTAParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(NTAParser.Y, i);
		}
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitCoord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitCoord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_coord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(834);
			match(EQUALS);
			setState(835);
			match(STRING);
			setState(836);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(837);
			match(EQUALS);
			setState(838);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NTAParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(NTAParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(NTAParser.STRING, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(ID);
			setState(841);
			match(EQUALS);
			setState(842);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> TRANSITION() { return getTokens(NTAParser.TRANSITION); }
		public TerminalNode TRANSITION(int i) {
			return getToken(NTAParser.TRANSITION, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<LabelUpdateContext> labelUpdate() {
			return getRuleContexts(LabelUpdateContext.class);
		}
		public LabelUpdateContext labelUpdate(int i) {
			return getRuleContext(LabelUpdateContext.class,i);
		}
		public List<LabelSelectContext> labelSelect() {
			return getRuleContexts(LabelSelectContext.class);
		}
		public LabelSelectContext labelSelect(int i) {
			return getRuleContext(LabelSelectContext.class,i);
		}
		public List<LabelGuardContext> labelGuard() {
			return getRuleContexts(LabelGuardContext.class);
		}
		public LabelGuardContext labelGuard(int i) {
			return getRuleContext(LabelGuardContext.class,i);
		}
		public List<LabelSyncContext> labelSync() {
			return getRuleContexts(LabelSyncContext.class);
		}
		public LabelSyncContext labelSync(int i) {
			return getRuleContext(LabelSyncContext.class,i);
		}
		public List<NailContext> nail() {
			return getRuleContexts(NailContext.class);
		}
		public NailContext nail(int i) {
			return getRuleContext(NailContext.class,i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(OPEN);
			setState(845);
			match(TRANSITION);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(846);
				color();
				}
			}

			setState(849);
			match(CLOSE);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(850);
				misc();
				}
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(856);
			source();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(857);
				misc();
				}
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(863);
			target();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(864);
				misc();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_GUARD) | (1L << OPEN_SYNC) | (1L << OPEN_LBLTR) | (1L << OPEN_SELECT))) != 0)) {
				{
				setState(898);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_LBLTR:
					{
					setState(870);
					labelUpdate();
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(871);
						misc();
						}
						}
						setState(876);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case OPEN_SELECT:
					{
					setState(877);
					labelSelect();
					setState(881);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(878);
						misc();
						}
						}
						setState(883);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case OPEN_GUARD:
					{
					setState(884);
					labelGuard();
					setState(888);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(885);
						misc();
						}
						}
						setState(890);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case OPEN_SYNC:
					{
					setState(891);
					labelSync();
					setState(895);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(892);
						misc();
						}
						}
						setState(897);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(903);
				nail();
				setState(904);
				misc();
				}
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(911);
			match(OPENSLASH);
			setState(912);
			match(TRANSITION);
			setState(913);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public TerminalNode SOURCE() { return getToken(NTAParser.SOURCE, 0); }
		public TerminalNode REF() { return getToken(NTAParser.REF, 0); }
		public TerminalNode EQUALS() { return getToken(NTAParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(NTAParser.STRING, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(NTAParser.SLASH_CLOSE, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(OPEN);
			setState(916);
			match(SOURCE);
			setState(917);
			match(REF);
			setState(918);
			match(EQUALS);
			setState(919);
			match(STRING);
			setState(920);
			match(SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public TerminalNode TARGET() { return getToken(NTAParser.TARGET, 0); }
		public TerminalNode REF() { return getToken(NTAParser.REF, 0); }
		public TerminalNode EQUALS() { return getToken(NTAParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(NTAParser.STRING, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(NTAParser.SLASH_CLOSE, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(OPEN);
			setState(923);
			match(TARGET);
			setState(924);
			match(REF);
			setState(925);
			match(EQUALS);
			setState(926);
			match(STRING);
			setState(927);
			match(SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelUpdateContext extends ParserRuleContext {
		public TerminalNode OPEN_LBLTR() { return getToken(NTAParser.OPEN_LBLTR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_LABEL() { return getToken(NTAParser.CLOSE_LABEL, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NTAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NTAParser.COMMA, i);
		}
		public LabelUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterLabelUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitLabelUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitLabelUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelUpdateContext labelUpdate() throws RecognitionException {
		LabelUpdateContext _localctx = new LabelUpdateContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_labelUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(OPEN_LBLTR);
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(930);
				misc();
				}
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(936);
			expr(0);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(937);
				match(COMMA);
				setState(938);
				expr(0);
				}
				}
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(944);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelGuardContext extends ParserRuleContext {
		public TerminalNode OPEN_GUARD() { return getToken(NTAParser.OPEN_GUARD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_LABEL() { return getToken(NTAParser.CLOSE_LABEL, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public LabelGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterLabelGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitLabelGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitLabelGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelGuardContext labelGuard() throws RecognitionException {
		LabelGuardContext _localctx = new LabelGuardContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_labelGuard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(OPEN_GUARD);
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(947);
				misc();
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(953);
			expr(0);
			setState(954);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelSyncContext extends ParserRuleContext {
		public TerminalNode OPEN_SYNC() { return getToken(NTAParser.OPEN_SYNC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_LABEL() { return getToken(NTAParser.CLOSE_LABEL, 0); }
		public TerminalNode QUESTION() { return getToken(NTAParser.QUESTION, 0); }
		public TerminalNode SNOT() { return getToken(NTAParser.SNOT, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public LabelSyncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelSync; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterLabelSync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitLabelSync(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitLabelSync(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelSyncContext labelSync() throws RecognitionException {
		LabelSyncContext _localctx = new LabelSyncContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_labelSync);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(OPEN_SYNC);
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(957);
				misc();
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(963);
			expr(0);
			setState(964);
			_la = _input.LA(1);
			if ( !(_la==QUESTION || _la==SNOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(965);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelSelectContext extends ParserRuleContext {
		public TerminalNode OPEN_SELECT() { return getToken(NTAParser.OPEN_SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode CLOSE_LABEL() { return getToken(NTAParser.CLOSE_LABEL, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public LabelSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterLabelSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitLabelSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitLabelSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelSelectContext labelSelect() throws RecognitionException {
		LabelSelectContext _localctx = new LabelSelectContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_labelSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(OPEN_SELECT);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(968);
				misc();
				}
				}
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(974);
			selectList(0);
			setState(975);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NTAParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(NTAParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NTAParser.COMMA, 0); }
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		return selectList(0);
	}

	private SelectListContext selectList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SelectListContext _localctx = new SelectListContext(_ctx, _parentState);
		SelectListContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_selectList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(978);
			match(IDENTIFIER);
			setState(979);
			match(COLON);
			setState(980);
			type();
			}
			_ctx.stop = _input.LT(-1);
			setState(989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_selectList);
					setState(982);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(983);
					match(COMMA);
					setState(984);
					match(IDENTIFIER);
					setState(985);
					match(COLON);
					setState(986);
					type();
					}
					} 
				}
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AnythingContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(NTAParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(NTAParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(NTAParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(NTAParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(NTAParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(NTAParser.COMMENT, i);
		}
		public AnythingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anything; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterAnything(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitAnything(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitAnything(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnythingContext anything() throws RecognitionException {
		AnythingContext _localctx = new AnythingContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(992);
				chardata();
				}
			}

			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << PI))) != 0)) {
				{
				{
				setState(999);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EntityRef:
				case CharRef:
					{
					setState(995);
					reference();
					}
					break;
				case CDATA:
					{
					setState(996);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(997);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(998);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(1001);
					chardata();
					}
				}

				}
				}
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemContext extends ParserRuleContext {
		public TerminalNode OPEN_SYSTEM() { return getToken(NTAParser.OPEN_SYSTEM, 0); }
		public TerminalNode CLOSE_SYSTEM() { return getToken(NTAParser.CLOSE_SYSTEM, 0); }
		public SystemDeclContext systemDecl() {
			return getRuleContext(SystemDeclContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public GanttDeclContext ganttDecl() {
			return getRuleContext(GanttDeclContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public SystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitSystem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitSystem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemContext system() throws RecognitionException {
		SystemContext _localctx = new SystemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_system);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(OPEN_SYSTEM);
			setState(1019);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1010);
					declarations();
					setState(1014);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(1011);
						misc();
						}
						}
						setState(1016);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(1021);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1023); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1022);
					process();
					}
					}
					setState(1025); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1027);
					misc();
					}
					}
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(1035);
			systemDecl();
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1036);
				misc();
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GANTT) {
				{
				setState(1042);
				ganttDecl();
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1043);
					misc();
					}
					}
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1051);
			match(CLOSE_SYSTEM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NTAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NTAParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(NTAParser.ASSIGN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(NTAParser.OPEN_PARENTHESIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(NTAParser.CLOSE_PARENTESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(NTAParser.SEMICOLON, 0); }
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(IDENTIFIER);
			setState(1054);
			match(ASSIGN);
			setState(1055);
			match(IDENTIFIER);
			setState(1056);
			match(OPEN_PARENTHESIS);
			setState(1057);
			arguments();
			setState(1058);
			match(CLOSE_PARENTESIS);
			setState(1059);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemDeclContext extends ParserRuleContext {
		public TerminalNode SYSTEMEXPR() { return getToken(NTAParser.SYSTEMEXPR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(NTAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NTAParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(NTAParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NTAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NTAParser.COMMA, i);
		}
		public List<TerminalNode> OPEN() { return getTokens(NTAParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(NTAParser.OPEN, i);
		}
		public SystemDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterSystemDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitSystemDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitSystemDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemDeclContext systemDecl() throws RecognitionException {
		SystemDeclContext _localctx = new SystemDeclContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_systemDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(SYSTEMEXPR);
			setState(1062);
			match(IDENTIFIER);
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN || _la==COMMA) {
				{
				{
				setState(1063);
				_la = _input.LA(1);
				if ( !(_la==OPEN || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1064);
				match(IDENTIFIER);
				}
				}
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1070);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GanttDeclContext extends ParserRuleContext {
		public TerminalNode GANTT() { return getToken(NTAParser.GANTT, 0); }
		public TerminalNode OPEN_CURLYBRACKET() { return getToken(NTAParser.OPEN_CURLYBRACKET, 0); }
		public TerminalNode CLOSE_CURLYBRACKET() { return getToken(NTAParser.CLOSE_CURLYBRACKET, 0); }
		public GanttDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ganttDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterGanttDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitGanttDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitGanttDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GanttDeclContext ganttDecl() throws RecognitionException {
		GanttDeclContext _localctx = new GanttDeclContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_ganttDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(GANTT);
			setState(1073);
			match(OPEN_CURLYBRACKET);
			setState(1077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1074);
					matchWildcard();
					}
					} 
				}
				setState(1079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(1080);
			match(CLOSE_CURLYBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NailContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public TerminalNode NAIL() { return getToken(NTAParser.NAIL, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(NTAParser.SLASH_CLOSE, 0); }
		public NailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterNail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitNail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitNail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NailContext nail() throws RecognitionException {
		NailContext _localctx = new NailContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_nail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(OPEN);
			setState(1083);
			match(NAIL);
			setState(1084);
			coord();
			setState(1085);
			match(SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueriesContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> QUERIES() { return getTokens(NTAParser.QUERIES); }
		public TerminalNode QUERIES(int i) {
			return getToken(NTAParser.QUERIES, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public QueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueriesContext queries() throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			match(OPEN);
			setState(1088);
			match(QUERIES);
			setState(1089);
			match(CLOSE);
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1090);
				misc();
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(1096);
				query();
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1097);
					misc();
					}
					}
					setState(1102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1108);
			match(OPENSLASH);
			setState(1109);
			match(QUERIES);
			setState(1110);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> QUERY() { return getTokens(NTAParser.QUERY); }
		public TerminalNode QUERY(int i) {
			return getToken(NTAParser.QUERY, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(OPEN);
			setState(1113);
			match(QUERY);
			setState(1114);
			match(CLOSE);
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1115);
				misc();
				}
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1121);
				formula();
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1122);
					misc();
					}
					}
					setState(1127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(1130);
				comment();
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1131);
					misc();
					}
					}
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1139);
			match(OPENSLASH);
			setState(1140);
			match(QUERY);
			setState(1141);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> FORMULA() { return getTokens(NTAParser.FORMULA); }
		public TerminalNode FORMULA(int i) {
			return getToken(NTAParser.FORMULA, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			match(OPEN);
			setState(1144);
			match(FORMULA);
			setState(1145);
			match(CLOSE);
			setState(1146);
			anything();
			setState(1147);
			match(OPENSLASH);
			setState(1148);
			match(FORMULA);
			setState(1149);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(NTAParser.OPEN, 0); }
		public List<TerminalNode> QUERY_COMMENT() { return getTokens(NTAParser.QUERY_COMMENT); }
		public TerminalNode QUERY_COMMENT(int i) {
			return getToken(NTAParser.QUERY_COMMENT, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(NTAParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(NTAParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPENSLASH() { return getToken(NTAParser.OPENSLASH, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NTAParserListener ) ((NTAParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NTAParserVisitor ) return ((NTAParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(OPEN);
			setState(1152);
			match(QUERY_COMMENT);
			setState(1153);
			match(CLOSE);
			setState(1154);
			anything();
			setState(1155);
			match(OPENSLASH);
			setState(1156);
			match(QUERY_COMMENT);
			setState(1157);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 30:
			return chanExpr_sempred((ChanExprContext)_localctx, predIndex);
		case 56:
			return selectList_sempred((SelectListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean chanExpr_sempred(ChanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean selectList_sempred(SelectListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0087\u048a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\5\2\u008a\n\2\3\2\7\2\u008d"+
		"\n\2\f\2\16\2\u0090\13\2\3\2\3\2\7\2\u0094\n\2\f\2\16\2\u0097\13\2\3\3"+
		"\3\3\7\3\u009b\n\3\f\3\16\3\u009e\13\3\3\3\3\3\3\4\3\4\3\4\7\4\u00a5\n"+
		"\4\f\4\16\4\u00a8\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00b3\n"+
		"\4\f\4\16\4\u00b6\13\4\3\4\5\4\u00b9\n\4\3\5\5\5\u00bc\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00c3\n\5\3\5\5\5\u00c6\n\5\7\5\u00c8\n\5\f\5\16\5\u00cb"+
		"\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00db"+
		"\n\n\f\n\16\n\u00de\13\n\3\n\3\n\7\n\u00e2\n\n\f\n\16\n\u00e5\13\n\3\n"+
		"\3\n\7\n\u00e9\n\n\f\n\16\n\u00ec\13\n\6\n\u00ee\n\n\r\n\16\n\u00ef\3"+
		"\n\3\n\7\n\u00f4\n\n\f\n\16\n\u00f7\13\n\3\n\3\n\7\n\u00fb\n\n\f\n\16"+
		"\n\u00fe\13\n\5\n\u0100\n\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u0108\n\13"+
		"\f\13\16\13\u010b\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0113\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u013e\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0164\n\r\f\r\16\r\u0167\13\r"+
		"\3\16\3\16\3\16\7\16\u016c\n\16\f\16\16\16\u016f\13\16\5\16\u0171\n\16"+
		"\3\17\3\17\3\17\3\17\7\17\u0177\n\17\f\17\16\17\u017a\13\17\3\17\3\17"+
		"\3\20\5\20\u017f\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\6\22\u019a\n\22\r\22\16\22\u019b\3\22\3\22\5\22\u01a0\n\22\3\23"+
		"\3\23\3\23\7\23\u01a5\n\23\f\23\16\23\u01a8\13\23\3\23\3\23\3\23\7\23"+
		"\u01ad\n\23\f\23\16\23\u01b0\13\23\7\23\u01b2\n\23\f\23\16\23\u01b5\13"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01c1\n\24"+
		"\3\25\3\25\7\25\u01c5\n\25\f\25\16\25\u01c8\13\25\3\25\3\25\5\25\u01cc"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u01d3\n\26\f\26\16\26\u01d6\13\26"+
		"\3\26\3\26\5\26\u01da\n\26\3\27\3\27\3\27\3\27\7\27\u01e0\n\27\f\27\16"+
		"\27\u01e3\13\27\3\27\3\27\3\27\7\27\u01e8\n\27\f\27\16\27\u01eb\13\27"+
		"\7\27\u01ed\n\27\f\27\16\27\u01f0\13\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\7\30\u01f8\n\30\f\30\16\30\u01fb\13\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\7\32\u0207\n\32\f\32\16\32\u020a\13\32\3\33\3\33"+
		"\5\33\u020e\n\33\3\33\3\33\7\33\u0212\n\33\f\33\16\33\u0215\13\33\3\34"+
		"\3\34\7\34\u0219\n\34\f\34\16\34\u021c\13\34\3\34\7\34\u021f\n\34\f\34"+
		"\16\34\u0222\13\34\3\34\3\34\3\35\3\35\5\35\u0228\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0235\n\36\3\37\3\37\3\37"+
		"\3\37\5\37\u023b\n\37\3\37\3\37\3\37\5\37\u0240\n\37\7\37\u0242\n\37\f"+
		"\37\16\37\u0245\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \7 \u0251\n \f"+
		" \16 \u0254\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\5%\u027d\n%\3&\3&\5&\u0281\n&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0289\n\'\f"+
		"\'\16\'\u028c\13\'\3\'\3\'\3\'\3\'\3\'\3(\3(\7(\u0295\n(\f(\16(\u0298"+
		"\13(\5(\u029a\n(\3(\3(\7(\u029e\n(\f(\16(\u02a1\13(\5(\u02a3\n(\3(\3("+
		"\7(\u02a7\n(\f(\16(\u02aa\13(\5(\u02ac\n(\3(\3(\7(\u02b0\n(\f(\16(\u02b3"+
		"\13(\3(\3(\7(\u02b7\n(\f(\16(\u02ba\13(\6(\u02bc\n(\r(\16(\u02bd\3(\3"+
		"(\7(\u02c2\n(\f(\16(\u02c5\13(\3(\3(\7(\u02c9\n(\f(\16(\u02cc\13(\7(\u02ce"+
		"\n(\f(\16(\u02d1\13(\3)\3)\3)\3)\3)\5)\u02d8\n)\3)\3)\7)\u02dc\n)\f)\16"+
		")\u02df\13)\3)\3)\7)\u02e3\n)\f)\16)\u02e6\13)\5)\u02e8\n)\3)\3)\7)\u02ec"+
		"\n)\f)\16)\u02ef\13)\5)\u02f1\n)\3)\3)\7)\u02f5\n)\f)\16)\u02f8\13)\5"+
		")\u02fa\n)\3)\3)\7)\u02fe\n)\f)\16)\u0301\13)\5)\u0303\n)\3)\3)\3)\3)"+
		"\3*\3*\7*\u030b\n*\f*\16*\u030e\13*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\5,\u0320\n,\3,\3,\7,\u0324\n,\f,\16,\u0327\13,\3,\3,\3,"+
		"\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\5/\u0338\n/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\5\63\u0352\n\63\3\63\3\63\7\63\u0356\n\63\f\63\16\63\u0359"+
		"\13\63\3\63\3\63\7\63\u035d\n\63\f\63\16\63\u0360\13\63\3\63\3\63\7\63"+
		"\u0364\n\63\f\63\16\63\u0367\13\63\3\63\3\63\7\63\u036b\n\63\f\63\16\63"+
		"\u036e\13\63\3\63\3\63\7\63\u0372\n\63\f\63\16\63\u0375\13\63\3\63\3\63"+
		"\7\63\u0379\n\63\f\63\16\63\u037c\13\63\3\63\3\63\7\63\u0380\n\63\f\63"+
		"\16\63\u0383\13\63\7\63\u0385\n\63\f\63\16\63\u0388\13\63\3\63\3\63\3"+
		"\63\7\63\u038d\n\63\f\63\16\63\u0390\13\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\7\66\u03a6\n\66\f\66\16\66\u03a9\13\66\3\66\3\66\3\66\7\66\u03ae\n"+
		"\66\f\66\16\66\u03b1\13\66\3\66\3\66\3\67\3\67\7\67\u03b7\n\67\f\67\16"+
		"\67\u03ba\13\67\3\67\3\67\3\67\38\38\78\u03c1\n8\f8\168\u03c4\138\38\3"+
		"8\38\38\39\39\79\u03cc\n9\f9\169\u03cf\139\39\39\39\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\7:\u03de\n:\f:\16:\u03e1\13:\3;\5;\u03e4\n;\3;\3;\3;\3;\5"+
		";\u03ea\n;\3;\5;\u03ed\n;\7;\u03ef\n;\f;\16;\u03f2\13;\3<\3<\3<\7<\u03f7"+
		"\n<\f<\16<\u03fa\13<\7<\u03fc\n<\f<\16<\u03ff\13<\3<\6<\u0402\n<\r<\16"+
		"<\u0403\3<\7<\u0407\n<\f<\16<\u040a\13<\5<\u040c\n<\3<\3<\7<\u0410\n<"+
		"\f<\16<\u0413\13<\3<\3<\7<\u0417\n<\f<\16<\u041a\13<\5<\u041c\n<\3<\3"+
		"<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\7>\u042c\n>\f>\16>\u042f\13>\3>"+
		"\3>\3?\3?\3?\7?\u0436\n?\f?\16?\u0439\13?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\7A\u0446\nA\fA\16A\u0449\13A\3A\3A\7A\u044d\nA\fA\16A\u0450\13A\7"+
		"A\u0452\nA\fA\16A\u0455\13A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u045f\nB\fB\16"+
		"B\u0462\13B\3B\3B\7B\u0466\nB\fB\16B\u0469\13B\5B\u046b\nB\3B\3B\7B\u046f"+
		"\nB\fB\16B\u0472\13B\5B\u0474\nB\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3\u0437\5\30>rE\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\2\r\3\2\6\7\4\2\b\b\24\24\5\2\3\3\b\b\25\25\3\2ad\4"+
		"\2cnpy\3\2cd\4\2\\\\bb\3\2CF\4\2YYee\3\2\34\35\4\2\21\21YY\2\u04ea\2\u0089"+
		"\3\2\2\2\4\u0098\3\2\2\2\6\u00b8\3\2\2\2\b\u00bb\3\2\2\2\n\u00cc\3\2\2"+
		"\2\f\u00ce\3\2\2\2\16\u00d2\3\2\2\2\20\u00d4\3\2\2\2\22\u00d6\3\2\2\2"+
		"\24\u0105\3\2\2\2\26\u0112\3\2\2\2\30\u013d\3\2\2\2\32\u0170\3\2\2\2\34"+
		"\u0172\3\2\2\2\36\u017e\3\2\2\2 \u0182\3\2\2\2\"\u019f\3\2\2\2$\u01a1"+
		"\3\2\2\2&\u01c0\3\2\2\2(\u01c2\3\2\2\2*\u01d9\3\2\2\2,\u01db\3\2\2\2."+
		"\u01f3\3\2\2\2\60\u01ff\3\2\2\2\62\u0203\3\2\2\2\64\u020b\3\2\2\2\66\u0216"+
		"\3\2\2\28\u0227\3\2\2\2:\u0234\3\2\2\2<\u0236\3\2\2\2>\u0248\3\2\2\2@"+
		"\u0255\3\2\2\2B\u025f\3\2\2\2D\u0267\3\2\2\2F\u026d\3\2\2\2H\u0275\3\2"+
		"\2\2J\u027e\3\2\2\2L\u0284\3\2\2\2N\u0299\3\2\2\2P\u02d2\3\2\2\2R\u0308"+
		"\3\2\2\2T\u0312\3\2\2\2V\u0319\3\2\2\2X\u032c\3\2\2\2Z\u0330\3\2\2\2\\"+
		"\u0334\3\2\2\2^\u033f\3\2\2\2`\u0343\3\2\2\2b\u034a\3\2\2\2d\u034e\3\2"+
		"\2\2f\u0395\3\2\2\2h\u039c\3\2\2\2j\u03a3\3\2\2\2l\u03b4\3\2\2\2n\u03be"+
		"\3\2\2\2p\u03c9\3\2\2\2r\u03d3\3\2\2\2t\u03e3\3\2\2\2v\u03f3\3\2\2\2x"+
		"\u041f\3\2\2\2z\u0427\3\2\2\2|\u0432\3\2\2\2~\u043c\3\2\2\2\u0080\u0441"+
		"\3\2\2\2\u0082\u045a\3\2\2\2\u0084\u0479\3\2\2\2\u0086\u0481\3\2\2\2\u0088"+
		"\u008a\5\4\3\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\3\2"+
		"\2\2\u008b\u008d\5\20\t\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0095\5\22\n\2\u0092\u0094\5\20\t\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\3\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0098\u009c\7\23\2\2\u0099\u009b\5\f\7\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\65\2\2\u00a0\5\3\2\2"+
		"\2\u00a1\u00a2\7\21\2\2\u00a2\u00a6\79\2\2\u00a3\u00a5\5\f\7\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\64\2\2\u00aa\u00ab\5"+
		"\b\5\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\79\2\2\u00ad\u00ae\7\64\2\2\u00ae"+
		"\u00b9\3\2\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b4\79\2\2\u00b1\u00b3\5\f"+
		"\7\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\7\66"+
		"\2\2\u00b8\u00a1\3\2\2\2\u00b8\u00af\3\2\2\2\u00b9\7\3\2\2\2\u00ba\u00bc"+
		"\5\16\b\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c9\3\2\2\2"+
		"\u00bd\u00c3\5\6\4\2\u00be\u00c3\5\n\6\2\u00bf\u00c3\7\4\2\2\u00c0\u00c3"+
		"\7\25\2\2\u00c1\u00c3\7\3\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2"+
		"\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00c6\5\16\b\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\t\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\t\2\2\2\u00cd\13\3\2\2\2\u00ce\u00cf\79\2\2\u00cf\u00d0\7\67\2"+
		"\2\u00d0\u00d1\78\2\2\u00d1\r\3\2\2\2\u00d2\u00d3\t\3\2\2\u00d3\17\3\2"+
		"\2\2\u00d4\u00d5\t\4\2\2\u00d5\21\3\2\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8"+
		"\7\26\2\2\u00d8\u00dc\7\64\2\2\u00d9\u00db\5\20\t\2\u00da\u00d9\3\2\2"+
		"\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e3\5\24\13\2\u00e0\u00e2\5\20\t"+
		"\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00ed\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea\5L\'\2\u00e7"+
		"\u00e9\5\20\t\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00e6\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5\5v<\2\u00f2\u00f4\5\20\t\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00ff\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fc\5\u0080A\2\u00f9"+
		"\u00fb\5\20\t\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u00f8\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\22"+
		"\2\2\u0102\u0103\7\26\2\2\u0103\u0104\7\64\2\2\u0104\23\3\2\2\2\u0105"+
		"\u0109\7\t\2\2\u0106\u0108\5\26\f\2\u0107\u0106\3\2\2\2\u0108\u010b\3"+
		"\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010d\7>\2\2\u010d\25\3\2\2\2\u010e\u0113\5\34\17"+
		"\2\u010f\u0113\5,\27\2\u0110\u0113\5.\30\2\u0111\u0113\5<\37\2\u0112\u010e"+
		"\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\27\3\2\2\2\u0114\u0115\b\r\1\2\u0115\u013e\7\u0087\2\2\u0116\u013e\7"+
		"=\2\2\u0117\u013e\7X\2\2\u0118\u0119\7R\2\2\u0119\u011a\5\30\r\2\u011a"+
		"\u011b\7S\2\2\u011b\u013e\3\2\2\2\u011c\u011d\7]\2\2\u011d\u013e\5\30"+
		"\r\23\u011e\u011f\7^\2\2\u011f\u013e\5\30\r\21\u0120\u0121\t\5\2\2\u0121"+
		"\u013e\5\30\r\17\u0122\u0123\7z\2\2\u0123\u0124\7R\2\2\u0124\u0125\7\u0087"+
		"\2\2\u0125\u0126\7Z\2\2\u0126\u0127\5\36\20\2\u0127\u0128\7S\2\2\u0128"+
		"\u0129\5\30\r\b\u0129\u013e\3\2\2\2\u012a\u012b\7{\2\2\u012b\u012c\7R"+
		"\2\2\u012c\u012d\7\u0087\2\2\u012d\u012e\7Z\2\2\u012e\u012f\5\36\20\2"+
		"\u012f\u0130\7S\2\2\u0130\u0131\5\30\r\7\u0131\u013e\3\2\2\2\u0132\u0133"+
		"\7|\2\2\u0133\u0134\7R\2\2\u0134\u0135\7\u0087\2\2\u0135\u0136\7Z\2\2"+
		"\u0136\u0137\5\36\20\2\u0137\u0138\7S\2\2\u0138\u0139\5\30\r\6\u0139\u013e"+
		"\3\2\2\2\u013a\u013e\7}\2\2\u013b\u013e\7~\2\2\u013c\u013e\7\177\2\2\u013d"+
		"\u0114\3\2\2\2\u013d\u0116\3\2\2\2\u013d\u0117\3\2\2\2\u013d\u0118\3\2"+
		"\2\2\u013d\u011c\3\2\2\2\u013d\u011e\3\2\2\2\u013d\u0120\3\2\2\2\u013d"+
		"\u0122\3\2\2\2\u013d\u012a\3\2\2\2\u013d\u0132\3\2\2\2\u013d\u013a\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0165\3\2\2\2\u013f"+
		"\u0140\f\20\2\2\u0140\u0141\7`\2\2\u0141\u0164\5\30\r\21\u0142\u0143\f"+
		"\16\2\2\u0143\u0144\t\6\2\2\u0144\u0164\5\30\r\17\u0145\u0146\f\r\2\2"+
		"\u0146\u0147\7\\\2\2\u0147\u0148\5\30\r\2\u0148\u0149\7Z\2\2\u0149\u014a"+
		"\5\30\r\16\u014a\u0164\3\2\2\2\u014b\u014c\f\t\2\2\u014c\u014d\t\7\2\2"+
		"\u014d\u0164\5\30\r\n\u014e\u014f\f\27\2\2\u014f\u0150\7T\2\2\u0150\u0151"+
		"\5\30\r\2\u0151\u0152\7U\2\2\u0152\u0164\3\2\2\2\u0153\u0154\f\26\2\2"+
		"\u0154\u0164\7Q\2\2\u0155\u0156\f\24\2\2\u0156\u0164\7]\2\2\u0157\u0158"+
		"\f\22\2\2\u0158\u0164\7^\2\2\u0159\u015a\f\f\2\2\u015a\u0164\t\b\2\2\u015b"+
		"\u015c\f\13\2\2\u015c\u015d\7X\2\2\u015d\u0164\7\u0087\2\2\u015e\u015f"+
		"\f\n\2\2\u015f\u0160\7R\2\2\u0160\u0161\5\32\16\2\u0161\u0162\7S\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u013f\3\2\2\2\u0163\u0142\3\2\2\2\u0163\u0145\3\2"+
		"\2\2\u0163\u014b\3\2\2\2\u0163\u014e\3\2\2\2\u0163\u0153\3\2\2\2\u0163"+
		"\u0155\3\2\2\2\u0163\u0157\3\2\2\2\u0163\u0159\3\2\2\2\u0163\u015b\3\2"+
		"\2\2\u0163\u015e\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\31\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016d\5\30\r"+
		"\2\u0169\u016a\7Y\2\2\u016a\u016c\5\30\r\2\u016b\u0169\3\2\2\2\u016c\u016f"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0168\3\2\2\2\u0170\u0171\3\2\2\2\u0171\33\3\2\2"+
		"\2\u0172\u0173\5\36\20\2\u0173\u0178\5(\25\2\u0174\u0175\7Y\2\2\u0175"+
		"\u0177\5(\25\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017c\7[\2\2\u017c\35\3\2\2\2\u017d\u017f\5 \21\2\u017e\u017d\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\5\"\22\2\u0181\37"+
		"\3\2\2\2\u0182\u0183\t\t\2\2\u0183!\3\2\2\2\u0184\u01a0\7\u0087\2\2\u0185"+
		"\u01a0\7G\2\2\u0186\u01a0\7H\2\2\u0187\u01a0\7I\2\2\u0188\u01a0\7J\2\2"+
		"\u0189\u01a0\7K\2\2\u018a\u018b\7G\2\2\u018b\u018c\7T\2\2\u018c\u018d"+
		"\5\30\r\2\u018d\u018e\7Y\2\2\u018e\u018f\5\30\r\2\u018f\u0190\7U\2\2\u0190"+
		"\u01a0\3\2\2\2\u0191\u0192\7L\2\2\u0192\u0193\7T\2\2\u0193\u0194\5\30"+
		"\r\2\u0194\u0195\7U\2\2\u0195\u01a0\3\2\2\2\u0196\u0197\7M\2\2\u0197\u0199"+
		"\7V\2\2\u0198\u019a\5$\23\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7W"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u0184\3\2\2\2\u019f\u0185\3\2\2\2\u019f"+
		"\u0186\3\2\2\2\u019f\u0187\3\2\2\2\u019f\u0188\3\2\2\2\u019f\u0189\3\2"+
		"\2\2\u019f\u018a\3\2\2\2\u019f\u0191\3\2\2\2\u019f\u0196\3\2\2\2\u01a0"+
		"#\3\2\2\2\u01a1\u01a2\5\36\20\2\u01a2\u01a6\7\u0087\2\2\u01a3\u01a5\5"+
		"&\24\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01b3\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7Y"+
		"\2\2\u01aa\u01ae\7\u0087\2\2\u01ab\u01ad\5&\24\2\u01ac\u01ab\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b2\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01a9\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b6\u01b7\7[\2\2\u01b7%\3\2\2\2\u01b8\u01b9\7T\2\2\u01b9\u01ba"+
		"\5\30\r\2\u01ba\u01bb\7U\2\2\u01bb\u01c1\3\2\2\2\u01bc\u01bd\7T\2\2\u01bd"+
		"\u01be\5\36\20\2\u01be\u01bf\7U\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01b8\3"+
		"\2\2\2\u01c0\u01bc\3\2\2\2\u01c1\'\3\2\2\2\u01c2\u01c6\7\u0087\2\2\u01c3"+
		"\u01c5\5&\24\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cb\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u01ca\7`\2\2\u01ca\u01cc\5*\26\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc)\3\2\2\2\u01cd\u01da\5\30\r\2\u01ce\u01cf\7V\2\2\u01cf\u01d4"+
		"\5*\26\2\u01d0\u01d1\7Y\2\2\u01d1\u01d3\5*\26\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\7W\2\2\u01d8\u01da\3\2\2\2\u01d9"+
		"\u01cd\3\2\2\2\u01d9\u01ce\3\2\2\2\u01da+\3\2\2\2\u01db\u01dc\7N\2\2\u01dc"+
		"\u01dd\5\36\20\2\u01dd\u01e1\7\u0087\2\2\u01de\u01e0\5&\24\2\u01df\u01de"+
		"\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01ee\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7Y\2\2\u01e5\u01e9\7\u0087"+
		"\2\2\u01e6\u01e8\5&\24\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01e4\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7["+
		"\2\2\u01f2-\3\2\2\2\u01f3\u01f4\5\36\20\2\u01f4\u01f5\7\u0087\2\2\u01f5"+
		"\u01f9\7R\2\2\u01f6\u01f8\5\62\32\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3"+
		"\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01fd\7S\2\2\u01fd\u01fe\5\66\34\2\u01fe/\3\2\2\2"+
		"\u01ff\u0200\7\n\2\2\u0200\u0201\5\62\32\2\u0201\u0202\7@\2\2\u0202\61"+
		"\3\2\2\2\u0203\u0208\5\64\33\2\u0204\u0205\7Y\2\2\u0205\u0207\5\64\33"+
		"\2\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209"+
		"\3\2\2\2\u0209\63\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\5\36\20\2\u020c"+
		"\u020e\7o\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0213\7\u0087\2\2\u0210\u0212\5&\24\2\u0211\u0210\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\65\3\2\2"+
		"\2\u0215\u0213\3\2\2\2\u0216\u021a\7V\2\2\u0217\u0219\58\35\2\u0218\u0217"+
		"\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u0220\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021f\5:\36\2\u021e\u021d\3\2"+
		"\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7W\2\2\u0224\67\3\2\2\2"+
		"\u0225\u0228\5,\27\2\u0226\u0228\5\34\17\2\u0227\u0225\3\2\2\2\u0227\u0226"+
		"\3\2\2\2\u02289\3\2\2\2\u0229\u0235\5\66\34\2\u022a\u0235\7[\2\2\u022b"+
		"\u022c\5\30\r\2\u022c\u022d\7[\2\2\u022d\u0235\3\2\2\2\u022e\u0235\5@"+
		"!\2\u022f\u0235\5B\"\2\u0230\u0235\5D#\2\u0231\u0235\5F$\2\u0232\u0235"+
		"\5H%\2\u0233\u0235\5J&\2\u0234\u0229\3\2\2\2\u0234\u022a\3\2\2\2\u0234"+
		"\u022b\3\2\2\2\u0234\u022e\3\2\2\2\u0234\u022f\3\2\2\2\u0234\u0230\3\2"+
		"\2\2\u0234\u0231\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235"+
		";\3\2\2\2\u0236\u0237\7I\2\2\u0237\u023a\7O\2\2\u0238\u023b\5> \2\u0239"+
		"\u023b\7P\2\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b\u0243\3\2"+
		"\2\2\u023c\u023f\t\n\2\2\u023d\u0240\5> \2\u023e\u0240\7P\2\2\u023f\u023d"+
		"\3\2\2\2\u023f\u023e\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023c\3\2\2\2\u0242"+
		"\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2"+
		"\2\2\u0245\u0243\3\2\2\2\u0246\u0247\7[\2\2\u0247=\3\2\2\2\u0248\u0249"+
		"\b \1\2\u0249\u024a\7\u0087\2\2\u024a\u0252\3\2\2\2\u024b\u024c\f\3\2"+
		"\2\u024c\u024d\7T\2\2\u024d\u024e\5\30\r\2\u024e\u024f\7U\2\2\u024f\u0251"+
		"\3\2\2\2\u0250\u024b\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253?\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7\u0080"+
		"\2\2\u0256\u0257\7R\2\2\u0257\u0258\5\30\r\2\u0258\u0259\7[\2\2\u0259"+
		"\u025a\5\30\r\2\u025a\u025b\7[\2\2\u025b\u025c\5\30\r\2\u025c\u025d\7"+
		"S\2\2\u025d\u025e\5:\36\2\u025eA\3\2\2\2\u025f\u0260\7\u0080\2\2\u0260"+
		"\u0261\7R\2\2\u0261\u0262\7\u0087\2\2\u0262\u0263\7Z\2\2\u0263\u0264\5"+
		"\36\20\2\u0264\u0265\7S\2\2\u0265\u0266\5:\36\2\u0266C\3\2\2\2\u0267\u0268"+
		"\7\u0081\2\2\u0268\u0269\7R\2\2\u0269\u026a\5\30\r\2\u026a\u026b\7S\2"+
		"\2\u026b\u026c\5:\36\2\u026cE\3\2\2\2\u026d\u026e\7\u0082\2\2\u026e\u026f"+
		"\5:\36\2\u026f\u0270\7\u0081\2\2\u0270\u0271\7R\2\2\u0271\u0272\5\30\r"+
		"\2\u0272\u0273\7S\2\2\u0273\u0274\7[\2\2\u0274G\3\2\2\2\u0275\u0276\7"+
		"\u0083\2\2\u0276\u0277\7R\2\2\u0277\u0278\5\30\r\2\u0278\u0279\7S\2\2"+
		"\u0279\u027c\5:\36\2\u027a\u027b\7\u0084\2\2\u027b\u027d\5:\36\2\u027c"+
		"\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027dI\3\2\2\2\u027e\u0280\7\u0085"+
		"\2\2\u027f\u0281\5\30\r\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0283\7[\2\2\u0283K\3\2\2\2\u0284\u0285\7\21\2\2"+
		"\u0285\u0286\7\30\2\2\u0286\u028a\7\64\2\2\u0287\u0289\5\20\t\2\u0288"+
		"\u0287\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2"+
		"\2\2\u028b\u028d\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028e\5N(\2\u028e\u028f"+
		"\7\22\2\2\u028f\u0290\7\30\2\2\u0290\u0291\7\64\2\2\u0291M\3\2\2\2\u0292"+
		"\u0296\5\\/\2\u0293\u0295\5\20\t\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2"+
		"\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029a\3\2\2\2\u0298"+
		"\u0296\3\2\2\2\u0299\u0292\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u02a2\3\2"+
		"\2\2\u029b\u029f\5\60\31\2\u029c\u029e\5\20\t\2\u029d\u029c\3\2\2\2\u029e"+
		"\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a3\3\2"+
		"\2\2\u02a1\u029f\3\2\2\2\u02a2\u029b\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02ab\3\2\2\2\u02a4\u02a8\5\24\13\2\u02a5\u02a7\5\20\t\2\u02a6\u02a5"+
		"\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02a4\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02bb\3\2\2\2\u02ad\u02b1\5P)\2\u02ae\u02b0\5\20\t\2\u02af"+
		"\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u02bc\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b8\5V,\2\u02b5\u02b7"+
		"\5\20\t\2\u02b6\u02b5\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2"+
		"\u02b8\u02b9\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02ad"+
		"\3\2\2\2\u02bb\u02b4\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c3\5T+\2\u02c0\u02c2\5\20"+
		"\t\2\u02c1\u02c0\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02cf\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02ca\5d"+
		"\63\2\u02c7\u02c9\5\20\t\2\u02c8\u02c7\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2"+
		"\2\2\u02cd\u02c6\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0O\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3\7\21\2\2"+
		"\u02d3\u02d4\7\31\2\2\u02d4\u02d5\5b\62\2\u02d5\u02d7\5`\61\2\u02d6\u02d8"+
		"\5^\60\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02dd\7\64\2\2\u02da\u02dc\5\20\t\2\u02db\u02da\3\2\2\2\u02dc\u02df\3"+
		"\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e7\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02e0\u02e4\5\\/\2\u02e1\u02e3\5\20\t\2\u02e2\u02e1\3\2"+
		"\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e0\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u02f0\3\2\2\2\u02e9\u02ed\5R*\2\u02ea\u02ec\5\20\t\2\u02eb"+
		"\u02ea\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2"+
		"\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02e9\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f9\3\2\2\2\u02f2\u02f6\5X-\2\u02f3\u02f5\5\20"+
		"\t\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02f2\3\2"+
		"\2\2\u02f9\u02fa\3\2\2\2\u02fa\u0302\3\2\2\2\u02fb\u02ff\5Z.\2\u02fc\u02fe"+
		"\5\20\t\2\u02fd\u02fc\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2"+
		"\u02ff\u0300\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u02fb"+
		"\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\7\22\2\2"+
		"\u0305\u0306\7\31\2\2\u0306\u0307\7\64\2\2\u0307Q\3\2\2\2\u0308\u030c"+
		"\7\17\2\2\u0309\u030b\5\20\t\2\u030a\u0309\3\2\2\2\u030b\u030e\3\2\2\2"+
		"\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e\u030c"+
		"\3\2\2\2\u030f\u0310\5\30\r\2\u0310\u0311\7?\2\2\u0311S\3\2\2\2\u0312"+
		"\u0313\7\21\2\2\u0313\u0314\7%\2\2\u0314\u0315\7\63\2\2\u0315\u0316\7"+
		"\67\2\2\u0316\u0317\78\2\2\u0317\u0318\7\66\2\2\u0318U\3\2\2\2\u0319\u031a"+
		"\7\21\2\2\u031a\u031b\7&\2\2\u031b\u031c\7\36\2\2\u031c\u031d\7\67\2\2"+
		"\u031d\u031f\78\2\2\u031e\u0320\5`\61\2\u031f\u031e\3\2\2\2\u031f\u0320"+
		"\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0325\7\64\2\2\u0322\u0324\5\20\t\2"+
		"\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u0329\7\22\2\2"+
		"\u0329\u032a\7&\2\2\u032a\u032b\7\64\2\2\u032bW\3\2\2\2\u032c\u032d\7"+
		"\21\2\2\u032d\u032e\7\'\2\2\u032e\u032f\7\66\2\2\u032fY\3\2\2\2\u0330"+
		"\u0331\7\21\2\2\u0331\u0332\7(\2\2\u0332\u0333\7\66\2\2\u0333[\3\2\2\2"+
		"\u0334\u0335\7\21\2\2\u0335\u0337\7\32\2\2\u0336\u0338\5`\61\2\u0337\u0336"+
		"\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\7\64\2\2"+
		"\u033a\u033b\5t;\2\u033b\u033c\7\22\2\2\u033c\u033d\7\32\2\2\u033d\u033e"+
		"\7\64\2\2\u033e]\3\2\2\2\u033f\u0340\7\33\2\2\u0340\u0341\7\67\2\2\u0341"+
		"\u0342\78\2\2\u0342_\3\2\2\2\u0343\u0344\t\13\2\2\u0344\u0345\7\67\2\2"+
		"\u0345\u0346\78\2\2\u0346\u0347\t\13\2\2\u0347\u0348\7\67\2\2\u0348\u0349"+
		"\78\2\2\u0349a\3\2\2\2\u034a\u034b\7\36\2\2\u034b\u034c\7\67\2\2\u034c"+
		"\u034d\78\2\2\u034dc\3\2\2\2\u034e\u034f\7\21\2\2\u034f\u0351\7\37\2\2"+
		"\u0350\u0352\5^\60\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0357\7\64\2\2\u0354\u0356\5\20\t\2\u0355\u0354\3\2\2\2"+
		"\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035a"+
		"\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035e\5f\64\2\u035b\u035d\5\20\t\2"+
		"\u035c\u035b\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f"+
		"\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0365\5h\65\2\u0362"+
		"\u0364\5\20\t\2\u0363\u0362\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3"+
		"\2\2\2\u0365\u0366\3\2\2\2\u0366\u0386\3\2\2\2\u0367\u0365\3\2\2\2\u0368"+
		"\u036c\5j\66\2\u0369\u036b\5\20\t\2\u036a\u0369\3\2\2\2\u036b\u036e\3"+
		"\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0385\3\2\2\2\u036e"+
		"\u036c\3\2\2\2\u036f\u0373\5p9\2\u0370\u0372\5\20\t\2\u0371\u0370\3\2"+
		"\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0385\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u037a\5l\67\2\u0377\u0379\5\20"+
		"\t\2\u0378\u0377\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u0385\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u0381\5n"+
		"8\2\u037e\u0380\5\20\t\2\u037f\u037e\3\2\2\2\u0380\u0383\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2"+
		"\2\2\u0384\u0368\3\2\2\2\u0384\u036f\3\2\2\2\u0384\u0376\3\2\2\2\u0384"+
		"\u037d\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2"+
		"\2\2\u0387\u038e\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038a\5~@\2\u038a\u038b"+
		"\5\20\t\2\u038b\u038d\3\2\2\2\u038c\u0389\3\2\2\2\u038d\u0390\3\2\2\2"+
		"\u038e\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\3\2\2\2\u0390\u038e"+
		"\3\2\2\2\u0391\u0392\7\22\2\2\u0392\u0393\7\37\2\2\u0393\u0394\7\64\2"+
		"\2\u0394e\3\2\2\2\u0395\u0396\7\21\2\2\u0396\u0397\7 \2\2\u0397\u0398"+
		"\7\63\2\2\u0398\u0399\7\67\2\2\u0399\u039a\78\2\2\u039a\u039b\7\66\2\2"+
		"\u039bg\3\2\2\2\u039c\u039d\7\21\2\2\u039d\u039e\7!\2\2\u039e\u039f\7"+
		"\63\2\2\u039f\u03a0\7\67\2\2\u03a0\u03a1\78\2\2\u03a1\u03a2\7\66\2\2\u03a2"+
		"i\3\2\2\2\u03a3\u03a7\7\r\2\2\u03a4\u03a6\5\20\t\2\u03a5\u03a4\3\2\2\2"+
		"\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa"+
		"\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03af\5\30\r\2\u03ab\u03ac\7Y\2\2\u03ac"+
		"\u03ae\5\30\r\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3"+
		"\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2"+
		"\u03b3\7?\2\2\u03b3k\3\2\2\2\u03b4\u03b8\7\13\2\2\u03b5\u03b7\5\20\t\2"+
		"\u03b6\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9"+
		"\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc\5\30\r\2"+
		"\u03bc\u03bd\7?\2\2\u03bdm\3\2\2\2\u03be\u03c2\7\f\2\2\u03bf\u03c1\5\20"+
		"\t\2\u03c0\u03bf\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2"+
		"\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5\u03c6\5\30"+
		"\r\2\u03c6\u03c7\t\b\2\2\u03c7\u03c8\7?\2\2\u03c8o\3\2\2\2\u03c9\u03cd"+
		"\7\16\2\2\u03ca\u03cc\5\20\t\2\u03cb\u03ca\3\2\2\2\u03cc\u03cf\3\2\2\2"+
		"\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03cd"+
		"\3\2\2\2\u03d0\u03d1\5r:\2\u03d1\u03d2\7?\2\2\u03d2q\3\2\2\2\u03d3\u03d4"+
		"\b:\1\2\u03d4\u03d5\7\u0087\2\2\u03d5\u03d6\7Z\2\2\u03d6\u03d7\5\36\20"+
		"\2\u03d7\u03df\3\2\2\2\u03d8\u03d9\f\3\2\2\u03d9\u03da\7Y\2\2\u03da\u03db"+
		"\7\u0087\2\2\u03db\u03dc\7Z\2\2\u03dc\u03de\5\36\20\2\u03dd\u03d8\3\2"+
		"\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"s\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e4\5\16\b\2\u03e3\u03e2\3\2\2\2"+
		"\u03e3\u03e4\3\2\2\2\u03e4\u03f0\3\2\2\2\u03e5\u03ea\5\n\6\2\u03e6\u03ea"+
		"\7\4\2\2\u03e7\u03ea\7\25\2\2\u03e8\u03ea\7\3\2\2\u03e9\u03e5\3\2\2\2"+
		"\u03e9\u03e6\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03e8\3\2\2\2\u03ea\u03ec"+
		"\3\2\2\2\u03eb\u03ed\5\16\b\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2"+
		"\u03ed\u03ef\3\2\2\2\u03ee\u03e9\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee"+
		"\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1u\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3"+
		"\u03fd\7\20\2\2\u03f4\u03f8\5\26\f\2\u03f5\u03f7\5\20\t\2\u03f6\u03f5"+
		"\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u03f4\3\2\2\2\u03fc\u03ff\3\2"+
		"\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u040b\3\2\2\2\u03ff"+
		"\u03fd\3\2\2\2\u0400\u0402\5x=\2\u0401\u0400\3\2\2\2\u0402\u0403\3\2\2"+
		"\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0408\3\2\2\2\u0405\u0407"+
		"\5\20\t\2\u0406\u0405\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0406\3\2\2\2"+
		"\u0408\u0409\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040b\u0401"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u0411\5z>\2\u040e"+
		"\u0410\5\20\t\2\u040f\u040e\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f\3"+
		"\2\2\2\u0411\u0412\3\2\2\2\u0412\u041b\3\2\2\2\u0413\u0411\3\2\2\2\u0414"+
		"\u0418\5|?\2\u0415\u0417\5\20\t\2\u0416\u0415\3\2\2\2\u0417\u041a\3\2"+
		"\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041c\3\2\2\2\u041a"+
		"\u0418\3\2\2\2\u041b\u0414\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\3\2"+
		"\2\2\u041d\u041e\7A\2\2\u041ew\3\2\2\2\u041f\u0420\7\u0087\2\2\u0420\u0421"+
		"\7`\2\2\u0421\u0422\7\u0087\2\2\u0422\u0423\7R\2\2\u0423\u0424\5\32\16"+
		"\2\u0424\u0425\7S\2\2\u0425\u0426\7[\2\2\u0426y\3\2\2\2\u0427\u0428\7"+
		"_\2\2\u0428\u042d\7\u0087\2\2\u0429\u042a\t\f\2\2\u042a\u042c\7\u0087"+
		"\2\2\u042b\u0429\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u042d\3\2\2\2\u0430\u0431\7["+
		"\2\2\u0431{\3\2\2\2\u0432\u0433\7\u0086\2\2\u0433\u0437\7V\2\2\u0434\u0436"+
		"\13\2\2\2\u0435\u0434\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0438\3\2\2\2"+
		"\u0437\u0435\3\2\2\2\u0438\u043a\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u043b"+
		"\7W\2\2\u043b}\3\2\2\2\u043c\u043d\7\21\2\2\u043d\u043e\7\"\2\2\u043e"+
		"\u043f\5`\61\2\u043f\u0440\7\66\2\2\u0440\177\3\2\2\2\u0441\u0442\7\21"+
		"\2\2\u0442\u0443\7*\2\2\u0443\u0447\7\64\2\2\u0444\u0446\5\20\t\2\u0445"+
		"\u0444\3\2\2\2\u0446\u0449\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2"+
		"\2\2\u0448\u0453\3\2\2\2\u0449\u0447\3\2\2\2\u044a\u044e\5\u0082B\2\u044b"+
		"\u044d\5\20\t\2\u044c\u044b\3\2\2\2\u044d\u0450\3\2\2\2\u044e\u044c\3"+
		"\2\2\2\u044e\u044f\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0451"+
		"\u044a\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2"+
		"\2\2\u0454\u0456\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u0457\7\22\2\2\u0457"+
		"\u0458\7*\2\2\u0458\u0459\7\64\2\2\u0459\u0081\3\2\2\2\u045a\u045b\7\21"+
		"\2\2\u045b\u045c\7+\2\2\u045c\u0460\7\64\2\2\u045d\u045f\5\20\t\2\u045e"+
		"\u045d\3\2\2\2\u045f\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2"+
		"\2\2\u0461\u046a\3\2\2\2\u0462\u0460\3\2\2\2\u0463\u0467\5\u0084C\2\u0464"+
		"\u0466\5\20\t\2\u0465\u0464\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3"+
		"\2\2\2\u0467\u0468\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u046a"+
		"\u0463\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u0473\3\2\2\2\u046c\u0470\5\u0086"+
		"D\2\u046d\u046f\5\20\t\2\u046e\u046d\3\2\2\2\u046f\u0472\3\2\2\2\u0470"+
		"\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2"+
		"\2\2\u0473\u046c\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0476\7\22\2\2\u0476\u0477\7+\2\2\u0477\u0478\7\64\2\2\u0478\u0083\3"+
		"\2\2\2\u0479\u047a\7\21\2\2\u047a\u047b\7#\2\2\u047b\u047c\7\64\2\2\u047c"+
		"\u047d\5t;\2\u047d\u047e\7\22\2\2\u047e\u047f\7#\2\2\u047f\u0480\7\64"+
		"\2\2\u0480\u0085\3\2\2\2\u0481\u0482\7\21\2\2\u0482\u0483\7,\2\2\u0483"+
		"\u0484\7\64\2\2\u0484\u0485\5t;\2\u0485\u0486\7\22\2\2\u0486\u0487\7,"+
		"\2\2\u0487\u0488\7\64\2\2\u0488\u0087\3\2\2\2{\u0089\u008e\u0095\u009c"+
		"\u00a6\u00b4\u00b8\u00bb\u00c2\u00c5\u00c9\u00dc\u00e3\u00ea\u00ef\u00f5"+
		"\u00fc\u00ff\u0109\u0112\u013d\u0163\u0165\u016d\u0170\u0178\u017e\u019b"+
		"\u019f\u01a6\u01ae\u01b3\u01c0\u01c6\u01cb\u01d4\u01d9\u01e1\u01e9\u01ee"+
		"\u01f9\u0208\u020d\u0213\u021a\u0220\u0227\u0234\u023a\u023f\u0243\u0252"+
		"\u027c\u0280\u028a\u0296\u0299\u029f\u02a2\u02a8\u02ab\u02b1\u02b8\u02bb"+
		"\u02bd\u02c3\u02ca\u02cf\u02d7\u02dd\u02e4\u02e7\u02ed\u02f0\u02f6\u02f9"+
		"\u02ff\u0302\u030c\u031f\u0325\u0337\u0351\u0357\u035e\u0365\u036c\u0373"+
		"\u037a\u0381\u0384\u0386\u038e\u03a7\u03af\u03b8\u03c2\u03cd\u03df\u03e3"+
		"\u03e9\u03ec\u03f0\u03f8\u03fd\u0403\u0408\u040b\u0411\u0418\u041b\u042d"+
		"\u0437\u0447\u044e\u0453\u0460\u0467\u046a\u0470\u0473";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}