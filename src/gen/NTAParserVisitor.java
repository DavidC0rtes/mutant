// Generated from /home/david/eclipse-workspace/mutants/src/NTAParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NTAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NTAParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NTAParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(NTAParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#prolog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProlog(NTAParser.PrologContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(NTAParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(NTAParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(NTAParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(NTAParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#chardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardata(NTAParser.ChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#misc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMisc(NTAParser.MiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#nta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNta(NTAParser.NtaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(NTAParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(NTAParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDeclaration}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(NTAParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunDecl}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDecl(NTAParser.FunDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChannelPriority}
	 * labeled alternative in {@link NTAParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelPriority(NTAParser.ChannelPriorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(NTAParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(NTAParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(NTAParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(NTAParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(NTAParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#typeID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeID(NTAParser.TypeIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(NTAParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(NTAParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#variableID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableID(NTAParser.VariableIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#initialiser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialiser(NTAParser.InitialiserContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#typeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecl(NTAParser.TypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(NTAParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#paramTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamTag(NTAParser.ParamTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(NTAParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(NTAParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(NTAParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#localDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDecl(NTAParser.LocalDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NTAParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#chanPriority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanPriority(NTAParser.ChanPriorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#chanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanExpr(NTAParser.ChanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(NTAParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(NTAParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(NTAParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#doWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(NTAParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(NTAParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#returnStmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmnt(NTAParser.ReturnStmntContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(NTAParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#templateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody(NTAParser.TemplateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(NTAParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#labelLoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelLoc(NTAParser.LabelLocContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#initRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitRef(NTAParser.InitRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#branchpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchpoint(NTAParser.BranchpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#commited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommited(NTAParser.CommitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#urgent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrgent(NTAParser.UrgentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(NTAParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(NTAParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#coord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoord(NTAParser.CoordContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(NTAParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(NTAParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(NTAParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(NTAParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#labelUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelUpdate(NTAParser.LabelUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#labelGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelGuard(NTAParser.LabelGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#labelSync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelSync(NTAParser.LabelSyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#labelSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelSelect(NTAParser.LabelSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(NTAParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#anything}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnything(NTAParser.AnythingContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#system}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem(NTAParser.SystemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(NTAParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#systemDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemDecl(NTAParser.SystemDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#ganttDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGanttDecl(NTAParser.GanttDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#nail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNail(NTAParser.NailContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#queries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueries(NTAParser.QueriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(NTAParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(NTAParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NTAParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(NTAParser.CommentContext ctx);
}