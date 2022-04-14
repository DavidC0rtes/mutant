// Generated from /home/david/eclipse-workspace/mutants/src/NTAParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NTAParser}.
 */
public interface NTAParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NTAParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(NTAParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(NTAParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(NTAParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(NTAParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(NTAParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(NTAParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(NTAParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(NTAParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(NTAParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(NTAParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(NTAParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(NTAParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(NTAParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(NTAParser.ChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(NTAParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(NTAParser.MiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#nta}.
	 * @param ctx the parse tree
	 */
	void enterNta(NTAParser.NtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#nta}.
	 * @param ctx the parse tree
	 */
	void exitNta(NTAParser.NtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(NTAParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(NTAParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(NTAParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(NTAParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDeclaration}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(NTAParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDeclaration}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(NTAParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunDecl}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunDecl(NTAParser.FunDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunDecl}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunDecl(NTAParser.FunDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChannelPriority}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterChannelPriority(NTAParser.ChannelPriorityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChannelPriority}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitChannelPriority(NTAParser.ChannelPriorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NTAParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NTAParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(NTAParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(NTAParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(NTAParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(NTAParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(NTAParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(NTAParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(NTAParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(NTAParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#typeID}.
	 * @param ctx the parse tree
	 */
	void enterTypeID(NTAParser.TypeIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#typeID}.
	 * @param ctx the parse tree
	 */
	void exitTypeID(NTAParser.TypeIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(NTAParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(NTAParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(NTAParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(NTAParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#variableID}.
	 * @param ctx the parse tree
	 */
	void enterVariableID(NTAParser.VariableIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#variableID}.
	 * @param ctx the parse tree
	 */
	void exitVariableID(NTAParser.VariableIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void enterInitialiser(NTAParser.InitialiserContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void exitInitialiser(NTAParser.InitialiserContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(NTAParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(NTAParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(NTAParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(NTAParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#paramTag}.
	 * @param ctx the parse tree
	 */
	void enterParamTag(NTAParser.ParamTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#paramTag}.
	 * @param ctx the parse tree
	 */
	void exitParamTag(NTAParser.ParamTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(NTAParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(NTAParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(NTAParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(NTAParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(NTAParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(NTAParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecl(NTAParser.LocalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecl(NTAParser.LocalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NTAParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NTAParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#chanPriority}.
	 * @param ctx the parse tree
	 */
	void enterChanPriority(NTAParser.ChanPriorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#chanPriority}.
	 * @param ctx the parse tree
	 */
	void exitChanPriority(NTAParser.ChanPriorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#chanExpr}.
	 * @param ctx the parse tree
	 */
	void enterChanExpr(NTAParser.ChanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#chanExpr}.
	 * @param ctx the parse tree
	 */
	void exitChanExpr(NTAParser.ChanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(NTAParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(NTAParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(NTAParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(NTAParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(NTAParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(NTAParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(NTAParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(NTAParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(NTAParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(NTAParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#returnStmnt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmnt(NTAParser.ReturnStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#returnStmnt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmnt(NTAParser.ReturnStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(NTAParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(NTAParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBody(NTAParser.TemplateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBody(NTAParser.TemplateBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(NTAParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(NTAParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#labelLoc}.
	 * @param ctx the parse tree
	 */
	void enterLabelLoc(NTAParser.LabelLocContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#labelLoc}.
	 * @param ctx the parse tree
	 */
	void exitLabelLoc(NTAParser.LabelLocContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#initRef}.
	 * @param ctx the parse tree
	 */
	void enterInitRef(NTAParser.InitRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#initRef}.
	 * @param ctx the parse tree
	 */
	void exitInitRef(NTAParser.InitRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#branchpoint}.
	 * @param ctx the parse tree
	 */
	void enterBranchpoint(NTAParser.BranchpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#branchpoint}.
	 * @param ctx the parse tree
	 */
	void exitBranchpoint(NTAParser.BranchpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#commited}.
	 * @param ctx the parse tree
	 */
	void enterCommited(NTAParser.CommitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#commited}.
	 * @param ctx the parse tree
	 */
	void exitCommited(NTAParser.CommitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#urgent}.
	 * @param ctx the parse tree
	 */
	void enterUrgent(NTAParser.UrgentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#urgent}.
	 * @param ctx the parse tree
	 */
	void exitUrgent(NTAParser.UrgentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(NTAParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(NTAParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(NTAParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(NTAParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#coord}.
	 * @param ctx the parse tree
	 */
	void enterCoord(NTAParser.CoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#coord}.
	 * @param ctx the parse tree
	 */
	void exitCoord(NTAParser.CoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(NTAParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(NTAParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(NTAParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(NTAParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(NTAParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(NTAParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(NTAParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(NTAParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#labelUpdate}.
	 * @param ctx the parse tree
	 */
	void enterLabelUpdate(NTAParser.LabelUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#labelUpdate}.
	 * @param ctx the parse tree
	 */
	void exitLabelUpdate(NTAParser.LabelUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#labelGuard}.
	 * @param ctx the parse tree
	 */
	void enterLabelGuard(NTAParser.LabelGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#labelGuard}.
	 * @param ctx the parse tree
	 */
	void exitLabelGuard(NTAParser.LabelGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#labelSync}.
	 * @param ctx the parse tree
	 */
	void enterLabelSync(NTAParser.LabelSyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#labelSync}.
	 * @param ctx the parse tree
	 */
	void exitLabelSync(NTAParser.LabelSyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#labelSelect}.
	 * @param ctx the parse tree
	 */
	void enterLabelSelect(NTAParser.LabelSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#labelSelect}.
	 * @param ctx the parse tree
	 */
	void exitLabelSelect(NTAParser.LabelSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(NTAParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(NTAParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#anything}.
	 * @param ctx the parse tree
	 */
	void enterAnything(NTAParser.AnythingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#anything}.
	 * @param ctx the parse tree
	 */
	void exitAnything(NTAParser.AnythingContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#system}.
	 * @param ctx the parse tree
	 */
	void enterSystem(NTAParser.SystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#system}.
	 * @param ctx the parse tree
	 */
	void exitSystem(NTAParser.SystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(NTAParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(NTAParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#systemDecl}.
	 * @param ctx the parse tree
	 */
	void enterSystemDecl(NTAParser.SystemDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#systemDecl}.
	 * @param ctx the parse tree
	 */
	void exitSystemDecl(NTAParser.SystemDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#ganttDecl}.
	 * @param ctx the parse tree
	 */
	void enterGanttDecl(NTAParser.GanttDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#ganttDecl}.
	 * @param ctx the parse tree
	 */
	void exitGanttDecl(NTAParser.GanttDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#nail}.
	 * @param ctx the parse tree
	 */
	void enterNail(NTAParser.NailContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#nail}.
	 * @param ctx the parse tree
	 */
	void exitNail(NTAParser.NailContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#queries}.
	 * @param ctx the parse tree
	 */
	void enterQueries(NTAParser.QueriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#queries}.
	 * @param ctx the parse tree
	 */
	void exitQueries(NTAParser.QueriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(NTAParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(NTAParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(NTAParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(NTAParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NTAParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(NTAParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NTAParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(NTAParser.CommentContext ctx);
}