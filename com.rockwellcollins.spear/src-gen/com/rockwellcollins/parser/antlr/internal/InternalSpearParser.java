package com.rockwellcollins.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.rockwellcollins.services.SpearGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSpearParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Specification'", "'Imports:'", "'Units:'", "'Types:'", "'Constants:'", "'Patterns:'", "'Inputs:'", "'Outputs:'", "'State:'", "'Macros:'", "'Assumptions:'", "'DerivedRequirements:'", "'Requirements:'", "'import'", "'Definitions'", "'pattern'", "'('", "','", "')'", "'returns'", "'var'", "'let'", "'tel'", "'|'", "'='", "'--%PROPERTY'", "'assert'", "'*'", "'/'", "'record'", "'{'", "'}'", "'['", "']'", "'enum'", "':'", "'int'", "'bool'", "'real'", "'is a'", "'is an'", "'text'", "'while'", "'then'", "'=>'", "'implies'", "'or'", "'xor'", "'and'", "'after'", "'until'", "'T'", "'triggers'", "'S'", "'since'", "'O'", "'once'", "'H'", "'historically'", "'never'", "'before'", "'initially'", "'<'", "'less'", "'than'", "'<='", "'equal'", "'to'", "'>'", "'greater'", "'>='", "'=='", "'<>'", "'not'", "'+'", "'-'", "'mod'", "'previous'", "'with'", "'initial'", "'value'", "'.'", "':='", "'if'", "'else'", "'new'", "'spec'", "'#'", "'TRUE'", "'true'", "'FALSE'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSpearParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpearParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpearParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpear.g"; }



     	private SpearGrammarAccess grammarAccess;
     	
        public InternalSpearParser(TokenStream input, SpearGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "File";	
       	}
       	
       	@Override
       	protected SpearGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFile"
    // InternalSpear.g:67:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalSpear.g:68:2: (iv_ruleFile= ruleFile EOF )
            // InternalSpear.g:69:2: iv_ruleFile= ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalSpear.g:76:1: ruleFile returns [EObject current=null] : (this_Specification_0= ruleSpecification | this_Definitions_1= ruleDefinitions ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject this_Specification_0 = null;

        EObject this_Definitions_1 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:79:28: ( (this_Specification_0= ruleSpecification | this_Definitions_1= ruleDefinitions ) )
            // InternalSpear.g:80:1: (this_Specification_0= ruleSpecification | this_Definitions_1= ruleDefinitions )
            {
            // InternalSpear.g:80:1: (this_Specification_0= ruleSpecification | this_Definitions_1= ruleDefinitions )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpear.g:81:5: this_Specification_0= ruleSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFileAccess().getSpecificationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Specification_0=ruleSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Specification_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpear.g:91:5: this_Definitions_1= ruleDefinitions
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFileAccess().getDefinitionsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Definitions_1=ruleDefinitions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Definitions_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleSpecification"
    // InternalSpear.g:107:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalSpear.g:108:2: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalSpear.g:109:2: iv_ruleSpecification= ruleSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSpear.g:116:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'Specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_units_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )? otherlv_12= 'Inputs:' ( (lv_inputs_13_0= ruleVariable ) )* otherlv_14= 'Outputs:' ( (lv_outputs_15_0= ruleVariable ) )* (otherlv_16= 'State:' ( (lv_state_17_0= ruleVariable ) )* )? (otherlv_18= 'Macros:' ( (lv_macros_19_0= ruleMacro ) )* )? (otherlv_20= 'Assumptions:' ( (lv_assumptions_21_0= ruleConstraint ) )* )? otherlv_22= 'DerivedRequirements:' ( (lv_requirements_23_0= ruleConstraint ) )* (otherlv_24= 'Requirements:' ( (lv_behaviors_25_0= ruleConstraint ) )* )? ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_imports_3_0 = null;

        EObject lv_units_5_0 = null;

        EObject lv_typedefs_7_0 = null;

        EObject lv_constants_9_0 = null;

        EObject lv_patterns_11_0 = null;

        EObject lv_inputs_13_0 = null;

        EObject lv_outputs_15_0 = null;

        EObject lv_state_17_0 = null;

        EObject lv_macros_19_0 = null;

        EObject lv_assumptions_21_0 = null;

        EObject lv_requirements_23_0 = null;

        EObject lv_behaviors_25_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:119:28: ( (otherlv_0= 'Specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_units_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )? otherlv_12= 'Inputs:' ( (lv_inputs_13_0= ruleVariable ) )* otherlv_14= 'Outputs:' ( (lv_outputs_15_0= ruleVariable ) )* (otherlv_16= 'State:' ( (lv_state_17_0= ruleVariable ) )* )? (otherlv_18= 'Macros:' ( (lv_macros_19_0= ruleMacro ) )* )? (otherlv_20= 'Assumptions:' ( (lv_assumptions_21_0= ruleConstraint ) )* )? otherlv_22= 'DerivedRequirements:' ( (lv_requirements_23_0= ruleConstraint ) )* (otherlv_24= 'Requirements:' ( (lv_behaviors_25_0= ruleConstraint ) )* )? ) )
            // InternalSpear.g:120:1: (otherlv_0= 'Specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_units_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )? otherlv_12= 'Inputs:' ( (lv_inputs_13_0= ruleVariable ) )* otherlv_14= 'Outputs:' ( (lv_outputs_15_0= ruleVariable ) )* (otherlv_16= 'State:' ( (lv_state_17_0= ruleVariable ) )* )? (otherlv_18= 'Macros:' ( (lv_macros_19_0= ruleMacro ) )* )? (otherlv_20= 'Assumptions:' ( (lv_assumptions_21_0= ruleConstraint ) )* )? otherlv_22= 'DerivedRequirements:' ( (lv_requirements_23_0= ruleConstraint ) )* (otherlv_24= 'Requirements:' ( (lv_behaviors_25_0= ruleConstraint ) )* )? )
            {
            // InternalSpear.g:120:1: (otherlv_0= 'Specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_units_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )? otherlv_12= 'Inputs:' ( (lv_inputs_13_0= ruleVariable ) )* otherlv_14= 'Outputs:' ( (lv_outputs_15_0= ruleVariable ) )* (otherlv_16= 'State:' ( (lv_state_17_0= ruleVariable ) )* )? (otherlv_18= 'Macros:' ( (lv_macros_19_0= ruleMacro ) )* )? (otherlv_20= 'Assumptions:' ( (lv_assumptions_21_0= ruleConstraint ) )* )? otherlv_22= 'DerivedRequirements:' ( (lv_requirements_23_0= ruleConstraint ) )* (otherlv_24= 'Requirements:' ( (lv_behaviors_25_0= ruleConstraint ) )* )? )
            // InternalSpear.g:120:3: otherlv_0= 'Specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_units_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )? otherlv_12= 'Inputs:' ( (lv_inputs_13_0= ruleVariable ) )* otherlv_14= 'Outputs:' ( (lv_outputs_15_0= ruleVariable ) )* (otherlv_16= 'State:' ( (lv_state_17_0= ruleVariable ) )* )? (otherlv_18= 'Macros:' ( (lv_macros_19_0= ruleMacro ) )* )? (otherlv_20= 'Assumptions:' ( (lv_assumptions_21_0= ruleConstraint ) )* )? otherlv_22= 'DerivedRequirements:' ( (lv_requirements_23_0= ruleConstraint ) )* (otherlv_24= 'Requirements:' ( (lv_behaviors_25_0= ruleConstraint ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
                  
            }
            // InternalSpear.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpear.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSpear.g:125:1: (lv_name_1_0= RULE_ID )
            // InternalSpear.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSpecificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSpear.g:142:2: (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpear.g:142:4: otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSpecificationAccess().getImportsKeyword_2_0());
                          
                    }
                    // InternalSpear.g:146:1: ( (lv_imports_3_0= ruleImport ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==24) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSpear.g:147:1: (lv_imports_3_0= ruleImport )
                    	    {
                    	    // InternalSpear.g:147:1: (lv_imports_3_0= ruleImport )
                    	    // InternalSpear.g:148:3: lv_imports_3_0= ruleImport
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getImportsImportParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_5);
                    	    lv_imports_3_0=ruleImport();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"imports",
                    	              		lv_imports_3_0, 
                    	              		"com.rockwellcollins.Spear.Import");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:164:5: (otherlv_4= 'Units:' ( (lv_units_5_0= ruleUnitDef ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpear.g:164:7: otherlv_4= 'Units:' ( (lv_units_5_0= ruleUnitDef ) )*
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSpecificationAccess().getUnitsKeyword_3_0());
                          
                    }
                    // InternalSpear.g:168:1: ( (lv_units_5_0= ruleUnitDef ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSpear.g:169:1: (lv_units_5_0= ruleUnitDef )
                    	    {
                    	    // InternalSpear.g:169:1: (lv_units_5_0= ruleUnitDef )
                    	    // InternalSpear.g:170:3: lv_units_5_0= ruleUnitDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getUnitsUnitDefParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_units_5_0=ruleUnitDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"units",
                    	              		lv_units_5_0, 
                    	              		"com.rockwellcollins.Spear.UnitDef");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:186:5: (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpear.g:186:7: otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )*
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSpecificationAccess().getTypesKeyword_4_0());
                          
                    }
                    // InternalSpear.g:190:1: ( (lv_typedefs_7_0= ruleTypeDef ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSpear.g:191:1: (lv_typedefs_7_0= ruleTypeDef )
                    	    {
                    	    // InternalSpear.g:191:1: (lv_typedefs_7_0= ruleTypeDef )
                    	    // InternalSpear.g:192:3: lv_typedefs_7_0= ruleTypeDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getTypedefsTypeDefParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_typedefs_7_0=ruleTypeDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typedefs",
                    	              		lv_typedefs_7_0, 
                    	              		"com.rockwellcollins.Spear.TypeDef");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:208:5: (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpear.g:208:7: otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )*
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSpecificationAccess().getConstantsKeyword_5_0());
                          
                    }
                    // InternalSpear.g:212:1: ( (lv_constants_9_0= ruleConstant ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSpear.g:213:1: (lv_constants_9_0= ruleConstant )
                    	    {
                    	    // InternalSpear.g:213:1: (lv_constants_9_0= ruleConstant )
                    	    // InternalSpear.g:214:3: lv_constants_9_0= ruleConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getConstantsConstantParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_constants_9_0=ruleConstant();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constants",
                    	              		lv_constants_9_0, 
                    	              		"com.rockwellcollins.Spear.Constant");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:230:5: (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpear.g:230:7: otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )*
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSpecificationAccess().getPatternsKeyword_6_0());
                          
                    }
                    // InternalSpear.g:234:1: ( (lv_patterns_11_0= rulePattern ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==26) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSpear.g:235:1: (lv_patterns_11_0= rulePattern )
                    	    {
                    	    // InternalSpear.g:235:1: (lv_patterns_11_0= rulePattern )
                    	    // InternalSpear.g:236:3: lv_patterns_11_0= rulePattern
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getPatternsPatternParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_patterns_11_0=rulePattern();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"patterns",
                    	              		lv_patterns_11_0, 
                    	              		"com.rockwellcollins.Spear.Pattern");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSpecificationAccess().getInputsKeyword_7());
                  
            }
            // InternalSpear.g:256:1: ( (lv_inputs_13_0= ruleVariable ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSpear.g:257:1: (lv_inputs_13_0= ruleVariable )
            	    {
            	    // InternalSpear.g:257:1: (lv_inputs_13_0= ruleVariable )
            	    // InternalSpear.g:258:3: lv_inputs_13_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getInputsVariableParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_inputs_13_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inputs",
            	              		lv_inputs_13_0, 
            	              		"com.rockwellcollins.Spear.Variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getSpecificationAccess().getOutputsKeyword_9());
                  
            }
            // InternalSpear.g:278:1: ( (lv_outputs_15_0= ruleVariable ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpear.g:279:1: (lv_outputs_15_0= ruleVariable )
            	    {
            	    // InternalSpear.g:279:1: (lv_outputs_15_0= ruleVariable )
            	    // InternalSpear.g:280:3: lv_outputs_15_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getOutputsVariableParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_outputs_15_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outputs",
            	              		lv_outputs_15_0, 
            	              		"com.rockwellcollins.Spear.Variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalSpear.g:296:3: (otherlv_16= 'State:' ( (lv_state_17_0= ruleVariable ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpear.g:296:5: otherlv_16= 'State:' ( (lv_state_17_0= ruleVariable ) )*
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getSpecificationAccess().getStateKeyword_11_0());
                          
                    }
                    // InternalSpear.g:300:1: ( (lv_state_17_0= ruleVariable ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSpear.g:301:1: (lv_state_17_0= ruleVariable )
                    	    {
                    	    // InternalSpear.g:301:1: (lv_state_17_0= ruleVariable )
                    	    // InternalSpear.g:302:3: lv_state_17_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getStateVariableParserRuleCall_11_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_state_17_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"state",
                    	              		lv_state_17_0, 
                    	              		"com.rockwellcollins.Spear.Variable");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:318:5: (otherlv_18= 'Macros:' ( (lv_macros_19_0= ruleMacro ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpear.g:318:7: otherlv_18= 'Macros:' ( (lv_macros_19_0= ruleMacro ) )*
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getSpecificationAccess().getMacrosKeyword_12_0());
                          
                    }
                    // InternalSpear.g:322:1: ( (lv_macros_19_0= ruleMacro ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSpear.g:323:1: (lv_macros_19_0= ruleMacro )
                    	    {
                    	    // InternalSpear.g:323:1: (lv_macros_19_0= ruleMacro )
                    	    // InternalSpear.g:324:3: lv_macros_19_0= ruleMacro
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getMacrosMacroParserRuleCall_12_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_macros_19_0=ruleMacro();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"macros",
                    	              		lv_macros_19_0, 
                    	              		"com.rockwellcollins.Spear.Macro");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:340:5: (otherlv_20= 'Assumptions:' ( (lv_assumptions_21_0= ruleConstraint ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpear.g:340:7: otherlv_20= 'Assumptions:' ( (lv_assumptions_21_0= ruleConstraint ) )*
                    {
                    otherlv_20=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getSpecificationAccess().getAssumptionsKeyword_13_0());
                          
                    }
                    // InternalSpear.g:344:1: ( (lv_assumptions_21_0= ruleConstraint ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSpear.g:345:1: (lv_assumptions_21_0= ruleConstraint )
                    	    {
                    	    // InternalSpear.g:345:1: (lv_assumptions_21_0= ruleConstraint )
                    	    // InternalSpear.g:346:3: lv_assumptions_21_0= ruleConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getAssumptionsConstraintParserRuleCall_13_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_assumptions_21_0=ruleConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"assumptions",
                    	              		lv_assumptions_21_0, 
                    	              		"com.rockwellcollins.Spear.Constraint");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getSpecificationAccess().getDerivedRequirementsKeyword_14());
                  
            }
            // InternalSpear.g:366:1: ( (lv_requirements_23_0= ruleConstraint ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSpear.g:367:1: (lv_requirements_23_0= ruleConstraint )
            	    {
            	    // InternalSpear.g:367:1: (lv_requirements_23_0= ruleConstraint )
            	    // InternalSpear.g:368:3: lv_requirements_23_0= ruleConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getRequirementsConstraintParserRuleCall_15_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_requirements_23_0=ruleConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"requirements",
            	              		lv_requirements_23_0, 
            	              		"com.rockwellcollins.Spear.Constraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalSpear.g:384:3: (otherlv_24= 'Requirements:' ( (lv_behaviors_25_0= ruleConstraint ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSpear.g:384:5: otherlv_24= 'Requirements:' ( (lv_behaviors_25_0= ruleConstraint ) )*
                    {
                    otherlv_24=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getSpecificationAccess().getRequirementsKeyword_16_0());
                          
                    }
                    // InternalSpear.g:388:1: ( (lv_behaviors_25_0= ruleConstraint ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSpear.g:389:1: (lv_behaviors_25_0= ruleConstraint )
                    	    {
                    	    // InternalSpear.g:389:1: (lv_behaviors_25_0= ruleConstraint )
                    	    // InternalSpear.g:390:3: lv_behaviors_25_0= ruleConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getBehaviorsConstraintParserRuleCall_16_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_behaviors_25_0=ruleConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"behaviors",
                    	              		lv_behaviors_25_0, 
                    	              		"com.rockwellcollins.Spear.Constraint");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleImport"
    // InternalSpear.g:414:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSpear.g:415:2: (iv_ruleImport= ruleImport EOF )
            // InternalSpear.g:416:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSpear.g:423:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:426:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalSpear.g:427:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalSpear.g:427:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalSpear.g:427:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // InternalSpear.g:431:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalSpear.g:432:1: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalSpear.g:432:1: (lv_importURI_1_0= RULE_STRING )
            // InternalSpear.g:433:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDefinitions"
    // InternalSpear.g:457:1: entryRuleDefinitions returns [EObject current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final EObject entryRuleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitions = null;


        try {
            // InternalSpear.g:458:2: (iv_ruleDefinitions= ruleDefinitions EOF )
            // InternalSpear.g:459:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinitions=ruleDefinitions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitions"


    // $ANTLR start "ruleDefinitions"
    // InternalSpear.g:466:1: ruleDefinitions returns [EObject current=null] : (otherlv_0= 'Definitions' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_unitdefs_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )? ) ;
    public final EObject ruleDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_imports_3_0 = null;

        EObject lv_unitdefs_5_0 = null;

        EObject lv_typedefs_7_0 = null;

        EObject lv_constants_9_0 = null;

        EObject lv_patterns_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:469:28: ( (otherlv_0= 'Definitions' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_unitdefs_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )? ) )
            // InternalSpear.g:470:1: (otherlv_0= 'Definitions' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_unitdefs_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )? )
            {
            // InternalSpear.g:470:1: (otherlv_0= 'Definitions' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_unitdefs_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )? )
            // InternalSpear.g:470:3: otherlv_0= 'Definitions' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )? (otherlv_4= 'Units:' ( (lv_unitdefs_5_0= ruleUnitDef ) )* )? (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )? (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )? (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefinitionsAccess().getDefinitionsKeyword_0());
                  
            }
            // InternalSpear.g:474:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpear.g:475:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSpear.g:475:1: (lv_name_1_0= RULE_ID )
            // InternalSpear.g:476:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDefinitionsAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDefinitionsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSpear.g:492:2: (otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSpear.g:492:4: otherlv_2= 'Imports:' ( (lv_imports_3_0= ruleImport ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDefinitionsAccess().getImportsKeyword_2_0());
                          
                    }
                    // InternalSpear.g:496:1: ( (lv_imports_3_0= ruleImport ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==24) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSpear.g:497:1: (lv_imports_3_0= ruleImport )
                    	    {
                    	    // InternalSpear.g:497:1: (lv_imports_3_0= ruleImport )
                    	    // InternalSpear.g:498:3: lv_imports_3_0= ruleImport
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionsAccess().getImportsImportParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_imports_3_0=ruleImport();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionsRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"imports",
                    	              		lv_imports_3_0, 
                    	              		"com.rockwellcollins.Spear.Import");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:514:5: (otherlv_4= 'Units:' ( (lv_unitdefs_5_0= ruleUnitDef ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSpear.g:514:7: otherlv_4= 'Units:' ( (lv_unitdefs_5_0= ruleUnitDef ) )*
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDefinitionsAccess().getUnitsKeyword_3_0());
                          
                    }
                    // InternalSpear.g:518:1: ( (lv_unitdefs_5_0= ruleUnitDef ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSpear.g:519:1: (lv_unitdefs_5_0= ruleUnitDef )
                    	    {
                    	    // InternalSpear.g:519:1: (lv_unitdefs_5_0= ruleUnitDef )
                    	    // InternalSpear.g:520:3: lv_unitdefs_5_0= ruleUnitDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionsAccess().getUnitdefsUnitDefParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_unitdefs_5_0=ruleUnitDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionsRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"unitdefs",
                    	              		lv_unitdefs_5_0, 
                    	              		"com.rockwellcollins.Spear.UnitDef");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:536:5: (otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSpear.g:536:7: otherlv_6= 'Types:' ( (lv_typedefs_7_0= ruleTypeDef ) )*
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDefinitionsAccess().getTypesKeyword_4_0());
                          
                    }
                    // InternalSpear.g:540:1: ( (lv_typedefs_7_0= ruleTypeDef ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSpear.g:541:1: (lv_typedefs_7_0= ruleTypeDef )
                    	    {
                    	    // InternalSpear.g:541:1: (lv_typedefs_7_0= ruleTypeDef )
                    	    // InternalSpear.g:542:3: lv_typedefs_7_0= ruleTypeDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionsAccess().getTypedefsTypeDefParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_typedefs_7_0=ruleTypeDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionsRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typedefs",
                    	              		lv_typedefs_7_0, 
                    	              		"com.rockwellcollins.Spear.TypeDef");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:558:5: (otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSpear.g:558:7: otherlv_8= 'Constants:' ( (lv_constants_9_0= ruleConstant ) )*
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDefinitionsAccess().getConstantsKeyword_5_0());
                          
                    }
                    // InternalSpear.g:562:1: ( (lv_constants_9_0= ruleConstant ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalSpear.g:563:1: (lv_constants_9_0= ruleConstant )
                    	    {
                    	    // InternalSpear.g:563:1: (lv_constants_9_0= ruleConstant )
                    	    // InternalSpear.g:564:3: lv_constants_9_0= ruleConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionsAccess().getConstantsConstantParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    lv_constants_9_0=ruleConstant();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionsRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constants",
                    	              		lv_constants_9_0, 
                    	              		"com.rockwellcollins.Spear.Constant");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpear.g:580:5: (otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSpear.g:580:7: otherlv_10= 'Patterns:' ( (lv_patterns_11_0= rulePattern ) )*
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDefinitionsAccess().getPatternsKeyword_6_0());
                          
                    }
                    // InternalSpear.g:584:1: ( (lv_patterns_11_0= rulePattern ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==26) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSpear.g:585:1: (lv_patterns_11_0= rulePattern )
                    	    {
                    	    // InternalSpear.g:585:1: (lv_patterns_11_0= rulePattern )
                    	    // InternalSpear.g:586:3: lv_patterns_11_0= rulePattern
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionsAccess().getPatternsPatternParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_patterns_11_0=rulePattern();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionsRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"patterns",
                    	              		lv_patterns_11_0, 
                    	              		"com.rockwellcollins.Spear.Pattern");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitions"


    // $ANTLR start "entryRulePattern"
    // InternalSpear.g:610:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalSpear.g:611:2: (iv_rulePattern= rulePattern EOF )
            // InternalSpear.g:612:2: iv_rulePattern= rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePattern; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalSpear.g:619:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_outputs_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_outputs_11_0= ruleVariable ) ) )* otherlv_12= ')' (otherlv_13= 'var' ( (lv_locals_14_0= ruleVariable ) )* )? otherlv_15= 'let' ( ( (lv_equations_16_0= ruleLustreEquation ) ) | ( (lv_properties_17_0= ruleLustreProperty ) ) | ( (lv_assertions_18_0= ruleLustreAssertion ) ) )* otherlv_19= 'tel' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_inputs_5_0 = null;

        EObject lv_outputs_9_0 = null;

        EObject lv_outputs_11_0 = null;

        EObject lv_locals_14_0 = null;

        EObject lv_equations_16_0 = null;

        EObject lv_properties_17_0 = null;

        EObject lv_assertions_18_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:622:28: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_outputs_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_outputs_11_0= ruleVariable ) ) )* otherlv_12= ')' (otherlv_13= 'var' ( (lv_locals_14_0= ruleVariable ) )* )? otherlv_15= 'let' ( ( (lv_equations_16_0= ruleLustreEquation ) ) | ( (lv_properties_17_0= ruleLustreProperty ) ) | ( (lv_assertions_18_0= ruleLustreAssertion ) ) )* otherlv_19= 'tel' ) )
            // InternalSpear.g:623:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_outputs_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_outputs_11_0= ruleVariable ) ) )* otherlv_12= ')' (otherlv_13= 'var' ( (lv_locals_14_0= ruleVariable ) )* )? otherlv_15= 'let' ( ( (lv_equations_16_0= ruleLustreEquation ) ) | ( (lv_properties_17_0= ruleLustreProperty ) ) | ( (lv_assertions_18_0= ruleLustreAssertion ) ) )* otherlv_19= 'tel' )
            {
            // InternalSpear.g:623:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_outputs_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_outputs_11_0= ruleVariable ) ) )* otherlv_12= ')' (otherlv_13= 'var' ( (lv_locals_14_0= ruleVariable ) )* )? otherlv_15= 'let' ( ( (lv_equations_16_0= ruleLustreEquation ) ) | ( (lv_properties_17_0= ruleLustreProperty ) ) | ( (lv_assertions_18_0= ruleLustreAssertion ) ) )* otherlv_19= 'tel' )
            // InternalSpear.g:623:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_outputs_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_outputs_11_0= ruleVariable ) ) )* otherlv_12= ')' (otherlv_13= 'var' ( (lv_locals_14_0= ruleVariable ) )* )? otherlv_15= 'let' ( ( (lv_equations_16_0= ruleLustreEquation ) ) | ( (lv_properties_17_0= ruleLustreProperty ) ) | ( (lv_assertions_18_0= ruleLustreAssertion ) ) )* otherlv_19= 'tel'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
                  
            }
            // InternalSpear.g:627:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpear.g:628:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSpear.g:628:1: (lv_name_1_0= RULE_ID )
            // InternalSpear.g:629:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalSpear.g:649:1: ( (lv_inputs_3_0= ruleVariable ) )
            // InternalSpear.g:650:1: (lv_inputs_3_0= ruleVariable )
            {
            // InternalSpear.g:650:1: (lv_inputs_3_0= ruleVariable )
            // InternalSpear.g:651:3: lv_inputs_3_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternAccess().getInputsVariableParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_25);
            lv_inputs_3_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPatternRule());
              	        }
                     		add(
                     			current, 
                     			"inputs",
                      		lv_inputs_3_0, 
                      		"com.rockwellcollins.Spear.Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpear.g:667:2: (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSpear.g:667:4: otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalSpear.g:671:1: ( (lv_inputs_5_0= ruleVariable ) )
            	    // InternalSpear.g:672:1: (lv_inputs_5_0= ruleVariable )
            	    {
            	    // InternalSpear.g:672:1: (lv_inputs_5_0= ruleVariable )
            	    // InternalSpear.g:673:3: lv_inputs_5_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternAccess().getInputsVariableParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_inputs_5_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inputs",
            	              		lv_inputs_5_0, 
            	              		"com.rockwellcollins.Spear.Variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getReturnsKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_7());
                  
            }
            // InternalSpear.g:701:1: ( (lv_outputs_9_0= ruleVariable ) )
            // InternalSpear.g:702:1: (lv_outputs_9_0= ruleVariable )
            {
            // InternalSpear.g:702:1: (lv_outputs_9_0= ruleVariable )
            // InternalSpear.g:703:3: lv_outputs_9_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternAccess().getOutputsVariableParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_25);
            lv_outputs_9_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPatternRule());
              	        }
                     		add(
                     			current, 
                     			"outputs",
                      		lv_outputs_9_0, 
                      		"com.rockwellcollins.Spear.Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpear.g:719:2: (otherlv_10= ',' ( (lv_outputs_11_0= ruleVariable ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSpear.g:719:4: otherlv_10= ',' ( (lv_outputs_11_0= ruleVariable ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getPatternAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // InternalSpear.g:723:1: ( (lv_outputs_11_0= ruleVariable ) )
            	    // InternalSpear.g:724:1: (lv_outputs_11_0= ruleVariable )
            	    {
            	    // InternalSpear.g:724:1: (lv_outputs_11_0= ruleVariable )
            	    // InternalSpear.g:725:3: lv_outputs_11_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternAccess().getOutputsVariableParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_outputs_11_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outputs",
            	              		lv_outputs_11_0, 
            	              		"com.rockwellcollins.Spear.Variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_12=(Token)match(input,29,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getRightParenthesisKeyword_10());
                  
            }
            // InternalSpear.g:745:1: (otherlv_13= 'var' ( (lv_locals_14_0= ruleVariable ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSpear.g:745:3: otherlv_13= 'var' ( (lv_locals_14_0= ruleVariable ) )*
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getPatternAccess().getVarKeyword_11_0());
                          
                    }
                    // InternalSpear.g:749:1: ( (lv_locals_14_0= ruleVariable ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalSpear.g:750:1: (lv_locals_14_0= ruleVariable )
                    	    {
                    	    // InternalSpear.g:750:1: (lv_locals_14_0= ruleVariable )
                    	    // InternalSpear.g:751:3: lv_locals_14_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternAccess().getLocalsVariableParserRuleCall_11_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_locals_14_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"locals",
                    	              		lv_locals_14_0, 
                    	              		"com.rockwellcollins.Spear.Variable");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getPatternAccess().getLetKeyword_12());
                  
            }
            // InternalSpear.g:771:1: ( ( (lv_equations_16_0= ruleLustreEquation ) ) | ( (lv_properties_17_0= ruleLustreProperty ) ) | ( (lv_assertions_18_0= ruleLustreAssertion ) ) )*
            loop37:
            do {
                int alt37=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                case 34:
                    {
                    alt37=1;
                    }
                    break;
                case 36:
                    {
                    alt37=2;
                    }
                    break;
                case 37:
                    {
                    alt37=3;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // InternalSpear.g:771:2: ( (lv_equations_16_0= ruleLustreEquation ) )
            	    {
            	    // InternalSpear.g:771:2: ( (lv_equations_16_0= ruleLustreEquation ) )
            	    // InternalSpear.g:772:1: (lv_equations_16_0= ruleLustreEquation )
            	    {
            	    // InternalSpear.g:772:1: (lv_equations_16_0= ruleLustreEquation )
            	    // InternalSpear.g:773:3: lv_equations_16_0= ruleLustreEquation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternAccess().getEquationsLustreEquationParserRuleCall_13_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_equations_16_0=ruleLustreEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"equations",
            	              		lv_equations_16_0, 
            	              		"com.rockwellcollins.Spear.LustreEquation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSpear.g:790:6: ( (lv_properties_17_0= ruleLustreProperty ) )
            	    {
            	    // InternalSpear.g:790:6: ( (lv_properties_17_0= ruleLustreProperty ) )
            	    // InternalSpear.g:791:1: (lv_properties_17_0= ruleLustreProperty )
            	    {
            	    // InternalSpear.g:791:1: (lv_properties_17_0= ruleLustreProperty )
            	    // InternalSpear.g:792:3: lv_properties_17_0= ruleLustreProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternAccess().getPropertiesLustrePropertyParserRuleCall_13_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_properties_17_0=ruleLustreProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_17_0, 
            	              		"com.rockwellcollins.Spear.LustreProperty");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSpear.g:809:6: ( (lv_assertions_18_0= ruleLustreAssertion ) )
            	    {
            	    // InternalSpear.g:809:6: ( (lv_assertions_18_0= ruleLustreAssertion ) )
            	    // InternalSpear.g:810:1: (lv_assertions_18_0= ruleLustreAssertion )
            	    {
            	    // InternalSpear.g:810:1: (lv_assertions_18_0= ruleLustreAssertion )
            	    // InternalSpear.g:811:3: lv_assertions_18_0= ruleLustreAssertion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternAccess().getAssertionsLustreAssertionParserRuleCall_13_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_assertions_18_0=ruleLustreAssertion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assertions",
            	              		lv_assertions_18_0, 
            	              		"com.rockwellcollins.Spear.LustreAssertion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_19=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_19, grammarAccess.getPatternAccess().getTelKeyword_14());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleLustreEquation"
    // InternalSpear.g:839:1: entryRuleLustreEquation returns [EObject current=null] : iv_ruleLustreEquation= ruleLustreEquation EOF ;
    public final EObject entryRuleLustreEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLustreEquation = null;


        try {
            // InternalSpear.g:840:2: (iv_ruleLustreEquation= ruleLustreEquation EOF )
            // InternalSpear.g:841:2: iv_ruleLustreEquation= ruleLustreEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLustreEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLustreEquation=ruleLustreEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLustreEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLustreEquation"


    // $ANTLR start "ruleLustreEquation"
    // InternalSpear.g:848:1: ruleLustreEquation returns [EObject current=null] : ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= '|' otherlv_5= '=' ( (lv_rhs_6_0= ruleExpr ) ) ) | ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleExpr ) ) ) ) ;
    public final EObject ruleLustreEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_rhs_6_0 = null;

        EObject lv_rhs_9_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:851:28: ( ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= '|' otherlv_5= '=' ( (lv_rhs_6_0= ruleExpr ) ) ) | ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleExpr ) ) ) ) )
            // InternalSpear.g:852:1: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= '|' otherlv_5= '=' ( (lv_rhs_6_0= ruleExpr ) ) ) | ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleExpr ) ) ) )
            {
            // InternalSpear.g:852:1: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= '|' otherlv_5= '=' ( (lv_rhs_6_0= ruleExpr ) ) ) | ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleExpr ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSpear.g:852:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= '|' otherlv_5= '=' ( (lv_rhs_6_0= ruleExpr ) ) )
                    {
                    // InternalSpear.g:852:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= '|' otherlv_5= '=' ( (lv_rhs_6_0= ruleExpr ) ) )
                    // InternalSpear.g:852:4: otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= '|' otherlv_5= '=' ( (lv_rhs_6_0= ruleExpr ) )
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getLustreEquationAccess().getVerticalLineKeyword_0_0());
                          
                    }
                    // InternalSpear.g:856:1: ( (otherlv_1= RULE_ID ) )
                    // InternalSpear.g:857:1: (otherlv_1= RULE_ID )
                    {
                    // InternalSpear.g:857:1: (otherlv_1= RULE_ID )
                    // InternalSpear.g:858:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getLustreEquationRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getLustreEquationAccess().getIdsVariableCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalSpear.g:869:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==28) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalSpear.g:869:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getLustreEquationAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // InternalSpear.g:873:1: ( (otherlv_3= RULE_ID ) )
                    	    // InternalSpear.g:874:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalSpear.g:874:1: (otherlv_3= RULE_ID )
                    	    // InternalSpear.g:875:3: otherlv_3= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getLustreEquationRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_3, grammarAccess.getLustreEquationAccess().getIdsVariableCrossReference_0_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,34,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getLustreEquationAccess().getVerticalLineKeyword_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLustreEquationAccess().getEqualsSignKeyword_0_4());
                          
                    }
                    // InternalSpear.g:894:1: ( (lv_rhs_6_0= ruleExpr ) )
                    // InternalSpear.g:895:1: (lv_rhs_6_0= ruleExpr )
                    {
                    // InternalSpear.g:895:1: (lv_rhs_6_0= ruleExpr )
                    // InternalSpear.g:896:3: lv_rhs_6_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLustreEquationAccess().getRhsExprParserRuleCall_0_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_6_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLustreEquationRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_6_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:913:6: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleExpr ) ) )
                    {
                    // InternalSpear.g:913:6: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleExpr ) ) )
                    // InternalSpear.g:913:7: ( (otherlv_7= RULE_ID ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleExpr ) )
                    {
                    // InternalSpear.g:913:7: ( (otherlv_7= RULE_ID ) )
                    // InternalSpear.g:914:1: (otherlv_7= RULE_ID )
                    {
                    // InternalSpear.g:914:1: (otherlv_7= RULE_ID )
                    // InternalSpear.g:915:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getLustreEquationRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getLustreEquationAccess().getIdsVariableCrossReference_1_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getLustreEquationAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // InternalSpear.g:930:1: ( (lv_rhs_9_0= ruleExpr ) )
                    // InternalSpear.g:931:1: (lv_rhs_9_0= ruleExpr )
                    {
                    // InternalSpear.g:931:1: (lv_rhs_9_0= ruleExpr )
                    // InternalSpear.g:932:3: lv_rhs_9_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLustreEquationAccess().getRhsExprParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_9_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLustreEquationRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_9_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLustreEquation"


    // $ANTLR start "entryRuleLustreProperty"
    // InternalSpear.g:956:1: entryRuleLustreProperty returns [EObject current=null] : iv_ruleLustreProperty= ruleLustreProperty EOF ;
    public final EObject entryRuleLustreProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLustreProperty = null;


        try {
            // InternalSpear.g:957:2: (iv_ruleLustreProperty= ruleLustreProperty EOF )
            // InternalSpear.g:958:2: iv_ruleLustreProperty= ruleLustreProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLustrePropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLustreProperty=ruleLustreProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLustreProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLustreProperty"


    // $ANTLR start "ruleLustreProperty"
    // InternalSpear.g:965:1: ruleLustreProperty returns [EObject current=null] : (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleLustreProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:968:28: ( (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSpear.g:969:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSpear.g:969:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) )
            // InternalSpear.g:969:3: otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLustrePropertyAccess().getPROPERTYKeyword_0());
                  
            }
            // InternalSpear.g:973:1: ( (otherlv_1= RULE_ID ) )
            // InternalSpear.g:974:1: (otherlv_1= RULE_ID )
            {
            // InternalSpear.g:974:1: (otherlv_1= RULE_ID )
            // InternalSpear.g:975:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLustrePropertyRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getLustrePropertyAccess().getPropertyIdVariableCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLustreProperty"


    // $ANTLR start "entryRuleLustreAssertion"
    // InternalSpear.g:994:1: entryRuleLustreAssertion returns [EObject current=null] : iv_ruleLustreAssertion= ruleLustreAssertion EOF ;
    public final EObject entryRuleLustreAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLustreAssertion = null;


        try {
            // InternalSpear.g:995:2: (iv_ruleLustreAssertion= ruleLustreAssertion EOF )
            // InternalSpear.g:996:2: iv_ruleLustreAssertion= ruleLustreAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLustreAssertionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLustreAssertion=ruleLustreAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLustreAssertion; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLustreAssertion"


    // $ANTLR start "ruleLustreAssertion"
    // InternalSpear.g:1003:1: ruleLustreAssertion returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_assertionExpr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleLustreAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_assertionExpr_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:1006:28: ( (otherlv_0= 'assert' ( (lv_assertionExpr_1_0= ruleExpr ) ) ) )
            // InternalSpear.g:1007:1: (otherlv_0= 'assert' ( (lv_assertionExpr_1_0= ruleExpr ) ) )
            {
            // InternalSpear.g:1007:1: (otherlv_0= 'assert' ( (lv_assertionExpr_1_0= ruleExpr ) ) )
            // InternalSpear.g:1007:3: otherlv_0= 'assert' ( (lv_assertionExpr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLustreAssertionAccess().getAssertKeyword_0());
                  
            }
            // InternalSpear.g:1011:1: ( (lv_assertionExpr_1_0= ruleExpr ) )
            // InternalSpear.g:1012:1: (lv_assertionExpr_1_0= ruleExpr )
            {
            // InternalSpear.g:1012:1: (lv_assertionExpr_1_0= ruleExpr )
            // InternalSpear.g:1013:3: lv_assertionExpr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLustreAssertionAccess().getAssertionExprExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_assertionExpr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLustreAssertionRule());
              	        }
                     		set(
                     			current, 
                     			"assertionExpr",
                      		lv_assertionExpr_1_0, 
                      		"com.rockwellcollins.Spear.Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLustreAssertion"


    // $ANTLR start "entryRuleUnitDef"
    // InternalSpear.g:1037:1: entryRuleUnitDef returns [EObject current=null] : iv_ruleUnitDef= ruleUnitDef EOF ;
    public final EObject entryRuleUnitDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitDef = null;


        try {
            // InternalSpear.g:1038:2: (iv_ruleUnitDef= ruleUnitDef EOF )
            // InternalSpear.g:1039:2: iv_ruleUnitDef= ruleUnitDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnitDef=ruleUnitDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitDef"


    // $ANTLR start "ruleUnitDef"
    // InternalSpear.g:1046:1: ruleUnitDef returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) | ( () ( (lv_name_4_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_unit_6_0= ruleUnitExpr ) ) ( (lv_description_7_0= RULE_STRING ) )? ) ) ;
    public final EObject ruleUnitDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token lv_name_4_0=null;
        Token lv_description_7_0=null;
        EObject lv_unit_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:1049:28: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) | ( () ( (lv_name_4_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_unit_6_0= ruleUnitExpr ) ) ( (lv_description_7_0= RULE_STRING ) )? ) ) )
            // InternalSpear.g:1050:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) | ( () ( (lv_name_4_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_unit_6_0= ruleUnitExpr ) ) ( (lv_description_7_0= RULE_STRING ) )? ) )
            {
            // InternalSpear.g:1050:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) | ( () ( (lv_name_4_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_unit_6_0= ruleUnitExpr ) ) ( (lv_description_7_0= RULE_STRING ) )? ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==46||(LA42_1>=50 && LA42_1<=51)) ) {
                    alt42=2;
                }
                else if ( (LA42_1==EOF||(LA42_1>=RULE_ID && LA42_1<=RULE_STRING)||(LA42_1>=14 && LA42_1<=17)) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalSpear.g:1050:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
                    {
                    // InternalSpear.g:1050:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
                    // InternalSpear.g:1050:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
                    {
                    // InternalSpear.g:1050:3: ()
                    // InternalSpear.g:1051:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnitDefAccess().getBaseUnitAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1056:2: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSpear.g:1057:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSpear.g:1057:1: (lv_name_1_0= RULE_ID )
                    // InternalSpear.g:1058:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getUnitDefAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnitDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:1074:2: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_STRING) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalSpear.g:1075:1: (lv_description_2_0= RULE_STRING )
                            {
                            // InternalSpear.g:1075:1: (lv_description_2_0= RULE_STRING )
                            // InternalSpear.g:1076:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_description_2_0, grammarAccess.getUnitDefAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getUnitDefRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"description",
                                      		lv_description_2_0, 
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:1093:6: ( () ( (lv_name_4_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_unit_6_0= ruleUnitExpr ) ) ( (lv_description_7_0= RULE_STRING ) )? )
                    {
                    // InternalSpear.g:1093:6: ( () ( (lv_name_4_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_unit_6_0= ruleUnitExpr ) ) ( (lv_description_7_0= RULE_STRING ) )? )
                    // InternalSpear.g:1093:7: () ( (lv_name_4_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_unit_6_0= ruleUnitExpr ) ) ( (lv_description_7_0= RULE_STRING ) )?
                    {
                    // InternalSpear.g:1093:7: ()
                    // InternalSpear.g:1094:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnitDefAccess().getDerivedUnitAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1099:2: ( (lv_name_4_0= RULE_ID ) )
                    // InternalSpear.g:1100:1: (lv_name_4_0= RULE_ID )
                    {
                    // InternalSpear.g:1100:1: (lv_name_4_0= RULE_ID )
                    // InternalSpear.g:1101:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_4_0, grammarAccess.getUnitDefAccess().getNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnitDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnitDefAccess().getIdTypeDelimiterParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_35);
                    ruleIdTypeDelimiter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpear.g:1125:1: ( (lv_unit_6_0= ruleUnitExpr ) )
                    // InternalSpear.g:1126:1: (lv_unit_6_0= ruleUnitExpr )
                    {
                    // InternalSpear.g:1126:1: (lv_unit_6_0= ruleUnitExpr )
                    // InternalSpear.g:1127:3: lv_unit_6_0= ruleUnitExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitDefAccess().getUnitUnitExprParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_33);
                    lv_unit_6_0=ruleUnitExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnitDefRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_6_0, 
                              		"com.rockwellcollins.Spear.UnitExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:1143:2: ( (lv_description_7_0= RULE_STRING ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_STRING) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSpear.g:1144:1: (lv_description_7_0= RULE_STRING )
                            {
                            // InternalSpear.g:1144:1: (lv_description_7_0= RULE_STRING )
                            // InternalSpear.g:1145:3: lv_description_7_0= RULE_STRING
                            {
                            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_description_7_0, grammarAccess.getUnitDefAccess().getDescriptionSTRINGTerminalRuleCall_1_4_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getUnitDefRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"description",
                                      		lv_description_7_0, 
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitDef"


    // $ANTLR start "entryRuleUnitExpr"
    // InternalSpear.g:1169:1: entryRuleUnitExpr returns [EObject current=null] : iv_ruleUnitExpr= ruleUnitExpr EOF ;
    public final EObject entryRuleUnitExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitExpr = null;


        try {
            // InternalSpear.g:1170:2: (iv_ruleUnitExpr= ruleUnitExpr EOF )
            // InternalSpear.g:1171:2: iv_ruleUnitExpr= ruleUnitExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnitExpr=ruleUnitExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitExpr"


    // $ANTLR start "ruleUnitExpr"
    // InternalSpear.g:1178:1: ruleUnitExpr returns [EObject current=null] : this_ProductUnitExpr_0= ruleProductUnitExpr ;
    public final EObject ruleUnitExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ProductUnitExpr_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:1181:28: (this_ProductUnitExpr_0= ruleProductUnitExpr )
            // InternalSpear.g:1183:5: this_ProductUnitExpr_0= ruleProductUnitExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnitExprAccess().getProductUnitExprParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_ProductUnitExpr_0=ruleProductUnitExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ProductUnitExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitExpr"


    // $ANTLR start "entryRuleProductUnitExpr"
    // InternalSpear.g:1199:1: entryRuleProductUnitExpr returns [EObject current=null] : iv_ruleProductUnitExpr= ruleProductUnitExpr EOF ;
    public final EObject entryRuleProductUnitExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductUnitExpr = null;


        try {
            // InternalSpear.g:1200:2: (iv_ruleProductUnitExpr= ruleProductUnitExpr EOF )
            // InternalSpear.g:1201:2: iv_ruleProductUnitExpr= ruleProductUnitExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProductUnitExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProductUnitExpr=ruleProductUnitExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProductUnitExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductUnitExpr"


    // $ANTLR start "ruleProductUnitExpr"
    // InternalSpear.g:1208:1: ruleProductUnitExpr returns [EObject current=null] : (this_DivisionUnitExpr_0= ruleDivisionUnitExpr ( ( ( ( () ( ( '*' ) ) ) )=> ( () ( (lv_op_2_0= '*' ) ) ) ) ( (lv_right_3_0= ruleProductUnitExpr ) ) )? ) ;
    public final EObject ruleProductUnitExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_DivisionUnitExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:1211:28: ( (this_DivisionUnitExpr_0= ruleDivisionUnitExpr ( ( ( ( () ( ( '*' ) ) ) )=> ( () ( (lv_op_2_0= '*' ) ) ) ) ( (lv_right_3_0= ruleProductUnitExpr ) ) )? ) )
            // InternalSpear.g:1212:1: (this_DivisionUnitExpr_0= ruleDivisionUnitExpr ( ( ( ( () ( ( '*' ) ) ) )=> ( () ( (lv_op_2_0= '*' ) ) ) ) ( (lv_right_3_0= ruleProductUnitExpr ) ) )? )
            {
            // InternalSpear.g:1212:1: (this_DivisionUnitExpr_0= ruleDivisionUnitExpr ( ( ( ( () ( ( '*' ) ) ) )=> ( () ( (lv_op_2_0= '*' ) ) ) ) ( (lv_right_3_0= ruleProductUnitExpr ) ) )? )
            // InternalSpear.g:1213:5: this_DivisionUnitExpr_0= ruleDivisionUnitExpr ( ( ( ( () ( ( '*' ) ) ) )=> ( () ( (lv_op_2_0= '*' ) ) ) ) ( (lv_right_3_0= ruleProductUnitExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getProductUnitExprAccess().getDivisionUnitExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_36);
            this_DivisionUnitExpr_0=ruleDivisionUnitExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivisionUnitExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:1221:1: ( ( ( ( () ( ( '*' ) ) ) )=> ( () ( (lv_op_2_0= '*' ) ) ) ) ( (lv_right_3_0= ruleProductUnitExpr ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) && (synpred1_InternalSpear())) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSpear.g:1221:2: ( ( ( () ( ( '*' ) ) ) )=> ( () ( (lv_op_2_0= '*' ) ) ) ) ( (lv_right_3_0= ruleProductUnitExpr ) )
                    {
                    // InternalSpear.g:1221:2: ( ( ( () ( ( '*' ) ) ) )=> ( () ( (lv_op_2_0= '*' ) ) ) )
                    // InternalSpear.g:1221:3: ( ( () ( ( '*' ) ) ) )=> ( () ( (lv_op_2_0= '*' ) ) )
                    {
                    // InternalSpear.g:1228:6: ( () ( (lv_op_2_0= '*' ) ) )
                    // InternalSpear.g:1228:7: () ( (lv_op_2_0= '*' ) )
                    {
                    // InternalSpear.g:1228:7: ()
                    // InternalSpear.g:1229:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getProductUnitExprAccess().getBinaryUnitExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1234:2: ( (lv_op_2_0= '*' ) )
                    // InternalSpear.g:1235:1: (lv_op_2_0= '*' )
                    {
                    // InternalSpear.g:1235:1: (lv_op_2_0= '*' )
                    // InternalSpear.g:1236:3: lv_op_2_0= '*'
                    {
                    lv_op_2_0=(Token)match(input,38,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getProductUnitExprAccess().getOpAsteriskKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProductUnitExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "*");
                      	    
                    }

                    }


                    }


                    }


                    }

                    // InternalSpear.g:1249:4: ( (lv_right_3_0= ruleProductUnitExpr ) )
                    // InternalSpear.g:1250:1: (lv_right_3_0= ruleProductUnitExpr )
                    {
                    // InternalSpear.g:1250:1: (lv_right_3_0= ruleProductUnitExpr )
                    // InternalSpear.g:1251:3: lv_right_3_0= ruleProductUnitExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProductUnitExprAccess().getRightProductUnitExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleProductUnitExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProductUnitExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.ProductUnitExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductUnitExpr"


    // $ANTLR start "entryRuleDivisionUnitExpr"
    // InternalSpear.g:1275:1: entryRuleDivisionUnitExpr returns [EObject current=null] : iv_ruleDivisionUnitExpr= ruleDivisionUnitExpr EOF ;
    public final EObject entryRuleDivisionUnitExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionUnitExpr = null;


        try {
            // InternalSpear.g:1276:2: (iv_ruleDivisionUnitExpr= ruleDivisionUnitExpr EOF )
            // InternalSpear.g:1277:2: iv_ruleDivisionUnitExpr= ruleDivisionUnitExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionUnitExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivisionUnitExpr=ruleDivisionUnitExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionUnitExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionUnitExpr"


    // $ANTLR start "ruleDivisionUnitExpr"
    // InternalSpear.g:1284:1: ruleDivisionUnitExpr returns [EObject current=null] : (this_AtomicUnitExpr_0= ruleAtomicUnitExpr ( ( ( ( () ( ( '/' ) ) ) )=> ( () ( (lv_op_2_0= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomicUnitExpr ) ) )? ) ;
    public final EObject ruleDivisionUnitExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AtomicUnitExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:1287:28: ( (this_AtomicUnitExpr_0= ruleAtomicUnitExpr ( ( ( ( () ( ( '/' ) ) ) )=> ( () ( (lv_op_2_0= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomicUnitExpr ) ) )? ) )
            // InternalSpear.g:1288:1: (this_AtomicUnitExpr_0= ruleAtomicUnitExpr ( ( ( ( () ( ( '/' ) ) ) )=> ( () ( (lv_op_2_0= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomicUnitExpr ) ) )? )
            {
            // InternalSpear.g:1288:1: (this_AtomicUnitExpr_0= ruleAtomicUnitExpr ( ( ( ( () ( ( '/' ) ) ) )=> ( () ( (lv_op_2_0= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomicUnitExpr ) ) )? )
            // InternalSpear.g:1289:5: this_AtomicUnitExpr_0= ruleAtomicUnitExpr ( ( ( ( () ( ( '/' ) ) ) )=> ( () ( (lv_op_2_0= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomicUnitExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivisionUnitExprAccess().getAtomicUnitExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_37);
            this_AtomicUnitExpr_0=ruleAtomicUnitExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AtomicUnitExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:1297:1: ( ( ( ( () ( ( '/' ) ) ) )=> ( () ( (lv_op_2_0= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomicUnitExpr ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) && (synpred2_InternalSpear())) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSpear.g:1297:2: ( ( ( () ( ( '/' ) ) ) )=> ( () ( (lv_op_2_0= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomicUnitExpr ) )
                    {
                    // InternalSpear.g:1297:2: ( ( ( () ( ( '/' ) ) ) )=> ( () ( (lv_op_2_0= '/' ) ) ) )
                    // InternalSpear.g:1297:3: ( ( () ( ( '/' ) ) ) )=> ( () ( (lv_op_2_0= '/' ) ) )
                    {
                    // InternalSpear.g:1304:6: ( () ( (lv_op_2_0= '/' ) ) )
                    // InternalSpear.g:1304:7: () ( (lv_op_2_0= '/' ) )
                    {
                    // InternalSpear.g:1304:7: ()
                    // InternalSpear.g:1305:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getDivisionUnitExprAccess().getBinaryUnitExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1310:2: ( (lv_op_2_0= '/' ) )
                    // InternalSpear.g:1311:1: (lv_op_2_0= '/' )
                    {
                    // InternalSpear.g:1311:1: (lv_op_2_0= '/' )
                    // InternalSpear.g:1312:3: lv_op_2_0= '/'
                    {
                    lv_op_2_0=(Token)match(input,39,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getDivisionUnitExprAccess().getOpSolidusKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDivisionUnitExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "/");
                      	    
                    }

                    }


                    }


                    }


                    }

                    // InternalSpear.g:1325:4: ( (lv_right_3_0= ruleAtomicUnitExpr ) )
                    // InternalSpear.g:1326:1: (lv_right_3_0= ruleAtomicUnitExpr )
                    {
                    // InternalSpear.g:1326:1: (lv_right_3_0= ruleAtomicUnitExpr )
                    // InternalSpear.g:1327:3: lv_right_3_0= ruleAtomicUnitExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivisionUnitExprAccess().getRightAtomicUnitExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAtomicUnitExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDivisionUnitExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.AtomicUnitExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionUnitExpr"


    // $ANTLR start "entryRuleAtomicUnitExpr"
    // InternalSpear.g:1351:1: entryRuleAtomicUnitExpr returns [EObject current=null] : iv_ruleAtomicUnitExpr= ruleAtomicUnitExpr EOF ;
    public final EObject entryRuleAtomicUnitExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicUnitExpr = null;


        try {
            // InternalSpear.g:1352:2: (iv_ruleAtomicUnitExpr= ruleAtomicUnitExpr EOF )
            // InternalSpear.g:1353:2: iv_ruleAtomicUnitExpr= ruleAtomicUnitExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicUnitExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicUnitExpr=ruleAtomicUnitExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicUnitExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicUnitExpr"


    // $ANTLR start "ruleAtomicUnitExpr"
    // InternalSpear.g:1360:1: ruleAtomicUnitExpr returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '(' this_UnitExpr_3= ruleUnitExpr otherlv_4= ')' ) ) ;
    public final EObject ruleAtomicUnitExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UnitExpr_3 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:1363:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '(' this_UnitExpr_3= ruleUnitExpr otherlv_4= ')' ) ) )
            // InternalSpear.g:1364:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '(' this_UnitExpr_3= ruleUnitExpr otherlv_4= ')' ) )
            {
            // InternalSpear.g:1364:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '(' this_UnitExpr_3= ruleUnitExpr otherlv_4= ')' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            else if ( (LA45_0==27) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalSpear.g:1364:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalSpear.g:1364:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalSpear.g:1364:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalSpear.g:1364:3: ()
                    // InternalSpear.g:1365:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicUnitExprAccess().getNamedUnitExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1370:2: ( (otherlv_1= RULE_ID ) )
                    // InternalSpear.g:1371:1: (otherlv_1= RULE_ID )
                    {
                    // InternalSpear.g:1371:1: (otherlv_1= RULE_ID )
                    // InternalSpear.g:1372:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicUnitExprRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getAtomicUnitExprAccess().getUnitUnitDefCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:1384:6: (otherlv_2= '(' this_UnitExpr_3= ruleUnitExpr otherlv_4= ')' )
                    {
                    // InternalSpear.g:1384:6: (otherlv_2= '(' this_UnitExpr_3= ruleUnitExpr otherlv_4= ')' )
                    // InternalSpear.g:1384:8: otherlv_2= '(' this_UnitExpr_3= ruleUnitExpr otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicUnitExprAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicUnitExprAccess().getUnitExprParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_38);
                    this_UnitExpr_3=ruleUnitExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnitExpr_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicUnitExprAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicUnitExpr"


    // $ANTLR start "entryRuleTypeDef"
    // InternalSpear.g:1409:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalSpear.g:1410:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalSpear.g:1411:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalSpear.g:1418:1: ruleTypeDef returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_3_0= ruleType ) ) ( (otherlv_4= RULE_ID ) )? ) | ( () ( (lv_name_6_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_8= 'record' otherlv_9= '{' ( (lv_fields_10_0= ruleFieldType ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) ) )* otherlv_13= '}' ) | ( () ( (lv_name_15_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_base_17_0= ruleType ) ) otherlv_18= '[' ( (lv_size_19_0= RULE_INT ) ) otherlv_20= ']' ) | ( () ( (lv_name_22_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_24= 'enum' otherlv_25= '{' ( (lv_values_26_0= ruleEnumValue ) ) (otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) ) )* otherlv_29= '}' ) ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_name_15_0=null;
        Token otherlv_18=null;
        Token lv_size_19_0=null;
        Token otherlv_20=null;
        Token lv_name_22_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        EObject lv_type_3_0 = null;

        EObject lv_fields_10_0 = null;

        EObject lv_fields_12_0 = null;

        EObject lv_base_17_0 = null;

        EObject lv_values_26_0 = null;

        EObject lv_values_28_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:1421:28: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_3_0= ruleType ) ) ( (otherlv_4= RULE_ID ) )? ) | ( () ( (lv_name_6_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_8= 'record' otherlv_9= '{' ( (lv_fields_10_0= ruleFieldType ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) ) )* otherlv_13= '}' ) | ( () ( (lv_name_15_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_base_17_0= ruleType ) ) otherlv_18= '[' ( (lv_size_19_0= RULE_INT ) ) otherlv_20= ']' ) | ( () ( (lv_name_22_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_24= 'enum' otherlv_25= '{' ( (lv_values_26_0= ruleEnumValue ) ) (otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) ) )* otherlv_29= '}' ) ) )
            // InternalSpear.g:1422:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_3_0= ruleType ) ) ( (otherlv_4= RULE_ID ) )? ) | ( () ( (lv_name_6_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_8= 'record' otherlv_9= '{' ( (lv_fields_10_0= ruleFieldType ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) ) )* otherlv_13= '}' ) | ( () ( (lv_name_15_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_base_17_0= ruleType ) ) otherlv_18= '[' ( (lv_size_19_0= RULE_INT ) ) otherlv_20= ']' ) | ( () ( (lv_name_22_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_24= 'enum' otherlv_25= '{' ( (lv_values_26_0= ruleEnumValue ) ) (otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) ) )* otherlv_29= '}' ) )
            {
            // InternalSpear.g:1422:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_3_0= ruleType ) ) ( (otherlv_4= RULE_ID ) )? ) | ( () ( (lv_name_6_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_8= 'record' otherlv_9= '{' ( (lv_fields_10_0= ruleFieldType ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) ) )* otherlv_13= '}' ) | ( () ( (lv_name_15_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_base_17_0= ruleType ) ) otherlv_18= '[' ( (lv_size_19_0= RULE_INT ) ) otherlv_20= ']' ) | ( () ( (lv_name_22_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_24= 'enum' otherlv_25= '{' ( (lv_values_26_0= ruleEnumValue ) ) (otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) ) )* otherlv_29= '}' ) )
            int alt49=4;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalSpear.g:1422:2: ( () ( (lv_name_1_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_3_0= ruleType ) ) ( (otherlv_4= RULE_ID ) )? )
                    {
                    // InternalSpear.g:1422:2: ( () ( (lv_name_1_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_3_0= ruleType ) ) ( (otherlv_4= RULE_ID ) )? )
                    // InternalSpear.g:1422:3: () ( (lv_name_1_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_3_0= ruleType ) ) ( (otherlv_4= RULE_ID ) )?
                    {
                    // InternalSpear.g:1422:3: ()
                    // InternalSpear.g:1423:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeDefAccess().getNamedTypeDefAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1428:2: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSpear.g:1429:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSpear.g:1429:1: (lv_name_1_0= RULE_ID )
                    // InternalSpear.g:1430:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getIdTypeDelimiterParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_39);
                    ruleIdTypeDelimiter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpear.g:1454:1: ( (lv_type_3_0= ruleType ) )
                    // InternalSpear.g:1455:1: (lv_type_3_0= ruleType )
                    {
                    // InternalSpear.g:1455:1: (lv_type_3_0= ruleType )
                    // InternalSpear.g:1456:3: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    lv_type_3_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"com.rockwellcollins.Spear.Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:1472:2: ( (otherlv_4= RULE_ID ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        int LA46_1 = input.LA(2);

                        if ( (LA46_1==EOF||LA46_1==RULE_ID||(LA46_1>=15 && LA46_1<=17)) ) {
                            alt46=1;
                        }
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalSpear.g:1473:1: (otherlv_4= RULE_ID )
                            {
                            // InternalSpear.g:1473:1: (otherlv_4= RULE_ID )
                            // InternalSpear.g:1474:3: otherlv_4= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getTypeDefRule());
                              	        }
                                      
                            }
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_4, grammarAccess.getTypeDefAccess().getUnitUnitDefCrossReference_0_4_0()); 
                              	
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:1486:6: ( () ( (lv_name_6_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_8= 'record' otherlv_9= '{' ( (lv_fields_10_0= ruleFieldType ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) ) )* otherlv_13= '}' )
                    {
                    // InternalSpear.g:1486:6: ( () ( (lv_name_6_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_8= 'record' otherlv_9= '{' ( (lv_fields_10_0= ruleFieldType ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) ) )* otherlv_13= '}' )
                    // InternalSpear.g:1486:7: () ( (lv_name_6_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_8= 'record' otherlv_9= '{' ( (lv_fields_10_0= ruleFieldType ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) ) )* otherlv_13= '}'
                    {
                    // InternalSpear.g:1486:7: ()
                    // InternalSpear.g:1487:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeDefAccess().getRecordTypeDefAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1492:2: ( (lv_name_6_0= RULE_ID ) )
                    // InternalSpear.g:1493:1: (lv_name_6_0= RULE_ID )
                    {
                    // InternalSpear.g:1493:1: (lv_name_6_0= RULE_ID )
                    // InternalSpear.g:1494:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_6_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_6_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getIdTypeDelimiterParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_40);
                    ruleIdTypeDelimiter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_8=(Token)match(input,40,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTypeDefAccess().getRecordKeyword_1_3());
                          
                    }
                    otherlv_9=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_1_4());
                          
                    }
                    // InternalSpear.g:1526:1: ( (lv_fields_10_0= ruleFieldType ) )
                    // InternalSpear.g:1527:1: (lv_fields_10_0= ruleFieldType )
                    {
                    // InternalSpear.g:1527:1: (lv_fields_10_0= ruleFieldType )
                    // InternalSpear.g:1528:3: lv_fields_10_0= ruleFieldType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefAccess().getFieldsFieldTypeParserRuleCall_1_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_42);
                    lv_fields_10_0=ruleFieldType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      	        }
                             		add(
                             			current, 
                             			"fields",
                              		lv_fields_10_0, 
                              		"com.rockwellcollins.Spear.FieldType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:1544:2: (otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==28) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalSpear.g:1544:4: otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) )
                    	    {
                    	    otherlv_11=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getTypeDefAccess().getCommaKeyword_1_6_0());
                    	          
                    	    }
                    	    // InternalSpear.g:1548:1: ( (lv_fields_12_0= ruleFieldType ) )
                    	    // InternalSpear.g:1549:1: (lv_fields_12_0= ruleFieldType )
                    	    {
                    	    // InternalSpear.g:1549:1: (lv_fields_12_0= ruleFieldType )
                    	    // InternalSpear.g:1550:3: lv_fields_12_0= ruleFieldType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeDefAccess().getFieldsFieldTypeParserRuleCall_1_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_fields_12_0=ruleFieldType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_12_0, 
                    	              		"com.rockwellcollins.Spear.FieldType");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_1_7());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSpear.g:1571:6: ( () ( (lv_name_15_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_base_17_0= ruleType ) ) otherlv_18= '[' ( (lv_size_19_0= RULE_INT ) ) otherlv_20= ']' )
                    {
                    // InternalSpear.g:1571:6: ( () ( (lv_name_15_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_base_17_0= ruleType ) ) otherlv_18= '[' ( (lv_size_19_0= RULE_INT ) ) otherlv_20= ']' )
                    // InternalSpear.g:1571:7: () ( (lv_name_15_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_base_17_0= ruleType ) ) otherlv_18= '[' ( (lv_size_19_0= RULE_INT ) ) otherlv_20= ']'
                    {
                    // InternalSpear.g:1571:7: ()
                    // InternalSpear.g:1572:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeDefAccess().getArrayTypeDefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1577:2: ( (lv_name_15_0= RULE_ID ) )
                    // InternalSpear.g:1578:1: (lv_name_15_0= RULE_ID )
                    {
                    // InternalSpear.g:1578:1: (lv_name_15_0= RULE_ID )
                    // InternalSpear.g:1579:3: lv_name_15_0= RULE_ID
                    {
                    lv_name_15_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_15_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_15_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getIdTypeDelimiterParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_39);
                    ruleIdTypeDelimiter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpear.g:1603:1: ( (lv_base_17_0= ruleType ) )
                    // InternalSpear.g:1604:1: (lv_base_17_0= ruleType )
                    {
                    // InternalSpear.g:1604:1: (lv_base_17_0= ruleType )
                    // InternalSpear.g:1605:3: lv_base_17_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefAccess().getBaseTypeParserRuleCall_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_43);
                    lv_base_17_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      	        }
                             		set(
                             			current, 
                             			"base",
                              		lv_base_17_0, 
                              		"com.rockwellcollins.Spear.Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,43,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getTypeDefAccess().getLeftSquareBracketKeyword_2_4());
                          
                    }
                    // InternalSpear.g:1625:1: ( (lv_size_19_0= RULE_INT ) )
                    // InternalSpear.g:1626:1: (lv_size_19_0= RULE_INT )
                    {
                    // InternalSpear.g:1626:1: (lv_size_19_0= RULE_INT )
                    // InternalSpear.g:1627:3: lv_size_19_0= RULE_INT
                    {
                    lv_size_19_0=(Token)match(input,RULE_INT,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_size_19_0, grammarAccess.getTypeDefAccess().getSizeINTTerminalRuleCall_2_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"size",
                              		lv_size_19_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getTypeDefAccess().getRightSquareBracketKeyword_2_6());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSpear.g:1648:6: ( () ( (lv_name_22_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_24= 'enum' otherlv_25= '{' ( (lv_values_26_0= ruleEnumValue ) ) (otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) ) )* otherlv_29= '}' )
                    {
                    // InternalSpear.g:1648:6: ( () ( (lv_name_22_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_24= 'enum' otherlv_25= '{' ( (lv_values_26_0= ruleEnumValue ) ) (otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) ) )* otherlv_29= '}' )
                    // InternalSpear.g:1648:7: () ( (lv_name_22_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_24= 'enum' otherlv_25= '{' ( (lv_values_26_0= ruleEnumValue ) ) (otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) ) )* otherlv_29= '}'
                    {
                    // InternalSpear.g:1648:7: ()
                    // InternalSpear.g:1649:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeDefAccess().getEnumTypeDefAction_3_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1654:2: ( (lv_name_22_0= RULE_ID ) )
                    // InternalSpear.g:1655:1: (lv_name_22_0= RULE_ID )
                    {
                    // InternalSpear.g:1655:1: (lv_name_22_0= RULE_ID )
                    // InternalSpear.g:1656:3: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_22_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_22_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefAccess().getIdTypeDelimiterParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_46);
                    ruleIdTypeDelimiter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_24=(Token)match(input,45,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getTypeDefAccess().getEnumKeyword_3_3());
                          
                    }
                    otherlv_25=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_3_4());
                          
                    }
                    // InternalSpear.g:1688:1: ( (lv_values_26_0= ruleEnumValue ) )
                    // InternalSpear.g:1689:1: (lv_values_26_0= ruleEnumValue )
                    {
                    // InternalSpear.g:1689:1: (lv_values_26_0= ruleEnumValue )
                    // InternalSpear.g:1690:3: lv_values_26_0= ruleEnumValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefAccess().getValuesEnumValueParserRuleCall_3_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_42);
                    lv_values_26_0=ruleEnumValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_26_0, 
                              		"com.rockwellcollins.Spear.EnumValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:1706:2: (otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==28) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalSpear.g:1706:4: otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) )
                    	    {
                    	    otherlv_27=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_27, grammarAccess.getTypeDefAccess().getCommaKeyword_3_6_0());
                    	          
                    	    }
                    	    // InternalSpear.g:1710:1: ( (lv_values_28_0= ruleEnumValue ) )
                    	    // InternalSpear.g:1711:1: (lv_values_28_0= ruleEnumValue )
                    	    {
                    	    // InternalSpear.g:1711:1: (lv_values_28_0= ruleEnumValue )
                    	    // InternalSpear.g:1712:3: lv_values_28_0= ruleEnumValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeDefAccess().getValuesEnumValueParserRuleCall_3_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_values_28_0=ruleEnumValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_28_0, 
                    	              		"com.rockwellcollins.Spear.EnumValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_3_7());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleFieldType"
    // InternalSpear.g:1740:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // InternalSpear.g:1741:2: (iv_ruleFieldType= ruleFieldType EOF )
            // InternalSpear.g:1742:2: iv_ruleFieldType= ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalSpear.g:1749:1: ruleFieldType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:1752:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalSpear.g:1753:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalSpear.g:1753:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalSpear.g:1753:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalSpear.g:1753:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpear.g:1754:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSpear.g:1754:1: (lv_name_0_0= RULE_ID )
            // InternalSpear.g:1755:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFieldTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldTypeAccess().getColonKeyword_1());
                  
            }
            // InternalSpear.g:1775:1: ( (lv_type_2_0= ruleType ) )
            // InternalSpear.g:1776:1: (lv_type_2_0= ruleType )
            {
            // InternalSpear.g:1776:1: (lv_type_2_0= ruleType )
            // InternalSpear.g:1777:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldTypeAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldTypeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"com.rockwellcollins.Spear.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleEnumValue"
    // InternalSpear.g:1801:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalSpear.g:1802:2: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalSpear.g:1803:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalSpear.g:1810:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:1813:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSpear.g:1814:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSpear.g:1814:1: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpear.g:1815:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSpear.g:1815:1: (lv_name_0_0= RULE_ID )
            // InternalSpear.g:1816:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleType"
    // InternalSpear.g:1840:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSpear.g:1841:2: (iv_ruleType= ruleType EOF )
            // InternalSpear.g:1842:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSpear.g:1849:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:1852:28: ( ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalSpear.g:1853:1: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalSpear.g:1853:1: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt50=1;
                }
                break;
            case 48:
                {
                alt50=2;
                }
                break;
            case 49:
                {
                alt50=3;
                }
                break;
            case RULE_ID:
                {
                alt50=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalSpear.g:1853:2: ( () otherlv_1= 'int' )
                    {
                    // InternalSpear.g:1853:2: ( () otherlv_1= 'int' )
                    // InternalSpear.g:1853:3: () otherlv_1= 'int'
                    {
                    // InternalSpear.g:1853:3: ()
                    // InternalSpear.g:1854:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getIntTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getIntKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:1864:6: ( () otherlv_3= 'bool' )
                    {
                    // InternalSpear.g:1864:6: ( () otherlv_3= 'bool' )
                    // InternalSpear.g:1864:7: () otherlv_3= 'bool'
                    {
                    // InternalSpear.g:1864:7: ()
                    // InternalSpear.g:1865:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getBoolTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getBoolKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSpear.g:1875:6: ( () otherlv_5= 'real' )
                    {
                    // InternalSpear.g:1875:6: ( () otherlv_5= 'real' )
                    // InternalSpear.g:1875:7: () otherlv_5= 'real'
                    {
                    // InternalSpear.g:1875:7: ()
                    // InternalSpear.g:1876:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getRealTypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getRealKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSpear.g:1886:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalSpear.g:1886:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalSpear.g:1886:7: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalSpear.g:1886:7: ()
                    // InternalSpear.g:1887:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getUserTypeAction_3_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:1892:2: ( (otherlv_7= RULE_ID ) )
                    // InternalSpear.g:1893:1: (otherlv_7= RULE_ID )
                    {
                    // InternalSpear.g:1893:1: (otherlv_7= RULE_ID )
                    // InternalSpear.g:1894:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getDefTypeDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleIdTypeDelimiter"
    // InternalSpear.g:1913:1: entryRuleIdTypeDelimiter returns [String current=null] : iv_ruleIdTypeDelimiter= ruleIdTypeDelimiter EOF ;
    public final String entryRuleIdTypeDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdTypeDelimiter = null;


        try {
            // InternalSpear.g:1914:2: (iv_ruleIdTypeDelimiter= ruleIdTypeDelimiter EOF )
            // InternalSpear.g:1915:2: iv_ruleIdTypeDelimiter= ruleIdTypeDelimiter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdTypeDelimiterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdTypeDelimiter=ruleIdTypeDelimiter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdTypeDelimiter.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdTypeDelimiter"


    // $ANTLR start "ruleIdTypeDelimiter"
    // InternalSpear.g:1922:1: ruleIdTypeDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' | kw= 'is a' | kw= 'is an' ) ;
    public final AntlrDatatypeRuleToken ruleIdTypeDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:1925:28: ( (kw= ':' | kw= 'is a' | kw= 'is an' ) )
            // InternalSpear.g:1926:1: (kw= ':' | kw= 'is a' | kw= 'is an' )
            {
            // InternalSpear.g:1926:1: (kw= ':' | kw= 'is a' | kw= 'is an' )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt51=1;
                }
                break;
            case 50:
                {
                alt51=2;
                }
                break;
            case 51:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalSpear.g:1927:2: kw= ':'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdTypeDelimiterAccess().getColonKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpear.g:1934:2: kw= 'is a'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdTypeDelimiterAccess().getIsAKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSpear.g:1941:2: kw= 'is an'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdTypeDelimiterAccess().getIsAnKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdTypeDelimiter"


    // $ANTLR start "entryRuleConstant"
    // InternalSpear.g:1954:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalSpear.g:1955:2: (iv_ruleConstant= ruleConstant EOF )
            // InternalSpear.g:1956:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalSpear.g:1963:1: ruleConstant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_descriptor_7_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_expr_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:1966:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )? ) )
            // InternalSpear.g:1967:1: ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )? )
            {
            // InternalSpear.g:1967:1: ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )? )
            // InternalSpear.g:1967:2: ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )?
            {
            // InternalSpear.g:1967:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpear.g:1968:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSpear.g:1968:1: (lv_name_0_0= RULE_ID )
            // InternalSpear.g:1969:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstantAccess().getIdTypeDelimiterParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_39);
            ruleIdTypeDelimiter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:1993:1: ( (lv_type_2_0= ruleType ) )
            // InternalSpear.g:1994:1: (lv_type_2_0= ruleType )
            {
            // InternalSpear.g:1994:1: (lv_type_2_0= ruleType )
            // InternalSpear.g:1995:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_31);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"com.rockwellcollins.Spear.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
                  
            }
            // InternalSpear.g:2015:1: ( (lv_expr_4_0= ruleExpr ) )
            // InternalSpear.g:2016:1: (lv_expr_4_0= ruleExpr )
            {
            // InternalSpear.g:2016:1: (lv_expr_4_0= ruleExpr )
            // InternalSpear.g:2017:3: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getExprExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_48);
            lv_expr_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_4_0, 
                      		"com.rockwellcollins.Spear.Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpear.g:2033:2: (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSpear.g:2033:4: otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getTextKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getConstantAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // InternalSpear.g:2041:1: ( (lv_descriptor_7_0= RULE_STRING ) )
                    // InternalSpear.g:2042:1: (lv_descriptor_7_0= RULE_STRING )
                    {
                    // InternalSpear.g:2042:1: (lv_descriptor_7_0= RULE_STRING )
                    // InternalSpear.g:2043:3: lv_descriptor_7_0= RULE_STRING
                    {
                    lv_descriptor_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_descriptor_7_0, grammarAccess.getConstantAccess().getDescriptorSTRINGTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"descriptor",
                              		lv_descriptor_7_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVariable"
    // InternalSpear.g:2067:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSpear.g:2068:2: (iv_ruleVariable= ruleVariable EOF )
            // InternalSpear.g:2069:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSpear.g:2076:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2079:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) ) )
            // InternalSpear.g:2080:1: ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalSpear.g:2080:1: ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) )
            // InternalSpear.g:2080:2: ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) )
            {
            // InternalSpear.g:2080:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpear.g:2081:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSpear.g:2081:1: (lv_name_0_0= RULE_ID )
            // InternalSpear.g:2082:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableAccess().getIdTypeDelimiterParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_39);
            ruleIdTypeDelimiter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:2106:1: ( (lv_type_2_0= ruleType ) )
            // InternalSpear.g:2107:1: (lv_type_2_0= ruleType )
            {
            // InternalSpear.g:2107:1: (lv_type_2_0= ruleType )
            // InternalSpear.g:2108:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"com.rockwellcollins.Spear.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleMacro"
    // InternalSpear.g:2132:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // InternalSpear.g:2133:2: (iv_ruleMacro= ruleMacro EOF )
            // InternalSpear.g:2134:2: iv_ruleMacro= ruleMacro EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMacroRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMacro=ruleMacro();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMacro; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMacro"


    // $ANTLR start "ruleMacro"
    // InternalSpear.g:2141:1: ruleMacro returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleMacro() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_descriptor_7_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_expr_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2144:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )? ) )
            // InternalSpear.g:2145:1: ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )? )
            {
            // InternalSpear.g:2145:1: ( ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )? )
            // InternalSpear.g:2145:2: ( (lv_name_0_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_2_0= ruleType ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )?
            {
            // InternalSpear.g:2145:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpear.g:2146:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSpear.g:2146:1: (lv_name_0_0= RULE_ID )
            // InternalSpear.g:2147:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMacroAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMacroRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMacroAccess().getIdTypeDelimiterParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_39);
            ruleIdTypeDelimiter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:2171:1: ( (lv_type_2_0= ruleType ) )
            // InternalSpear.g:2172:1: (lv_type_2_0= ruleType )
            {
            // InternalSpear.g:2172:1: (lv_type_2_0= ruleType )
            // InternalSpear.g:2173:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMacroAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_31);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMacroRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"com.rockwellcollins.Spear.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMacroAccess().getEqualsSignKeyword_3());
                  
            }
            // InternalSpear.g:2193:1: ( (lv_expr_4_0= ruleExpr ) )
            // InternalSpear.g:2194:1: (lv_expr_4_0= ruleExpr )
            {
            // InternalSpear.g:2194:1: (lv_expr_4_0= ruleExpr )
            // InternalSpear.g:2195:3: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMacroAccess().getExprExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_48);
            lv_expr_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMacroRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_4_0, 
                      		"com.rockwellcollins.Spear.Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpear.g:2211:2: (otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==52) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSpear.g:2211:4: otherlv_5= 'text' otherlv_6= '=' ( (lv_descriptor_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMacroAccess().getTextKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMacroAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // InternalSpear.g:2219:1: ( (lv_descriptor_7_0= RULE_STRING ) )
                    // InternalSpear.g:2220:1: (lv_descriptor_7_0= RULE_STRING )
                    {
                    // InternalSpear.g:2220:1: (lv_descriptor_7_0= RULE_STRING )
                    // InternalSpear.g:2221:3: lv_descriptor_7_0= RULE_STRING
                    {
                    lv_descriptor_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_descriptor_7_0, grammarAccess.getMacroAccess().getDescriptorSTRINGTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMacroRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"descriptor",
                              		lv_descriptor_7_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMacro"


    // $ANTLR start "entryRuleConstraint"
    // InternalSpear.g:2245:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalSpear.g:2246:2: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalSpear.g:2247:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalSpear.g:2254:1: ruleConstraint returns [EObject current=null] : (this_FormalConstraint_0= ruleFormalConstraint | this_EnglishConstraint_1= ruleEnglishConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_FormalConstraint_0 = null;

        EObject this_EnglishConstraint_1 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2257:28: ( (this_FormalConstraint_0= ruleFormalConstraint | this_EnglishConstraint_1= ruleEnglishConstraint ) )
            // InternalSpear.g:2258:1: (this_FormalConstraint_0= ruleFormalConstraint | this_EnglishConstraint_1= ruleEnglishConstraint )
            {
            // InternalSpear.g:2258:1: (this_FormalConstraint_0= ruleFormalConstraint | this_EnglishConstraint_1= ruleEnglishConstraint )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==35) ) {
                    int LA54_2 = input.LA(3);

                    if ( (LA54_2==RULE_STRING) ) {
                        alt54=2;
                    }
                    else if ( (LA54_2==RULE_ID||LA54_2==RULE_INT||LA54_2==27||LA54_2==34||LA54_2==53||LA54_2==60||(LA54_2>=66 && LA54_2<=72)||LA54_2==84||LA54_2==86||LA54_2==88||LA54_2==94||(LA54_2>=96 && LA54_2<=102)) ) {
                        alt54=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalSpear.g:2259:5: this_FormalConstraint_0= ruleFormalConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getFormalConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FormalConstraint_0=ruleFormalConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FormalConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpear.g:2269:5: this_EnglishConstraint_1= ruleEnglishConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getEnglishConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_EnglishConstraint_1=ruleEnglishConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnglishConstraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleFormalConstraint"
    // InternalSpear.g:2285:1: entryRuleFormalConstraint returns [EObject current=null] : iv_ruleFormalConstraint= ruleFormalConstraint EOF ;
    public final EObject entryRuleFormalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalConstraint = null;


        try {
            // InternalSpear.g:2286:2: (iv_ruleFormalConstraint= ruleFormalConstraint EOF )
            // InternalSpear.g:2287:2: iv_ruleFormalConstraint= ruleFormalConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormalConstraint=ruleFormalConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalConstraint"


    // $ANTLR start "ruleFormalConstraint"
    // InternalSpear.g:2294:1: ruleFormalConstraint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) (otherlv_3= 'text' otherlv_4= '=' ( (lv_descriptor_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFormalConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_descriptor_5_0=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2297:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) (otherlv_3= 'text' otherlv_4= '=' ( (lv_descriptor_5_0= RULE_STRING ) ) )? ) )
            // InternalSpear.g:2298:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) (otherlv_3= 'text' otherlv_4= '=' ( (lv_descriptor_5_0= RULE_STRING ) ) )? )
            {
            // InternalSpear.g:2298:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) (otherlv_3= 'text' otherlv_4= '=' ( (lv_descriptor_5_0= RULE_STRING ) ) )? )
            // InternalSpear.g:2298:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) (otherlv_3= 'text' otherlv_4= '=' ( (lv_descriptor_5_0= RULE_STRING ) ) )?
            {
            // InternalSpear.g:2298:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpear.g:2299:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSpear.g:2299:1: (lv_name_0_0= RULE_ID )
            // InternalSpear.g:2300:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFormalConstraintAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFormalConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFormalConstraintAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalSpear.g:2320:1: ( (lv_expr_2_0= ruleExpr ) )
            // InternalSpear.g:2321:1: (lv_expr_2_0= ruleExpr )
            {
            // InternalSpear.g:2321:1: (lv_expr_2_0= ruleExpr )
            // InternalSpear.g:2322:3: lv_expr_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalConstraintAccess().getExprExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_48);
            lv_expr_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormalConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"com.rockwellcollins.Spear.Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpear.g:2338:2: (otherlv_3= 'text' otherlv_4= '=' ( (lv_descriptor_5_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSpear.g:2338:4: otherlv_3= 'text' otherlv_4= '=' ( (lv_descriptor_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFormalConstraintAccess().getTextKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFormalConstraintAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // InternalSpear.g:2346:1: ( (lv_descriptor_5_0= RULE_STRING ) )
                    // InternalSpear.g:2347:1: (lv_descriptor_5_0= RULE_STRING )
                    {
                    // InternalSpear.g:2347:1: (lv_descriptor_5_0= RULE_STRING )
                    // InternalSpear.g:2348:3: lv_descriptor_5_0= RULE_STRING
                    {
                    lv_descriptor_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_descriptor_5_0, grammarAccess.getFormalConstraintAccess().getDescriptorSTRINGTerminalRuleCall_3_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFormalConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"descriptor",
                              		lv_descriptor_5_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalConstraint"


    // $ANTLR start "entryRuleEnglishConstraint"
    // InternalSpear.g:2372:1: entryRuleEnglishConstraint returns [EObject current=null] : iv_ruleEnglishConstraint= ruleEnglishConstraint EOF ;
    public final EObject entryRuleEnglishConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnglishConstraint = null;


        try {
            // InternalSpear.g:2373:2: (iv_ruleEnglishConstraint= ruleEnglishConstraint EOF )
            // InternalSpear.g:2374:2: iv_ruleEnglishConstraint= ruleEnglishConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnglishConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnglishConstraint=ruleEnglishConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnglishConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnglishConstraint"


    // $ANTLR start "ruleEnglishConstraint"
    // InternalSpear.g:2381:1: ruleEnglishConstraint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnglishConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:2384:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) ) ) )
            // InternalSpear.g:2385:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // InternalSpear.g:2385:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) ) )
            // InternalSpear.g:2385:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) )
            {
            // InternalSpear.g:2385:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpear.g:2386:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSpear.g:2386:1: (lv_name_0_0= RULE_ID )
            // InternalSpear.g:2387:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnglishConstraintAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnglishConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnglishConstraintAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalSpear.g:2407:1: ( (lv_text_2_0= RULE_STRING ) )
            // InternalSpear.g:2408:1: (lv_text_2_0= RULE_STRING )
            {
            // InternalSpear.g:2408:1: (lv_text_2_0= RULE_STRING )
            // InternalSpear.g:2409:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_2_0, grammarAccess.getEnglishConstraintAccess().getTextSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnglishConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_2_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnglishConstraint"


    // $ANTLR start "entryRuleExpr"
    // InternalSpear.g:2433:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalSpear.g:2434:2: (iv_ruleExpr= ruleExpr EOF )
            // InternalSpear.g:2435:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalSpear.g:2442:1: ruleExpr returns [EObject current=null] : this_WhileExpr_0= ruleWhileExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_WhileExpr_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2445:28: (this_WhileExpr_0= ruleWhileExpr )
            // InternalSpear.g:2447:5: this_WhileExpr_0= ruleWhileExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAccess().getWhileExprParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_WhileExpr_0=ruleWhileExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_WhileExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleWhileExpr"
    // InternalSpear.g:2463:1: entryRuleWhileExpr returns [EObject current=null] : iv_ruleWhileExpr= ruleWhileExpr EOF ;
    public final EObject entryRuleWhileExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileExpr = null;


        try {
            // InternalSpear.g:2464:2: (iv_ruleWhileExpr= ruleWhileExpr EOF )
            // InternalSpear.g:2465:2: iv_ruleWhileExpr= ruleWhileExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileExpr=ruleWhileExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileExpr"


    // $ANTLR start "ruleWhileExpr"
    // InternalSpear.g:2472:1: ruleWhileExpr returns [EObject current=null] : ( ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleExpr ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpr ) ) ) | this_ImpliesExpr_5= ruleImpliesExpr ) ;
    public final EObject ruleWhileExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cond_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject this_ImpliesExpr_5 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2475:28: ( ( ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleExpr ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpr ) ) ) | this_ImpliesExpr_5= ruleImpliesExpr ) )
            // InternalSpear.g:2476:1: ( ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleExpr ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpr ) ) ) | this_ImpliesExpr_5= ruleImpliesExpr )
            {
            // InternalSpear.g:2476:1: ( ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleExpr ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpr ) ) ) | this_ImpliesExpr_5= ruleImpliesExpr )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==53) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID||LA56_0==RULE_INT||LA56_0==27||LA56_0==34||LA56_0==60||(LA56_0>=66 && LA56_0<=72)||LA56_0==84||LA56_0==86||LA56_0==88||LA56_0==94||(LA56_0>=96 && LA56_0<=102)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalSpear.g:2476:2: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleExpr ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpr ) ) )
                    {
                    // InternalSpear.g:2476:2: ( () otherlv_1= 'while' ( (lv_cond_2_0= ruleExpr ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpr ) ) )
                    // InternalSpear.g:2476:3: () otherlv_1= 'while' ( (lv_cond_2_0= ruleExpr ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpr ) )
                    {
                    // InternalSpear.g:2476:3: ()
                    // InternalSpear.g:2477:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getWhileExprAccess().getWhileExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,53,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getWhileExprAccess().getWhileKeyword_0_1());
                          
                    }
                    // InternalSpear.g:2486:1: ( (lv_cond_2_0= ruleExpr ) )
                    // InternalSpear.g:2487:1: (lv_cond_2_0= ruleExpr )
                    {
                    // InternalSpear.g:2487:1: (lv_cond_2_0= ruleExpr )
                    // InternalSpear.g:2488:3: lv_cond_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhileExprAccess().getCondExprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_49);
                    lv_cond_2_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhileExprRule());
                      	        }
                             		set(
                             			current, 
                             			"cond",
                              		lv_cond_2_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,54,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getWhileExprAccess().getThenKeyword_0_3());
                          
                    }
                    // InternalSpear.g:2508:1: ( (lv_then_4_0= ruleExpr ) )
                    // InternalSpear.g:2509:1: (lv_then_4_0= ruleExpr )
                    {
                    // InternalSpear.g:2509:1: (lv_then_4_0= ruleExpr )
                    // InternalSpear.g:2510:3: lv_then_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhileExprAccess().getThenExprParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_then_4_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhileExprRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_4_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:2528:5: this_ImpliesExpr_5= ruleImpliesExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWhileExprAccess().getImpliesExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ImpliesExpr_5=ruleImpliesExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImpliesExpr_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileExpr"


    // $ANTLR start "entryRuleImpliesExpr"
    // InternalSpear.g:2544:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // InternalSpear.g:2545:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // InternalSpear.g:2546:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImpliesExpr=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpliesExpr"


    // $ANTLR start "ruleImpliesExpr"
    // InternalSpear.g:2553:1: ruleImpliesExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2556:28: ( (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) )
            // InternalSpear.g:2557:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            {
            // InternalSpear.g:2557:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            // InternalSpear.g:2558:5: this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_50);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:2566:1: ( ( ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==55) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred3_InternalSpear()) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==56) ) {
                int LA58_2 = input.LA(2);

                if ( (synpred3_InternalSpear()) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalSpear.g:2566:2: ( ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) )
                    {
                    // InternalSpear.g:2566:2: ( ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) ) )
                    // InternalSpear.g:2566:3: ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) )
                    {
                    // InternalSpear.g:2579:6: ( () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) ) )
                    // InternalSpear.g:2579:7: () ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) )
                    {
                    // InternalSpear.g:2579:7: ()
                    // InternalSpear.g:2580:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:2585:2: ( ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) ) )
                    // InternalSpear.g:2586:1: ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) )
                    {
                    // InternalSpear.g:2586:1: ( (lv_op_2_1= '=>' | lv_op_2_2= 'implies' ) )
                    // InternalSpear.g:2587:1: (lv_op_2_1= '=>' | lv_op_2_2= 'implies' )
                    {
                    // InternalSpear.g:2587:1: (lv_op_2_1= '=>' | lv_op_2_2= 'implies' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==55) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==56) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalSpear.g:2588:3: lv_op_2_1= '=>'
                            {
                            lv_op_2_1=(Token)match(input,55,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getImpliesExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpear.g:2600:8: lv_op_2_2= 'implies'
                            {
                            lv_op_2_2=(Token)match(input,56,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getImpliesExprAccess().getOpImpliesKeyword_1_0_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getImpliesExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // InternalSpear.g:2615:4: ( (lv_right_3_0= ruleImpliesExpr ) )
                    // InternalSpear.g:2616:1: (lv_right_3_0= ruleImpliesExpr )
                    {
                    // InternalSpear.g:2616:1: (lv_right_3_0= ruleImpliesExpr )
                    // InternalSpear.g:2617:3: lv_right_3_0= ruleImpliesExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleImpliesExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImpliesExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.ImpliesExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalSpear.g:2641:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalSpear.g:2642:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalSpear.g:2643:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalSpear.g:2650:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2653:28: ( (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? ) )
            // InternalSpear.g:2654:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? )
            {
            // InternalSpear.g:2654:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? )
            // InternalSpear.g:2655:5: this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_51);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:2663:1: ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==57) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred4_InternalSpear()) ) {
                    alt60=1;
                }
            }
            else if ( (LA60_0==58) ) {
                int LA60_2 = input.LA(2);

                if ( (synpred4_InternalSpear()) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalSpear.g:2663:2: ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) )
                    {
                    // InternalSpear.g:2663:2: ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) )
                    // InternalSpear.g:2663:3: ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) )
                    {
                    // InternalSpear.g:2676:6: ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) )
                    // InternalSpear.g:2676:7: () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) )
                    {
                    // InternalSpear.g:2676:7: ()
                    // InternalSpear.g:2677:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:2682:2: ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) )
                    // InternalSpear.g:2683:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
                    {
                    // InternalSpear.g:2683:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
                    // InternalSpear.g:2684:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
                    {
                    // InternalSpear.g:2684:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==57) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==58) ) {
                        alt59=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalSpear.g:2685:3: lv_op_2_1= 'or'
                            {
                            lv_op_2_1=(Token)match(input,57,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getOrExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpear.g:2697:8: lv_op_2_2= 'xor'
                            {
                            lv_op_2_2=(Token)match(input,58,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getOrExprAccess().getOpXorKeyword_1_0_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getOrExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // InternalSpear.g:2712:4: ( (lv_right_3_0= ruleOrExpr ) )
                    // InternalSpear.g:2713:1: (lv_right_3_0= ruleOrExpr )
                    {
                    // InternalSpear.g:2713:1: (lv_right_3_0= ruleOrExpr )
                    // InternalSpear.g:2714:3: lv_right_3_0= ruleOrExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrExprAccess().getRightOrExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleOrExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.OrExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalSpear.g:2738:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalSpear.g:2739:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalSpear.g:2740:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalSpear.g:2747:1: ruleAndExpr returns [EObject current=null] : (this_AfterUntilExpr_0= ruleAfterUntilExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )? ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AfterUntilExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2750:28: ( (this_AfterUntilExpr_0= ruleAfterUntilExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )? ) )
            // InternalSpear.g:2751:1: (this_AfterUntilExpr_0= ruleAfterUntilExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )? )
            {
            // InternalSpear.g:2751:1: (this_AfterUntilExpr_0= ruleAfterUntilExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )? )
            // InternalSpear.g:2752:5: this_AfterUntilExpr_0= ruleAfterUntilExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExprAccess().getAfterUntilExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_52);
            this_AfterUntilExpr_0=ruleAfterUntilExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AfterUntilExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:2760:1: ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==59) ) {
                int LA61_1 = input.LA(2);

                if ( (synpred5_InternalSpear()) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // InternalSpear.g:2760:2: ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) )
                    {
                    // InternalSpear.g:2760:2: ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) )
                    // InternalSpear.g:2760:3: ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) )
                    {
                    // InternalSpear.g:2767:6: ( () ( (lv_op_2_0= 'and' ) ) )
                    // InternalSpear.g:2767:7: () ( (lv_op_2_0= 'and' ) )
                    {
                    // InternalSpear.g:2767:7: ()
                    // InternalSpear.g:2768:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:2773:2: ( (lv_op_2_0= 'and' ) )
                    // InternalSpear.g:2774:1: (lv_op_2_0= 'and' )
                    {
                    // InternalSpear.g:2774:1: (lv_op_2_0= 'and' )
                    // InternalSpear.g:2775:3: lv_op_2_0= 'and'
                    {
                    lv_op_2_0=(Token)match(input,59,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAndExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "and");
                      	    
                    }

                    }


                    }


                    }


                    }

                    // InternalSpear.g:2788:4: ( (lv_right_3_0= ruleAndExpr ) )
                    // InternalSpear.g:2789:1: (lv_right_3_0= ruleAndExpr )
                    {
                    // InternalSpear.g:2789:1: (lv_right_3_0= ruleAndExpr )
                    // InternalSpear.g:2790:3: lv_right_3_0= ruleAndExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAndExprAccess().getRightAndExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAndExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAndExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.AndExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleAfterUntilExpr"
    // InternalSpear.g:2814:1: entryRuleAfterUntilExpr returns [EObject current=null] : iv_ruleAfterUntilExpr= ruleAfterUntilExpr EOF ;
    public final EObject entryRuleAfterUntilExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterUntilExpr = null;


        try {
            // InternalSpear.g:2815:2: (iv_ruleAfterUntilExpr= ruleAfterUntilExpr EOF )
            // InternalSpear.g:2816:2: iv_ruleAfterUntilExpr= ruleAfterUntilExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAfterUntilExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAfterUntilExpr=ruleAfterUntilExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAfterUntilExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAfterUntilExpr"


    // $ANTLR start "ruleAfterUntilExpr"
    // InternalSpear.g:2823:1: ruleAfterUntilExpr returns [EObject current=null] : ( ( () otherlv_1= 'after' ( (lv_after_2_0= ruleTriggersExpr ) ) ( ( ( 'until' )=>otherlv_3= 'until' ) ( (lv_until_4_0= ruleTriggersExpr ) ) )? ) | this_TriggersExpr_5= ruleTriggersExpr ) ;
    public final EObject ruleAfterUntilExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_after_2_0 = null;

        EObject lv_until_4_0 = null;

        EObject this_TriggersExpr_5 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2826:28: ( ( ( () otherlv_1= 'after' ( (lv_after_2_0= ruleTriggersExpr ) ) ( ( ( 'until' )=>otherlv_3= 'until' ) ( (lv_until_4_0= ruleTriggersExpr ) ) )? ) | this_TriggersExpr_5= ruleTriggersExpr ) )
            // InternalSpear.g:2827:1: ( ( () otherlv_1= 'after' ( (lv_after_2_0= ruleTriggersExpr ) ) ( ( ( 'until' )=>otherlv_3= 'until' ) ( (lv_until_4_0= ruleTriggersExpr ) ) )? ) | this_TriggersExpr_5= ruleTriggersExpr )
            {
            // InternalSpear.g:2827:1: ( ( () otherlv_1= 'after' ( (lv_after_2_0= ruleTriggersExpr ) ) ( ( ( 'until' )=>otherlv_3= 'until' ) ( (lv_until_4_0= ruleTriggersExpr ) ) )? ) | this_TriggersExpr_5= ruleTriggersExpr )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==60) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID||LA63_0==RULE_INT||LA63_0==27||LA63_0==34||(LA63_0>=66 && LA63_0<=72)||LA63_0==84||LA63_0==86||LA63_0==88||LA63_0==94||(LA63_0>=96 && LA63_0<=102)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalSpear.g:2827:2: ( () otherlv_1= 'after' ( (lv_after_2_0= ruleTriggersExpr ) ) ( ( ( 'until' )=>otherlv_3= 'until' ) ( (lv_until_4_0= ruleTriggersExpr ) ) )? )
                    {
                    // InternalSpear.g:2827:2: ( () otherlv_1= 'after' ( (lv_after_2_0= ruleTriggersExpr ) ) ( ( ( 'until' )=>otherlv_3= 'until' ) ( (lv_until_4_0= ruleTriggersExpr ) ) )? )
                    // InternalSpear.g:2827:3: () otherlv_1= 'after' ( (lv_after_2_0= ruleTriggersExpr ) ) ( ( ( 'until' )=>otherlv_3= 'until' ) ( (lv_until_4_0= ruleTriggersExpr ) ) )?
                    {
                    // InternalSpear.g:2827:3: ()
                    // InternalSpear.g:2828:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAfterUntilExprAccess().getAfterUntilExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,60,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAfterUntilExprAccess().getAfterKeyword_0_1());
                          
                    }
                    // InternalSpear.g:2837:1: ( (lv_after_2_0= ruleTriggersExpr ) )
                    // InternalSpear.g:2838:1: (lv_after_2_0= ruleTriggersExpr )
                    {
                    // InternalSpear.g:2838:1: (lv_after_2_0= ruleTriggersExpr )
                    // InternalSpear.g:2839:3: lv_after_2_0= ruleTriggersExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAfterUntilExprAccess().getAfterTriggersExprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_53);
                    lv_after_2_0=ruleTriggersExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAfterUntilExprRule());
                      	        }
                             		set(
                             			current, 
                             			"after",
                              		lv_after_2_0, 
                              		"com.rockwellcollins.Spear.TriggersExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:2855:2: ( ( ( 'until' )=>otherlv_3= 'until' ) ( (lv_until_4_0= ruleTriggersExpr ) ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==61) ) {
                        int LA62_1 = input.LA(2);

                        if ( (synpred6_InternalSpear()) ) {
                            alt62=1;
                        }
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalSpear.g:2855:3: ( ( 'until' )=>otherlv_3= 'until' ) ( (lv_until_4_0= ruleTriggersExpr ) )
                            {
                            // InternalSpear.g:2855:3: ( ( 'until' )=>otherlv_3= 'until' )
                            // InternalSpear.g:2855:4: ( 'until' )=>otherlv_3= 'until'
                            {
                            otherlv_3=(Token)match(input,61,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getAfterUntilExprAccess().getUntilKeyword_0_3_0());
                                  
                            }

                            }

                            // InternalSpear.g:2860:2: ( (lv_until_4_0= ruleTriggersExpr ) )
                            // InternalSpear.g:2861:1: (lv_until_4_0= ruleTriggersExpr )
                            {
                            // InternalSpear.g:2861:1: (lv_until_4_0= ruleTriggersExpr )
                            // InternalSpear.g:2862:3: lv_until_4_0= ruleTriggersExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAfterUntilExprAccess().getUntilTriggersExprParserRuleCall_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_until_4_0=ruleTriggersExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAfterUntilExprRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"until",
                                      		lv_until_4_0, 
                                      		"com.rockwellcollins.Spear.TriggersExpr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:2880:5: this_TriggersExpr_5= ruleTriggersExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAfterUntilExprAccess().getTriggersExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_TriggersExpr_5=ruleTriggersExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TriggersExpr_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAfterUntilExpr"


    // $ANTLR start "entryRuleTriggersExpr"
    // InternalSpear.g:2896:1: entryRuleTriggersExpr returns [EObject current=null] : iv_ruleTriggersExpr= ruleTriggersExpr EOF ;
    public final EObject entryRuleTriggersExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggersExpr = null;


        try {
            // InternalSpear.g:2897:2: (iv_ruleTriggersExpr= ruleTriggersExpr EOF )
            // InternalSpear.g:2898:2: iv_ruleTriggersExpr= ruleTriggersExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggersExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTriggersExpr=ruleTriggersExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriggersExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggersExpr"


    // $ANTLR start "ruleTriggersExpr"
    // InternalSpear.g:2905:1: ruleTriggersExpr returns [EObject current=null] : (this_SinceExpr_0= ruleSinceExpr ( ( ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) ) ) ( (lv_right_3_0= ruleTriggersExpr ) ) )? ) ;
    public final EObject ruleTriggersExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_SinceExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:2908:28: ( (this_SinceExpr_0= ruleSinceExpr ( ( ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) ) ) ( (lv_right_3_0= ruleTriggersExpr ) ) )? ) )
            // InternalSpear.g:2909:1: (this_SinceExpr_0= ruleSinceExpr ( ( ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) ) ) ( (lv_right_3_0= ruleTriggersExpr ) ) )? )
            {
            // InternalSpear.g:2909:1: (this_SinceExpr_0= ruleSinceExpr ( ( ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) ) ) ( (lv_right_3_0= ruleTriggersExpr ) ) )? )
            // InternalSpear.g:2910:5: this_SinceExpr_0= ruleSinceExpr ( ( ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) ) ) ( (lv_right_3_0= ruleTriggersExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTriggersExprAccess().getSinceExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_54);
            this_SinceExpr_0=ruleSinceExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SinceExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:2918:1: ( ( ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) ) ) ( (lv_right_3_0= ruleTriggersExpr ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==62) ) {
                int LA65_1 = input.LA(2);

                if ( (synpred7_InternalSpear()) ) {
                    alt65=1;
                }
            }
            else if ( (LA65_0==63) ) {
                int LA65_2 = input.LA(2);

                if ( (synpred7_InternalSpear()) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalSpear.g:2918:2: ( ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) ) ) ( (lv_right_3_0= ruleTriggersExpr ) )
                    {
                    // InternalSpear.g:2918:2: ( ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) ) )
                    // InternalSpear.g:2918:3: ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) )
                    {
                    // InternalSpear.g:2931:6: ( () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) ) )
                    // InternalSpear.g:2931:7: () ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) )
                    {
                    // InternalSpear.g:2931:7: ()
                    // InternalSpear.g:2932:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getTriggersExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:2937:2: ( ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) ) )
                    // InternalSpear.g:2938:1: ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) )
                    {
                    // InternalSpear.g:2938:1: ( (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' ) )
                    // InternalSpear.g:2939:1: (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' )
                    {
                    // InternalSpear.g:2939:1: (lv_op_2_1= 'T' | lv_op_2_2= 'triggers' )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==62) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==63) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalSpear.g:2940:3: lv_op_2_1= 'T'
                            {
                            lv_op_2_1=(Token)match(input,62,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getTriggersExprAccess().getOpTKeyword_1_0_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTriggersExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpear.g:2952:8: lv_op_2_2= 'triggers'
                            {
                            lv_op_2_2=(Token)match(input,63,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getTriggersExprAccess().getOpTriggersKeyword_1_0_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTriggersExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // InternalSpear.g:2967:4: ( (lv_right_3_0= ruleTriggersExpr ) )
                    // InternalSpear.g:2968:1: (lv_right_3_0= ruleTriggersExpr )
                    {
                    // InternalSpear.g:2968:1: (lv_right_3_0= ruleTriggersExpr )
                    // InternalSpear.g:2969:3: lv_right_3_0= ruleTriggersExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTriggersExprAccess().getRightTriggersExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleTriggersExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTriggersExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.TriggersExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggersExpr"


    // $ANTLR start "entryRuleSinceExpr"
    // InternalSpear.g:2993:1: entryRuleSinceExpr returns [EObject current=null] : iv_ruleSinceExpr= ruleSinceExpr EOF ;
    public final EObject entryRuleSinceExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinceExpr = null;


        try {
            // InternalSpear.g:2994:2: (iv_ruleSinceExpr= ruleSinceExpr EOF )
            // InternalSpear.g:2995:2: iv_ruleSinceExpr= ruleSinceExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSinceExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSinceExpr=ruleSinceExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSinceExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSinceExpr"


    // $ANTLR start "ruleSinceExpr"
    // InternalSpear.g:3002:1: ruleSinceExpr returns [EObject current=null] : (this_TemporalPrefixExpr_0= ruleTemporalPrefixExpr ( ( ( ( () ( ( ( 'S' | 'since' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) ) ) ( (lv_right_3_0= ruleSinceExpr ) ) )? ) ;
    public final EObject ruleSinceExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TemporalPrefixExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:3005:28: ( (this_TemporalPrefixExpr_0= ruleTemporalPrefixExpr ( ( ( ( () ( ( ( 'S' | 'since' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) ) ) ( (lv_right_3_0= ruleSinceExpr ) ) )? ) )
            // InternalSpear.g:3006:1: (this_TemporalPrefixExpr_0= ruleTemporalPrefixExpr ( ( ( ( () ( ( ( 'S' | 'since' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) ) ) ( (lv_right_3_0= ruleSinceExpr ) ) )? )
            {
            // InternalSpear.g:3006:1: (this_TemporalPrefixExpr_0= ruleTemporalPrefixExpr ( ( ( ( () ( ( ( 'S' | 'since' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) ) ) ( (lv_right_3_0= ruleSinceExpr ) ) )? )
            // InternalSpear.g:3007:5: this_TemporalPrefixExpr_0= ruleTemporalPrefixExpr ( ( ( ( () ( ( ( 'S' | 'since' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) ) ) ( (lv_right_3_0= ruleSinceExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSinceExprAccess().getTemporalPrefixExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_55);
            this_TemporalPrefixExpr_0=ruleTemporalPrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TemporalPrefixExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:3015:1: ( ( ( ( () ( ( ( 'S' | 'since' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) ) ) ( (lv_right_3_0= ruleSinceExpr ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==64) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred8_InternalSpear()) ) {
                    alt67=1;
                }
            }
            else if ( (LA67_0==65) ) {
                int LA67_2 = input.LA(2);

                if ( (synpred8_InternalSpear()) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // InternalSpear.g:3015:2: ( ( ( () ( ( ( 'S' | 'since' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) ) ) ( (lv_right_3_0= ruleSinceExpr ) )
                    {
                    // InternalSpear.g:3015:2: ( ( ( () ( ( ( 'S' | 'since' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) ) )
                    // InternalSpear.g:3015:3: ( ( () ( ( ( 'S' | 'since' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) )
                    {
                    // InternalSpear.g:3028:6: ( () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) ) )
                    // InternalSpear.g:3028:7: () ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) )
                    {
                    // InternalSpear.g:3028:7: ()
                    // InternalSpear.g:3029:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getSinceExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:3034:2: ( ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) ) )
                    // InternalSpear.g:3035:1: ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) )
                    {
                    // InternalSpear.g:3035:1: ( (lv_op_2_1= 'S' | lv_op_2_2= 'since' ) )
                    // InternalSpear.g:3036:1: (lv_op_2_1= 'S' | lv_op_2_2= 'since' )
                    {
                    // InternalSpear.g:3036:1: (lv_op_2_1= 'S' | lv_op_2_2= 'since' )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==64) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==65) ) {
                        alt66=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalSpear.g:3037:3: lv_op_2_1= 'S'
                            {
                            lv_op_2_1=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getSinceExprAccess().getOpSKeyword_1_0_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSinceExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpear.g:3049:8: lv_op_2_2= 'since'
                            {
                            lv_op_2_2=(Token)match(input,65,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getSinceExprAccess().getOpSinceKeyword_1_0_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSinceExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // InternalSpear.g:3064:4: ( (lv_right_3_0= ruleSinceExpr ) )
                    // InternalSpear.g:3065:1: (lv_right_3_0= ruleSinceExpr )
                    {
                    // InternalSpear.g:3065:1: (lv_right_3_0= ruleSinceExpr )
                    // InternalSpear.g:3066:3: lv_right_3_0= ruleSinceExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSinceExprAccess().getRightSinceExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleSinceExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSinceExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.SinceExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSinceExpr"


    // $ANTLR start "entryRuleTemporalPrefixExpr"
    // InternalSpear.g:3090:1: entryRuleTemporalPrefixExpr returns [EObject current=null] : iv_ruleTemporalPrefixExpr= ruleTemporalPrefixExpr EOF ;
    public final EObject entryRuleTemporalPrefixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPrefixExpr = null;


        try {
            // InternalSpear.g:3091:2: (iv_ruleTemporalPrefixExpr= ruleTemporalPrefixExpr EOF )
            // InternalSpear.g:3092:2: iv_ruleTemporalPrefixExpr= ruleTemporalPrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalPrefixExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTemporalPrefixExpr=ruleTemporalPrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalPrefixExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalPrefixExpr"


    // $ANTLR start "ruleTemporalPrefixExpr"
    // InternalSpear.g:3099:1: ruleTemporalPrefixExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) ) ) ( (lv_expr_2_0= ruleTemporalPrefixExpr ) ) ) | this_RelationalExpr_3= ruleRelationalExpr ) ;
    public final EObject ruleTemporalPrefixExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        Token lv_op_1_4=null;
        Token lv_op_1_5=null;
        Token lv_op_1_6=null;
        Token lv_op_1_7=null;
        EObject lv_expr_2_0 = null;

        EObject this_RelationalExpr_3 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:3102:28: ( ( ( () ( ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) ) ) ( (lv_expr_2_0= ruleTemporalPrefixExpr ) ) ) | this_RelationalExpr_3= ruleRelationalExpr ) )
            // InternalSpear.g:3103:1: ( ( () ( ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) ) ) ( (lv_expr_2_0= ruleTemporalPrefixExpr ) ) ) | this_RelationalExpr_3= ruleRelationalExpr )
            {
            // InternalSpear.g:3103:1: ( ( () ( ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) ) ) ( (lv_expr_2_0= ruleTemporalPrefixExpr ) ) ) | this_RelationalExpr_3= ruleRelationalExpr )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=66 && LA69_0<=72)) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ID||LA69_0==RULE_INT||LA69_0==27||LA69_0==34||LA69_0==84||LA69_0==86||LA69_0==88||LA69_0==94||(LA69_0>=96 && LA69_0<=102)) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalSpear.g:3103:2: ( () ( ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) ) ) ( (lv_expr_2_0= ruleTemporalPrefixExpr ) ) )
                    {
                    // InternalSpear.g:3103:2: ( () ( ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) ) ) ( (lv_expr_2_0= ruleTemporalPrefixExpr ) ) )
                    // InternalSpear.g:3103:3: () ( ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) ) ) ( (lv_expr_2_0= ruleTemporalPrefixExpr ) )
                    {
                    // InternalSpear.g:3103:3: ()
                    // InternalSpear.g:3104:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTemporalPrefixExprAccess().getUnaryExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:3109:2: ( ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) ) )
                    // InternalSpear.g:3110:1: ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) )
                    {
                    // InternalSpear.g:3110:1: ( (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' ) )
                    // InternalSpear.g:3111:1: (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' )
                    {
                    // InternalSpear.g:3111:1: (lv_op_1_1= 'O' | lv_op_1_2= 'once' | lv_op_1_3= 'H' | lv_op_1_4= 'historically' | lv_op_1_5= 'never' | lv_op_1_6= 'before' | lv_op_1_7= 'initially' )
                    int alt68=7;
                    switch ( input.LA(1) ) {
                    case 66:
                        {
                        alt68=1;
                        }
                        break;
                    case 67:
                        {
                        alt68=2;
                        }
                        break;
                    case 68:
                        {
                        alt68=3;
                        }
                        break;
                    case 69:
                        {
                        alt68=4;
                        }
                        break;
                    case 70:
                        {
                        alt68=5;
                        }
                        break;
                    case 71:
                        {
                        alt68=6;
                        }
                        break;
                    case 72:
                        {
                        alt68=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // InternalSpear.g:3112:3: lv_op_1_1= 'O'
                            {
                            lv_op_1_1=(Token)match(input,66,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_1, grammarAccess.getTemporalPrefixExprAccess().getOpOKeyword_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTemporalPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpear.g:3124:8: lv_op_1_2= 'once'
                            {
                            lv_op_1_2=(Token)match(input,67,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_2, grammarAccess.getTemporalPrefixExprAccess().getOpOnceKeyword_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTemporalPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // InternalSpear.g:3136:8: lv_op_1_3= 'H'
                            {
                            lv_op_1_3=(Token)match(input,68,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_3, grammarAccess.getTemporalPrefixExprAccess().getOpHKeyword_0_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTemporalPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // InternalSpear.g:3148:8: lv_op_1_4= 'historically'
                            {
                            lv_op_1_4=(Token)match(input,69,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_4, grammarAccess.getTemporalPrefixExprAccess().getOpHistoricallyKeyword_0_1_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTemporalPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // InternalSpear.g:3160:8: lv_op_1_5= 'never'
                            {
                            lv_op_1_5=(Token)match(input,70,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_5, grammarAccess.getTemporalPrefixExprAccess().getOpNeverKeyword_0_1_0_4());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTemporalPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_5, null);
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // InternalSpear.g:3172:8: lv_op_1_6= 'before'
                            {
                            lv_op_1_6=(Token)match(input,71,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_6, grammarAccess.getTemporalPrefixExprAccess().getOpBeforeKeyword_0_1_0_5());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTemporalPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_6, null);
                              	    
                            }

                            }
                            break;
                        case 7 :
                            // InternalSpear.g:3184:8: lv_op_1_7= 'initially'
                            {
                            lv_op_1_7=(Token)match(input,72,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_7, grammarAccess.getTemporalPrefixExprAccess().getOpInitiallyKeyword_0_1_0_6());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTemporalPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_7, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalSpear.g:3199:2: ( (lv_expr_2_0= ruleTemporalPrefixExpr ) )
                    // InternalSpear.g:3200:1: (lv_expr_2_0= ruleTemporalPrefixExpr )
                    {
                    // InternalSpear.g:3200:1: (lv_expr_2_0= ruleTemporalPrefixExpr )
                    // InternalSpear.g:3201:3: lv_expr_2_0= ruleTemporalPrefixExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrefixExprAccess().getExprTemporalPrefixExprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleTemporalPrefixExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemporalPrefixExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"com.rockwellcollins.Spear.TemporalPrefixExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:3219:5: this_RelationalExpr_3= ruleRelationalExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemporalPrefixExprAccess().getRelationalExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationalExpr_3=ruleRelationalExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RelationalExpr_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalPrefixExpr"


    // $ANTLR start "entryRuleRelationalExpr"
    // InternalSpear.g:3235:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // InternalSpear.g:3236:2: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // InternalSpear.g:3237:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpr=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpr"


    // $ANTLR start "ruleRelationalExpr"
    // InternalSpear.g:3244:1: ruleRelationalExpr returns [EObject current=null] : (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )? ) ;
    public final EObject ruleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject this_PlusExpr_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:3247:28: ( (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )? ) )
            // InternalSpear.g:3248:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )? )
            {
            // InternalSpear.g:3248:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )? )
            // InternalSpear.g:3249:5: this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_56);
            this_PlusExpr_0=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:3257:1: ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // InternalSpear.g:3257:2: ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) )
                    {
                    // InternalSpear.g:3257:2: ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) )
                    // InternalSpear.g:3257:3: ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) )
                    {
                    // InternalSpear.g:3262:6: ( () ( (lv_op_2_0= ruleRelationalOp ) ) )
                    // InternalSpear.g:3262:7: () ( (lv_op_2_0= ruleRelationalOp ) )
                    {
                    // InternalSpear.g:3262:7: ()
                    // InternalSpear.g:3263:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:3268:2: ( (lv_op_2_0= ruleRelationalOp ) )
                    // InternalSpear.g:3269:1: (lv_op_2_0= ruleRelationalOp )
                    {
                    // InternalSpear.g:3269:1: (lv_op_2_0= ruleRelationalOp )
                    // InternalSpear.g:3270:3: lv_op_2_0= ruleRelationalOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExprAccess().getOpRelationalOpParserRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_32);
                    lv_op_2_0=ruleRelationalOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"com.rockwellcollins.Spear.RelationalOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // InternalSpear.g:3286:4: ( (lv_right_3_0= ruleRelationalExpr ) )
                    // InternalSpear.g:3287:1: (lv_right_3_0= ruleRelationalExpr )
                    {
                    // InternalSpear.g:3287:1: (lv_right_3_0= ruleRelationalExpr )
                    // InternalSpear.g:3288:3: lv_right_3_0= ruleRelationalExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExprAccess().getRightRelationalExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleRelationalExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.RelationalExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpr"


    // $ANTLR start "entryRuleRelationalOp"
    // InternalSpear.g:3312:1: entryRuleRelationalOp returns [String current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final String entryRuleRelationalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOp = null;


        try {
            // InternalSpear.g:3313:2: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalSpear.g:3314:2: iv_ruleRelationalOp= ruleRelationalOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOp=ruleRelationalOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // InternalSpear.g:3321:1: ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | (kw= 'less' kw= 'than' ) | kw= '<=' | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '>' | (kw= 'greater' kw= 'than' ) | kw= '>=' | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '==' | (kw= 'equal' kw= 'to' ) | kw= '<>' | (kw= 'not' kw= 'equal' kw= 'to' ) ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:3324:28: ( (kw= '<' | (kw= 'less' kw= 'than' ) | kw= '<=' | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '>' | (kw= 'greater' kw= 'than' ) | kw= '>=' | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '==' | (kw= 'equal' kw= 'to' ) | kw= '<>' | (kw= 'not' kw= 'equal' kw= 'to' ) ) )
            // InternalSpear.g:3325:1: (kw= '<' | (kw= 'less' kw= 'than' ) | kw= '<=' | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '>' | (kw= 'greater' kw= 'than' ) | kw= '>=' | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '==' | (kw= 'equal' kw= 'to' ) | kw= '<>' | (kw= 'not' kw= 'equal' kw= 'to' ) )
            {
            // InternalSpear.g:3325:1: (kw= '<' | (kw= 'less' kw= 'than' ) | kw= '<=' | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '>' | (kw= 'greater' kw= 'than' ) | kw= '>=' | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '==' | (kw= 'equal' kw= 'to' ) | kw= '<>' | (kw= 'not' kw= 'equal' kw= 'to' ) )
            int alt71=12;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalSpear.g:3326:2: kw= '<'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpear.g:3332:6: (kw= 'less' kw= 'than' )
                    {
                    // InternalSpear.g:3332:6: (kw= 'less' kw= 'than' )
                    // InternalSpear.g:3333:2: kw= 'less' kw= 'than'
                    {
                    kw=(Token)match(input,74,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getThanKeyword_1_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSpear.g:3346:2: kw= '<='
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSpear.g:3352:6: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalSpear.g:3352:6: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalSpear.g:3353:2: kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,74,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessKeyword_3_0()); 
                          
                    }
                    kw=(Token)match(input,75,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getThanKeyword_3_1()); 
                          
                    }
                    kw=(Token)match(input,57,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getOrKeyword_3_2()); 
                          
                    }
                    kw=(Token)match(input,77,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualKeyword_3_3()); 
                          
                    }
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getToKeyword_3_4()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSpear.g:3384:2: kw= '>'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalSpear.g:3390:6: (kw= 'greater' kw= 'than' )
                    {
                    // InternalSpear.g:3390:6: (kw= 'greater' kw= 'than' )
                    // InternalSpear.g:3391:2: kw= 'greater' kw= 'than'
                    {
                    kw=(Token)match(input,80,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterKeyword_5_0()); 
                          
                    }
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getThanKeyword_5_1()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSpear.g:3404:2: kw= '>='
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalSpear.g:3410:6: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalSpear.g:3410:6: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalSpear.g:3411:2: kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,80,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterKeyword_7_0()); 
                          
                    }
                    kw=(Token)match(input,75,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getThanKeyword_7_1()); 
                          
                    }
                    kw=(Token)match(input,57,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getOrKeyword_7_2()); 
                          
                    }
                    kw=(Token)match(input,77,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualKeyword_7_3()); 
                          
                    }
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getToKeyword_7_4()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSpear.g:3442:2: kw= '=='
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualsSignEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalSpear.g:3448:6: (kw= 'equal' kw= 'to' )
                    {
                    // InternalSpear.g:3448:6: (kw= 'equal' kw= 'to' )
                    // InternalSpear.g:3449:2: kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,77,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualKeyword_9_0()); 
                          
                    }
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getToKeyword_9_1()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalSpear.g:3462:2: kw= '<>'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignGreaterThanSignKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // InternalSpear.g:3468:6: (kw= 'not' kw= 'equal' kw= 'to' )
                    {
                    // InternalSpear.g:3468:6: (kw= 'not' kw= 'equal' kw= 'to' )
                    // InternalSpear.g:3469:2: kw= 'not' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,84,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getNotKeyword_11_0()); 
                          
                    }
                    kw=(Token)match(input,77,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualKeyword_11_1()); 
                          
                    }
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getToKeyword_11_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRulePlusExpr"
    // InternalSpear.g:3494:1: entryRulePlusExpr returns [EObject current=null] : iv_rulePlusExpr= rulePlusExpr EOF ;
    public final EObject entryRulePlusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusExpr = null;


        try {
            // InternalSpear.g:3495:2: (iv_rulePlusExpr= rulePlusExpr EOF )
            // InternalSpear.g:3496:2: iv_rulePlusExpr= rulePlusExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusExpr=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusExpr"


    // $ANTLR start "rulePlusExpr"
    // InternalSpear.g:3503:1: rulePlusExpr returns [EObject current=null] : (this_MultiplyExpr_0= ruleMultiplyExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) ;
    public final EObject rulePlusExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultiplyExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:3506:28: ( (this_MultiplyExpr_0= ruleMultiplyExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) )
            // InternalSpear.g:3507:1: (this_MultiplyExpr_0= ruleMultiplyExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            {
            // InternalSpear.g:3507:1: (this_MultiplyExpr_0= ruleMultiplyExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            // InternalSpear.g:3508:5: this_MultiplyExpr_0= ruleMultiplyExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusExprAccess().getMultiplyExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_61);
            this_MultiplyExpr_0=ruleMultiplyExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplyExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:3516:1: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==85) ) {
                int LA73_1 = input.LA(2);

                if ( (synpred10_InternalSpear()) ) {
                    alt73=1;
                }
            }
            else if ( (LA73_0==86) ) {
                int LA73_2 = input.LA(2);

                if ( (synpred10_InternalSpear()) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // InternalSpear.g:3516:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) )
                    {
                    // InternalSpear.g:3516:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) )
                    // InternalSpear.g:3516:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
                    {
                    // InternalSpear.g:3529:6: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
                    // InternalSpear.g:3529:7: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
                    {
                    // InternalSpear.g:3529:7: ()
                    // InternalSpear.g:3530:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:3535:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
                    // InternalSpear.g:3536:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    {
                    // InternalSpear.g:3536:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    // InternalSpear.g:3537:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    {
                    // InternalSpear.g:3537:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==85) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==86) ) {
                        alt72=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalSpear.g:3538:3: lv_op_2_1= '+'
                            {
                            lv_op_2_1=(Token)match(input,85,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPlusExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpear.g:3550:8: lv_op_2_2= '-'
                            {
                            lv_op_2_2=(Token)match(input,86,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPlusExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // InternalSpear.g:3565:4: ( (lv_right_3_0= rulePlusExpr ) )
                    // InternalSpear.g:3566:1: (lv_right_3_0= rulePlusExpr )
                    {
                    // InternalSpear.g:3566:1: (lv_right_3_0= rulePlusExpr )
                    // InternalSpear.g:3567:3: lv_right_3_0= rulePlusExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlusExprAccess().getRightPlusExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=rulePlusExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPlusExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.PlusExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusExpr"


    // $ANTLR start "entryRuleMultiplyExpr"
    // InternalSpear.g:3591:1: entryRuleMultiplyExpr returns [EObject current=null] : iv_ruleMultiplyExpr= ruleMultiplyExpr EOF ;
    public final EObject entryRuleMultiplyExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplyExpr = null;


        try {
            // InternalSpear.g:3592:2: (iv_ruleMultiplyExpr= ruleMultiplyExpr EOF )
            // InternalSpear.g:3593:2: iv_ruleMultiplyExpr= ruleMultiplyExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplyExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplyExpr=ruleMultiplyExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplyExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplyExpr"


    // $ANTLR start "ruleMultiplyExpr"
    // InternalSpear.g:3600:1: ruleMultiplyExpr returns [EObject current=null] : (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpr ) ) )? ) ;
    public final EObject ruleMultiplyExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_PrefixExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:3603:28: ( (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpr ) ) )? ) )
            // InternalSpear.g:3604:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpr ) ) )? )
            {
            // InternalSpear.g:3604:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpr ) ) )? )
            // InternalSpear.g:3605:5: this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplyExprAccess().getPrefixExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_62);
            this_PrefixExpr_0=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrefixExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:3613:1: ( ( ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpr ) ) )?
            int alt75=2;
            switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA75_1 = input.LA(2);

                    if ( (synpred11_InternalSpear()) ) {
                        alt75=1;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA75_2 = input.LA(2);

                    if ( (synpred11_InternalSpear()) ) {
                        alt75=1;
                    }
                    }
                    break;
                case 87:
                    {
                    int LA75_3 = input.LA(2);

                    if ( (synpred11_InternalSpear()) ) {
                        alt75=1;
                    }
                    }
                    break;
            }

            switch (alt75) {
                case 1 :
                    // InternalSpear.g:3613:2: ( ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpr ) )
                    {
                    // InternalSpear.g:3613:2: ( ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ) )
                    // InternalSpear.g:3613:3: ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) )
                    {
                    // InternalSpear.g:3629:6: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) )
                    // InternalSpear.g:3629:7: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
                    {
                    // InternalSpear.g:3629:7: ()
                    // InternalSpear.g:3630:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getMultiplyExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:3635:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
                    // InternalSpear.g:3636:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
                    {
                    // InternalSpear.g:3636:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
                    // InternalSpear.g:3637:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
                    {
                    // InternalSpear.g:3637:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
                    int alt74=3;
                    switch ( input.LA(1) ) {
                    case 38:
                        {
                        alt74=1;
                        }
                        break;
                    case 39:
                        {
                        alt74=2;
                        }
                        break;
                    case 87:
                        {
                        alt74=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }

                    switch (alt74) {
                        case 1 :
                            // InternalSpear.g:3638:3: lv_op_2_1= '*'
                            {
                            lv_op_2_1=(Token)match(input,38,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getMultiplyExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getMultiplyExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpear.g:3650:8: lv_op_2_2= '/'
                            {
                            lv_op_2_2=(Token)match(input,39,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getMultiplyExprAccess().getOpSolidusKeyword_1_0_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getMultiplyExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // InternalSpear.g:3662:8: lv_op_2_3= 'mod'
                            {
                            lv_op_2_3=(Token)match(input,87,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_3, grammarAccess.getMultiplyExprAccess().getOpModKeyword_1_0_0_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getMultiplyExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // InternalSpear.g:3677:4: ( (lv_right_3_0= ruleMultiplyExpr ) )
                    // InternalSpear.g:3678:1: (lv_right_3_0= ruleMultiplyExpr )
                    {
                    // InternalSpear.g:3678:1: (lv_right_3_0= ruleMultiplyExpr )
                    // InternalSpear.g:3679:3: lv_right_3_0= ruleMultiplyExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplyExprAccess().getRightMultiplyExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleMultiplyExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplyExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"com.rockwellcollins.Spear.MultiplyExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplyExpr"


    // $ANTLR start "entryRulePrefixExpr"
    // InternalSpear.g:3703:1: entryRulePrefixExpr returns [EObject current=null] : iv_rulePrefixExpr= rulePrefixExpr EOF ;
    public final EObject entryRulePrefixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixExpr = null;


        try {
            // InternalSpear.g:3704:2: (iv_rulePrefixExpr= rulePrefixExpr EOF )
            // InternalSpear.g:3705:2: iv_rulePrefixExpr= rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixExpr=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixExpr"


    // $ANTLR start "rulePrefixExpr"
    // InternalSpear.g:3712:1: rulePrefixExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | ( () otherlv_4= 'previous' ( (lv_var_5_0= rulePrefixExpr ) ) ( ( ( 'with' )=>otherlv_6= 'with' ) otherlv_7= 'initial' otherlv_8= 'value' ( (lv_init_9_0= rulePrefixExpr ) ) )? ) | this_AccessExpr_10= ruleAccessExpr ) ;
    public final EObject rulePrefixExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_expr_2_0 = null;

        EObject lv_var_5_0 = null;

        EObject lv_init_9_0 = null;

        EObject this_AccessExpr_10 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:3715:28: ( ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | ( () otherlv_4= 'previous' ( (lv_var_5_0= rulePrefixExpr ) ) ( ( ( 'with' )=>otherlv_6= 'with' ) otherlv_7= 'initial' otherlv_8= 'value' ( (lv_init_9_0= rulePrefixExpr ) ) )? ) | this_AccessExpr_10= ruleAccessExpr ) )
            // InternalSpear.g:3716:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | ( () otherlv_4= 'previous' ( (lv_var_5_0= rulePrefixExpr ) ) ( ( ( 'with' )=>otherlv_6= 'with' ) otherlv_7= 'initial' otherlv_8= 'value' ( (lv_init_9_0= rulePrefixExpr ) ) )? ) | this_AccessExpr_10= ruleAccessExpr )
            {
            // InternalSpear.g:3716:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | ( () otherlv_4= 'previous' ( (lv_var_5_0= rulePrefixExpr ) ) ( ( ( 'with' )=>otherlv_6= 'with' ) otherlv_7= 'initial' otherlv_8= 'value' ( (lv_init_9_0= rulePrefixExpr ) ) )? ) | this_AccessExpr_10= ruleAccessExpr )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 84:
            case 86:
                {
                alt78=1;
                }
                break;
            case 88:
                {
                alt78=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 27:
            case 34:
            case 94:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
                {
                alt78=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalSpear.g:3716:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    {
                    // InternalSpear.g:3716:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    // InternalSpear.g:3716:3: () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) )
                    {
                    // InternalSpear.g:3716:3: ()
                    // InternalSpear.g:3717:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:3722:2: ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) ) )
                    // InternalSpear.g:3723:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) )
                    {
                    // InternalSpear.g:3723:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' ) )
                    // InternalSpear.g:3724:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' )
                    {
                    // InternalSpear.g:3724:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==86) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==84) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalSpear.g:3725:3: lv_op_1_1= '-'
                            {
                            lv_op_1_1=(Token)match(input,86,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_1, grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpear.g:3737:8: lv_op_1_2= 'not'
                            {
                            lv_op_1_2=(Token)match(input,84,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_2, grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalSpear.g:3752:2: ( (lv_expr_2_0= rulePrefixExpr ) )
                    // InternalSpear.g:3753:1: (lv_expr_2_0= rulePrefixExpr )
                    {
                    // InternalSpear.g:3753:1: (lv_expr_2_0= rulePrefixExpr )
                    // InternalSpear.g:3754:3: lv_expr_2_0= rulePrefixExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=rulePrefixExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"com.rockwellcollins.Spear.PrefixExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:3771:6: ( () otherlv_4= 'previous' ( (lv_var_5_0= rulePrefixExpr ) ) ( ( ( 'with' )=>otherlv_6= 'with' ) otherlv_7= 'initial' otherlv_8= 'value' ( (lv_init_9_0= rulePrefixExpr ) ) )? )
                    {
                    // InternalSpear.g:3771:6: ( () otherlv_4= 'previous' ( (lv_var_5_0= rulePrefixExpr ) ) ( ( ( 'with' )=>otherlv_6= 'with' ) otherlv_7= 'initial' otherlv_8= 'value' ( (lv_init_9_0= rulePrefixExpr ) ) )? )
                    // InternalSpear.g:3771:7: () otherlv_4= 'previous' ( (lv_var_5_0= rulePrefixExpr ) ) ( ( ( 'with' )=>otherlv_6= 'with' ) otherlv_7= 'initial' otherlv_8= 'value' ( (lv_init_9_0= rulePrefixExpr ) ) )?
                    {
                    // InternalSpear.g:3771:7: ()
                    // InternalSpear.g:3772:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixExprAccess().getPreviousExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,88,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrefixExprAccess().getPreviousKeyword_1_1());
                          
                    }
                    // InternalSpear.g:3781:1: ( (lv_var_5_0= rulePrefixExpr ) )
                    // InternalSpear.g:3782:1: (lv_var_5_0= rulePrefixExpr )
                    {
                    // InternalSpear.g:3782:1: (lv_var_5_0= rulePrefixExpr )
                    // InternalSpear.g:3783:3: lv_var_5_0= rulePrefixExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixExprAccess().getVarPrefixExprParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_63);
                    lv_var_5_0=rulePrefixExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixExprRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_5_0, 
                              		"com.rockwellcollins.Spear.PrefixExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:3799:2: ( ( ( 'with' )=>otherlv_6= 'with' ) otherlv_7= 'initial' otherlv_8= 'value' ( (lv_init_9_0= rulePrefixExpr ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==89) ) {
                        int LA77_1 = input.LA(2);

                        if ( (synpred12_InternalSpear()) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalSpear.g:3799:3: ( ( 'with' )=>otherlv_6= 'with' ) otherlv_7= 'initial' otherlv_8= 'value' ( (lv_init_9_0= rulePrefixExpr ) )
                            {
                            // InternalSpear.g:3799:3: ( ( 'with' )=>otherlv_6= 'with' )
                            // InternalSpear.g:3799:4: ( 'with' )=>otherlv_6= 'with'
                            {
                            otherlv_6=(Token)match(input,89,FOLLOW_64); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getPrefixExprAccess().getWithKeyword_1_3_0());
                                  
                            }

                            }

                            otherlv_7=(Token)match(input,90,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getPrefixExprAccess().getInitialKeyword_1_3_1());
                                  
                            }
                            otherlv_8=(Token)match(input,91,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrefixExprAccess().getValueKeyword_1_3_2());
                                  
                            }
                            // InternalSpear.g:3812:1: ( (lv_init_9_0= rulePrefixExpr ) )
                            // InternalSpear.g:3813:1: (lv_init_9_0= rulePrefixExpr )
                            {
                            // InternalSpear.g:3813:1: (lv_init_9_0= rulePrefixExpr )
                            // InternalSpear.g:3814:3: lv_init_9_0= rulePrefixExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrefixExprAccess().getInitPrefixExprParserRuleCall_1_3_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_init_9_0=rulePrefixExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrefixExprRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"init",
                                      		lv_init_9_0, 
                                      		"com.rockwellcollins.Spear.PrefixExpr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpear.g:3832:5: this_AccessExpr_10= ruleAccessExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixExprAccess().getAccessExprParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_AccessExpr_10=ruleAccessExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AccessExpr_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixExpr"


    // $ANTLR start "entryRuleAccessExpr"
    // InternalSpear.g:3848:1: entryRuleAccessExpr returns [EObject current=null] : iv_ruleAccessExpr= ruleAccessExpr EOF ;
    public final EObject entryRuleAccessExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessExpr = null;


        try {
            // InternalSpear.g:3849:2: (iv_ruleAccessExpr= ruleAccessExpr EOF )
            // InternalSpear.g:3850:2: iv_ruleAccessExpr= ruleAccessExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAccessExpr=ruleAccessExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessExpr"


    // $ANTLR start "ruleAccessExpr"
    // InternalSpear.g:3857:1: ruleAccessExpr returns [EObject current=null] : (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )* ) ;
    public final EObject ruleAccessExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject this_AtomicExpr_0 = null;

        EObject lv_value_8_0 = null;

        EObject lv_index_12_0 = null;

        EObject lv_value_15_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:3860:28: ( (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )* ) )
            // InternalSpear.g:3861:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )* )
            {
            // InternalSpear.g:3861:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )* )
            // InternalSpear.g:3862:5: this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAccessExprAccess().getAtomicExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_66);
            this_AtomicExpr_0=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AtomicExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpear.g:3870:1: ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )*
            loop80:
            do {
                int alt80=4;
                switch ( input.LA(1) ) {
                case 92:
                    {
                    int LA80_2 = input.LA(2);

                    if ( (synpred13_InternalSpear()) ) {
                        alt80=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA80_3 = input.LA(2);

                    if ( (synpred14_InternalSpear()) ) {
                        alt80=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA80_4 = input.LA(2);

                    if ( (synpred15_InternalSpear()) ) {
                        alt80=3;
                    }


                    }
                    break;

                }

                switch (alt80) {
            	case 1 :
            	    // InternalSpear.g:3870:2: ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalSpear.g:3870:2: ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalSpear.g:3870:3: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalSpear.g:3870:3: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) )
            	    // InternalSpear.g:3870:4: ( ( () '.' ) )=> ( () otherlv_2= '.' )
            	    {
            	    // InternalSpear.g:3872:5: ( () otherlv_2= '.' )
            	    // InternalSpear.g:3872:6: () otherlv_2= '.'
            	    {
            	    // InternalSpear.g:3872:6: ()
            	    // InternalSpear.g:3873:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,92,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAccessExprAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // InternalSpear.g:3882:3: ( (otherlv_3= RULE_ID ) )
            	    // InternalSpear.g:3883:1: (otherlv_3= RULE_ID )
            	    {
            	    // InternalSpear.g:3883:1: (otherlv_3= RULE_ID )
            	    // InternalSpear.g:3884:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAccessExprRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getAccessExprAccess().getFieldFieldTypeCrossReference_1_0_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSpear.g:3896:6: ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' )
            	    {
            	    // InternalSpear.g:3896:6: ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' )
            	    // InternalSpear.g:3896:7: ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}'
            	    {
            	    // InternalSpear.g:3896:7: ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) )
            	    // InternalSpear.g:3896:8: ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' )
            	    {
            	    // InternalSpear.g:3904:5: ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' )
            	    // InternalSpear.g:3904:6: () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':='
            	    {
            	    // InternalSpear.g:3904:6: ()
            	    // InternalSpear.g:3905:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_5=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getAccessExprAccess().getLeftCurlyBracketKeyword_1_1_0_0_1());
            	          
            	    }
            	    // InternalSpear.g:3914:1: ( (otherlv_6= RULE_ID ) )
            	    // InternalSpear.g:3915:1: (otherlv_6= RULE_ID )
            	    {
            	    // InternalSpear.g:3915:1: (otherlv_6= RULE_ID )
            	    // InternalSpear.g:3916:3: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAccessExprRule());
            	      	        }
            	              
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_6, grammarAccess.getAccessExprAccess().getFieldFieldTypeCrossReference_1_1_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,93,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getAccessExprAccess().getColonEqualsSignKeyword_1_1_0_0_3());
            	          
            	    }

            	    }


            	    }

            	    // InternalSpear.g:3931:3: ( (lv_value_8_0= ruleExpr ) )
            	    // InternalSpear.g:3932:1: (lv_value_8_0= ruleExpr )
            	    {
            	    // InternalSpear.g:3932:1: (lv_value_8_0= ruleExpr )
            	    // InternalSpear.g:3933:3: lv_value_8_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExprAccess().getValueExprParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_68);
            	    lv_value_8_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAccessExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_8_0, 
            	              		"com.rockwellcollins.Spear.Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,42,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getAccessExprAccess().getRightCurlyBracketKeyword_1_1_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSpear.g:3954:6: ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' )
            	    {
            	    // InternalSpear.g:3954:6: ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' )
            	    // InternalSpear.g:3954:7: ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']'
            	    {
            	    // InternalSpear.g:3954:7: ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) )
            	    // InternalSpear.g:3954:8: ( ( () '[' ) )=> ( () otherlv_11= '[' )
            	    {
            	    // InternalSpear.g:3956:5: ( () otherlv_11= '[' )
            	    // InternalSpear.g:3956:6: () otherlv_11= '['
            	    {
            	    // InternalSpear.g:3956:6: ()
            	    // InternalSpear.g:3957:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_11=(Token)match(input,43,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getAccessExprAccess().getLeftSquareBracketKeyword_1_2_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // InternalSpear.g:3966:3: ( (lv_index_12_0= ruleExpr ) )
            	    // InternalSpear.g:3967:1: (lv_index_12_0= ruleExpr )
            	    {
            	    // InternalSpear.g:3967:1: (lv_index_12_0= ruleExpr )
            	    // InternalSpear.g:3968:3: lv_index_12_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExprAccess().getIndexExprParserRuleCall_1_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_69);
            	    lv_index_12_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAccessExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"index",
            	              		lv_index_12_0, 
            	              		"com.rockwellcollins.Spear.Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalSpear.g:3984:2: ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==93) && (synpred16_InternalSpear())) {
            	        alt79=1;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // InternalSpear.g:3984:3: ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) )
            	            {
            	            // InternalSpear.g:3984:3: ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) )
            	            // InternalSpear.g:3984:4: ( ( () ':=' ) )=> ( () otherlv_14= ':=' )
            	            {
            	            // InternalSpear.g:3986:5: ( () otherlv_14= ':=' )
            	            // InternalSpear.g:3986:6: () otherlv_14= ':='
            	            {
            	            // InternalSpear.g:3986:6: ()
            	            // InternalSpear.g:3987:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAccessExprAccess().getArrayUpdateExprAccessAction_1_2_2_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_14=(Token)match(input,93,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getAccessExprAccess().getColonEqualsSignKeyword_1_2_2_0_0_1());
            	                  
            	            }

            	            }


            	            }

            	            // InternalSpear.g:3996:3: ( (lv_value_15_0= ruleExpr ) )
            	            // InternalSpear.g:3997:1: (lv_value_15_0= ruleExpr )
            	            {
            	            // InternalSpear.g:3997:1: (lv_value_15_0= ruleExpr )
            	            // InternalSpear.g:3998:3: lv_value_15_0= ruleExpr
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAccessExprAccess().getValueExprParserRuleCall_1_2_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_45);
            	            lv_value_15_0=ruleExpr();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getAccessExprRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"value",
            	                      		lv_value_15_0, 
            	                      		"com.rockwellcollins.Spear.Expr");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,44,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getAccessExprAccess().getRightSquareBracketKeyword_1_2_3());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // InternalSpear.g:4026:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // InternalSpear.g:4027:2: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // InternalSpear.g:4028:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpr=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpr"


    // $ANTLR start "ruleAtomicExpr"
    // InternalSpear.g:4035:1: ruleAtomicExpr returns [EObject current=null] : (this_LiteralExpr_0= ruleLiteralExpr | ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '|' ) | ( () otherlv_10= 'if' ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_then_13_0= ruleExpr ) ) ( ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) ) )? ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) otherlv_19= '{' ( (lv_fieldExprs_20_0= ruleFieldExpr ) ) (otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) ) )* otherlv_23= '}' ) | ( () otherlv_25= 'new' ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (lv_exprs_28_0= ruleExpr ) ) (otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) ) )* otherlv_31= '}' ) | ( () otherlv_33= 'new' ( (otherlv_34= RULE_ID ) ) otherlv_35= '[' ( (lv_exprs_36_0= ruleExpr ) ) (otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) ) )* otherlv_39= ']' ) | ( () ( (otherlv_41= RULE_ID ) ) otherlv_42= '(' ( (lv_args_43_0= ruleExpr ) ) (otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) ) )* otherlv_46= ')' ) | ( () otherlv_48= 'spec' ( (otherlv_49= RULE_ID ) ) otherlv_50= '(' ( (lv_args_51_0= ruleExpr ) ) (otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) ) )* otherlv_54= ')' ) | this_UnusedExpr_55= ruleUnusedExpr | (otherlv_56= '(' this_Expr_57= ruleExpr otherlv_58= ')' ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        EObject this_LiteralExpr_0 = null;

        EObject lv_cond_11_0 = null;

        EObject lv_then_13_0 = null;

        EObject lv_else_15_0 = null;

        EObject lv_fieldExprs_20_0 = null;

        EObject lv_fieldExprs_22_0 = null;

        EObject lv_exprs_28_0 = null;

        EObject lv_exprs_30_0 = null;

        EObject lv_exprs_36_0 = null;

        EObject lv_exprs_38_0 = null;

        EObject lv_args_43_0 = null;

        EObject lv_args_45_0 = null;

        EObject lv_args_51_0 = null;

        EObject lv_args_53_0 = null;

        EObject this_UnusedExpr_55 = null;

        EObject this_Expr_57 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:4038:28: ( (this_LiteralExpr_0= ruleLiteralExpr | ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '|' ) | ( () otherlv_10= 'if' ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_then_13_0= ruleExpr ) ) ( ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) ) )? ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) otherlv_19= '{' ( (lv_fieldExprs_20_0= ruleFieldExpr ) ) (otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) ) )* otherlv_23= '}' ) | ( () otherlv_25= 'new' ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (lv_exprs_28_0= ruleExpr ) ) (otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) ) )* otherlv_31= '}' ) | ( () otherlv_33= 'new' ( (otherlv_34= RULE_ID ) ) otherlv_35= '[' ( (lv_exprs_36_0= ruleExpr ) ) (otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) ) )* otherlv_39= ']' ) | ( () ( (otherlv_41= RULE_ID ) ) otherlv_42= '(' ( (lv_args_43_0= ruleExpr ) ) (otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) ) )* otherlv_46= ')' ) | ( () otherlv_48= 'spec' ( (otherlv_49= RULE_ID ) ) otherlv_50= '(' ( (lv_args_51_0= ruleExpr ) ) (otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) ) )* otherlv_54= ')' ) | this_UnusedExpr_55= ruleUnusedExpr | (otherlv_56= '(' this_Expr_57= ruleExpr otherlv_58= ')' ) ) )
            // InternalSpear.g:4039:1: (this_LiteralExpr_0= ruleLiteralExpr | ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '|' ) | ( () otherlv_10= 'if' ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_then_13_0= ruleExpr ) ) ( ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) ) )? ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) otherlv_19= '{' ( (lv_fieldExprs_20_0= ruleFieldExpr ) ) (otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) ) )* otherlv_23= '}' ) | ( () otherlv_25= 'new' ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (lv_exprs_28_0= ruleExpr ) ) (otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) ) )* otherlv_31= '}' ) | ( () otherlv_33= 'new' ( (otherlv_34= RULE_ID ) ) otherlv_35= '[' ( (lv_exprs_36_0= ruleExpr ) ) (otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) ) )* otherlv_39= ']' ) | ( () ( (otherlv_41= RULE_ID ) ) otherlv_42= '(' ( (lv_args_43_0= ruleExpr ) ) (otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) ) )* otherlv_46= ')' ) | ( () otherlv_48= 'spec' ( (otherlv_49= RULE_ID ) ) otherlv_50= '(' ( (lv_args_51_0= ruleExpr ) ) (otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) ) )* otherlv_54= ')' ) | this_UnusedExpr_55= ruleUnusedExpr | (otherlv_56= '(' this_Expr_57= ruleExpr otherlv_58= ')' ) )
            {
            // InternalSpear.g:4039:1: (this_LiteralExpr_0= ruleLiteralExpr | ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '|' ) | ( () otherlv_10= 'if' ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_then_13_0= ruleExpr ) ) ( ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) ) )? ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) otherlv_19= '{' ( (lv_fieldExprs_20_0= ruleFieldExpr ) ) (otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) ) )* otherlv_23= '}' ) | ( () otherlv_25= 'new' ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (lv_exprs_28_0= ruleExpr ) ) (otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) ) )* otherlv_31= '}' ) | ( () otherlv_33= 'new' ( (otherlv_34= RULE_ID ) ) otherlv_35= '[' ( (lv_exprs_36_0= ruleExpr ) ) (otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) ) )* otherlv_39= ']' ) | ( () ( (otherlv_41= RULE_ID ) ) otherlv_42= '(' ( (lv_args_43_0= ruleExpr ) ) (otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) ) )* otherlv_46= ')' ) | ( () otherlv_48= 'spec' ( (otherlv_49= RULE_ID ) ) otherlv_50= '(' ( (lv_args_51_0= ruleExpr ) ) (otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) ) )* otherlv_54= ')' ) | this_UnusedExpr_55= ruleUnusedExpr | (otherlv_56= '(' this_Expr_57= ruleExpr otherlv_58= ')' ) )
            int alt88=11;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // InternalSpear.g:4040:5: this_LiteralExpr_0= ruleLiteralExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getLiteralExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralExpr_0=ruleLiteralExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpear.g:4049:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalSpear.g:4049:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    // InternalSpear.g:4049:7: () ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalSpear.g:4049:7: ()
                    // InternalSpear.g:4050:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIdExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:4055:2: ( (otherlv_2= RULE_ID ) )
                    // InternalSpear.g:4056:1: (otherlv_2= RULE_ID )
                    {
                    // InternalSpear.g:4056:1: (otherlv_2= RULE_ID )
                    // InternalSpear.g:4057:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getAtomicExprAccess().getIdIdRefCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpear.g:4069:6: ( () otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '|' )
                    {
                    // InternalSpear.g:4069:6: ( () otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '|' )
                    // InternalSpear.g:4069:7: () otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '|'
                    {
                    // InternalSpear.g:4069:7: ()
                    // InternalSpear.g:4070:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getMultipleIdExprAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExprAccess().getVerticalLineKeyword_2_1());
                          
                    }
                    // InternalSpear.g:4079:1: ( (otherlv_5= RULE_ID ) )
                    // InternalSpear.g:4080:1: (otherlv_5= RULE_ID )
                    {
                    // InternalSpear.g:4080:1: (otherlv_5= RULE_ID )
                    // InternalSpear.g:4081:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getAtomicExprAccess().getIdsIdRefCrossReference_2_2_0()); 
                      	
                    }

                    }


                    }

                    // InternalSpear.g:4092:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==28) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalSpear.g:4092:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getAtomicExprAccess().getCommaKeyword_2_3_0());
                    	          
                    	    }
                    	    // InternalSpear.g:4096:1: ( (otherlv_7= RULE_ID ) )
                    	    // InternalSpear.g:4097:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalSpear.g:4097:1: (otherlv_7= RULE_ID )
                    	    // InternalSpear.g:4098:3: otherlv_7= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_7, grammarAccess.getAtomicExprAccess().getIdsIdRefCrossReference_2_3_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getAtomicExprAccess().getVerticalLineKeyword_2_4());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSpear.g:4114:6: ( () otherlv_10= 'if' ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_then_13_0= ruleExpr ) ) ( ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) ) )? )
                    {
                    // InternalSpear.g:4114:6: ( () otherlv_10= 'if' ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_then_13_0= ruleExpr ) ) ( ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) ) )? )
                    // InternalSpear.g:4114:7: () otherlv_10= 'if' ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_then_13_0= ruleExpr ) ) ( ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) ) )?
                    {
                    // InternalSpear.g:4114:7: ()
                    // InternalSpear.g:4115:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIfThenElseExprAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_10=(Token)match(input,94,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getAtomicExprAccess().getIfKeyword_3_1());
                          
                    }
                    // InternalSpear.g:4124:1: ( (lv_cond_11_0= ruleExpr ) )
                    // InternalSpear.g:4125:1: (lv_cond_11_0= ruleExpr )
                    {
                    // InternalSpear.g:4125:1: (lv_cond_11_0= ruleExpr )
                    // InternalSpear.g:4126:3: lv_cond_11_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_49);
                    lv_cond_11_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"cond",
                              		lv_cond_11_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,54,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getAtomicExprAccess().getThenKeyword_3_3());
                          
                    }
                    // InternalSpear.g:4146:1: ( (lv_then_13_0= ruleExpr ) )
                    // InternalSpear.g:4147:1: (lv_then_13_0= ruleExpr )
                    {
                    // InternalSpear.g:4147:1: (lv_then_13_0= ruleExpr )
                    // InternalSpear.g:4148:3: lv_then_13_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_3_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_70);
                    lv_then_13_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_13_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:4164:2: ( ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==95) ) {
                        int LA82_1 = input.LA(2);

                        if ( (synpred17_InternalSpear()) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalSpear.g:4164:3: ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) )
                            {
                            // InternalSpear.g:4164:3: ( ( 'else' )=>otherlv_14= 'else' )
                            // InternalSpear.g:4164:4: ( 'else' )=>otherlv_14= 'else'
                            {
                            otherlv_14=(Token)match(input,95,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getAtomicExprAccess().getElseKeyword_3_5_0());
                                  
                            }

                            }

                            // InternalSpear.g:4169:2: ( (lv_else_15_0= ruleExpr ) )
                            // InternalSpear.g:4170:1: (lv_else_15_0= ruleExpr )
                            {
                            // InternalSpear.g:4170:1: (lv_else_15_0= ruleExpr )
                            // InternalSpear.g:4171:3: lv_else_15_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_3_5_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_else_15_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"else",
                                      		lv_else_15_0, 
                                      		"com.rockwellcollins.Spear.Expr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSpear.g:4188:6: ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) otherlv_19= '{' ( (lv_fieldExprs_20_0= ruleFieldExpr ) ) (otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) ) )* otherlv_23= '}' )
                    {
                    // InternalSpear.g:4188:6: ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) otherlv_19= '{' ( (lv_fieldExprs_20_0= ruleFieldExpr ) ) (otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) ) )* otherlv_23= '}' )
                    // InternalSpear.g:4188:7: () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) otherlv_19= '{' ( (lv_fieldExprs_20_0= ruleFieldExpr ) ) (otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) ) )* otherlv_23= '}'
                    {
                    // InternalSpear.g:4188:7: ()
                    // InternalSpear.g:4189:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRecordExprAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,96,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAtomicExprAccess().getNewKeyword_4_1());
                          
                    }
                    // InternalSpear.g:4198:1: ( (otherlv_18= RULE_ID ) )
                    // InternalSpear.g:4199:1: (otherlv_18= RULE_ID )
                    {
                    // InternalSpear.g:4199:1: (otherlv_18= RULE_ID )
                    // InternalSpear.g:4200:3: otherlv_18= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_18, grammarAccess.getAtomicExprAccess().getTypeRecordTypeDefCrossReference_4_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_4_3());
                          
                    }
                    // InternalSpear.g:4215:1: ( (lv_fieldExprs_20_0= ruleFieldExpr ) )
                    // InternalSpear.g:4216:1: (lv_fieldExprs_20_0= ruleFieldExpr )
                    {
                    // InternalSpear.g:4216:1: (lv_fieldExprs_20_0= ruleFieldExpr )
                    // InternalSpear.g:4217:3: lv_fieldExprs_20_0= ruleFieldExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getFieldExprsFieldExprParserRuleCall_4_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_42);
                    lv_fieldExprs_20_0=ruleFieldExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"fieldExprs",
                              		lv_fieldExprs_20_0, 
                              		"com.rockwellcollins.Spear.FieldExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:4233:2: (otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==28) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalSpear.g:4233:4: otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) )
                    	    {
                    	    otherlv_21=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_21, grammarAccess.getAtomicExprAccess().getCommaKeyword_4_5_0());
                    	          
                    	    }
                    	    // InternalSpear.g:4237:1: ( (lv_fieldExprs_22_0= ruleFieldExpr ) )
                    	    // InternalSpear.g:4238:1: (lv_fieldExprs_22_0= ruleFieldExpr )
                    	    {
                    	    // InternalSpear.g:4238:1: (lv_fieldExprs_22_0= ruleFieldExpr )
                    	    // InternalSpear.g:4239:3: lv_fieldExprs_22_0= ruleFieldExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getFieldExprsFieldExprParserRuleCall_4_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_fieldExprs_22_0=ruleFieldExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"fieldExprs",
                    	              		lv_fieldExprs_22_0, 
                    	              		"com.rockwellcollins.Spear.FieldExpr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_4_6());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSpear.g:4260:6: ( () otherlv_25= 'new' ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (lv_exprs_28_0= ruleExpr ) ) (otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) ) )* otherlv_31= '}' )
                    {
                    // InternalSpear.g:4260:6: ( () otherlv_25= 'new' ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (lv_exprs_28_0= ruleExpr ) ) (otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) ) )* otherlv_31= '}' )
                    // InternalSpear.g:4260:7: () otherlv_25= 'new' ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (lv_exprs_28_0= ruleExpr ) ) (otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) ) )* otherlv_31= '}'
                    {
                    // InternalSpear.g:4260:7: ()
                    // InternalSpear.g:4261:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getFieldlessRecordExprAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_25=(Token)match(input,96,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getAtomicExprAccess().getNewKeyword_5_1());
                          
                    }
                    // InternalSpear.g:4270:1: ( (otherlv_26= RULE_ID ) )
                    // InternalSpear.g:4271:1: (otherlv_26= RULE_ID )
                    {
                    // InternalSpear.g:4271:1: (otherlv_26= RULE_ID )
                    // InternalSpear.g:4272:3: otherlv_26= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_26, grammarAccess.getAtomicExprAccess().getTypeRecordTypeDefCrossReference_5_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,41,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_5_3());
                          
                    }
                    // InternalSpear.g:4287:1: ( (lv_exprs_28_0= ruleExpr ) )
                    // InternalSpear.g:4288:1: (lv_exprs_28_0= ruleExpr )
                    {
                    // InternalSpear.g:4288:1: (lv_exprs_28_0= ruleExpr )
                    // InternalSpear.g:4289:3: lv_exprs_28_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_42);
                    lv_exprs_28_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"exprs",
                              		lv_exprs_28_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:4305:2: (otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==28) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalSpear.g:4305:4: otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) )
                    	    {
                    	    otherlv_29=(Token)match(input,28,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_29, grammarAccess.getAtomicExprAccess().getCommaKeyword_5_5_0());
                    	          
                    	    }
                    	    // InternalSpear.g:4309:1: ( (lv_exprs_30_0= ruleExpr ) )
                    	    // InternalSpear.g:4310:1: (lv_exprs_30_0= ruleExpr )
                    	    {
                    	    // InternalSpear.g:4310:1: (lv_exprs_30_0= ruleExpr )
                    	    // InternalSpear.g:4311:3: lv_exprs_30_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_5_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_exprs_30_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exprs",
                    	              		lv_exprs_30_0, 
                    	              		"com.rockwellcollins.Spear.Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_5_6());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSpear.g:4332:6: ( () otherlv_33= 'new' ( (otherlv_34= RULE_ID ) ) otherlv_35= '[' ( (lv_exprs_36_0= ruleExpr ) ) (otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) ) )* otherlv_39= ']' )
                    {
                    // InternalSpear.g:4332:6: ( () otherlv_33= 'new' ( (otherlv_34= RULE_ID ) ) otherlv_35= '[' ( (lv_exprs_36_0= ruleExpr ) ) (otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) ) )* otherlv_39= ']' )
                    // InternalSpear.g:4332:7: () otherlv_33= 'new' ( (otherlv_34= RULE_ID ) ) otherlv_35= '[' ( (lv_exprs_36_0= ruleExpr ) ) (otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) ) )* otherlv_39= ']'
                    {
                    // InternalSpear.g:4332:7: ()
                    // InternalSpear.g:4333:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getArrayExprAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_33=(Token)match(input,96,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getAtomicExprAccess().getNewKeyword_6_1());
                          
                    }
                    // InternalSpear.g:4342:1: ( (otherlv_34= RULE_ID ) )
                    // InternalSpear.g:4343:1: (otherlv_34= RULE_ID )
                    {
                    // InternalSpear.g:4343:1: (otherlv_34= RULE_ID )
                    // InternalSpear.g:4344:3: otherlv_34= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_34=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_34, grammarAccess.getAtomicExprAccess().getTypeArrayTypeDefCrossReference_6_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,43,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getAtomicExprAccess().getLeftSquareBracketKeyword_6_3());
                          
                    }
                    // InternalSpear.g:4359:1: ( (lv_exprs_36_0= ruleExpr ) )
                    // InternalSpear.g:4360:1: (lv_exprs_36_0= ruleExpr )
                    {
                    // InternalSpear.g:4360:1: (lv_exprs_36_0= ruleExpr )
                    // InternalSpear.g:4361:3: lv_exprs_36_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_71);
                    lv_exprs_36_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"exprs",
                              		lv_exprs_36_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:4377:2: (otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==28) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalSpear.g:4377:4: otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) )
                    	    {
                    	    otherlv_37=(Token)match(input,28,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_37, grammarAccess.getAtomicExprAccess().getCommaKeyword_6_5_0());
                    	          
                    	    }
                    	    // InternalSpear.g:4381:1: ( (lv_exprs_38_0= ruleExpr ) )
                    	    // InternalSpear.g:4382:1: (lv_exprs_38_0= ruleExpr )
                    	    {
                    	    // InternalSpear.g:4382:1: (lv_exprs_38_0= ruleExpr )
                    	    // InternalSpear.g:4383:3: lv_exprs_38_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_71);
                    	    lv_exprs_38_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exprs",
                    	              		lv_exprs_38_0, 
                    	              		"com.rockwellcollins.Spear.Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getAtomicExprAccess().getRightSquareBracketKeyword_6_6());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSpear.g:4404:6: ( () ( (otherlv_41= RULE_ID ) ) otherlv_42= '(' ( (lv_args_43_0= ruleExpr ) ) (otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) ) )* otherlv_46= ')' )
                    {
                    // InternalSpear.g:4404:6: ( () ( (otherlv_41= RULE_ID ) ) otherlv_42= '(' ( (lv_args_43_0= ruleExpr ) ) (otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) ) )* otherlv_46= ')' )
                    // InternalSpear.g:4404:7: () ( (otherlv_41= RULE_ID ) ) otherlv_42= '(' ( (lv_args_43_0= ruleExpr ) ) (otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) ) )* otherlv_46= ')'
                    {
                    // InternalSpear.g:4404:7: ()
                    // InternalSpear.g:4405:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getPatternCallAction_7_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:4410:2: ( (otherlv_41= RULE_ID ) )
                    // InternalSpear.g:4411:1: (otherlv_41= RULE_ID )
                    {
                    // InternalSpear.g:4411:1: (otherlv_41= RULE_ID )
                    // InternalSpear.g:4412:3: otherlv_41= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_41=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_41, grammarAccess.getAtomicExprAccess().getPatternPatternCrossReference_7_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_42=(Token)match(input,27,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // InternalSpear.g:4427:1: ( (lv_args_43_0= ruleExpr ) )
                    // InternalSpear.g:4428:1: (lv_args_43_0= ruleExpr )
                    {
                    // InternalSpear.g:4428:1: (lv_args_43_0= ruleExpr )
                    // InternalSpear.g:4429:3: lv_args_43_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
                    lv_args_43_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_43_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:4445:2: (otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==28) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalSpear.g:4445:4: otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) )
                    	    {
                    	    otherlv_44=(Token)match(input,28,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_44, grammarAccess.getAtomicExprAccess().getCommaKeyword_7_4_0());
                    	          
                    	    }
                    	    // InternalSpear.g:4449:1: ( (lv_args_45_0= ruleExpr ) )
                    	    // InternalSpear.g:4450:1: (lv_args_45_0= ruleExpr )
                    	    {
                    	    // InternalSpear.g:4450:1: (lv_args_45_0= ruleExpr )
                    	    // InternalSpear.g:4451:3: lv_args_45_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_7_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_args_45_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_45_0, 
                    	              		"com.rockwellcollins.Spear.Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_5());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSpear.g:4472:6: ( () otherlv_48= 'spec' ( (otherlv_49= RULE_ID ) ) otherlv_50= '(' ( (lv_args_51_0= ruleExpr ) ) (otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) ) )* otherlv_54= ')' )
                    {
                    // InternalSpear.g:4472:6: ( () otherlv_48= 'spec' ( (otherlv_49= RULE_ID ) ) otherlv_50= '(' ( (lv_args_51_0= ruleExpr ) ) (otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) ) )* otherlv_54= ')' )
                    // InternalSpear.g:4472:7: () otherlv_48= 'spec' ( (otherlv_49= RULE_ID ) ) otherlv_50= '(' ( (lv_args_51_0= ruleExpr ) ) (otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) ) )* otherlv_54= ')'
                    {
                    // InternalSpear.g:4472:7: ()
                    // InternalSpear.g:4473:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getSpecificationCallAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_48=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_48, grammarAccess.getAtomicExprAccess().getSpecKeyword_8_1());
                          
                    }
                    // InternalSpear.g:4482:1: ( (otherlv_49= RULE_ID ) )
                    // InternalSpear.g:4483:1: (otherlv_49= RULE_ID )
                    {
                    // InternalSpear.g:4483:1: (otherlv_49= RULE_ID )
                    // InternalSpear.g:4484:3: otherlv_49= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_49=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_49, grammarAccess.getAtomicExprAccess().getSpecSpecificationCrossReference_8_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_50=(Token)match(input,27,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_50, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_3());
                          
                    }
                    // InternalSpear.g:4499:1: ( (lv_args_51_0= ruleExpr ) )
                    // InternalSpear.g:4500:1: (lv_args_51_0= ruleExpr )
                    {
                    // InternalSpear.g:4500:1: (lv_args_51_0= ruleExpr )
                    // InternalSpear.g:4501:3: lv_args_51_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_8_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
                    lv_args_51_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_51_0, 
                              		"com.rockwellcollins.Spear.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:4517:2: (otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==28) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalSpear.g:4517:4: otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) )
                    	    {
                    	    otherlv_52=(Token)match(input,28,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_52, grammarAccess.getAtomicExprAccess().getCommaKeyword_8_5_0());
                    	          
                    	    }
                    	    // InternalSpear.g:4521:1: ( (lv_args_53_0= ruleExpr ) )
                    	    // InternalSpear.g:4522:1: (lv_args_53_0= ruleExpr )
                    	    {
                    	    // InternalSpear.g:4522:1: (lv_args_53_0= ruleExpr )
                    	    // InternalSpear.g:4523:3: lv_args_53_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_8_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_args_53_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_53_0, 
                    	              		"com.rockwellcollins.Spear.Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_54=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_54, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_8_6());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalSpear.g:4545:5: this_UnusedExpr_55= ruleUnusedExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getUnusedExprParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_UnusedExpr_55=ruleUnusedExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnusedExpr_55; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalSpear.g:4554:6: (otherlv_56= '(' this_Expr_57= ruleExpr otherlv_58= ')' )
                    {
                    // InternalSpear.g:4554:6: (otherlv_56= '(' this_Expr_57= ruleExpr otherlv_58= ')' )
                    // InternalSpear.g:4554:8: otherlv_56= '(' this_Expr_57= ruleExpr otherlv_58= ')'
                    {
                    otherlv_56=(Token)match(input,27,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_56, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_10_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_10_1()); 
                          
                    }
                    pushFollow(FOLLOW_38);
                    this_Expr_57=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expr_57; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_58=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_58, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_10_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpr"


    // $ANTLR start "entryRuleLiteralExpr"
    // InternalSpear.g:4579:1: entryRuleLiteralExpr returns [EObject current=null] : iv_ruleLiteralExpr= ruleLiteralExpr EOF ;
    public final EObject entryRuleLiteralExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpr = null;


        try {
            // InternalSpear.g:4580:2: (iv_ruleLiteralExpr= ruleLiteralExpr EOF )
            // InternalSpear.g:4581:2: iv_ruleLiteralExpr= ruleLiteralExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpr=ruleLiteralExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpr"


    // $ANTLR start "ruleLiteralExpr"
    // InternalSpear.g:4588:1: ruleLiteralExpr returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) )? ) | ( () ( (lv_value_4_0= ruleBOOL ) ) ) | ( () ( (lv_value_6_0= ruleREAL ) ) ( (otherlv_7= RULE_ID ) )? ) ) ;
    public final EObject ruleLiteralExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:4591:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) )? ) | ( () ( (lv_value_4_0= ruleBOOL ) ) ) | ( () ( (lv_value_6_0= ruleREAL ) ) ( (otherlv_7= RULE_ID ) )? ) ) )
            // InternalSpear.g:4592:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) )? ) | ( () ( (lv_value_4_0= ruleBOOL ) ) ) | ( () ( (lv_value_6_0= ruleREAL ) ) ( (otherlv_7= RULE_ID ) )? ) )
            {
            // InternalSpear.g:4592:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) )? ) | ( () ( (lv_value_4_0= ruleBOOL ) ) ) | ( () ( (lv_value_6_0= ruleREAL ) ) ( (otherlv_7= RULE_ID ) )? ) )
            int alt91=3;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_INT) ) {
                int LA91_1 = input.LA(2);

                if ( (LA91_1==92) ) {
                    int LA91_3 = input.LA(3);

                    if ( (LA91_3==RULE_ID) ) {
                        alt91=1;
                    }
                    else if ( (LA91_3==RULE_INT) ) {
                        alt91=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA91_1==EOF||LA91_1==RULE_ID||(LA91_1>=16 && LA91_1<=17)||(LA91_1>=21 && LA91_1<=23)||(LA91_1>=28 && LA91_1<=29)||(LA91_1>=33 && LA91_1<=34)||(LA91_1>=36 && LA91_1<=39)||(LA91_1>=41 && LA91_1<=44)||LA91_1==52||(LA91_1>=54 && LA91_1<=59)||(LA91_1>=61 && LA91_1<=65)||(LA91_1>=73 && LA91_1<=74)||(LA91_1>=76 && LA91_1<=77)||(LA91_1>=79 && LA91_1<=87)||LA91_1==89||LA91_1==93||LA91_1==95) ) {
                    alt91=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA91_0>=99 && LA91_0<=102)) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalSpear.g:4592:2: ( () ( (lv_value_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) )? )
                    {
                    // InternalSpear.g:4592:2: ( () ( (lv_value_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) )? )
                    // InternalSpear.g:4592:3: () ( (lv_value_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) )?
                    {
                    // InternalSpear.g:4592:3: ()
                    // InternalSpear.g:4593:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralExprAccess().getIntLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:4598:2: ( (lv_value_1_0= RULE_INT ) )
                    // InternalSpear.g:4599:1: (lv_value_1_0= RULE_INT )
                    {
                    // InternalSpear.g:4599:1: (lv_value_1_0= RULE_INT )
                    // InternalSpear.g:4600:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getLiteralExprAccess().getValueINTTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralExprRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:4616:2: ( (otherlv_2= RULE_ID ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_ID) ) {
                        int LA89_1 = input.LA(2);

                        if ( (LA89_1==EOF||LA89_1==RULE_ID||(LA89_1>=16 && LA89_1<=17)||(LA89_1>=21 && LA89_1<=23)||(LA89_1>=28 && LA89_1<=29)||(LA89_1>=33 && LA89_1<=34)||(LA89_1>=36 && LA89_1<=39)||(LA89_1>=41 && LA89_1<=44)||LA89_1==52||(LA89_1>=54 && LA89_1<=59)||(LA89_1>=61 && LA89_1<=65)||(LA89_1>=73 && LA89_1<=74)||(LA89_1>=76 && LA89_1<=77)||(LA89_1>=79 && LA89_1<=87)||LA89_1==89||(LA89_1>=92 && LA89_1<=93)||LA89_1==95) ) {
                            alt89=1;
                        }
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalSpear.g:4617:1: (otherlv_2= RULE_ID )
                            {
                            // InternalSpear.g:4617:1: (otherlv_2= RULE_ID )
                            // InternalSpear.g:4618:3: otherlv_2= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getLiteralExprRule());
                              	        }
                                      
                            }
                            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_2, grammarAccess.getLiteralExprAccess().getUnitUnitDefCrossReference_0_2_0()); 
                              	
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpear.g:4630:6: ( () ( (lv_value_4_0= ruleBOOL ) ) )
                    {
                    // InternalSpear.g:4630:6: ( () ( (lv_value_4_0= ruleBOOL ) ) )
                    // InternalSpear.g:4630:7: () ( (lv_value_4_0= ruleBOOL ) )
                    {
                    // InternalSpear.g:4630:7: ()
                    // InternalSpear.g:4631:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralExprAccess().getBoolLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:4636:2: ( (lv_value_4_0= ruleBOOL ) )
                    // InternalSpear.g:4637:1: (lv_value_4_0= ruleBOOL )
                    {
                    // InternalSpear.g:4637:1: (lv_value_4_0= ruleBOOL )
                    // InternalSpear.g:4638:3: lv_value_4_0= ruleBOOL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralExprAccess().getValueBOOLParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleBOOL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralExprRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"com.rockwellcollins.Spear.BOOL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpear.g:4655:6: ( () ( (lv_value_6_0= ruleREAL ) ) ( (otherlv_7= RULE_ID ) )? )
                    {
                    // InternalSpear.g:4655:6: ( () ( (lv_value_6_0= ruleREAL ) ) ( (otherlv_7= RULE_ID ) )? )
                    // InternalSpear.g:4655:7: () ( (lv_value_6_0= ruleREAL ) ) ( (otherlv_7= RULE_ID ) )?
                    {
                    // InternalSpear.g:4655:7: ()
                    // InternalSpear.g:4656:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralExprAccess().getRealLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpear.g:4661:2: ( (lv_value_6_0= ruleREAL ) )
                    // InternalSpear.g:4662:1: (lv_value_6_0= ruleREAL )
                    {
                    // InternalSpear.g:4662:1: (lv_value_6_0= ruleREAL )
                    // InternalSpear.g:4663:3: lv_value_6_0= ruleREAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralExprAccess().getValueREALParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    lv_value_6_0=ruleREAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralExprRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_6_0, 
                              		"com.rockwellcollins.Spear.REAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpear.g:4679:2: ( (otherlv_7= RULE_ID ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==RULE_ID) ) {
                        int LA90_1 = input.LA(2);

                        if ( (LA90_1==EOF||LA90_1==RULE_ID||(LA90_1>=16 && LA90_1<=17)||(LA90_1>=21 && LA90_1<=23)||(LA90_1>=28 && LA90_1<=29)||(LA90_1>=33 && LA90_1<=34)||(LA90_1>=36 && LA90_1<=39)||(LA90_1>=41 && LA90_1<=44)||LA90_1==52||(LA90_1>=54 && LA90_1<=59)||(LA90_1>=61 && LA90_1<=65)||(LA90_1>=73 && LA90_1<=74)||(LA90_1>=76 && LA90_1<=77)||(LA90_1>=79 && LA90_1<=87)||LA90_1==89||(LA90_1>=92 && LA90_1<=93)||LA90_1==95) ) {
                            alt90=1;
                        }
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalSpear.g:4680:1: (otherlv_7= RULE_ID )
                            {
                            // InternalSpear.g:4680:1: (otherlv_7= RULE_ID )
                            // InternalSpear.g:4681:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getLiteralExprRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getLiteralExprAccess().getUnitUnitDefCrossReference_2_2_0()); 
                              	
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpr"


    // $ANTLR start "entryRuleUnusedExpr"
    // InternalSpear.g:4700:1: entryRuleUnusedExpr returns [EObject current=null] : iv_ruleUnusedExpr= ruleUnusedExpr EOF ;
    public final EObject entryRuleUnusedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnusedExpr = null;


        try {
            // InternalSpear.g:4701:2: (iv_ruleUnusedExpr= ruleUnusedExpr EOF )
            // InternalSpear.g:4702:2: iv_ruleUnusedExpr= ruleUnusedExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnusedExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnusedExpr=ruleUnusedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnusedExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnusedExpr"


    // $ANTLR start "ruleUnusedExpr"
    // InternalSpear.g:4709:1: ruleUnusedExpr returns [EObject current=null] : ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '#' otherlv_6= '==' otherlv_7= 'spec' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (lv_args_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleExpr ) ) )* otherlv_13= ')' ) ;
    public final EObject ruleUnusedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_args_10_0 = null;

        EObject lv_args_12_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:4712:28: ( ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '#' otherlv_6= '==' otherlv_7= 'spec' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (lv_args_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleExpr ) ) )* otherlv_13= ')' ) )
            // InternalSpear.g:4713:1: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '#' otherlv_6= '==' otherlv_7= 'spec' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (lv_args_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleExpr ) ) )* otherlv_13= ')' )
            {
            // InternalSpear.g:4713:1: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '#' otherlv_6= '==' otherlv_7= 'spec' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (lv_args_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleExpr ) ) )* otherlv_13= ')' )
            // InternalSpear.g:4713:2: () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '#' otherlv_6= '==' otherlv_7= 'spec' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (lv_args_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleExpr ) ) )* otherlv_13= ')'
            {
            // InternalSpear.g:4713:2: ()
            // InternalSpear.g:4714:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnusedExprAccess().getNormalizedCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,98,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnusedExprAccess().getNumberSignKeyword_1());
                  
            }
            // InternalSpear.g:4723:1: ( (otherlv_2= RULE_ID ) )
            // InternalSpear.g:4724:1: (otherlv_2= RULE_ID )
            {
            // InternalSpear.g:4724:1: (otherlv_2= RULE_ID )
            // InternalSpear.g:4725:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUnusedExprRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getUnusedExprAccess().getIdsIdRefCrossReference_2_0()); 
              	
            }

            }


            }

            // InternalSpear.g:4736:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==28) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalSpear.g:4736:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getUnusedExprAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSpear.g:4740:1: ( (otherlv_4= RULE_ID ) )
            	    // InternalSpear.g:4741:1: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSpear.g:4741:1: (otherlv_4= RULE_ID )
            	    // InternalSpear.g:4742:3: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getUnusedExprRule());
            	      	        }
            	              
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_4, grammarAccess.getUnusedExprAccess().getIdsIdRefCrossReference_3_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            otherlv_5=(Token)match(input,98,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUnusedExprAccess().getNumberSignKeyword_4());
                  
            }
            otherlv_6=(Token)match(input,82,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getUnusedExprAccess().getEqualsSignEqualsSignKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUnusedExprAccess().getSpecKeyword_6());
                  
            }
            // InternalSpear.g:4765:1: ( (otherlv_8= RULE_ID ) )
            // InternalSpear.g:4766:1: (otherlv_8= RULE_ID )
            {
            // InternalSpear.g:4766:1: (otherlv_8= RULE_ID )
            // InternalSpear.g:4767:3: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUnusedExprRule());
              	        }
                      
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_8, grammarAccess.getUnusedExprAccess().getSpecSpecificationCrossReference_7_0()); 
              	
            }

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getUnusedExprAccess().getLeftParenthesisKeyword_8());
                  
            }
            // InternalSpear.g:4782:1: ( (lv_args_10_0= ruleExpr ) )
            // InternalSpear.g:4783:1: (lv_args_10_0= ruleExpr )
            {
            // InternalSpear.g:4783:1: (lv_args_10_0= ruleExpr )
            // InternalSpear.g:4784:3: lv_args_10_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnusedExprAccess().getArgsExprParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_25);
            lv_args_10_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnusedExprRule());
              	        }
                     		add(
                     			current, 
                     			"args",
                      		lv_args_10_0, 
                      		"com.rockwellcollins.Spear.Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpear.g:4800:2: (otherlv_11= ',' ( (lv_args_12_0= ruleExpr ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==28) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalSpear.g:4800:4: otherlv_11= ',' ( (lv_args_12_0= ruleExpr ) )
            	    {
            	    otherlv_11=(Token)match(input,28,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getUnusedExprAccess().getCommaKeyword_10_0());
            	          
            	    }
            	    // InternalSpear.g:4804:1: ( (lv_args_12_0= ruleExpr ) )
            	    // InternalSpear.g:4805:1: (lv_args_12_0= ruleExpr )
            	    {
            	    // InternalSpear.g:4805:1: (lv_args_12_0= ruleExpr )
            	    // InternalSpear.g:4806:3: lv_args_12_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnusedExprAccess().getArgsExprParserRuleCall_10_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_args_12_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnusedExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"args",
            	              		lv_args_12_0, 
            	              		"com.rockwellcollins.Spear.Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            otherlv_13=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getUnusedExprAccess().getRightParenthesisKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnusedExpr"


    // $ANTLR start "entryRuleFieldExpr"
    // InternalSpear.g:4836:1: entryRuleFieldExpr returns [EObject current=null] : iv_ruleFieldExpr= ruleFieldExpr EOF ;
    public final EObject entryRuleFieldExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldExpr = null;


        try {
            // InternalSpear.g:4837:2: (iv_ruleFieldExpr= ruleFieldExpr EOF )
            // InternalSpear.g:4838:2: iv_ruleFieldExpr= ruleFieldExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldExpr=ruleFieldExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldExpr"


    // $ANTLR start "ruleFieldExpr"
    // InternalSpear.g:4845:1: ruleFieldExpr returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleFieldExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:4848:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // InternalSpear.g:4849:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // InternalSpear.g:4849:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            // InternalSpear.g:4849:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) )
            {
            // InternalSpear.g:4849:2: ( (otherlv_0= RULE_ID ) )
            // InternalSpear.g:4850:1: (otherlv_0= RULE_ID )
            {
            // InternalSpear.g:4850:1: (otherlv_0= RULE_ID )
            // InternalSpear.g:4851:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldExprRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getFieldExprAccess().getFieldFieldTypeCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldExprAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalSpear.g:4866:1: ( (lv_expr_2_0= ruleExpr ) )
            // InternalSpear.g:4867:1: (lv_expr_2_0= ruleExpr )
            {
            // InternalSpear.g:4867:1: (lv_expr_2_0= ruleExpr )
            // InternalSpear.g:4868:3: lv_expr_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldExprAccess().getExprExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldExprRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"com.rockwellcollins.Spear.Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldExpr"


    // $ANTLR start "entryRuleBOOL"
    // InternalSpear.g:4892:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // InternalSpear.g:4893:2: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalSpear.g:4894:2: iv_ruleBOOL= ruleBOOL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // InternalSpear.g:4901:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BOOLEAN_TRUE_0= ruleBOOLEAN_TRUE | this_BOOLEAN_FALSE_1= ruleBOOLEAN_FALSE ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BOOLEAN_TRUE_0 = null;

        AntlrDatatypeRuleToken this_BOOLEAN_FALSE_1 = null;


         enterRule(); 
            
        try {
            // InternalSpear.g:4904:28: ( (this_BOOLEAN_TRUE_0= ruleBOOLEAN_TRUE | this_BOOLEAN_FALSE_1= ruleBOOLEAN_FALSE ) )
            // InternalSpear.g:4905:1: (this_BOOLEAN_TRUE_0= ruleBOOLEAN_TRUE | this_BOOLEAN_FALSE_1= ruleBOOLEAN_FALSE )
            {
            // InternalSpear.g:4905:1: (this_BOOLEAN_TRUE_0= ruleBOOLEAN_TRUE | this_BOOLEAN_FALSE_1= ruleBOOLEAN_FALSE )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=99 && LA94_0<=100)) ) {
                alt94=1;
            }
            else if ( ((LA94_0>=101 && LA94_0<=102)) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalSpear.g:4906:5: this_BOOLEAN_TRUE_0= ruleBOOLEAN_TRUE
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBOOLAccess().getBOOLEAN_TRUEParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BOOLEAN_TRUE_0=ruleBOOLEAN_TRUE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_TRUE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpear.g:4918:5: this_BOOLEAN_FALSE_1= ruleBOOLEAN_FALSE
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBOOLAccess().getBOOLEAN_FALSEParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BOOLEAN_FALSE_1=ruleBOOLEAN_FALSE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_FALSE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleBOOLEAN_TRUE"
    // InternalSpear.g:4936:1: entryRuleBOOLEAN_TRUE returns [String current=null] : iv_ruleBOOLEAN_TRUE= ruleBOOLEAN_TRUE EOF ;
    public final String entryRuleBOOLEAN_TRUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN_TRUE = null;


        try {
            // InternalSpear.g:4937:2: (iv_ruleBOOLEAN_TRUE= ruleBOOLEAN_TRUE EOF )
            // InternalSpear.g:4938:2: iv_ruleBOOLEAN_TRUE= ruleBOOLEAN_TRUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEAN_TRUERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN_TRUE=ruleBOOLEAN_TRUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN_TRUE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN_TRUE"


    // $ANTLR start "ruleBOOLEAN_TRUE"
    // InternalSpear.g:4945:1: ruleBOOLEAN_TRUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TRUE' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN_TRUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:4948:28: ( (kw= 'TRUE' | kw= 'true' ) )
            // InternalSpear.g:4949:1: (kw= 'TRUE' | kw= 'true' )
            {
            // InternalSpear.g:4949:1: (kw= 'TRUE' | kw= 'true' )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==99) ) {
                alt95=1;
            }
            else if ( (LA95_0==100) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalSpear.g:4950:2: kw= 'TRUE'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEAN_TRUEAccess().getTRUEKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpear.g:4957:2: kw= 'true'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEAN_TRUEAccess().getTrueKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN_TRUE"


    // $ANTLR start "entryRuleBOOLEAN_FALSE"
    // InternalSpear.g:4970:1: entryRuleBOOLEAN_FALSE returns [String current=null] : iv_ruleBOOLEAN_FALSE= ruleBOOLEAN_FALSE EOF ;
    public final String entryRuleBOOLEAN_FALSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN_FALSE = null;


        try {
            // InternalSpear.g:4971:2: (iv_ruleBOOLEAN_FALSE= ruleBOOLEAN_FALSE EOF )
            // InternalSpear.g:4972:2: iv_ruleBOOLEAN_FALSE= ruleBOOLEAN_FALSE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEAN_FALSERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN_FALSE=ruleBOOLEAN_FALSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN_FALSE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN_FALSE"


    // $ANTLR start "ruleBOOLEAN_FALSE"
    // InternalSpear.g:4979:1: ruleBOOLEAN_FALSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'FALSE' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN_FALSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:4982:28: ( (kw= 'FALSE' | kw= 'false' ) )
            // InternalSpear.g:4983:1: (kw= 'FALSE' | kw= 'false' )
            {
            // InternalSpear.g:4983:1: (kw= 'FALSE' | kw= 'false' )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==101) ) {
                alt96=1;
            }
            else if ( (LA96_0==102) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalSpear.g:4984:2: kw= 'FALSE'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEAN_FALSEAccess().getFALSEKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpear.g:4991:2: kw= 'false'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEAN_FALSEAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN_FALSE"


    // $ANTLR start "entryRuleREAL"
    // InternalSpear.g:5004:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // InternalSpear.g:5005:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalSpear.g:5006:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalSpear.g:5013:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // InternalSpear.g:5016:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalSpear.g:5017:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalSpear.g:5017:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalSpear.g:5017:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,92,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREAL"

    // $ANTLR start synpred1_InternalSpear
    public final void synpred1_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:1221:3: ( ( () ( ( '*' ) ) ) )
        // InternalSpear.g:1221:4: ( () ( ( '*' ) ) )
        {
        // InternalSpear.g:1221:4: ( () ( ( '*' ) ) )
        // InternalSpear.g:1221:5: () ( ( '*' ) )
        {
        // InternalSpear.g:1221:5: ()
        // InternalSpear.g:1222:1: 
        {
        }

        // InternalSpear.g:1222:2: ( ( '*' ) )
        // InternalSpear.g:1223:1: ( '*' )
        {
        // InternalSpear.g:1223:1: ( '*' )
        // InternalSpear.g:1224:2: '*'
        {
        match(input,38,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalSpear

    // $ANTLR start synpred2_InternalSpear
    public final void synpred2_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:1297:3: ( ( () ( ( '/' ) ) ) )
        // InternalSpear.g:1297:4: ( () ( ( '/' ) ) )
        {
        // InternalSpear.g:1297:4: ( () ( ( '/' ) ) )
        // InternalSpear.g:1297:5: () ( ( '/' ) )
        {
        // InternalSpear.g:1297:5: ()
        // InternalSpear.g:1298:1: 
        {
        }

        // InternalSpear.g:1298:2: ( ( '/' ) )
        // InternalSpear.g:1299:1: ( '/' )
        {
        // InternalSpear.g:1299:1: ( '/' )
        // InternalSpear.g:1300:2: '/'
        {
        match(input,39,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalSpear

    // $ANTLR start synpred3_InternalSpear
    public final void synpred3_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:2566:3: ( ( () ( ( ( '=>' | 'implies' ) ) ) ) )
        // InternalSpear.g:2566:4: ( () ( ( ( '=>' | 'implies' ) ) ) )
        {
        // InternalSpear.g:2566:4: ( () ( ( ( '=>' | 'implies' ) ) ) )
        // InternalSpear.g:2566:5: () ( ( ( '=>' | 'implies' ) ) )
        {
        // InternalSpear.g:2566:5: ()
        // InternalSpear.g:2567:1: 
        {
        }

        // InternalSpear.g:2567:2: ( ( ( '=>' | 'implies' ) ) )
        // InternalSpear.g:2568:1: ( ( '=>' | 'implies' ) )
        {
        // InternalSpear.g:2568:1: ( ( '=>' | 'implies' ) )
        // InternalSpear.g:2569:1: ( '=>' | 'implies' )
        {
        if ( (input.LA(1)>=55 && input.LA(1)<=56) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalSpear

    // $ANTLR start synpred4_InternalSpear
    public final void synpred4_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:2663:3: ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )
        // InternalSpear.g:2663:4: ( () ( ( ( 'or' | 'xor' ) ) ) )
        {
        // InternalSpear.g:2663:4: ( () ( ( ( 'or' | 'xor' ) ) ) )
        // InternalSpear.g:2663:5: () ( ( ( 'or' | 'xor' ) ) )
        {
        // InternalSpear.g:2663:5: ()
        // InternalSpear.g:2664:1: 
        {
        }

        // InternalSpear.g:2664:2: ( ( ( 'or' | 'xor' ) ) )
        // InternalSpear.g:2665:1: ( ( 'or' | 'xor' ) )
        {
        // InternalSpear.g:2665:1: ( ( 'or' | 'xor' ) )
        // InternalSpear.g:2666:1: ( 'or' | 'xor' )
        {
        if ( (input.LA(1)>=57 && input.LA(1)<=58) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSpear

    // $ANTLR start synpred5_InternalSpear
    public final void synpred5_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:2760:3: ( ( () ( ( 'and' ) ) ) )
        // InternalSpear.g:2760:4: ( () ( ( 'and' ) ) )
        {
        // InternalSpear.g:2760:4: ( () ( ( 'and' ) ) )
        // InternalSpear.g:2760:5: () ( ( 'and' ) )
        {
        // InternalSpear.g:2760:5: ()
        // InternalSpear.g:2761:1: 
        {
        }

        // InternalSpear.g:2761:2: ( ( 'and' ) )
        // InternalSpear.g:2762:1: ( 'and' )
        {
        // InternalSpear.g:2762:1: ( 'and' )
        // InternalSpear.g:2763:2: 'and'
        {
        match(input,59,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalSpear

    // $ANTLR start synpred6_InternalSpear
    public final void synpred6_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:2855:4: ( 'until' )
        // InternalSpear.g:2855:6: 'until'
        {
        match(input,61,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalSpear

    // $ANTLR start synpred7_InternalSpear
    public final void synpred7_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:2918:3: ( ( () ( ( ( 'T' | 'triggers' ) ) ) ) )
        // InternalSpear.g:2918:4: ( () ( ( ( 'T' | 'triggers' ) ) ) )
        {
        // InternalSpear.g:2918:4: ( () ( ( ( 'T' | 'triggers' ) ) ) )
        // InternalSpear.g:2918:5: () ( ( ( 'T' | 'triggers' ) ) )
        {
        // InternalSpear.g:2918:5: ()
        // InternalSpear.g:2919:1: 
        {
        }

        // InternalSpear.g:2919:2: ( ( ( 'T' | 'triggers' ) ) )
        // InternalSpear.g:2920:1: ( ( 'T' | 'triggers' ) )
        {
        // InternalSpear.g:2920:1: ( ( 'T' | 'triggers' ) )
        // InternalSpear.g:2921:1: ( 'T' | 'triggers' )
        {
        if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSpear

    // $ANTLR start synpred8_InternalSpear
    public final void synpred8_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:3015:3: ( ( () ( ( ( 'S' | 'since' ) ) ) ) )
        // InternalSpear.g:3015:4: ( () ( ( ( 'S' | 'since' ) ) ) )
        {
        // InternalSpear.g:3015:4: ( () ( ( ( 'S' | 'since' ) ) ) )
        // InternalSpear.g:3015:5: () ( ( ( 'S' | 'since' ) ) )
        {
        // InternalSpear.g:3015:5: ()
        // InternalSpear.g:3016:1: 
        {
        }

        // InternalSpear.g:3016:2: ( ( ( 'S' | 'since' ) ) )
        // InternalSpear.g:3017:1: ( ( 'S' | 'since' ) )
        {
        // InternalSpear.g:3017:1: ( ( 'S' | 'since' ) )
        // InternalSpear.g:3018:1: ( 'S' | 'since' )
        {
        if ( (input.LA(1)>=64 && input.LA(1)<=65) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalSpear

    // $ANTLR start synpred9_InternalSpear
    public final void synpred9_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:3257:3: ( ( () ( ( ruleRelationalOp ) ) ) )
        // InternalSpear.g:3257:4: ( () ( ( ruleRelationalOp ) ) )
        {
        // InternalSpear.g:3257:4: ( () ( ( ruleRelationalOp ) ) )
        // InternalSpear.g:3257:5: () ( ( ruleRelationalOp ) )
        {
        // InternalSpear.g:3257:5: ()
        // InternalSpear.g:3258:1: 
        {
        }

        // InternalSpear.g:3258:2: ( ( ruleRelationalOp ) )
        // InternalSpear.g:3259:1: ( ruleRelationalOp )
        {
        // InternalSpear.g:3259:1: ( ruleRelationalOp )
        // InternalSpear.g:3260:1: ruleRelationalOp
        {
        pushFollow(FOLLOW_2);
        ruleRelationalOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalSpear

    // $ANTLR start synpred10_InternalSpear
    public final void synpred10_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:3516:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // InternalSpear.g:3516:4: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // InternalSpear.g:3516:4: ( () ( ( ( '+' | '-' ) ) ) )
        // InternalSpear.g:3516:5: () ( ( ( '+' | '-' ) ) )
        {
        // InternalSpear.g:3516:5: ()
        // InternalSpear.g:3517:1: 
        {
        }

        // InternalSpear.g:3517:2: ( ( ( '+' | '-' ) ) )
        // InternalSpear.g:3518:1: ( ( '+' | '-' ) )
        {
        // InternalSpear.g:3518:1: ( ( '+' | '-' ) )
        // InternalSpear.g:3519:1: ( '+' | '-' )
        {
        if ( (input.LA(1)>=85 && input.LA(1)<=86) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalSpear

    // $ANTLR start synpred11_InternalSpear
    public final void synpred11_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:3613:3: ( ( () ( ( ( '*' | '/' | 'mod' ) ) ) ) )
        // InternalSpear.g:3613:4: ( () ( ( ( '*' | '/' | 'mod' ) ) ) )
        {
        // InternalSpear.g:3613:4: ( () ( ( ( '*' | '/' | 'mod' ) ) ) )
        // InternalSpear.g:3613:5: () ( ( ( '*' | '/' | 'mod' ) ) )
        {
        // InternalSpear.g:3613:5: ()
        // InternalSpear.g:3614:1: 
        {
        }

        // InternalSpear.g:3614:2: ( ( ( '*' | '/' | 'mod' ) ) )
        // InternalSpear.g:3615:1: ( ( '*' | '/' | 'mod' ) )
        {
        // InternalSpear.g:3615:1: ( ( '*' | '/' | 'mod' ) )
        // InternalSpear.g:3616:1: ( '*' | '/' | 'mod' )
        {
        if ( (input.LA(1)>=38 && input.LA(1)<=39)||input.LA(1)==87 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalSpear

    // $ANTLR start synpred12_InternalSpear
    public final void synpred12_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:3799:4: ( 'with' )
        // InternalSpear.g:3799:6: 'with'
        {
        match(input,89,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalSpear

    // $ANTLR start synpred13_InternalSpear
    public final void synpred13_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:3870:4: ( ( () '.' ) )
        // InternalSpear.g:3870:5: ( () '.' )
        {
        // InternalSpear.g:3870:5: ( () '.' )
        // InternalSpear.g:3870:6: () '.'
        {
        // InternalSpear.g:3870:6: ()
        // InternalSpear.g:3871:1: 
        {
        }

        match(input,92,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSpear

    // $ANTLR start synpred14_InternalSpear
    public final void synpred14_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:3896:8: ( ( () '{' ( ( RULE_ID ) ) ':=' ) )
        // InternalSpear.g:3896:9: ( () '{' ( ( RULE_ID ) ) ':=' )
        {
        // InternalSpear.g:3896:9: ( () '{' ( ( RULE_ID ) ) ':=' )
        // InternalSpear.g:3896:10: () '{' ( ( RULE_ID ) ) ':='
        {
        // InternalSpear.g:3896:10: ()
        // InternalSpear.g:3897:1: 
        {
        }

        match(input,41,FOLLOW_3); if (state.failed) return ;
        // InternalSpear.g:3898:1: ( ( RULE_ID ) )
        // InternalSpear.g:3899:1: ( RULE_ID )
        {
        // InternalSpear.g:3899:1: ( RULE_ID )
        // InternalSpear.g:3900:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_67); if (state.failed) return ;

        }


        }

        match(input,93,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalSpear

    // $ANTLR start synpred15_InternalSpear
    public final void synpred15_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:3954:8: ( ( () '[' ) )
        // InternalSpear.g:3954:9: ( () '[' )
        {
        // InternalSpear.g:3954:9: ( () '[' )
        // InternalSpear.g:3954:10: () '['
        {
        // InternalSpear.g:3954:10: ()
        // InternalSpear.g:3955:1: 
        {
        }

        match(input,43,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSpear

    // $ANTLR start synpred16_InternalSpear
    public final void synpred16_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:3984:4: ( ( () ':=' ) )
        // InternalSpear.g:3984:5: ( () ':=' )
        {
        // InternalSpear.g:3984:5: ( () ':=' )
        // InternalSpear.g:3984:6: () ':='
        {
        // InternalSpear.g:3984:6: ()
        // InternalSpear.g:3985:1: 
        {
        }

        match(input,93,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalSpear

    // $ANTLR start synpred17_InternalSpear
    public final void synpred17_InternalSpear_fragment() throws RecognitionException {   
        // InternalSpear.g:4164:4: ( 'else' )
        // InternalSpear.g:4164:6: 'else'
        {
        match(input,95,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalSpear

    // Delegated rules

    public final boolean synpred2_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSpear() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSpear_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA49 dfa49 = new DFA49(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\7\uffff\4\14\2\uffff";
    static final String dfa_3s = "\1\4\1\56\3\4\2\uffff\4\4\2\uffff";
    static final String dfa_4s = "\1\4\1\63\3\61\2\uffff\4\53\2\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\4\4\uffff\1\3\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\3\uffff\1\3\1\4",
            "\1\12\43\uffff\1\5\4\uffff\1\6\1\uffff\1\7\1\10\1\11",
            "\1\12\43\uffff\1\5\4\uffff\1\6\1\uffff\1\7\1\10\1\11",
            "\1\12\43\uffff\1\5\4\uffff\1\6\1\uffff\1\7\1\10\1\11",
            "",
            "",
            "\1\14\12\uffff\3\14\31\uffff\1\13",
            "\1\14\12\uffff\3\14\31\uffff\1\13",
            "\1\14\12\uffff\3\14\31\uffff\1\13",
            "\1\14\12\uffff\3\14\31\uffff\1\13",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1422:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_type_3_0= ruleType ) ) ( (otherlv_4= RULE_ID ) )? ) | ( () ( (lv_name_6_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_8= 'record' otherlv_9= '{' ( (lv_fields_10_0= ruleFieldType ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleFieldType ) ) )* otherlv_13= '}' ) | ( () ( (lv_name_15_0= RULE_ID ) ) ruleIdTypeDelimiter ( (lv_base_17_0= ruleType ) ) otherlv_18= '[' ( (lv_size_19_0= RULE_INT ) ) otherlv_20= ']' ) | ( () ( (lv_name_22_0= RULE_ID ) ) ruleIdTypeDelimiter otherlv_24= 'enum' otherlv_25= '{' ( (lv_values_26_0= ruleEnumValue ) ) (otherlv_27= ',' ( (lv_values_28_0= ruleEnumValue ) ) )* otherlv_29= '}' ) )";
        }
    }
    static final String dfa_8s = "\1\13\14\uffff";
    static final String dfa_9s = "\1\4\12\0\2\uffff";
    static final String dfa_10s = "\1\137\12\0\2\uffff";
    static final String dfa_11s = "\13\uffff\1\2\1\1";
    static final String dfa_12s = "\1\uffff\1\2\1\4\1\10\1\5\1\0\1\1\1\7\1\11\1\3\1\6\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\13\13\uffff\2\13\3\uffff\3\13\4\uffff\2\13\3\uffff\2\13\1\uffff\4\13\1\uffff\4\13\7\uffff\1\13\1\uffff\6\13\1\uffff\5\13\7\uffff\1\1\1\2\1\uffff\1\3\1\10\1\uffff\1\4\1\5\1\6\1\7\1\11\1\12\3\13\1\uffff\1\13\2\uffff\2\13\1\uffff\1\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3257:1: ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpear()) ) {s = 12;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\21\uffff";
    static final String dfa_15s = "\13\uffff\1\16\1\20\4\uffff";
    static final String dfa_16s = "\1\111\1\uffff\1\113\2\uffff\1\113\5\uffff\2\4\4\uffff";
    static final String dfa_17s = "\1\124\1\uffff\1\113\2\uffff\1\113\5\uffff\2\146\4\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\uffff\1\3\1\5\1\uffff\1\7\1\11\1\12\1\13\1\14\2\uffff\1\4\1\2\1\10\1\6";
    static final String dfa_19s = "\21\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\2\1\uffff\1\3\1\10\1\uffff\1\4\1\5\1\6\1\7\1\11\1\12",
            "",
            "\1\13",
            "",
            "",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\1\16\24\uffff\1\16\6\uffff\1\16\26\uffff\1\15\32\uffff\1\16\1\uffff\1\16\1\uffff\1\16\5\uffff\1\16\1\uffff\7\16",
            "\1\20\1\uffff\1\20\24\uffff\1\20\6\uffff\1\20\26\uffff\1\17\32\uffff\1\20\1\uffff\1\20\1\uffff\1\20\5\uffff\1\20\1\uffff\7\20",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "3325:1: (kw= '<' | (kw= 'less' kw= 'than' ) | kw= '<=' | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '>' | (kw= 'greater' kw= 'than' ) | kw= '>=' | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | kw= '==' | (kw= 'equal' kw= 'to' ) | kw= '<>' | (kw= 'not' kw= 'equal' kw= 'to' ) )";
        }
    }
    static final String dfa_21s = "\2\uffff\1\12\16\uffff";
    static final String dfa_22s = "\1\4\1\uffff\1\4\2\uffff\1\4\5\uffff\1\51\1\4\1\uffff\1\33\2\uffff";
    static final String dfa_23s = "\1\146\1\uffff\1\137\2\uffff\1\4\5\uffff\1\53\1\146\1\uffff\1\134\2\uffff";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\uffff\1\11\1\12\1\13\1\10\1\2\2\uffff\1\7\1\uffff\1\6\1\5";
    static final String[] dfa_25s = {
            "\1\2\1\uffff\1\1\24\uffff\1\10\6\uffff\1\3\73\uffff\1\4\1\uffff\1\5\1\6\1\7\4\1",
            "",
            "\1\12\13\uffff\2\12\3\uffff\3\12\3\uffff\1\11\2\12\3\uffff\2\12\1\uffff\4\12\1\uffff\4\12\7\uffff\1\12\1\uffff\6\12\1\uffff\5\12\7\uffff\2\12\1\uffff\2\12\1\uffff\11\12\1\uffff\1\12\2\uffff\2\12\1\uffff\1\12",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\uffff\1\15",
            "\1\16\1\uffff\1\17\24\uffff\1\17\6\uffff\1\17\22\uffff\1\17\6\uffff\1\17\5\uffff\7\17\13\uffff\1\17\1\uffff\1\17\1\uffff\1\17\5\uffff\1\17\1\uffff\7\17",
            "",
            "\2\17\6\uffff\1\20\2\uffff\2\17\1\uffff\3\17\13\uffff\5\17\2\uffff\4\17\7\uffff\2\17\1\uffff\2\17\1\uffff\11\17\4\uffff\1\17",
            "",
            ""
    };
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = dfa_14;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_19;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "4039:1: (this_LiteralExpr_0= ruleLiteralExpr | ( () ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '|' ) | ( () otherlv_10= 'if' ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_then_13_0= ruleExpr ) ) ( ( ( 'else' )=>otherlv_14= 'else' ) ( (lv_else_15_0= ruleExpr ) ) )? ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) otherlv_19= '{' ( (lv_fieldExprs_20_0= ruleFieldExpr ) ) (otherlv_21= ',' ( (lv_fieldExprs_22_0= ruleFieldExpr ) ) )* otherlv_23= '}' ) | ( () otherlv_25= 'new' ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (lv_exprs_28_0= ruleExpr ) ) (otherlv_29= ',' ( (lv_exprs_30_0= ruleExpr ) ) )* otherlv_31= '}' ) | ( () otherlv_33= 'new' ( (otherlv_34= RULE_ID ) ) otherlv_35= '[' ( (lv_exprs_36_0= ruleExpr ) ) (otherlv_37= ',' ( (lv_exprs_38_0= ruleExpr ) ) )* otherlv_39= ']' ) | ( () ( (otherlv_41= RULE_ID ) ) otherlv_42= '(' ( (lv_args_43_0= ruleExpr ) ) (otherlv_44= ',' ( (lv_args_45_0= ruleExpr ) ) )* otherlv_46= ')' ) | ( () otherlv_48= 'spec' ( (otherlv_49= RULE_ID ) ) otherlv_50= '(' ( (lv_args_51_0= ruleExpr ) ) (otherlv_52= ',' ( (lv_args_53_0= ruleExpr ) ) )* otherlv_54= ')' ) | this_UnusedExpr_55= ruleUnusedExpr | (otherlv_56= '(' this_Expr_57= ruleExpr otherlv_58= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000103E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000101E002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000001C012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000018012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003600000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1020000408000050L,0x0000007F415001FCL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000C400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0003800000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x00000000001FB600L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x000000C000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x00000A0000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000100000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000100010000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000010000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});

}