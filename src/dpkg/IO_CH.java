package dpkg;
import java.util.HashMap;
import com.tandem.ext.util.*;
/**
IO_CH class was generated for DDL Rec/Def: ch on: 3/11/24 at: 21:30:4.
This is an INPUT/OUTPUT class which can be used to read and write data.*/

  public class IO_CH implements com.tandem.ext.guardian.GuardianInput, 
            com.tandem.ext.guardian.GuardianOutput {
    protected int _numConversionErrors;
    protected boolean _allowErrors = false;
    @SuppressWarnings("rawtypes")
    protected HashMap _errorDetail;

    protected int _bufferLen = 2029;
    public String d__ch_card_pan_r;
    public String filler0;
    public String filler1;
    public String d__ch_name;
    public String d__ch_curcy_code;
    public short d__ch_except_ind_int;
    public short d__ch_except_ind_dom;
    public String d__ch_purge_date_year;
    public String d__ch_purge_date_month;
    public String d__ch_region_code;
    public String d__ch_exp_date_year;
    public String d__ch_exp_date_month;
    public String d__ch_saldo_on_host;
    public String d__ch_crac_limit;
    public String d__ch_temp_disp_increm;
    public String d__ch_max_date_increm_r;
    public String filler2;
    public String d__ch_tot_auth_pend;
    public String d__ch_tot_dc_aleu;
    public String d__ch_tot_dc_steu;
    public String d__ch_tx_time_r;
    public String filler3;
    public String d__ch_dom_sale_max_tx;
    public String d__ch_dom_cash_max_tx;
    public String d__ch_int_sale_max_tx;
    public String d__ch_int_cash_max_tx;
    public String d__ch_dom_sale_max_24h;
    public String d__ch_dom_cash_max_24h;
    public String d__ch_dom_tot_max_24h;
    public String d__ch_int_sale_max_24h;
    public String d__ch_int_cash_max_24h;
    public String d__ch_int_tot_max_24h;
    public String d__ch_sale_max_24h;
    public String d__ch_cash_max_24h;
    public String d__ch_tot_max_24h;
    public String d__ch_card_use_max_24h;
    public String d__ch_dom_sale_max_7d;
    public String d__ch_dom_cash_max_7d;
    public String d__ch_dom_tot_max_7d;
    public String d__ch_int_sale_max_7d;
    public String d__ch_int_cash_max_7d;
    public String d__ch_int_tot_max_7d;
    public String d__ch_sale_max_7d;
    public String d__ch_cash_max_7d;
    public String d__ch_tot_max_7d;
    public String d__ch_card_use_max_7d;
    public String d__ch_dom_sale_cur_24h;
    public String d__ch_dom_cash_cur_24h;
    public String d__ch_int_sale_cur_24h;
    public String d__ch_int_cash_cur_24h;
    public String d__ch_card_use_cur_24h;
    public String d__ch_pointer_24h;
    D__ch__cur_4h_class d__ch__cur_4h[] = {new D__ch__cur_4h_class(),
new D__ch__cur_4h_class(),
new D__ch__cur_4h_class(),
new D__ch__cur_4h_class(),
new D__ch__cur_4h_class(),
new D__ch__cur_4h_class()};
    public String d__ch_dom_sale_cur_7d;
    public String d__ch_dom_cash_cur_7d;
    public String d__ch_int_sale_cur_7d;
    public String d__ch_int_cash_cur_7d;
    public String d__ch_card_use_cur_7d;
    public String d__ch_pointer_7d;
    D__ch__cur_day_class d__ch__cur_day[] = {new D__ch__cur_day_class(),
new D__ch__cur_day_class(),
new D__ch__cur_day_class(),
new D__ch__cur_day_class(),
new D__ch__cur_day_class(),
new D__ch__cur_day_class(),
new D__ch__cur_day_class()};
    public String user_class;
    public String user_id;
    public String state;
    public String disable_reason;
    public String creation_time_r;
    public String disable_time_r;
    public String modif_time_r;
    public short d__ch_curr_pvv;
    public short d__ch_temp_pvv;
    public String d__ch_pin_err_cnt;
    public String d__ch_pin_disable;
    public String d__ch_updt_nr;
    public String trace_nr;
    public String compl_code;
    public short reply_code;
    public String amt;
    public String codfin;
    public String tx_type;
    public String datim_r;
    public String iso2_ind;
    public String mid;
    public String me_brand;
    public String card_exp_date_year;
    public String card_exp_date_month;
    public String uid;
    public String te_brand;
    public String filler4;
    public String response_table;
    public String decision_table;
    public String d__ch_atm_last_date_r;
    D__ch_atm_tot_curr_tx_class d__ch_atm_tot_curr_tx[] = {new D__ch_atm_tot_curr_tx_class(),
new D__ch_atm_tot_curr_tx_class(),
new D__ch_atm_tot_curr_tx_class(),
new D__ch_atm_tot_curr_tx_class()};
    public String d__ch_pin_ch_allowed_ind;
    public String d__ch_pin_change_busy_ind;
    public String d__ch_exp_yy_last_appr_tx;
    public String d__ch_curr_pvv_date_time_r;
    public String d__ch_curr_pvki;
    public String d__ch_temp_pvv_date_time_r;
    public String d__ch_temp_pvki;
    public String d__ch_try_pin_change;
    public String d__ch_iss_id;
    public String d__ch_visa_key_set;
    public String d__ch_cash_limit_ind;
    public String d__ch_cash_limit;
    public String d__ch_account_ind;
    public String d__ch_account;
    public String d__ch_cash_limit_bank;
    public String d__ch_cash_limit_date_r;
    public String d__ch_emv_sd_id;
    public String d__ch_emv_app_inst;
    public String d__ch_emv_mk_ver;
    public String d__ch_emv_atc;
    public String d__ch_pin_synchro;
    public String d__ch_crit_script_script_number;
    public String d__ch_crit_script_flag_script_ready;
    public String d__ch_crit_script_flag_script_sent;
    public String d__ch_script_pri_1_script_number;
    public String d__ch_script_pri_1_flag_script_ready;
    public String d__ch_script_pri_1_flag_script_sent;
    public String d__ch_script_pri_2_script_number;
    public String d__ch_script_pri_2_flag_script_ready;
    public String d__ch_script_pri_2_flag_script_sent;
    public String d__ch_emv_card_nr;
    public String d__ch_calc_counter;
    public String d__ch_oltb_ind;
    public String d__ch_second_card_ind;
    public String d__ch_old_icvv_ind;
    public String d__ch_new_icvv_ind;
    public String d__ch_wng_icvv_ind;
    public String d__ch_emv_card_type;
    public String d__ch_cust_nr;
    public String d__ch_bor_sec_code_try;
    public String d__ch_emv_load_sum;
    public String d__ch_emv_spent_sum;
    public String d__ch_emv_offline_tx;
    public String d__ch_emv_cntless_ind;
    public String d__ch_new_emue;
    public String d__ch_dkvk_ind;
    public String d__ch_dkvk_time_r;
    public String d__ch_dkvk_ym;
    public String d__ch_dkvk_sc;
    public String d__ch_dkvk_min;
    public String d__ch_dkvk_static_ind;
    public String d__ch_act_flag1_old;
    public String d__ch_act_flag2_old;
    public String d__ch_act_flag1_new;
    public String d__ch_act_flag2_new;
    public String d__ch_pvv_cvv_ind_old;
    public String d__ch_pvv_cvv_ind_new;
    public String d__ch_internet_ind_old;
    public String d__ch_internet_ind_new;
    public String d__ch_act_flag3;
    public String d__ch_sca_count;
    public String d__ch_sca_count_3d;
    public String d__ch_sca_amt;
    public String filler5;
            class D__ch__cur_4h_class {
                  public String d__ch__cur_4h_dom_sale;
                  public String d__ch__cur_4h_dom_cash;
                  public String d__ch__cur_4h_int_sale;
                  public String d__ch__cur_4h_int_cash;
                  public String d__ch__cur_4h_card_use;
            }
            class D__ch__cur_day_class {
                  public String d__ch__cur_day_dom_sale;
                  public String d__ch__cur_day_dom_cash;
                  public String d__ch__cur_day_int_sale;
                  public String d__ch__cur_day_int_cash;
                  public String d__ch__cur_day_card_use;
            }
      class D__ch_atm_tot_curr_tx_class {
            public String d__ch_tot_tx_amount;
            public String d__ch_tot_nb_tx;
      }

/**
IO_CH Constructor
*/
   public IO_CH() {
        _errorDetail = new HashMap();
      for(int _i0 = 0; _i0 < 6; _i0++) {
        d__ch__cur_4h[_i0].d__ch__cur_4h_dom_sale = "0";
        d__ch__cur_4h[_i0].d__ch__cur_4h_dom_cash = "0";
        d__ch__cur_4h[_i0].d__ch__cur_4h_int_sale = "0";
        d__ch__cur_4h[_i0].d__ch__cur_4h_int_cash = "0";
        d__ch__cur_4h[_i0].d__ch__cur_4h_card_use = "0";
      }
      for(int _i0 = 0; _i0 < 7; _i0++) {
        d__ch__cur_day[_i0].d__ch__cur_day_dom_sale = "0";
        d__ch__cur_day[_i0].d__ch__cur_day_dom_cash = "0";
        d__ch__cur_day[_i0].d__ch__cur_day_int_sale = "0";
        d__ch__cur_day[_i0].d__ch__cur_day_int_cash = "0";
        d__ch__cur_day[_i0].d__ch__cur_day_card_use = "0";
      }
      for(int _i0 = 0; _i0 < 4; _i0++) {
        d__ch_atm_tot_curr_tx[_i0].d__ch_tot_tx_amount = "0";
        d__ch_atm_tot_curr_tx[_i0].d__ch_tot_nb_tx = "0";
      }
   }

/**
Returns the expected length of the byte array used by this class.
@return int expected length of byte array.
*/
   public int getLength() {
      return _bufferLen;
   }
/**
  Indicates whether DataConversion Exceptions are thrown during execution
  of the unmarshal method. Specifying false indicates that the first data
  conversion error encountered during execution of the unmarshal method, 
  causes a DataConversionException to be thrown.  All subsequent data in 
  the byte array supplied to the unmarshal method is NOT converted

  Specifying true indicates that DataConversionExceptions are ignored 
  during execution of the unmarshal method.  umarshal will attempt to 
  convert all data in the byte array.  To determine if errors have 
  occurred during execution of unmarshal, the user can call 
  getNumConversionFailures().  This method returns the number of fields 
  that failed to convert.  If the call to getNumConversionFailures() 
  returns a number greater than zero, a call to 
  getConversionFailureDetails() returns a HashMap whose keys are the fields
  that failed to convert and whose value is the associated 
  DataConversionException.
  @param boolean true to indicate that conversion errors are to be 
  allowed; false otherwise.
  @see #getNumConversionFailures
  @see #getConversionFailureDetails
*/
    public void allowErrors(boolean value) {
       _allowErrors = value;
    }
/**
   Returns the number of fields that failed to convert during execution
   of the unmarshal method.
   @return the number of fields that failed to convert during the 
   execution of unmarshal.  A returned value of zero indicates that
   all fields converted.
   @see #allowErrors
   @see #getConversionFailureDetails
*/
    public int getNumConversionFailures() {
       return _numConversionErrors;
    }
/**
    Returns a HashMap with information about fields that failed to 
    convert during execution of the unmarshal method.  Keys are 
    the fields that failed to convert and values are the associated
    DataConversionExceptions.

    @return HashMap containing details of data conversion failures.
    If no failures occurred the HashMap.isEmpty() method returns true.
    @see #getNumConversionFailures
    @see #allowErrors
*/
     public HashMap getConversionFailureDetails() {
        return _errorDetail;
     }

/**
Used to set a value for d__ch_card_pan_r.
@param value  the value to be set.
*/
    public void setD__ch_card_pan_r(String value) {
      d__ch_card_pan_r = value;
    }
/**
Used to set a value for filler0.
@param value  the value to be set.
*/
    public void setFiller0(String value) {
      filler0 = value;
    }
/**
Used to set a value for filler1.
@param value  the value to be set.
*/
    public void setFiller1(String value) {
      filler1 = value;
    }
/**
Used to set a value for d__ch_name.
@param value  the value to be set.
*/
    public void setD__ch_name(String value) {
      d__ch_name = value;
    }
/**
Used to set a value for d__ch_curcy_code.
@param value  the value to be set.
*/
    public void setD__ch_curcy_code(String value) {
      d__ch_curcy_code = value;
    }
/**
Used to set a value for d__ch_except_ind_int.
@param value  the value to be set.
*/
    public void setD__ch_except_ind_int(short value) {
      d__ch_except_ind_int = value;
    }
/**
Used to set a value for d__ch_except_ind_dom.
@param value  the value to be set.
*/
    public void setD__ch_except_ind_dom(short value) {
      d__ch_except_ind_dom = value;
    }
/**
Used to set a value for d__ch_purge_date_year.
@param value  the value to be set.
*/
    public void setD__ch_purge_date_year(String value) {
      d__ch_purge_date_year = value;
    }
/**
Used to set a value for d__ch_purge_date_month.
@param value  the value to be set.
*/
    public void setD__ch_purge_date_month(String value) {
      d__ch_purge_date_month = value;
    }
/**
Used to set a value for d__ch_region_code.
@param value  the value to be set.
*/
    public void setD__ch_region_code(String value) {
      d__ch_region_code = value;
    }
/**
Used to set a value for d__ch_exp_date_year.
@param value  the value to be set.
*/
    public void setD__ch_exp_date_year(String value) {
      d__ch_exp_date_year = value;
    }
/**
Used to set a value for d__ch_exp_date_month.
@param value  the value to be set.
*/
    public void setD__ch_exp_date_month(String value) {
      d__ch_exp_date_month = value;
    }
/**
Used to set a value for d__ch_saldo_on_host.
@param value  the value to be set.
*/
    public void setD__ch_saldo_on_host(String value) {
      d__ch_saldo_on_host = value;
    }
/**
Used to set a value for d__ch_crac_limit.
@param value  the value to be set.
*/
    public void setD__ch_crac_limit(String value) {
      d__ch_crac_limit = value;
    }
/**
Used to set a value for d__ch_temp_disp_increm.
@param value  the value to be set.
*/
    public void setD__ch_temp_disp_increm(String value) {
      d__ch_temp_disp_increm = value;
    }
/**
Used to set a value for d__ch_max_date_increm_r.
@param value  the value to be set.
*/
    public void setD__ch_max_date_increm_r(String value) {
      d__ch_max_date_increm_r = value;
    }
/**
Used to set a value for filler2.
@param value  the value to be set.
*/
    public void setFiller2(String value) {
      filler2 = value;
    }
/**
Used to set a value for d__ch_tot_auth_pend.
@param value  the value to be set.
*/
    public void setD__ch_tot_auth_pend(String value) {
      d__ch_tot_auth_pend = value;
    }
/**
Used to set a value for d__ch_tot_dc_aleu.
@param value  the value to be set.
*/
    public void setD__ch_tot_dc_aleu(String value) {
      d__ch_tot_dc_aleu = value;
    }
/**
Used to set a value for d__ch_tot_dc_steu.
@param value  the value to be set.
*/
    public void setD__ch_tot_dc_steu(String value) {
      d__ch_tot_dc_steu = value;
    }
/**
Used to set a value for d__ch_tx_time_r.
@param value  the value to be set.
*/
    public void setD__ch_tx_time_r(String value) {
      d__ch_tx_time_r = value;
    }
/**
Used to set a value for filler3.
@param value  the value to be set.
*/
    public void setFiller3(String value) {
      filler3 = value;
    }
/**
Used to set a value for d__ch_dom_sale_max_tx.
@param value  the value to be set.
*/
    public void setD__ch_dom_sale_max_tx(String value) {
      d__ch_dom_sale_max_tx = value;
    }
/**
Used to set a value for d__ch_dom_cash_max_tx.
@param value  the value to be set.
*/
    public void setD__ch_dom_cash_max_tx(String value) {
      d__ch_dom_cash_max_tx = value;
    }
/**
Used to set a value for d__ch_int_sale_max_tx.
@param value  the value to be set.
*/
    public void setD__ch_int_sale_max_tx(String value) {
      d__ch_int_sale_max_tx = value;
    }
/**
Used to set a value for d__ch_int_cash_max_tx.
@param value  the value to be set.
*/
    public void setD__ch_int_cash_max_tx(String value) {
      d__ch_int_cash_max_tx = value;
    }
/**
Used to set a value for d__ch_dom_sale_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_dom_sale_max_24h(String value) {
      d__ch_dom_sale_max_24h = value;
    }
/**
Used to set a value for d__ch_dom_cash_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_dom_cash_max_24h(String value) {
      d__ch_dom_cash_max_24h = value;
    }
/**
Used to set a value for d__ch_dom_tot_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_dom_tot_max_24h(String value) {
      d__ch_dom_tot_max_24h = value;
    }
/**
Used to set a value for d__ch_int_sale_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_int_sale_max_24h(String value) {
      d__ch_int_sale_max_24h = value;
    }
/**
Used to set a value for d__ch_int_cash_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_int_cash_max_24h(String value) {
      d__ch_int_cash_max_24h = value;
    }
/**
Used to set a value for d__ch_int_tot_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_int_tot_max_24h(String value) {
      d__ch_int_tot_max_24h = value;
    }
/**
Used to set a value for d__ch_sale_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_sale_max_24h(String value) {
      d__ch_sale_max_24h = value;
    }
/**
Used to set a value for d__ch_cash_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_cash_max_24h(String value) {
      d__ch_cash_max_24h = value;
    }
/**
Used to set a value for d__ch_tot_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_tot_max_24h(String value) {
      d__ch_tot_max_24h = value;
    }
/**
Used to set a value for d__ch_card_use_max_24h.
@param value  the value to be set.
*/
    public void setD__ch_card_use_max_24h(String value) {
      d__ch_card_use_max_24h = value;
    }
/**
Used to set a value for d__ch_dom_sale_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_dom_sale_max_7d(String value) {
      d__ch_dom_sale_max_7d = value;
    }
/**
Used to set a value for d__ch_dom_cash_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_dom_cash_max_7d(String value) {
      d__ch_dom_cash_max_7d = value;
    }
/**
Used to set a value for d__ch_dom_tot_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_dom_tot_max_7d(String value) {
      d__ch_dom_tot_max_7d = value;
    }
/**
Used to set a value for d__ch_int_sale_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_int_sale_max_7d(String value) {
      d__ch_int_sale_max_7d = value;
    }
/**
Used to set a value for d__ch_int_cash_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_int_cash_max_7d(String value) {
      d__ch_int_cash_max_7d = value;
    }
/**
Used to set a value for d__ch_int_tot_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_int_tot_max_7d(String value) {
      d__ch_int_tot_max_7d = value;
    }
/**
Used to set a value for d__ch_sale_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_sale_max_7d(String value) {
      d__ch_sale_max_7d = value;
    }
/**
Used to set a value for d__ch_cash_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_cash_max_7d(String value) {
      d__ch_cash_max_7d = value;
    }
/**
Used to set a value for d__ch_tot_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_tot_max_7d(String value) {
      d__ch_tot_max_7d = value;
    }
/**
Used to set a value for d__ch_card_use_max_7d.
@param value  the value to be set.
*/
    public void setD__ch_card_use_max_7d(String value) {
      d__ch_card_use_max_7d = value;
    }
/**
Used to set a value for d__ch_dom_sale_cur_24h.
@param value  the value to be set.
*/
    public void setD__ch_dom_sale_cur_24h(String value) {
      d__ch_dom_sale_cur_24h = value;
    }
/**
Used to set a value for d__ch_dom_cash_cur_24h.
@param value  the value to be set.
*/
    public void setD__ch_dom_cash_cur_24h(String value) {
      d__ch_dom_cash_cur_24h = value;
    }
/**
Used to set a value for d__ch_int_sale_cur_24h.
@param value  the value to be set.
*/
    public void setD__ch_int_sale_cur_24h(String value) {
      d__ch_int_sale_cur_24h = value;
    }
/**
Used to set a value for d__ch_int_cash_cur_24h.
@param value  the value to be set.
*/
    public void setD__ch_int_cash_cur_24h(String value) {
      d__ch_int_cash_cur_24h = value;
    }
/**
Used to set a value for d__ch_card_use_cur_24h.
@param value  the value to be set.
*/
    public void setD__ch_card_use_cur_24h(String value) {
      d__ch_card_use_cur_24h = value;
    }
/**
Used to set a value for d__ch_pointer_24h.
@param value  the value to be set.
*/
    public void setD__ch_pointer_24h(String value) {
      d__ch_pointer_24h = value;
    }
/**
Used to set a value for d__ch__cur_4h_dom_sale.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to set d__ch__cur_4h_dom_sale.
*/
    public void setD__ch__cur_4h_dom_sale(String value,
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_dom_sale = value;
    }
/**
Used to set a value for d__ch__cur_4h_dom_cash.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to set d__ch__cur_4h_dom_cash.
*/
    public void setD__ch__cur_4h_dom_cash(String value,
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_dom_cash = value;
    }
/**
Used to set a value for d__ch__cur_4h_int_sale.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to set d__ch__cur_4h_int_sale.
*/
    public void setD__ch__cur_4h_int_sale(String value,
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_int_sale = value;
    }
/**
Used to set a value for d__ch__cur_4h_int_cash.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to set d__ch__cur_4h_int_cash.
*/
    public void setD__ch__cur_4h_int_cash(String value,
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_int_cash = value;
    }
/**
Used to set a value for d__ch__cur_4h_card_use.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to set d__ch__cur_4h_card_use.
*/
    public void setD__ch__cur_4h_card_use(String value,
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_card_use = value;
    }
/**
Used to set a value for d__ch_dom_sale_cur_7d.
@param value  the value to be set.
*/
    public void setD__ch_dom_sale_cur_7d(String value) {
      d__ch_dom_sale_cur_7d = value;
    }
/**
Used to set a value for d__ch_dom_cash_cur_7d.
@param value  the value to be set.
*/
    public void setD__ch_dom_cash_cur_7d(String value) {
      d__ch_dom_cash_cur_7d = value;
    }
/**
Used to set a value for d__ch_int_sale_cur_7d.
@param value  the value to be set.
*/
    public void setD__ch_int_sale_cur_7d(String value) {
      d__ch_int_sale_cur_7d = value;
    }
/**
Used to set a value for d__ch_int_cash_cur_7d.
@param value  the value to be set.
*/
    public void setD__ch_int_cash_cur_7d(String value) {
      d__ch_int_cash_cur_7d = value;
    }
/**
Used to set a value for d__ch_card_use_cur_7d.
@param value  the value to be set.
*/
    public void setD__ch_card_use_cur_7d(String value) {
      d__ch_card_use_cur_7d = value;
    }
/**
Used to set a value for d__ch_pointer_7d.
@param value  the value to be set.
*/
    public void setD__ch_pointer_7d(String value) {
      d__ch_pointer_7d = value;
    }
/**
Used to set a value for d__ch__cur_day_dom_sale.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to set d__ch__cur_day_dom_sale.
*/
    public void setD__ch__cur_day_dom_sale(String value,
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_dom_sale = value;
    }
/**
Used to set a value for d__ch__cur_day_dom_cash.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to set d__ch__cur_day_dom_cash.
*/
    public void setD__ch__cur_day_dom_cash(String value,
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_dom_cash = value;
    }
/**
Used to set a value for d__ch__cur_day_int_sale.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to set d__ch__cur_day_int_sale.
*/
    public void setD__ch__cur_day_int_sale(String value,
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_int_sale = value;
    }
/**
Used to set a value for d__ch__cur_day_int_cash.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to set d__ch__cur_day_int_cash.
*/
    public void setD__ch__cur_day_int_cash(String value,
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_int_cash = value;
    }
/**
Used to set a value for d__ch__cur_day_card_use.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to set d__ch__cur_day_card_use.
*/
    public void setD__ch__cur_day_card_use(String value,
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_card_use = value;
    }
/**
Used to set a value for user_class.
@param value  the value to be set.
*/
    public void setUser_class(String value) {
      user_class = value;
    }
/**
Used to set a value for user_id.
@param value  the value to be set.
*/
    public void setUser_id(String value) {
      user_id = value;
    }
/**
Used to set a value for state.
@param value  the value to be set.
*/
    public void setState(String value) {
      state = value;
    }
/**
Used to set a value for disable_reason.
@param value  the value to be set.
*/
    public void setDisable_reason(String value) {
      disable_reason = value;
    }
/**
Used to set a value for creation_time_r.
@param value  the value to be set.
*/
    public void setCreation_time_r(String value) {
      creation_time_r = value;
    }
/**
Used to set a value for disable_time_r.
@param value  the value to be set.
*/
    public void setDisable_time_r(String value) {
      disable_time_r = value;
    }
/**
Used to set a value for modif_time_r.
@param value  the value to be set.
*/
    public void setModif_time_r(String value) {
      modif_time_r = value;
    }
/**
Used to set a value for d__ch_curr_pvv.
@param value  the value to be set.
*/
    public void setD__ch_curr_pvv(short value) {
      d__ch_curr_pvv = value;
    }
/**
Used to set a value for d__ch_temp_pvv.
@param value  the value to be set.
*/
    public void setD__ch_temp_pvv(short value) {
      d__ch_temp_pvv = value;
    }
/**
Used to set a value for d__ch_pin_err_cnt.
@param value  the value to be set.
*/
    public void setD__ch_pin_err_cnt(String value) {
      d__ch_pin_err_cnt = value;
    }
/**
Used to set a value for d__ch_pin_disable.
@param value  the value to be set.
*/
    public void setD__ch_pin_disable(String value) {
      d__ch_pin_disable = value;
    }
/**
Used to set a value for d__ch_updt_nr.
@param value  the value to be set.
*/
    public void setD__ch_updt_nr(String value) {
      d__ch_updt_nr = value;
    }
/**
Used to set a value for trace_nr.
@param value  the value to be set.
*/
    public void setTrace_nr(String value) {
      trace_nr = value;
    }
/**
Used to set a value for compl_code.
@param value  the value to be set.
*/
    public void setCompl_code(String value) {
      compl_code = value;
    }
/**
Used to set a value for reply_code.
@param value  the value to be set.
*/
    public void setReply_code(short value) {
      reply_code = value;
    }
/**
Used to set a value for amt.
@param value  the value to be set.
*/
    public void setAmt(String value) {
      amt = value;
    }
/**
Used to set a value for codfin.
@param value  the value to be set.
*/
    public void setCodfin(String value) {
      codfin = value;
    }
/**
Used to set a value for tx_type.
@param value  the value to be set.
*/
    public void setTx_type(String value) {
      tx_type = value;
    }
/**
Used to set a value for datim_r.
@param value  the value to be set.
*/
    public void setDatim_r(String value) {
      datim_r = value;
    }
/**
Used to set a value for iso2_ind.
@param value  the value to be set.
*/
    public void setIso2_ind(String value) {
      iso2_ind = value;
    }
/**
Used to set a value for mid.
@param value  the value to be set.
*/
    public void setMid(String value) {
      mid = value;
    }
/**
Used to set a value for me_brand.
@param value  the value to be set.
*/
    public void setMe_brand(String value) {
      me_brand = value;
    }
/**
Used to set a value for card_exp_date_year.
@param value  the value to be set.
*/
    public void setCard_exp_date_year(String value) {
      card_exp_date_year = value;
    }
/**
Used to set a value for card_exp_date_month.
@param value  the value to be set.
*/
    public void setCard_exp_date_month(String value) {
      card_exp_date_month = value;
    }
/**
Used to set a value for uid.
@param value  the value to be set.
*/
    public void setUid(String value) {
      uid = value;
    }
/**
Used to set a value for te_brand.
@param value  the value to be set.
*/
    public void setTe_brand(String value) {
      te_brand = value;
    }
/**
Used to set a value for filler4.
@param value  the value to be set.
*/
    public void setFiller4(String value) {
      filler4 = value;
    }
/**
Used to set a value for response_table.
@param value  the value to be set.
*/
    public void setResponse_table(String value) {
      response_table = value;
    }
/**
Used to set a value for decision_table.
@param value  the value to be set.
*/
    public void setDecision_table(String value) {
      decision_table = value;
    }
/**
Used to set a value for d__ch_atm_last_date_r.
@param value  the value to be set.
*/
    public void setD__ch_atm_last_date_r(String value) {
      d__ch_atm_last_date_r = value;
    }
/**
Used to set a value for d__ch_tot_tx_amount.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch_atm_tot_curr_tx for which you want to set d__ch_tot_tx_amount.
*/
    public void setD__ch_tot_tx_amount(String value,
                                  int _i0) {
      d__ch_atm_tot_curr_tx[_i0].d__ch_tot_tx_amount = value;
    }
/**
Used to set a value for d__ch_tot_nb_tx.
@param value  the value to be set.
@param _i0  index which identifies the occurrence of d__ch_atm_tot_curr_tx for which you want to set d__ch_tot_nb_tx.
*/
    public void setD__ch_tot_nb_tx(String value,
                                  int _i0) {
      d__ch_atm_tot_curr_tx[_i0].d__ch_tot_nb_tx = value;
    }
/**
Used to set a value for d__ch_pin_ch_allowed_ind.
@param value  the value to be set.
*/
    public void setD__ch_pin_ch_allowed_ind(String value) {
      d__ch_pin_ch_allowed_ind = value;
    }
/**
Used to set a value for d__ch_pin_change_busy_ind.
@param value  the value to be set.
*/
    public void setD__ch_pin_change_busy_ind(String value) {
      d__ch_pin_change_busy_ind = value;
    }
/**
Used to set a value for d__ch_exp_yy_last_appr_tx.
@param value  the value to be set.
*/
    public void setD__ch_exp_yy_last_appr_tx(String value) {
      d__ch_exp_yy_last_appr_tx = value;
    }
/**
Used to set a value for d__ch_curr_pvv_date_time_r.
@param value  the value to be set.
*/
    public void setD__ch_curr_pvv_date_time_r(String value) {
      d__ch_curr_pvv_date_time_r = value;
    }
/**
Used to set a value for d__ch_curr_pvki.
@param value  the value to be set.
*/
    public void setD__ch_curr_pvki(String value) {
      d__ch_curr_pvki = value;
    }
/**
Used to set a value for d__ch_temp_pvv_date_time_r.
@param value  the value to be set.
*/
    public void setD__ch_temp_pvv_date_time_r(String value) {
      d__ch_temp_pvv_date_time_r = value;
    }
/**
Used to set a value for d__ch_temp_pvki.
@param value  the value to be set.
*/
    public void setD__ch_temp_pvki(String value) {
      d__ch_temp_pvki = value;
    }
/**
Used to set a value for d__ch_try_pin_change.
@param value  the value to be set.
*/
    public void setD__ch_try_pin_change(String value) {
      d__ch_try_pin_change = value;
    }
/**
Used to set a value for d__ch_iss_id.
@param value  the value to be set.
*/
    public void setD__ch_iss_id(String value) {
      d__ch_iss_id = value;
    }
/**
Used to set a value for d__ch_visa_key_set.
@param value  the value to be set.
*/
    public void setD__ch_visa_key_set(String value) {
      d__ch_visa_key_set = value;
    }
/**
Used to set a value for d__ch_cash_limit_ind.
@param value  the value to be set.
*/
    public void setD__ch_cash_limit_ind(String value) {
      d__ch_cash_limit_ind = value;
    }
/**
Used to set a value for d__ch_cash_limit.
@param value  the value to be set.
*/
    public void setD__ch_cash_limit(String value) {
      d__ch_cash_limit = value;
    }
/**
Used to set a value for d__ch_account_ind.
@param value  the value to be set.
*/
    public void setD__ch_account_ind(String value) {
      d__ch_account_ind = value;
    }
/**
Used to set a value for d__ch_account.
@param value  the value to be set.
*/
    public void setD__ch_account(String value) {
      d__ch_account = value;
    }
/**
Used to set a value for d__ch_cash_limit_bank.
@param value  the value to be set.
*/
    public void setD__ch_cash_limit_bank(String value) {
      d__ch_cash_limit_bank = value;
    }
/**
Used to set a value for d__ch_cash_limit_date_r.
@param value  the value to be set.
*/
    public void setD__ch_cash_limit_date_r(String value) {
      d__ch_cash_limit_date_r = value;
    }
/**
Used to set a value for d__ch_emv_sd_id.
@param value  the value to be set.
*/
    public void setD__ch_emv_sd_id(String value) {
      d__ch_emv_sd_id = value;
    }
/**
Used to set a value for d__ch_emv_app_inst.
@param value  the value to be set.
*/
    public void setD__ch_emv_app_inst(String value) {
      d__ch_emv_app_inst = value;
    }
/**
Used to set a value for d__ch_emv_mk_ver.
@param value  the value to be set.
*/
    public void setD__ch_emv_mk_ver(String value) {
      d__ch_emv_mk_ver = value;
    }
/**
Used to set a value for d__ch_emv_atc.
@param value  the value to be set.
*/
    public void setD__ch_emv_atc(String value) {
      d__ch_emv_atc = value;
    }
/**
Used to set a value for d__ch_pin_synchro.
@param value  the value to be set.
*/
    public void setD__ch_pin_synchro(String value) {
      d__ch_pin_synchro = value;
    }
/**
Used to set a value for d__ch_crit_script_script_number.
@param value  the value to be set.
*/
    public void setD__ch_crit_script_script_number(String value) {
      d__ch_crit_script_script_number = value;
    }
/**
Used to set a value for d__ch_crit_script_flag_script_ready.
@param value  the value to be set.
*/
    public void setD__ch_crit_script_flag_script_ready(String value) {
      d__ch_crit_script_flag_script_ready = value;
    }
/**
Used to set a value for d__ch_crit_script_flag_script_sent.
@param value  the value to be set.
*/
    public void setD__ch_crit_script_flag_script_sent(String value) {
      d__ch_crit_script_flag_script_sent = value;
    }
/**
Used to set a value for d__ch_script_pri_1_script_number.
@param value  the value to be set.
*/
    public void setD__ch_script_pri_1_script_number(String value) {
      d__ch_script_pri_1_script_number = value;
    }
/**
Used to set a value for d__ch_script_pri_1_flag_script_ready.
@param value  the value to be set.
*/
    public void setD__ch_script_pri_1_flag_script_ready(String value) {
      d__ch_script_pri_1_flag_script_ready = value;
    }
/**
Used to set a value for d__ch_script_pri_1_flag_script_sent.
@param value  the value to be set.
*/
    public void setD__ch_script_pri_1_flag_script_sent(String value) {
      d__ch_script_pri_1_flag_script_sent = value;
    }
/**
Used to set a value for d__ch_script_pri_2_script_number.
@param value  the value to be set.
*/
    public void setD__ch_script_pri_2_script_number(String value) {
      d__ch_script_pri_2_script_number = value;
    }
/**
Used to set a value for d__ch_script_pri_2_flag_script_ready.
@param value  the value to be set.
*/
    public void setD__ch_script_pri_2_flag_script_ready(String value) {
      d__ch_script_pri_2_flag_script_ready = value;
    }
/**
Used to set a value for d__ch_script_pri_2_flag_script_sent.
@param value  the value to be set.
*/
    public void setD__ch_script_pri_2_flag_script_sent(String value) {
      d__ch_script_pri_2_flag_script_sent = value;
    }
/**
Used to set a value for d__ch_emv_card_nr.
@param value  the value to be set.
*/
    public void setD__ch_emv_card_nr(String value) {
      d__ch_emv_card_nr = value;
    }
/**
Used to set a value for d__ch_calc_counter.
@param value  the value to be set.
*/
    public void setD__ch_calc_counter(String value) {
      d__ch_calc_counter = value;
    }
/**
Used to set a value for d__ch_oltb_ind.
@param value  the value to be set.
*/
    public void setD__ch_oltb_ind(String value) {
      d__ch_oltb_ind = value;
    }
/**
Used to set a value for d__ch_second_card_ind.
@param value  the value to be set.
*/
    public void setD__ch_second_card_ind(String value) {
      d__ch_second_card_ind = value;
    }
/**
Used to set a value for d__ch_old_icvv_ind.
@param value  the value to be set.
*/
    public void setD__ch_old_icvv_ind(String value) {
      d__ch_old_icvv_ind = value;
    }
/**
Used to set a value for d__ch_new_icvv_ind.
@param value  the value to be set.
*/
    public void setD__ch_new_icvv_ind(String value) {
      d__ch_new_icvv_ind = value;
    }
/**
Used to set a value for d__ch_wng_icvv_ind.
@param value  the value to be set.
*/
    public void setD__ch_wng_icvv_ind(String value) {
      d__ch_wng_icvv_ind = value;
    }
/**
Used to set a value for d__ch_emv_card_type.
@param value  the value to be set.
*/
    public void setD__ch_emv_card_type(String value) {
      d__ch_emv_card_type = value;
    }
/**
Used to set a value for d__ch_cust_nr.
@param value  the value to be set.
*/
    public void setD__ch_cust_nr(String value) {
      d__ch_cust_nr = value;
    }
/**
Used to set a value for d__ch_bor_sec_code_try.
@param value  the value to be set.
*/
    public void setD__ch_bor_sec_code_try(String value) {
      d__ch_bor_sec_code_try = value;
    }
/**
Used to set a value for d__ch_emv_load_sum.
@param value  the value to be set.
*/
    public void setD__ch_emv_load_sum(String value) {
      d__ch_emv_load_sum = value;
    }
/**
Used to set a value for d__ch_emv_spent_sum.
@param value  the value to be set.
*/
    public void setD__ch_emv_spent_sum(String value) {
      d__ch_emv_spent_sum = value;
    }
/**
Used to set a value for d__ch_emv_offline_tx.
@param value  the value to be set.
*/
    public void setD__ch_emv_offline_tx(String value) {
      d__ch_emv_offline_tx = value;
    }
/**
Used to set a value for d__ch_emv_cntless_ind.
@param value  the value to be set.
*/
    public void setD__ch_emv_cntless_ind(String value) {
      d__ch_emv_cntless_ind = value;
    }
/**
Used to set a value for d__ch_new_emue.
@param value  the value to be set.
*/
    public void setD__ch_new_emue(String value) {
      d__ch_new_emue = value;
    }
/**
Used to set a value for d__ch_dkvk_ind.
@param value  the value to be set.
*/
    public void setD__ch_dkvk_ind(String value) {
      d__ch_dkvk_ind = value;
    }
/**
Used to set a value for d__ch_dkvk_time_r.
@param value  the value to be set.
*/
    public void setD__ch_dkvk_time_r(String value) {
      d__ch_dkvk_time_r = value;
    }
/**
Used to set a value for d__ch_dkvk_ym.
@param value  the value to be set.
*/
    public void setD__ch_dkvk_ym(String value) {
      d__ch_dkvk_ym = value;
    }
/**
Used to set a value for d__ch_dkvk_sc.
@param value  the value to be set.
*/
    public void setD__ch_dkvk_sc(String value) {
      d__ch_dkvk_sc = value;
    }
/**
Used to set a value for d__ch_dkvk_min.
@param value  the value to be set.
*/
    public void setD__ch_dkvk_min(String value) {
      d__ch_dkvk_min = value;
    }
/**
Used to set a value for d__ch_dkvk_static_ind.
@param value  the value to be set.
*/
    public void setD__ch_dkvk_static_ind(String value) {
      d__ch_dkvk_static_ind = value;
    }
/**
Used to set a value for d__ch_act_flag1_old.
@param value  the value to be set.
*/
    public void setD__ch_act_flag1_old(String value) {
      d__ch_act_flag1_old = value;
    }
/**
Used to set a value for d__ch_act_flag2_old.
@param value  the value to be set.
*/
    public void setD__ch_act_flag2_old(String value) {
      d__ch_act_flag2_old = value;
    }
/**
Used to set a value for d__ch_act_flag1_new.
@param value  the value to be set.
*/
    public void setD__ch_act_flag1_new(String value) {
      d__ch_act_flag1_new = value;
    }
/**
Used to set a value for d__ch_act_flag2_new.
@param value  the value to be set.
*/
    public void setD__ch_act_flag2_new(String value) {
      d__ch_act_flag2_new = value;
    }
/**
Used to set a value for d__ch_pvv_cvv_ind_old.
@param value  the value to be set.
*/
    public void setD__ch_pvv_cvv_ind_old(String value) {
      d__ch_pvv_cvv_ind_old = value;
    }
/**
Used to set a value for d__ch_pvv_cvv_ind_new.
@param value  the value to be set.
*/
    public void setD__ch_pvv_cvv_ind_new(String value) {
      d__ch_pvv_cvv_ind_new = value;
    }
/**
Used to set a value for d__ch_internet_ind_old.
@param value  the value to be set.
*/
    public void setD__ch_internet_ind_old(String value) {
      d__ch_internet_ind_old = value;
    }
/**
Used to set a value for d__ch_internet_ind_new.
@param value  the value to be set.
*/
    public void setD__ch_internet_ind_new(String value) {
      d__ch_internet_ind_new = value;
    }
/**
Used to set a value for d__ch_act_flag3.
@param value  the value to be set.
*/
    public void setD__ch_act_flag3(String value) {
      d__ch_act_flag3 = value;
    }
/**
Used to set a value for d__ch_sca_count.
@param value  the value to be set.
*/
    public void setD__ch_sca_count(String value) {
      d__ch_sca_count = value;
    }
/**
Used to set a value for d__ch_sca_count_3d.
@param value  the value to be set.
*/
    public void setD__ch_sca_count_3d(String value) {
      d__ch_sca_count_3d = value;
    }
/**
Used to set a value for d__ch_sca_amt.
@param value  the value to be set.
*/
    public void setD__ch_sca_amt(String value) {
      d__ch_sca_amt = value;
    }
/**
Used to set a value for filler5.
@param value  the value to be set.
*/
    public void setFiller5(String value) {
      filler5 = value;
    }

/**
Used to clear any existing values for d__ch_card_pan_r.
*/
    public void clearD__ch_card_pan_r() {
        d__ch_card_pan_r = null;
    }
/**
Used to clear any existing values for filler0.
*/
    public void clearFiller0() {
        filler0 = null;
    }
/**
Used to clear any existing values for filler1.
*/
    public void clearFiller1() {
        filler1 = null;
    }
/**
Used to clear any existing values for d__ch_name.
*/
    public void clearD__ch_name() {
        d__ch_name = null;
    }
/**
Used to clear any existing values for d__ch_curcy_code.
*/
    public void clearD__ch_curcy_code() {
        d__ch_curcy_code = null;
    }
/**
Used to clear any existing values for d__ch_except_ind_int.
*/
    public void clearD__ch_except_ind_int() {
        d__ch_except_ind_int = (short)0;
    }
/**
Used to clear any existing values for d__ch_except_ind_dom.
*/
    public void clearD__ch_except_ind_dom() {
        d__ch_except_ind_dom = (short)0;
    }
/**
Used to clear any existing values for d__ch_purge_date_year.
*/
    public void clearD__ch_purge_date_year() {
        d__ch_purge_date_year = null;
    }
/**
Used to clear any existing values for d__ch_purge_date_month.
*/
    public void clearD__ch_purge_date_month() {
        d__ch_purge_date_month = null;
    }
/**
Used to clear any existing values for d__ch_region_code.
*/
    public void clearD__ch_region_code() {
        d__ch_region_code = null;
    }
/**
Used to clear any existing values for d__ch_exp_date_year.
*/
    public void clearD__ch_exp_date_year() {
        d__ch_exp_date_year = null;
    }
/**
Used to clear any existing values for d__ch_exp_date_month.
*/
    public void clearD__ch_exp_date_month() {
        d__ch_exp_date_month = null;
    }
/**
Used to clear any existing values for d__ch_saldo_on_host.
*/
    public void clearD__ch_saldo_on_host() {
        d__ch_saldo_on_host = null;
    }
/**
Used to clear any existing values for d__ch_crac_limit.
*/
    public void clearD__ch_crac_limit() {
        d__ch_crac_limit = null;
    }
/**
Used to clear any existing values for d__ch_temp_disp_increm.
*/
    public void clearD__ch_temp_disp_increm() {
        d__ch_temp_disp_increm = null;
    }
/**
Used to clear any existing values for d__ch_max_date_increm_r.
*/
    public void clearD__ch_max_date_increm_r() {
        d__ch_max_date_increm_r = null;
    }
/**
Used to clear any existing values for filler2.
*/
    public void clearFiller2() {
        filler2 = null;
    }
/**
Used to clear any existing values for d__ch_tot_auth_pend.
*/
    public void clearD__ch_tot_auth_pend() {
        d__ch_tot_auth_pend = null;
    }
/**
Used to clear any existing values for d__ch_tot_dc_aleu.
*/
    public void clearD__ch_tot_dc_aleu() {
        d__ch_tot_dc_aleu = null;
    }
/**
Used to clear any existing values for d__ch_tot_dc_steu.
*/
    public void clearD__ch_tot_dc_steu() {
        d__ch_tot_dc_steu = null;
    }
/**
Used to clear any existing values for d__ch_tx_time_r.
*/
    public void clearD__ch_tx_time_r() {
        d__ch_tx_time_r = null;
    }
/**
Used to clear any existing values for filler3.
*/
    public void clearFiller3() {
        filler3 = null;
    }
/**
Used to clear any existing values for d__ch_dom_sale_max_tx.
*/
    public void clearD__ch_dom_sale_max_tx() {
        d__ch_dom_sale_max_tx = null;
    }
/**
Used to clear any existing values for d__ch_dom_cash_max_tx.
*/
    public void clearD__ch_dom_cash_max_tx() {
        d__ch_dom_cash_max_tx = null;
    }
/**
Used to clear any existing values for d__ch_int_sale_max_tx.
*/
    public void clearD__ch_int_sale_max_tx() {
        d__ch_int_sale_max_tx = null;
    }
/**
Used to clear any existing values for d__ch_int_cash_max_tx.
*/
    public void clearD__ch_int_cash_max_tx() {
        d__ch_int_cash_max_tx = null;
    }
/**
Used to clear any existing values for d__ch_dom_sale_max_24h.
*/
    public void clearD__ch_dom_sale_max_24h() {
        d__ch_dom_sale_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_dom_cash_max_24h.
*/
    public void clearD__ch_dom_cash_max_24h() {
        d__ch_dom_cash_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_dom_tot_max_24h.
*/
    public void clearD__ch_dom_tot_max_24h() {
        d__ch_dom_tot_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_int_sale_max_24h.
*/
    public void clearD__ch_int_sale_max_24h() {
        d__ch_int_sale_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_int_cash_max_24h.
*/
    public void clearD__ch_int_cash_max_24h() {
        d__ch_int_cash_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_int_tot_max_24h.
*/
    public void clearD__ch_int_tot_max_24h() {
        d__ch_int_tot_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_sale_max_24h.
*/
    public void clearD__ch_sale_max_24h() {
        d__ch_sale_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_cash_max_24h.
*/
    public void clearD__ch_cash_max_24h() {
        d__ch_cash_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_tot_max_24h.
*/
    public void clearD__ch_tot_max_24h() {
        d__ch_tot_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_card_use_max_24h.
*/
    public void clearD__ch_card_use_max_24h() {
        d__ch_card_use_max_24h = null;
    }
/**
Used to clear any existing values for d__ch_dom_sale_max_7d.
*/
    public void clearD__ch_dom_sale_max_7d() {
        d__ch_dom_sale_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_dom_cash_max_7d.
*/
    public void clearD__ch_dom_cash_max_7d() {
        d__ch_dom_cash_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_dom_tot_max_7d.
*/
    public void clearD__ch_dom_tot_max_7d() {
        d__ch_dom_tot_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_int_sale_max_7d.
*/
    public void clearD__ch_int_sale_max_7d() {
        d__ch_int_sale_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_int_cash_max_7d.
*/
    public void clearD__ch_int_cash_max_7d() {
        d__ch_int_cash_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_int_tot_max_7d.
*/
    public void clearD__ch_int_tot_max_7d() {
        d__ch_int_tot_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_sale_max_7d.
*/
    public void clearD__ch_sale_max_7d() {
        d__ch_sale_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_cash_max_7d.
*/
    public void clearD__ch_cash_max_7d() {
        d__ch_cash_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_tot_max_7d.
*/
    public void clearD__ch_tot_max_7d() {
        d__ch_tot_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_card_use_max_7d.
*/
    public void clearD__ch_card_use_max_7d() {
        d__ch_card_use_max_7d = null;
    }
/**
Used to clear any existing values for d__ch_dom_sale_cur_24h.
*/
    public void clearD__ch_dom_sale_cur_24h() {
        d__ch_dom_sale_cur_24h = null;
    }
/**
Used to clear any existing values for d__ch_dom_cash_cur_24h.
*/
    public void clearD__ch_dom_cash_cur_24h() {
        d__ch_dom_cash_cur_24h = null;
    }
/**
Used to clear any existing values for d__ch_int_sale_cur_24h.
*/
    public void clearD__ch_int_sale_cur_24h() {
        d__ch_int_sale_cur_24h = null;
    }
/**
Used to clear any existing values for d__ch_int_cash_cur_24h.
*/
    public void clearD__ch_int_cash_cur_24h() {
        d__ch_int_cash_cur_24h = null;
    }
/**
Used to clear any existing values for d__ch_card_use_cur_24h.
*/
    public void clearD__ch_card_use_cur_24h() {
        d__ch_card_use_cur_24h = null;
    }
/**
Used to clear any existing values for d__ch_pointer_24h.
*/
    public void clearD__ch_pointer_24h() {
        d__ch_pointer_24h = null;
    }
/**
Used to clear any existing values for d__ch__cur_4h_dom_sale.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to clear d__ch__cur_4h_dom_sale.
*/
    public void clearD__ch__cur_4h_dom_sale(
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_dom_sale = null;
    }
/**
Used to clear any existing values for d__ch__cur_4h_dom_cash.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to clear d__ch__cur_4h_dom_cash.
*/
    public void clearD__ch__cur_4h_dom_cash(
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_dom_cash = null;
    }
/**
Used to clear any existing values for d__ch__cur_4h_int_sale.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to clear d__ch__cur_4h_int_sale.
*/
    public void clearD__ch__cur_4h_int_sale(
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_int_sale = null;
    }
/**
Used to clear any existing values for d__ch__cur_4h_int_cash.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to clear d__ch__cur_4h_int_cash.
*/
    public void clearD__ch__cur_4h_int_cash(
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_int_cash = null;
    }
/**
Used to clear any existing values for d__ch__cur_4h_card_use.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to clear d__ch__cur_4h_card_use.
*/
    public void clearD__ch__cur_4h_card_use(
                                  int _i0) {
      d__ch__cur_4h[_i0].d__ch__cur_4h_card_use = null;
    }
/**
Used to clear any existing values for d__ch_dom_sale_cur_7d.
*/
    public void clearD__ch_dom_sale_cur_7d() {
        d__ch_dom_sale_cur_7d = null;
    }
/**
Used to clear any existing values for d__ch_dom_cash_cur_7d.
*/
    public void clearD__ch_dom_cash_cur_7d() {
        d__ch_dom_cash_cur_7d = null;
    }
/**
Used to clear any existing values for d__ch_int_sale_cur_7d.
*/
    public void clearD__ch_int_sale_cur_7d() {
        d__ch_int_sale_cur_7d = null;
    }
/**
Used to clear any existing values for d__ch_int_cash_cur_7d.
*/
    public void clearD__ch_int_cash_cur_7d() {
        d__ch_int_cash_cur_7d = null;
    }
/**
Used to clear any existing values for d__ch_card_use_cur_7d.
*/
    public void clearD__ch_card_use_cur_7d() {
        d__ch_card_use_cur_7d = null;
    }
/**
Used to clear any existing values for d__ch_pointer_7d.
*/
    public void clearD__ch_pointer_7d() {
        d__ch_pointer_7d = null;
    }
/**
Used to clear any existing values for d__ch__cur_day_dom_sale.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to clear d__ch__cur_day_dom_sale.
*/
    public void clearD__ch__cur_day_dom_sale(
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_dom_sale = null;
    }
/**
Used to clear any existing values for d__ch__cur_day_dom_cash.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to clear d__ch__cur_day_dom_cash.
*/
    public void clearD__ch__cur_day_dom_cash(
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_dom_cash = null;
    }
/**
Used to clear any existing values for d__ch__cur_day_int_sale.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to clear d__ch__cur_day_int_sale.
*/
    public void clearD__ch__cur_day_int_sale(
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_int_sale = null;
    }
/**
Used to clear any existing values for d__ch__cur_day_int_cash.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to clear d__ch__cur_day_int_cash.
*/
    public void clearD__ch__cur_day_int_cash(
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_int_cash = null;
    }
/**
Used to clear any existing values for d__ch__cur_day_card_use.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to clear d__ch__cur_day_card_use.
*/
    public void clearD__ch__cur_day_card_use(
                                  int _i0) {
      d__ch__cur_day[_i0].d__ch__cur_day_card_use = null;
    }
/**
Used to clear any existing values for user_class.
*/
    public void clearUser_class() {
        user_class = null;
    }
/**
Used to clear any existing values for user_id.
*/
    public void clearUser_id() {
        user_id = null;
    }
/**
Used to clear any existing values for state.
*/
    public void clearState() {
        state = null;
    }
/**
Used to clear any existing values for disable_reason.
*/
    public void clearDisable_reason() {
        disable_reason = null;
    }
/**
Used to clear any existing values for creation_time_r.
*/
    public void clearCreation_time_r() {
        creation_time_r = null;
    }
/**
Used to clear any existing values for disable_time_r.
*/
    public void clearDisable_time_r() {
        disable_time_r = null;
    }
/**
Used to clear any existing values for modif_time_r.
*/
    public void clearModif_time_r() {
        modif_time_r = null;
    }
/**
Used to clear any existing values for d__ch_curr_pvv.
*/
    public void clearD__ch_curr_pvv() {
        d__ch_curr_pvv = (short)0;
    }
/**
Used to clear any existing values for d__ch_temp_pvv.
*/
    public void clearD__ch_temp_pvv() {
        d__ch_temp_pvv = (short)0;
    }
/**
Used to clear any existing values for d__ch_pin_err_cnt.
*/
    public void clearD__ch_pin_err_cnt() {
        d__ch_pin_err_cnt = null;
    }
/**
Used to clear any existing values for d__ch_pin_disable.
*/
    public void clearD__ch_pin_disable() {
        d__ch_pin_disable = null;
    }
/**
Used to clear any existing values for d__ch_updt_nr.
*/
    public void clearD__ch_updt_nr() {
        d__ch_updt_nr = null;
    }
/**
Used to clear any existing values for trace_nr.
*/
    public void clearTrace_nr() {
        trace_nr = null;
    }
/**
Used to clear any existing values for compl_code.
*/
    public void clearCompl_code() {
        compl_code = null;
    }
/**
Used to clear any existing values for reply_code.
*/
    public void clearReply_code() {
        reply_code = (short)0;
    }
/**
Used to clear any existing values for amt.
*/
    public void clearAmt() {
        amt = null;
    }
/**
Used to clear any existing values for codfin.
*/
    public void clearCodfin() {
        codfin = null;
    }
/**
Used to clear any existing values for tx_type.
*/
    public void clearTx_type() {
        tx_type = null;
    }
/**
Used to clear any existing values for datim_r.
*/
    public void clearDatim_r() {
        datim_r = null;
    }
/**
Used to clear any existing values for iso2_ind.
*/
    public void clearIso2_ind() {
        iso2_ind = null;
    }
/**
Used to clear any existing values for mid.
*/
    public void clearMid() {
        mid = null;
    }
/**
Used to clear any existing values for me_brand.
*/
    public void clearMe_brand() {
        me_brand = null;
    }
/**
Used to clear any existing values for card_exp_date_year.
*/
    public void clearCard_exp_date_year() {
        card_exp_date_year = null;
    }
/**
Used to clear any existing values for card_exp_date_month.
*/
    public void clearCard_exp_date_month() {
        card_exp_date_month = null;
    }
/**
Used to clear any existing values for uid.
*/
    public void clearUid() {
        uid = null;
    }
/**
Used to clear any existing values for te_brand.
*/
    public void clearTe_brand() {
        te_brand = null;
    }
/**
Used to clear any existing values for filler4.
*/
    public void clearFiller4() {
        filler4 = null;
    }
/**
Used to clear any existing values for response_table.
*/
    public void clearResponse_table() {
        response_table = null;
    }
/**
Used to clear any existing values for decision_table.
*/
    public void clearDecision_table() {
        decision_table = null;
    }
/**
Used to clear any existing values for d__ch_atm_last_date_r.
*/
    public void clearD__ch_atm_last_date_r() {
        d__ch_atm_last_date_r = null;
    }
/**
Used to clear any existing values for d__ch_tot_tx_amount.
@param _i0  index which identifies the occurrence of d__ch_atm_tot_curr_tx for which you want to clear d__ch_tot_tx_amount.
*/
    public void clearD__ch_tot_tx_amount(
                                  int _i0) {
      d__ch_atm_tot_curr_tx[_i0].d__ch_tot_tx_amount = null;
    }
/**
Used to clear any existing values for d__ch_tot_nb_tx.
@param _i0  index which identifies the occurrence of d__ch_atm_tot_curr_tx for which you want to clear d__ch_tot_nb_tx.
*/
    public void clearD__ch_tot_nb_tx(
                                  int _i0) {
      d__ch_atm_tot_curr_tx[_i0].d__ch_tot_nb_tx = null;
    }
/**
Used to clear any existing values for d__ch_pin_ch_allowed_ind.
*/
    public void clearD__ch_pin_ch_allowed_ind() {
        d__ch_pin_ch_allowed_ind = null;
    }
/**
Used to clear any existing values for d__ch_pin_change_busy_ind.
*/
    public void clearD__ch_pin_change_busy_ind() {
        d__ch_pin_change_busy_ind = null;
    }
/**
Used to clear any existing values for d__ch_exp_yy_last_appr_tx.
*/
    public void clearD__ch_exp_yy_last_appr_tx() {
        d__ch_exp_yy_last_appr_tx = null;
    }
/**
Used to clear any existing values for d__ch_curr_pvv_date_time_r.
*/
    public void clearD__ch_curr_pvv_date_time_r() {
        d__ch_curr_pvv_date_time_r = null;
    }
/**
Used to clear any existing values for d__ch_curr_pvki.
*/
    public void clearD__ch_curr_pvki() {
        d__ch_curr_pvki = null;
    }
/**
Used to clear any existing values for d__ch_temp_pvv_date_time_r.
*/
    public void clearD__ch_temp_pvv_date_time_r() {
        d__ch_temp_pvv_date_time_r = null;
    }
/**
Used to clear any existing values for d__ch_temp_pvki.
*/
    public void clearD__ch_temp_pvki() {
        d__ch_temp_pvki = null;
    }
/**
Used to clear any existing values for d__ch_try_pin_change.
*/
    public void clearD__ch_try_pin_change() {
        d__ch_try_pin_change = null;
    }
/**
Used to clear any existing values for d__ch_iss_id.
*/
    public void clearD__ch_iss_id() {
        d__ch_iss_id = null;
    }
/**
Used to clear any existing values for d__ch_visa_key_set.
*/
    public void clearD__ch_visa_key_set() {
        d__ch_visa_key_set = null;
    }
/**
Used to clear any existing values for d__ch_cash_limit_ind.
*/
    public void clearD__ch_cash_limit_ind() {
        d__ch_cash_limit_ind = null;
    }
/**
Used to clear any existing values for d__ch_cash_limit.
*/
    public void clearD__ch_cash_limit() {
        d__ch_cash_limit = null;
    }
/**
Used to clear any existing values for d__ch_account_ind.
*/
    public void clearD__ch_account_ind() {
        d__ch_account_ind = null;
    }
/**
Used to clear any existing values for d__ch_account.
*/
    public void clearD__ch_account() {
        d__ch_account = null;
    }
/**
Used to clear any existing values for d__ch_cash_limit_bank.
*/
    public void clearD__ch_cash_limit_bank() {
        d__ch_cash_limit_bank = null;
    }
/**
Used to clear any existing values for d__ch_cash_limit_date_r.
*/
    public void clearD__ch_cash_limit_date_r() {
        d__ch_cash_limit_date_r = null;
    }
/**
Used to clear any existing values for d__ch_emv_sd_id.
*/
    public void clearD__ch_emv_sd_id() {
        d__ch_emv_sd_id = null;
    }
/**
Used to clear any existing values for d__ch_emv_app_inst.
*/
    public void clearD__ch_emv_app_inst() {
        d__ch_emv_app_inst = null;
    }
/**
Used to clear any existing values for d__ch_emv_mk_ver.
*/
    public void clearD__ch_emv_mk_ver() {
        d__ch_emv_mk_ver = null;
    }
/**
Used to clear any existing values for d__ch_emv_atc.
*/
    public void clearD__ch_emv_atc() {
        d__ch_emv_atc = null;
    }
/**
Used to clear any existing values for d__ch_pin_synchro.
*/
    public void clearD__ch_pin_synchro() {
        d__ch_pin_synchro = null;
    }
/**
Used to clear any existing values for d__ch_crit_script_script_number.
*/
    public void clearD__ch_crit_script_script_number() {
        d__ch_crit_script_script_number = null;
    }
/**
Used to clear any existing values for d__ch_crit_script_flag_script_ready.
*/
    public void clearD__ch_crit_script_flag_script_ready() {
        d__ch_crit_script_flag_script_ready = null;
    }
/**
Used to clear any existing values for d__ch_crit_script_flag_script_sent.
*/
    public void clearD__ch_crit_script_flag_script_sent() {
        d__ch_crit_script_flag_script_sent = null;
    }
/**
Used to clear any existing values for d__ch_script_pri_1_script_number.
*/
    public void clearD__ch_script_pri_1_script_number() {
        d__ch_script_pri_1_script_number = null;
    }
/**
Used to clear any existing values for d__ch_script_pri_1_flag_script_ready.
*/
    public void clearD__ch_script_pri_1_flag_script_ready() {
        d__ch_script_pri_1_flag_script_ready = null;
    }
/**
Used to clear any existing values for d__ch_script_pri_1_flag_script_sent.
*/
    public void clearD__ch_script_pri_1_flag_script_sent() {
        d__ch_script_pri_1_flag_script_sent = null;
    }
/**
Used to clear any existing values for d__ch_script_pri_2_script_number.
*/
    public void clearD__ch_script_pri_2_script_number() {
        d__ch_script_pri_2_script_number = null;
    }
/**
Used to clear any existing values for d__ch_script_pri_2_flag_script_ready.
*/
    public void clearD__ch_script_pri_2_flag_script_ready() {
        d__ch_script_pri_2_flag_script_ready = null;
    }
/**
Used to clear any existing values for d__ch_script_pri_2_flag_script_sent.
*/
    public void clearD__ch_script_pri_2_flag_script_sent() {
        d__ch_script_pri_2_flag_script_sent = null;
    }
/**
Used to clear any existing values for d__ch_emv_card_nr.
*/
    public void clearD__ch_emv_card_nr() {
        d__ch_emv_card_nr = null;
    }
/**
Used to clear any existing values for d__ch_calc_counter.
*/
    public void clearD__ch_calc_counter() {
        d__ch_calc_counter = null;
    }
/**
Used to clear any existing values for d__ch_oltb_ind.
*/
    public void clearD__ch_oltb_ind() {
        d__ch_oltb_ind = null;
    }
/**
Used to clear any existing values for d__ch_second_card_ind.
*/
    public void clearD__ch_second_card_ind() {
        d__ch_second_card_ind = null;
    }
/**
Used to clear any existing values for d__ch_old_icvv_ind.
*/
    public void clearD__ch_old_icvv_ind() {
        d__ch_old_icvv_ind = null;
    }
/**
Used to clear any existing values for d__ch_new_icvv_ind.
*/
    public void clearD__ch_new_icvv_ind() {
        d__ch_new_icvv_ind = null;
    }
/**
Used to clear any existing values for d__ch_wng_icvv_ind.
*/
    public void clearD__ch_wng_icvv_ind() {
        d__ch_wng_icvv_ind = null;
    }
/**
Used to clear any existing values for d__ch_emv_card_type.
*/
    public void clearD__ch_emv_card_type() {
        d__ch_emv_card_type = null;
    }
/**
Used to clear any existing values for d__ch_cust_nr.
*/
    public void clearD__ch_cust_nr() {
        d__ch_cust_nr = null;
    }
/**
Used to clear any existing values for d__ch_bor_sec_code_try.
*/
    public void clearD__ch_bor_sec_code_try() {
        d__ch_bor_sec_code_try = null;
    }
/**
Used to clear any existing values for d__ch_emv_load_sum.
*/
    public void clearD__ch_emv_load_sum() {
        d__ch_emv_load_sum = null;
    }
/**
Used to clear any existing values for d__ch_emv_spent_sum.
*/
    public void clearD__ch_emv_spent_sum() {
        d__ch_emv_spent_sum = null;
    }
/**
Used to clear any existing values for d__ch_emv_offline_tx.
*/
    public void clearD__ch_emv_offline_tx() {
        d__ch_emv_offline_tx = null;
    }
/**
Used to clear any existing values for d__ch_emv_cntless_ind.
*/
    public void clearD__ch_emv_cntless_ind() {
        d__ch_emv_cntless_ind = null;
    }
/**
Used to clear any existing values for d__ch_new_emue.
*/
    public void clearD__ch_new_emue() {
        d__ch_new_emue = null;
    }
/**
Used to clear any existing values for d__ch_dkvk_ind.
*/
    public void clearD__ch_dkvk_ind() {
        d__ch_dkvk_ind = null;
    }
/**
Used to clear any existing values for d__ch_dkvk_time_r.
*/
    public void clearD__ch_dkvk_time_r() {
        d__ch_dkvk_time_r = null;
    }
/**
Used to clear any existing values for d__ch_dkvk_ym.
*/
    public void clearD__ch_dkvk_ym() {
        d__ch_dkvk_ym = null;
    }
/**
Used to clear any existing values for d__ch_dkvk_sc.
*/
    public void clearD__ch_dkvk_sc() {
        d__ch_dkvk_sc = null;
    }
/**
Used to clear any existing values for d__ch_dkvk_min.
*/
    public void clearD__ch_dkvk_min() {
        d__ch_dkvk_min = null;
    }
/**
Used to clear any existing values for d__ch_dkvk_static_ind.
*/
    public void clearD__ch_dkvk_static_ind() {
        d__ch_dkvk_static_ind = null;
    }
/**
Used to clear any existing values for d__ch_act_flag1_old.
*/
    public void clearD__ch_act_flag1_old() {
        d__ch_act_flag1_old = null;
    }
/**
Used to clear any existing values for d__ch_act_flag2_old.
*/
    public void clearD__ch_act_flag2_old() {
        d__ch_act_flag2_old = null;
    }
/**
Used to clear any existing values for d__ch_act_flag1_new.
*/
    public void clearD__ch_act_flag1_new() {
        d__ch_act_flag1_new = null;
    }
/**
Used to clear any existing values for d__ch_act_flag2_new.
*/
    public void clearD__ch_act_flag2_new() {
        d__ch_act_flag2_new = null;
    }
/**
Used to clear any existing values for d__ch_pvv_cvv_ind_old.
*/
    public void clearD__ch_pvv_cvv_ind_old() {
        d__ch_pvv_cvv_ind_old = null;
    }
/**
Used to clear any existing values for d__ch_pvv_cvv_ind_new.
*/
    public void clearD__ch_pvv_cvv_ind_new() {
        d__ch_pvv_cvv_ind_new = null;
    }
/**
Used to clear any existing values for d__ch_internet_ind_old.
*/
    public void clearD__ch_internet_ind_old() {
        d__ch_internet_ind_old = null;
    }
/**
Used to clear any existing values for d__ch_internet_ind_new.
*/
    public void clearD__ch_internet_ind_new() {
        d__ch_internet_ind_new = null;
    }
/**
Used to clear any existing values for d__ch_act_flag3.
*/
    public void clearD__ch_act_flag3() {
        d__ch_act_flag3 = null;
    }
/**
Used to clear any existing values for d__ch_sca_count.
*/
    public void clearD__ch_sca_count() {
        d__ch_sca_count = null;
    }
/**
Used to clear any existing values for d__ch_sca_count_3d.
*/
    public void clearD__ch_sca_count_3d() {
        d__ch_sca_count_3d = null;
    }
/**
Used to clear any existing values for d__ch_sca_amt.
*/
    public void clearD__ch_sca_amt() {
        d__ch_sca_amt = null;
    }
/**
Used to clear any existing values for filler5.
*/
    public void clearFiller5() {
        filler5 = null;
    }
/** Used to clear the values of all instance variables in this class.
*/
  public void clear_All() {
      d__ch_card_pan_r = null;
      filler0 = null;
      filler1 = null;
      d__ch_name = null;
      d__ch_curcy_code = "0";
      d__ch_except_ind_int = (short)0;
      d__ch_except_ind_dom = (short)0;
      d__ch_purge_date_year = "0";
      d__ch_purge_date_month = "0";
      d__ch_region_code = null;
      d__ch_exp_date_year = "0";
      d__ch_exp_date_month = "0";
      d__ch_saldo_on_host = null;
      d__ch_crac_limit = null;
      d__ch_temp_disp_increm = null;
      d__ch_max_date_increm_r = "0";
      filler2 = null;
      d__ch_tot_auth_pend = null;
      d__ch_tot_dc_aleu = null;
      d__ch_tot_dc_steu = null;
      d__ch_tx_time_r = "0";
      filler3 = null;
      d__ch_dom_sale_max_tx = "0";
      d__ch_dom_cash_max_tx = "0";
      d__ch_int_sale_max_tx = "0";
      d__ch_int_cash_max_tx = "0";
      d__ch_dom_sale_max_24h = "0";
      d__ch_dom_cash_max_24h = "0";
      d__ch_dom_tot_max_24h = "0";
      d__ch_int_sale_max_24h = "0";
      d__ch_int_cash_max_24h = "0";
      d__ch_int_tot_max_24h = "0";
      d__ch_sale_max_24h = "0";
      d__ch_cash_max_24h = "0";
      d__ch_tot_max_24h = "0";
      d__ch_card_use_max_24h = "0";
      d__ch_dom_sale_max_7d = "0";
      d__ch_dom_cash_max_7d = "0";
      d__ch_dom_tot_max_7d = "0";
      d__ch_int_sale_max_7d = "0";
      d__ch_int_cash_max_7d = "0";
      d__ch_int_tot_max_7d = "0";
      d__ch_sale_max_7d = "0";
      d__ch_cash_max_7d = "0";
      d__ch_tot_max_7d = "0";
      d__ch_card_use_max_7d = "0";
      d__ch_dom_sale_cur_24h = "0";
      d__ch_dom_cash_cur_24h = "0";
      d__ch_int_sale_cur_24h = "0";
      d__ch_int_cash_cur_24h = "0";
      d__ch_card_use_cur_24h = "0";
      d__ch_pointer_24h = "0";
      for(int _i0 = 0; _i0 < 6; _i0++) {
        d__ch__cur_4h[_i0].d__ch__cur_4h_dom_sale = "0";
        d__ch__cur_4h[_i0].d__ch__cur_4h_dom_cash = "0";
        d__ch__cur_4h[_i0].d__ch__cur_4h_int_sale = "0";
        d__ch__cur_4h[_i0].d__ch__cur_4h_int_cash = "0";
        d__ch__cur_4h[_i0].d__ch__cur_4h_card_use = "0";
      }
      d__ch_dom_sale_cur_7d = "0";
      d__ch_dom_cash_cur_7d = "0";
      d__ch_int_sale_cur_7d = "0";
      d__ch_int_cash_cur_7d = "0";
      d__ch_card_use_cur_7d = "0";
      d__ch_pointer_7d = "0";
      for(int _i0 = 0; _i0 < 7; _i0++) {
        d__ch__cur_day[_i0].d__ch__cur_day_dom_sale = "0";
        d__ch__cur_day[_i0].d__ch__cur_day_dom_cash = "0";
        d__ch__cur_day[_i0].d__ch__cur_day_int_sale = "0";
        d__ch__cur_day[_i0].d__ch__cur_day_int_cash = "0";
        d__ch__cur_day[_i0].d__ch__cur_day_card_use = "0";
      }
      user_class = null;
      user_id = null;
      state = "0";
      disable_reason = "0";
      creation_time_r = "0";
      disable_time_r = "0";
      modif_time_r = "0";
      d__ch_curr_pvv = (short)0;
      d__ch_temp_pvv = (short)0;
      d__ch_pin_err_cnt = "0";
      d__ch_pin_disable = "0";
      d__ch_updt_nr = "0";
      trace_nr = null;
      compl_code = null;
      reply_code = (short)0;
      amt = null;
      codfin = "0";
      tx_type = "0";
      datim_r = "0";
      iso2_ind = "0";
      mid = null;
      me_brand = null;
      card_exp_date_year = "0";
      card_exp_date_month = "0";
      uid = null;
      te_brand = null;
      filler4 = null;
      response_table = "0";
      decision_table = "0";
      d__ch_atm_last_date_r = "0";
      for(int _i0 = 0; _i0 < 4; _i0++) {
        d__ch_atm_tot_curr_tx[_i0].d__ch_tot_tx_amount = "0";
        d__ch_atm_tot_curr_tx[_i0].d__ch_tot_nb_tx = "0";
      }
      d__ch_pin_ch_allowed_ind = "0";
      d__ch_pin_change_busy_ind = null;
      d__ch_exp_yy_last_appr_tx = "0";
      d__ch_curr_pvv_date_time_r = "0";
      d__ch_curr_pvki = null;
      d__ch_temp_pvv_date_time_r = "0";
      d__ch_temp_pvki = null;
      d__ch_try_pin_change = "0";
      d__ch_iss_id = "0";
      d__ch_visa_key_set = null;
      d__ch_cash_limit_ind = null;
      d__ch_cash_limit = "0";
      d__ch_account_ind = null;
      d__ch_account = null;
      d__ch_cash_limit_bank = "0";
      d__ch_cash_limit_date_r = "0";
      d__ch_emv_sd_id = null;
      d__ch_emv_app_inst = null;
      d__ch_emv_mk_ver = null;
      d__ch_emv_atc = null;
      d__ch_pin_synchro = null;
      d__ch_crit_script_script_number = null;
      d__ch_crit_script_flag_script_ready = null;
      d__ch_crit_script_flag_script_sent = null;
      d__ch_script_pri_1_script_number = null;
      d__ch_script_pri_1_flag_script_ready = null;
      d__ch_script_pri_1_flag_script_sent = null;
      d__ch_script_pri_2_script_number = null;
      d__ch_script_pri_2_flag_script_ready = null;
      d__ch_script_pri_2_flag_script_sent = null;
      d__ch_emv_card_nr = null;
      d__ch_calc_counter = null;
      d__ch_oltb_ind = null;
      d__ch_second_card_ind = null;
      d__ch_old_icvv_ind = null;
      d__ch_new_icvv_ind = null;
      d__ch_wng_icvv_ind = null;
      d__ch_emv_card_type = null;
      d__ch_cust_nr = "0";
      d__ch_bor_sec_code_try = "0";
      d__ch_emv_load_sum = "0";
      d__ch_emv_spent_sum = "0";
      d__ch_emv_offline_tx = "0";
      d__ch_emv_cntless_ind = "0";
      d__ch_new_emue = null;
      d__ch_dkvk_ind = null;
      d__ch_dkvk_time_r = "0";
      d__ch_dkvk_ym = null;
      d__ch_dkvk_sc = null;
      d__ch_dkvk_min = "0";
      d__ch_dkvk_static_ind = null;
      d__ch_act_flag1_old = null;
      d__ch_act_flag2_old = null;
      d__ch_act_flag1_new = null;
      d__ch_act_flag2_new = null;
      d__ch_pvv_cvv_ind_old = null;
      d__ch_pvv_cvv_ind_new = null;
      d__ch_internet_ind_old = null;
      d__ch_internet_ind_new = null;
      d__ch_act_flag3 = null;
      d__ch_sca_count = "0";
      d__ch_sca_count_3d = "0";
      d__ch_sca_amt = "0";
      filler5 = null;
  }

/**
Used to obtain the value of d__ch_card_pan_r.
@return the value for d__ch_card_pan_r.
*/
    public String getD__ch_card_pan_r() {
      return(d__ch_card_pan_r);
    }
/**
Used to obtain the value of filler0.
@return the value for filler0.
*/
    public String getFiller0() {
      return(filler0);
    }
/**
Used to obtain the value of filler1.
@return the value for filler1.
*/
    public String getFiller1() {
      return(filler1);
    }
/**
Used to obtain the value of d__ch_name.
@return the value for d__ch_name.
*/
    public String getD__ch_name() {
      return(d__ch_name);
    }
/**
Used to obtain the value of d__ch_curcy_code.
@return the value for d__ch_curcy_code.
*/
    public String getD__ch_curcy_code() {
      return(d__ch_curcy_code);
    }
/**
Used to obtain the value of d__ch_except_ind_int.
@return the value for d__ch_except_ind_int.
*/
    public short getD__ch_except_ind_int() {
      return(d__ch_except_ind_int);
    }
/**
Used to obtain the value of d__ch_except_ind_dom.
@return the value for d__ch_except_ind_dom.
*/
    public short getD__ch_except_ind_dom() {
      return(d__ch_except_ind_dom);
    }
/**
Used to obtain the value of d__ch_purge_date_year.
@return the value for d__ch_purge_date_year.
*/
    public String getD__ch_purge_date_year() {
      return(d__ch_purge_date_year);
    }
/**
Used to obtain the value of d__ch_purge_date_month.
@return the value for d__ch_purge_date_month.
*/
    public String getD__ch_purge_date_month() {
      return(d__ch_purge_date_month);
    }
/**
Used to obtain the value of d__ch_region_code.
@return the value for d__ch_region_code.
*/
    public String getD__ch_region_code() {
      return(d__ch_region_code);
    }
/**
Used to obtain the value of d__ch_exp_date_year.
@return the value for d__ch_exp_date_year.
*/
    public String getD__ch_exp_date_year() {
      return(d__ch_exp_date_year);
    }
/**
Used to obtain the value of d__ch_exp_date_month.
@return the value for d__ch_exp_date_month.
*/
    public String getD__ch_exp_date_month() {
      return(d__ch_exp_date_month);
    }
/**
Used to obtain the value of d__ch_saldo_on_host.
@return the value for d__ch_saldo_on_host.
*/
    public String getD__ch_saldo_on_host() {
      return(d__ch_saldo_on_host);
    }
/**
Used to obtain the value of d__ch_crac_limit.
@return the value for d__ch_crac_limit.
*/
    public String getD__ch_crac_limit() {
      return(d__ch_crac_limit);
    }
/**
Used to obtain the value of d__ch_temp_disp_increm.
@return the value for d__ch_temp_disp_increm.
*/
    public String getD__ch_temp_disp_increm() {
      return(d__ch_temp_disp_increm);
    }
/**
Used to obtain the value of d__ch_max_date_increm_r.
@return the value for d__ch_max_date_increm_r.
*/
    public String getD__ch_max_date_increm_r() {
      return(d__ch_max_date_increm_r);
    }
/**
Used to obtain the value of filler2.
@return the value for filler2.
*/
    public String getFiller2() {
      return(filler2);
    }
/**
Used to obtain the value of d__ch_tot_auth_pend.
@return the value for d__ch_tot_auth_pend.
*/
    public String getD__ch_tot_auth_pend() {
      return(d__ch_tot_auth_pend);
    }
/**
Used to obtain the value of d__ch_tot_dc_aleu.
@return the value for d__ch_tot_dc_aleu.
*/
    public String getD__ch_tot_dc_aleu() {
      return(d__ch_tot_dc_aleu);
    }
/**
Used to obtain the value of d__ch_tot_dc_steu.
@return the value for d__ch_tot_dc_steu.
*/
    public String getD__ch_tot_dc_steu() {
      return(d__ch_tot_dc_steu);
    }
/**
Used to obtain the value of d__ch_tx_time_r.
@return the value for d__ch_tx_time_r.
*/
    public String getD__ch_tx_time_r() {
      return(d__ch_tx_time_r);
    }
/**
Used to obtain the value of filler3.
@return the value for filler3.
*/
    public String getFiller3() {
      return(filler3);
    }
/**
Used to obtain the value of d__ch_dom_sale_max_tx.
@return the value for d__ch_dom_sale_max_tx.
*/
    public String getD__ch_dom_sale_max_tx() {
      return(d__ch_dom_sale_max_tx);
    }
/**
Used to obtain the value of d__ch_dom_cash_max_tx.
@return the value for d__ch_dom_cash_max_tx.
*/
    public String getD__ch_dom_cash_max_tx() {
      return(d__ch_dom_cash_max_tx);
    }
/**
Used to obtain the value of d__ch_int_sale_max_tx.
@return the value for d__ch_int_sale_max_tx.
*/
    public String getD__ch_int_sale_max_tx() {
      return(d__ch_int_sale_max_tx);
    }
/**
Used to obtain the value of d__ch_int_cash_max_tx.
@return the value for d__ch_int_cash_max_tx.
*/
    public String getD__ch_int_cash_max_tx() {
      return(d__ch_int_cash_max_tx);
    }
/**
Used to obtain the value of d__ch_dom_sale_max_24h.
@return the value for d__ch_dom_sale_max_24h.
*/
    public String getD__ch_dom_sale_max_24h() {
      return(d__ch_dom_sale_max_24h);
    }
/**
Used to obtain the value of d__ch_dom_cash_max_24h.
@return the value for d__ch_dom_cash_max_24h.
*/
    public String getD__ch_dom_cash_max_24h() {
      return(d__ch_dom_cash_max_24h);
    }
/**
Used to obtain the value of d__ch_dom_tot_max_24h.
@return the value for d__ch_dom_tot_max_24h.
*/
    public String getD__ch_dom_tot_max_24h() {
      return(d__ch_dom_tot_max_24h);
    }
/**
Used to obtain the value of d__ch_int_sale_max_24h.
@return the value for d__ch_int_sale_max_24h.
*/
    public String getD__ch_int_sale_max_24h() {
      return(d__ch_int_sale_max_24h);
    }
/**
Used to obtain the value of d__ch_int_cash_max_24h.
@return the value for d__ch_int_cash_max_24h.
*/
    public String getD__ch_int_cash_max_24h() {
      return(d__ch_int_cash_max_24h);
    }
/**
Used to obtain the value of d__ch_int_tot_max_24h.
@return the value for d__ch_int_tot_max_24h.
*/
    public String getD__ch_int_tot_max_24h() {
      return(d__ch_int_tot_max_24h);
    }
/**
Used to obtain the value of d__ch_sale_max_24h.
@return the value for d__ch_sale_max_24h.
*/
    public String getD__ch_sale_max_24h() {
      return(d__ch_sale_max_24h);
    }
/**
Used to obtain the value of d__ch_cash_max_24h.
@return the value for d__ch_cash_max_24h.
*/
    public String getD__ch_cash_max_24h() {
      return(d__ch_cash_max_24h);
    }
/**
Used to obtain the value of d__ch_tot_max_24h.
@return the value for d__ch_tot_max_24h.
*/
    public String getD__ch_tot_max_24h() {
      return(d__ch_tot_max_24h);
    }
/**
Used to obtain the value of d__ch_card_use_max_24h.
@return the value for d__ch_card_use_max_24h.
*/
    public String getD__ch_card_use_max_24h() {
      return(d__ch_card_use_max_24h);
    }
/**
Used to obtain the value of d__ch_dom_sale_max_7d.
@return the value for d__ch_dom_sale_max_7d.
*/
    public String getD__ch_dom_sale_max_7d() {
      return(d__ch_dom_sale_max_7d);
    }
/**
Used to obtain the value of d__ch_dom_cash_max_7d.
@return the value for d__ch_dom_cash_max_7d.
*/
    public String getD__ch_dom_cash_max_7d() {
      return(d__ch_dom_cash_max_7d);
    }
/**
Used to obtain the value of d__ch_dom_tot_max_7d.
@return the value for d__ch_dom_tot_max_7d.
*/
    public String getD__ch_dom_tot_max_7d() {
      return(d__ch_dom_tot_max_7d);
    }
/**
Used to obtain the value of d__ch_int_sale_max_7d.
@return the value for d__ch_int_sale_max_7d.
*/
    public String getD__ch_int_sale_max_7d() {
      return(d__ch_int_sale_max_7d);
    }
/**
Used to obtain the value of d__ch_int_cash_max_7d.
@return the value for d__ch_int_cash_max_7d.
*/
    public String getD__ch_int_cash_max_7d() {
      return(d__ch_int_cash_max_7d);
    }
/**
Used to obtain the value of d__ch_int_tot_max_7d.
@return the value for d__ch_int_tot_max_7d.
*/
    public String getD__ch_int_tot_max_7d() {
      return(d__ch_int_tot_max_7d);
    }
/**
Used to obtain the value of d__ch_sale_max_7d.
@return the value for d__ch_sale_max_7d.
*/
    public String getD__ch_sale_max_7d() {
      return(d__ch_sale_max_7d);
    }
/**
Used to obtain the value of d__ch_cash_max_7d.
@return the value for d__ch_cash_max_7d.
*/
    public String getD__ch_cash_max_7d() {
      return(d__ch_cash_max_7d);
    }
/**
Used to obtain the value of d__ch_tot_max_7d.
@return the value for d__ch_tot_max_7d.
*/
    public String getD__ch_tot_max_7d() {
      return(d__ch_tot_max_7d);
    }
/**
Used to obtain the value of d__ch_card_use_max_7d.
@return the value for d__ch_card_use_max_7d.
*/
    public String getD__ch_card_use_max_7d() {
      return(d__ch_card_use_max_7d);
    }
/**
Used to obtain the value of d__ch_dom_sale_cur_24h.
@return the value for d__ch_dom_sale_cur_24h.
*/
    public String getD__ch_dom_sale_cur_24h() {
      return(d__ch_dom_sale_cur_24h);
    }
/**
Used to obtain the value of d__ch_dom_cash_cur_24h.
@return the value for d__ch_dom_cash_cur_24h.
*/
    public String getD__ch_dom_cash_cur_24h() {
      return(d__ch_dom_cash_cur_24h);
    }
/**
Used to obtain the value of d__ch_int_sale_cur_24h.
@return the value for d__ch_int_sale_cur_24h.
*/
    public String getD__ch_int_sale_cur_24h() {
      return(d__ch_int_sale_cur_24h);
    }
/**
Used to obtain the value of d__ch_int_cash_cur_24h.
@return the value for d__ch_int_cash_cur_24h.
*/
    public String getD__ch_int_cash_cur_24h() {
      return(d__ch_int_cash_cur_24h);
    }
/**
Used to obtain the value of d__ch_card_use_cur_24h.
@return the value for d__ch_card_use_cur_24h.
*/
    public String getD__ch_card_use_cur_24h() {
      return(d__ch_card_use_cur_24h);
    }
/**
Used to obtain the value of d__ch_pointer_24h.
@return the value for d__ch_pointer_24h.
*/
    public String getD__ch_pointer_24h() {
      return(d__ch_pointer_24h);
    }
/**
Used to obtain the value of d__ch__cur_4h_dom_sale.
@return the value for d__ch__cur_4h_dom_sale.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to get d__ch__cur_4h_dom_sale.
*/
    public String getD__ch__cur_4h_dom_sale(
                                  int _i0) {
      return(d__ch__cur_4h[_i0].d__ch__cur_4h_dom_sale);
    }
/**
Used to obtain the value of d__ch__cur_4h_dom_cash.
@return the value for d__ch__cur_4h_dom_cash.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to get d__ch__cur_4h_dom_cash.
*/
    public String getD__ch__cur_4h_dom_cash(
                                  int _i0) {
      return(d__ch__cur_4h[_i0].d__ch__cur_4h_dom_cash);
    }
/**
Used to obtain the value of d__ch__cur_4h_int_sale.
@return the value for d__ch__cur_4h_int_sale.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to get d__ch__cur_4h_int_sale.
*/
    public String getD__ch__cur_4h_int_sale(
                                  int _i0) {
      return(d__ch__cur_4h[_i0].d__ch__cur_4h_int_sale);
    }
/**
Used to obtain the value of d__ch__cur_4h_int_cash.
@return the value for d__ch__cur_4h_int_cash.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to get d__ch__cur_4h_int_cash.
*/
    public String getD__ch__cur_4h_int_cash(
                                  int _i0) {
      return(d__ch__cur_4h[_i0].d__ch__cur_4h_int_cash);
    }
/**
Used to obtain the value of d__ch__cur_4h_card_use.
@return the value for d__ch__cur_4h_card_use.
@param _i0  index which identifies the occurrence of d__ch__cur_4h for which you want to get d__ch__cur_4h_card_use.
*/
    public String getD__ch__cur_4h_card_use(
                                  int _i0) {
      return(d__ch__cur_4h[_i0].d__ch__cur_4h_card_use);
    }
/**
Used to obtain the value of d__ch_dom_sale_cur_7d.
@return the value for d__ch_dom_sale_cur_7d.
*/
    public String getD__ch_dom_sale_cur_7d() {
      return(d__ch_dom_sale_cur_7d);
    }
/**
Used to obtain the value of d__ch_dom_cash_cur_7d.
@return the value for d__ch_dom_cash_cur_7d.
*/
    public String getD__ch_dom_cash_cur_7d() {
      return(d__ch_dom_cash_cur_7d);
    }
/**
Used to obtain the value of d__ch_int_sale_cur_7d.
@return the value for d__ch_int_sale_cur_7d.
*/
    public String getD__ch_int_sale_cur_7d() {
      return(d__ch_int_sale_cur_7d);
    }
/**
Used to obtain the value of d__ch_int_cash_cur_7d.
@return the value for d__ch_int_cash_cur_7d.
*/
    public String getD__ch_int_cash_cur_7d() {
      return(d__ch_int_cash_cur_7d);
    }
/**
Used to obtain the value of d__ch_card_use_cur_7d.
@return the value for d__ch_card_use_cur_7d.
*/
    public String getD__ch_card_use_cur_7d() {
      return(d__ch_card_use_cur_7d);
    }
/**
Used to obtain the value of d__ch_pointer_7d.
@return the value for d__ch_pointer_7d.
*/
    public String getD__ch_pointer_7d() {
      return(d__ch_pointer_7d);
    }
/**
Used to obtain the value of d__ch__cur_day_dom_sale.
@return the value for d__ch__cur_day_dom_sale.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to get d__ch__cur_day_dom_sale.
*/
    public String getD__ch__cur_day_dom_sale(
                                  int _i0) {
      return(d__ch__cur_day[_i0].d__ch__cur_day_dom_sale);
    }
/**
Used to obtain the value of d__ch__cur_day_dom_cash.
@return the value for d__ch__cur_day_dom_cash.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to get d__ch__cur_day_dom_cash.
*/
    public String getD__ch__cur_day_dom_cash(
                                  int _i0) {
      return(d__ch__cur_day[_i0].d__ch__cur_day_dom_cash);
    }
/**
Used to obtain the value of d__ch__cur_day_int_sale.
@return the value for d__ch__cur_day_int_sale.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to get d__ch__cur_day_int_sale.
*/
    public String getD__ch__cur_day_int_sale(
                                  int _i0) {
      return(d__ch__cur_day[_i0].d__ch__cur_day_int_sale);
    }
/**
Used to obtain the value of d__ch__cur_day_int_cash.
@return the value for d__ch__cur_day_int_cash.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to get d__ch__cur_day_int_cash.
*/
    public String getD__ch__cur_day_int_cash(
                                  int _i0) {
      return(d__ch__cur_day[_i0].d__ch__cur_day_int_cash);
    }
/**
Used to obtain the value of d__ch__cur_day_card_use.
@return the value for d__ch__cur_day_card_use.
@param _i0  index which identifies the occurrence of d__ch__cur_day for which you want to get d__ch__cur_day_card_use.
*/
    public String getD__ch__cur_day_card_use(
                                  int _i0) {
      return(d__ch__cur_day[_i0].d__ch__cur_day_card_use);
    }
/**
Used to obtain the value of user_class.
@return the value for user_class.
*/
    public String getUser_class() {
      return(user_class);
    }
/**
Used to obtain the value of user_id.
@return the value for user_id.
*/
    public String getUser_id() {
      return(user_id);
    }
/**
Used to obtain the value of state.
@return the value for state.
*/
    public String getState() {
      return(state);
    }
/**
Used to obtain the value of disable_reason.
@return the value for disable_reason.
*/
    public String getDisable_reason() {
      return(disable_reason);
    }
/**
Used to obtain the value of creation_time_r.
@return the value for creation_time_r.
*/
    public String getCreation_time_r() {
      return(creation_time_r);
    }
/**
Used to obtain the value of disable_time_r.
@return the value for disable_time_r.
*/
    public String getDisable_time_r() {
      return(disable_time_r);
    }
/**
Used to obtain the value of modif_time_r.
@return the value for modif_time_r.
*/
    public String getModif_time_r() {
      return(modif_time_r);
    }
/**
Used to obtain the value of d__ch_curr_pvv.
@return the value for d__ch_curr_pvv.
*/
    public short getD__ch_curr_pvv() {
      return(d__ch_curr_pvv);
    }
/**
Used to obtain the value of d__ch_temp_pvv.
@return the value for d__ch_temp_pvv.
*/
    public short getD__ch_temp_pvv() {
      return(d__ch_temp_pvv);
    }
/**
Used to obtain the value of d__ch_pin_err_cnt.
@return the value for d__ch_pin_err_cnt.
*/
    public String getD__ch_pin_err_cnt() {
      return(d__ch_pin_err_cnt);
    }
/**
Used to obtain the value of d__ch_pin_disable.
@return the value for d__ch_pin_disable.
*/
    public String getD__ch_pin_disable() {
      return(d__ch_pin_disable);
    }
/**
Used to obtain the value of d__ch_updt_nr.
@return the value for d__ch_updt_nr.
*/
    public String getD__ch_updt_nr() {
      return(d__ch_updt_nr);
    }
/**
Used to obtain the value of trace_nr.
@return the value for trace_nr.
*/
    public String getTrace_nr() {
      return(trace_nr);
    }
/**
Used to obtain the value of compl_code.
@return the value for compl_code.
*/
    public String getCompl_code() {
      return(compl_code);
    }
/**
Used to obtain the value of reply_code.
@return the value for reply_code.
*/
    public short getReply_code() {
      return(reply_code);
    }
/**
Used to obtain the value of amt.
@return the value for amt.
*/
    public String getAmt() {
      return(amt);
    }
/**
Used to obtain the value of codfin.
@return the value for codfin.
*/
    public String getCodfin() {
      return(codfin);
    }
/**
Used to obtain the value of tx_type.
@return the value for tx_type.
*/
    public String getTx_type() {
      return(tx_type);
    }
/**
Used to obtain the value of datim_r.
@return the value for datim_r.
*/
    public String getDatim_r() {
      return(datim_r);
    }
/**
Used to obtain the value of iso2_ind.
@return the value for iso2_ind.
*/
    public String getIso2_ind() {
      return(iso2_ind);
    }
/**
Used to obtain the value of mid.
@return the value for mid.
*/
    public String getMid() {
      return(mid);
    }
/**
Used to obtain the value of me_brand.
@return the value for me_brand.
*/
    public String getMe_brand() {
      return(me_brand);
    }
/**
Used to obtain the value of card_exp_date_year.
@return the value for card_exp_date_year.
*/
    public String getCard_exp_date_year() {
      return(card_exp_date_year);
    }
/**
Used to obtain the value of card_exp_date_month.
@return the value for card_exp_date_month.
*/
    public String getCard_exp_date_month() {
      return(card_exp_date_month);
    }
/**
Used to obtain the value of uid.
@return the value for uid.
*/
    public String getUid() {
      return(uid);
    }
/**
Used to obtain the value of te_brand.
@return the value for te_brand.
*/
    public String getTe_brand() {
      return(te_brand);
    }
/**
Used to obtain the value of filler4.
@return the value for filler4.
*/
    public String getFiller4() {
      return(filler4);
    }
/**
Used to obtain the value of response_table.
@return the value for response_table.
*/
    public String getResponse_table() {
      return(response_table);
    }
/**
Used to obtain the value of decision_table.
@return the value for decision_table.
*/
    public String getDecision_table() {
      return(decision_table);
    }
/**
Used to obtain the value of d__ch_atm_last_date_r.
@return the value for d__ch_atm_last_date_r.
*/
    public String getD__ch_atm_last_date_r() {
      return(d__ch_atm_last_date_r);
    }
/**
Used to obtain the value of d__ch_tot_tx_amount.
@return the value for d__ch_tot_tx_amount.
@param _i0  index which identifies the occurrence of d__ch_atm_tot_curr_tx for which you want to get d__ch_tot_tx_amount.
*/
    public String getD__ch_tot_tx_amount(
                                  int _i0) {
      return(d__ch_atm_tot_curr_tx[_i0].d__ch_tot_tx_amount);
    }
/**
Used to obtain the value of d__ch_tot_nb_tx.
@return the value for d__ch_tot_nb_tx.
@param _i0  index which identifies the occurrence of d__ch_atm_tot_curr_tx for which you want to get d__ch_tot_nb_tx.
*/
    public String getD__ch_tot_nb_tx(
                                  int _i0) {
      return(d__ch_atm_tot_curr_tx[_i0].d__ch_tot_nb_tx);
    }
/**
Used to obtain the value of d__ch_pin_ch_allowed_ind.
@return the value for d__ch_pin_ch_allowed_ind.
*/
    public String getD__ch_pin_ch_allowed_ind() {
      return(d__ch_pin_ch_allowed_ind);
    }
/**
Used to obtain the value of d__ch_pin_change_busy_ind.
@return the value for d__ch_pin_change_busy_ind.
*/
    public String getD__ch_pin_change_busy_ind() {
      return(d__ch_pin_change_busy_ind);
    }
/**
Used to obtain the value of d__ch_exp_yy_last_appr_tx.
@return the value for d__ch_exp_yy_last_appr_tx.
*/
    public String getD__ch_exp_yy_last_appr_tx() {
      return(d__ch_exp_yy_last_appr_tx);
    }
/**
Used to obtain the value of d__ch_curr_pvv_date_time_r.
@return the value for d__ch_curr_pvv_date_time_r.
*/
    public String getD__ch_curr_pvv_date_time_r() {
      return(d__ch_curr_pvv_date_time_r);
    }
/**
Used to obtain the value of d__ch_curr_pvki.
@return the value for d__ch_curr_pvki.
*/
    public String getD__ch_curr_pvki() {
      return(d__ch_curr_pvki);
    }
/**
Used to obtain the value of d__ch_temp_pvv_date_time_r.
@return the value for d__ch_temp_pvv_date_time_r.
*/
    public String getD__ch_temp_pvv_date_time_r() {
      return(d__ch_temp_pvv_date_time_r);
    }
/**
Used to obtain the value of d__ch_temp_pvki.
@return the value for d__ch_temp_pvki.
*/
    public String getD__ch_temp_pvki() {
      return(d__ch_temp_pvki);
    }
/**
Used to obtain the value of d__ch_try_pin_change.
@return the value for d__ch_try_pin_change.
*/
    public String getD__ch_try_pin_change() {
      return(d__ch_try_pin_change);
    }
/**
Used to obtain the value of d__ch_iss_id.
@return the value for d__ch_iss_id.
*/
    public String getD__ch_iss_id() {
      return(d__ch_iss_id);
    }
/**
Used to obtain the value of d__ch_visa_key_set.
@return the value for d__ch_visa_key_set.
*/
    public String getD__ch_visa_key_set() {
      return(d__ch_visa_key_set);
    }
/**
Used to obtain the value of d__ch_cash_limit_ind.
@return the value for d__ch_cash_limit_ind.
*/
    public String getD__ch_cash_limit_ind() {
      return(d__ch_cash_limit_ind);
    }
/**
Used to obtain the value of d__ch_cash_limit.
@return the value for d__ch_cash_limit.
*/
    public String getD__ch_cash_limit() {
      return(d__ch_cash_limit);
    }
/**
Used to obtain the value of d__ch_account_ind.
@return the value for d__ch_account_ind.
*/
    public String getD__ch_account_ind() {
      return(d__ch_account_ind);
    }
/**
Used to obtain the value of d__ch_account.
@return the value for d__ch_account.
*/
    public String getD__ch_account() {
      return(d__ch_account);
    }
/**
Used to obtain the value of d__ch_cash_limit_bank.
@return the value for d__ch_cash_limit_bank.
*/
    public String getD__ch_cash_limit_bank() {
      return(d__ch_cash_limit_bank);
    }
/**
Used to obtain the value of d__ch_cash_limit_date_r.
@return the value for d__ch_cash_limit_date_r.
*/
    public String getD__ch_cash_limit_date_r() {
      return(d__ch_cash_limit_date_r);
    }
/**
Used to obtain the value of d__ch_emv_sd_id.
@return the value for d__ch_emv_sd_id.
*/
    public String getD__ch_emv_sd_id() {
      return(d__ch_emv_sd_id);
    }
/**
Used to obtain the value of d__ch_emv_app_inst.
@return the value for d__ch_emv_app_inst.
*/
    public String getD__ch_emv_app_inst() {
      return(d__ch_emv_app_inst);
    }
/**
Used to obtain the value of d__ch_emv_mk_ver.
@return the value for d__ch_emv_mk_ver.
*/
    public String getD__ch_emv_mk_ver() {
      return(d__ch_emv_mk_ver);
    }
/**
Used to obtain the value of d__ch_emv_atc.
@return the value for d__ch_emv_atc.
*/
    public String getD__ch_emv_atc() {
      return(d__ch_emv_atc);
    }
/**
Used to obtain the value of d__ch_pin_synchro.
@return the value for d__ch_pin_synchro.
*/
    public String getD__ch_pin_synchro() {
      return(d__ch_pin_synchro);
    }
/**
Used to obtain the value of d__ch_crit_script_script_number.
@return the value for d__ch_crit_script_script_number.
*/
    public String getD__ch_crit_script_script_number() {
      return(d__ch_crit_script_script_number);
    }
/**
Used to obtain the value of d__ch_crit_script_flag_script_ready.
@return the value for d__ch_crit_script_flag_script_ready.
*/
    public String getD__ch_crit_script_flag_script_ready() {
      return(d__ch_crit_script_flag_script_ready);
    }
/**
Used to obtain the value of d__ch_crit_script_flag_script_sent.
@return the value for d__ch_crit_script_flag_script_sent.
*/
    public String getD__ch_crit_script_flag_script_sent() {
      return(d__ch_crit_script_flag_script_sent);
    }
/**
Used to obtain the value of d__ch_script_pri_1_script_number.
@return the value for d__ch_script_pri_1_script_number.
*/
    public String getD__ch_script_pri_1_script_number() {
      return(d__ch_script_pri_1_script_number);
    }
/**
Used to obtain the value of d__ch_script_pri_1_flag_script_ready.
@return the value for d__ch_script_pri_1_flag_script_ready.
*/
    public String getD__ch_script_pri_1_flag_script_ready() {
      return(d__ch_script_pri_1_flag_script_ready);
    }
/**
Used to obtain the value of d__ch_script_pri_1_flag_script_sent.
@return the value for d__ch_script_pri_1_flag_script_sent.
*/
    public String getD__ch_script_pri_1_flag_script_sent() {
      return(d__ch_script_pri_1_flag_script_sent);
    }
/**
Used to obtain the value of d__ch_script_pri_2_script_number.
@return the value for d__ch_script_pri_2_script_number.
*/
    public String getD__ch_script_pri_2_script_number() {
      return(d__ch_script_pri_2_script_number);
    }
/**
Used to obtain the value of d__ch_script_pri_2_flag_script_ready.
@return the value for d__ch_script_pri_2_flag_script_ready.
*/
    public String getD__ch_script_pri_2_flag_script_ready() {
      return(d__ch_script_pri_2_flag_script_ready);
    }
/**
Used to obtain the value of d__ch_script_pri_2_flag_script_sent.
@return the value for d__ch_script_pri_2_flag_script_sent.
*/
    public String getD__ch_script_pri_2_flag_script_sent() {
      return(d__ch_script_pri_2_flag_script_sent);
    }
/**
Used to obtain the value of d__ch_emv_card_nr.
@return the value for d__ch_emv_card_nr.
*/
    public String getD__ch_emv_card_nr() {
      return(d__ch_emv_card_nr);
    }
/**
Used to obtain the value of d__ch_calc_counter.
@return the value for d__ch_calc_counter.
*/
    public String getD__ch_calc_counter() {
      return(d__ch_calc_counter);
    }
/**
Used to obtain the value of d__ch_oltb_ind.
@return the value for d__ch_oltb_ind.
*/
    public String getD__ch_oltb_ind() {
      return(d__ch_oltb_ind);
    }
/**
Used to obtain the value of d__ch_second_card_ind.
@return the value for d__ch_second_card_ind.
*/
    public String getD__ch_second_card_ind() {
      return(d__ch_second_card_ind);
    }
/**
Used to obtain the value of d__ch_old_icvv_ind.
@return the value for d__ch_old_icvv_ind.
*/
    public String getD__ch_old_icvv_ind() {
      return(d__ch_old_icvv_ind);
    }
/**
Used to obtain the value of d__ch_new_icvv_ind.
@return the value for d__ch_new_icvv_ind.
*/
    public String getD__ch_new_icvv_ind() {
      return(d__ch_new_icvv_ind);
    }
/**
Used to obtain the value of d__ch_wng_icvv_ind.
@return the value for d__ch_wng_icvv_ind.
*/
    public String getD__ch_wng_icvv_ind() {
      return(d__ch_wng_icvv_ind);
    }
/**
Used to obtain the value of d__ch_emv_card_type.
@return the value for d__ch_emv_card_type.
*/
    public String getD__ch_emv_card_type() {
      return(d__ch_emv_card_type);
    }
/**
Used to obtain the value of d__ch_cust_nr.
@return the value for d__ch_cust_nr.
*/
    public String getD__ch_cust_nr() {
      return(d__ch_cust_nr);
    }
/**
Used to obtain the value of d__ch_bor_sec_code_try.
@return the value for d__ch_bor_sec_code_try.
*/
    public String getD__ch_bor_sec_code_try() {
      return(d__ch_bor_sec_code_try);
    }
/**
Used to obtain the value of d__ch_emv_load_sum.
@return the value for d__ch_emv_load_sum.
*/
    public String getD__ch_emv_load_sum() {
      return(d__ch_emv_load_sum);
    }
/**
Used to obtain the value of d__ch_emv_spent_sum.
@return the value for d__ch_emv_spent_sum.
*/
    public String getD__ch_emv_spent_sum() {
      return(d__ch_emv_spent_sum);
    }
/**
Used to obtain the value of d__ch_emv_offline_tx.
@return the value for d__ch_emv_offline_tx.
*/
    public String getD__ch_emv_offline_tx() {
      return(d__ch_emv_offline_tx);
    }
/**
Used to obtain the value of d__ch_emv_cntless_ind.
@return the value for d__ch_emv_cntless_ind.
*/
    public String getD__ch_emv_cntless_ind() {
      return(d__ch_emv_cntless_ind);
    }
/**
Used to obtain the value of d__ch_new_emue.
@return the value for d__ch_new_emue.
*/
    public String getD__ch_new_emue() {
      return(d__ch_new_emue);
    }
/**
Used to obtain the value of d__ch_dkvk_ind.
@return the value for d__ch_dkvk_ind.
*/
    public String getD__ch_dkvk_ind() {
      return(d__ch_dkvk_ind);
    }
/**
Used to obtain the value of d__ch_dkvk_time_r.
@return the value for d__ch_dkvk_time_r.
*/
    public String getD__ch_dkvk_time_r() {
      return(d__ch_dkvk_time_r);
    }
/**
Used to obtain the value of d__ch_dkvk_ym.
@return the value for d__ch_dkvk_ym.
*/
    public String getD__ch_dkvk_ym() {
      return(d__ch_dkvk_ym);
    }
/**
Used to obtain the value of d__ch_dkvk_sc.
@return the value for d__ch_dkvk_sc.
*/
    public String getD__ch_dkvk_sc() {
      return(d__ch_dkvk_sc);
    }
/**
Used to obtain the value of d__ch_dkvk_min.
@return the value for d__ch_dkvk_min.
*/
    public String getD__ch_dkvk_min() {
      return(d__ch_dkvk_min);
    }
/**
Used to obtain the value of d__ch_dkvk_static_ind.
@return the value for d__ch_dkvk_static_ind.
*/
    public String getD__ch_dkvk_static_ind() {
      return(d__ch_dkvk_static_ind);
    }
/**
Used to obtain the value of d__ch_act_flag1_old.
@return the value for d__ch_act_flag1_old.
*/
    public String getD__ch_act_flag1_old() {
      return(d__ch_act_flag1_old);
    }
/**
Used to obtain the value of d__ch_act_flag2_old.
@return the value for d__ch_act_flag2_old.
*/
    public String getD__ch_act_flag2_old() {
      return(d__ch_act_flag2_old);
    }
/**
Used to obtain the value of d__ch_act_flag1_new.
@return the value for d__ch_act_flag1_new.
*/
    public String getD__ch_act_flag1_new() {
      return(d__ch_act_flag1_new);
    }
/**
Used to obtain the value of d__ch_act_flag2_new.
@return the value for d__ch_act_flag2_new.
*/
    public String getD__ch_act_flag2_new() {
      return(d__ch_act_flag2_new);
    }
/**
Used to obtain the value of d__ch_pvv_cvv_ind_old.
@return the value for d__ch_pvv_cvv_ind_old.
*/
    public String getD__ch_pvv_cvv_ind_old() {
      return(d__ch_pvv_cvv_ind_old);
    }
/**
Used to obtain the value of d__ch_pvv_cvv_ind_new.
@return the value for d__ch_pvv_cvv_ind_new.
*/
    public String getD__ch_pvv_cvv_ind_new() {
      return(d__ch_pvv_cvv_ind_new);
    }
/**
Used to obtain the value of d__ch_internet_ind_old.
@return the value for d__ch_internet_ind_old.
*/
    public String getD__ch_internet_ind_old() {
      return(d__ch_internet_ind_old);
    }
/**
Used to obtain the value of d__ch_internet_ind_new.
@return the value for d__ch_internet_ind_new.
*/
    public String getD__ch_internet_ind_new() {
      return(d__ch_internet_ind_new);
    }
/**
Used to obtain the value of d__ch_act_flag3.
@return the value for d__ch_act_flag3.
*/
    public String getD__ch_act_flag3() {
      return(d__ch_act_flag3);
    }
/**
Used to obtain the value of d__ch_sca_count.
@return the value for d__ch_sca_count.
*/
    public String getD__ch_sca_count() {
      return(d__ch_sca_count);
    }
/**
Used to obtain the value of d__ch_sca_count_3d.
@return the value for d__ch_sca_count_3d.
*/
    public String getD__ch_sca_count_3d() {
      return(d__ch_sca_count_3d);
    }
/**
Used to obtain the value of d__ch_sca_amt.
@return the value for d__ch_sca_amt.
*/
    public String getD__ch_sca_amt() {
      return(d__ch_sca_amt);
    }
/**
Used to obtain the value of filler5.
@return the value for filler5.
*/
    public String getFiller5() {
      return(filler5);
    }
/**
Moves the data from the supplied byte array to the instance variables.
@param _buffer a byte array which contains the data to be moved. 
@param _count the number of bytes to be converted.
@exception com.tandem.ext.util.DataConversionException if 
a field fails to convert correctly and allowErrors has been set to false; or
allowErrors is set to true and _count < getLength().
@see #allowErrors
**/
    public void unmarshal(byte [] _buffer, int _count) 
      throws com.tandem.ext.util.DataConversionException {

      int _offset;
      int _fieldSize;
      _errorDetail.clear();
      _numConversionErrors = 0;
      if(!_allowErrors && _count < _bufferLen) {
          _numConversionErrors++;
          throw new DataConversionException(DataConversionException.ConvError.PARAM,
            "The value supplied for the _count variable is less than expected (see getLength())");
      }
      if(_allowErrors && _count < _bufferLen) {
          DataConversionException _bfe = new DataConversionException(DataConversionException.ConvError.PARAM,
          "The value supplied for the _count variable is less than expected (see  getLength())");
          _numConversionErrors++;
          _errorDetail.put(_buffer,_bfe);
      }


      _offset = 0;
      if(_offset >= _count) return;
      _fieldSize = Math.min(19,_count - _offset);
        try {
           d__ch_card_pan_r = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_card_pan_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 19;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           filler0 = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler0",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 20;
      if(_offset >= _count) return;
      _fieldSize = Math.min(3,_count - _offset);
        try {
           filler1 = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler1",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 23;
      if(_offset >= _count) return;
      _fieldSize = Math.min(26,_count - _offset);
        try {
           d__ch_name = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_name",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 49;
      if(_offset + 3 > _count) return;
        try {
           d__ch_curcy_code = DataConversion.NumStrToJavaStr(_buffer,_offset,3, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_curcy_code",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 52;
      if(_offset + 2 > _count) return;
        try {
            d__ch_except_ind_int = DataConversion.BIN16ToJavaShort(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_except_ind_int",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 54;
      if(_offset + 2 > _count) return;
        try {
            d__ch_except_ind_dom = DataConversion.BIN16ToJavaShort(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_except_ind_dom",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 56;
      if(_offset + 2 > _count) return;
        try {
           d__ch_purge_date_year = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_purge_date_year",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 58;
      if(_offset + 2 > _count) return;
        try {
           d__ch_purge_date_month = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_purge_date_month",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 60;
      if(_offset >= _count) return;
      _fieldSize = Math.min(9,_count - _offset);
        try {
           d__ch_region_code = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_region_code",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 69;
      if(_offset + 2 > _count) return;
        try {
           d__ch_exp_date_year = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_exp_date_year",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 71;
      if(_offset + 2 > _count) return;
        try {
           d__ch_exp_date_month = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_exp_date_month",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 73;
      if(_offset + 13 > _count) return;
        try {
                d__ch_saldo_on_host = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_saldo_on_host",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 86;
      if(_offset + 13 > _count) return;
        try {
                d__ch_crac_limit = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_crac_limit",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 99;
      if(_offset + 13 > _count) return;
        try {
                d__ch_temp_disp_increm = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_temp_disp_increm",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 112;
      if(_offset + 6 > _count) return;
        try {
           d__ch_max_date_increm_r = DataConversion.NumStrToJavaStr(_buffer,_offset,6, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_max_date_increm_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 118;
      if(_offset >= _count) return;
      _fieldSize = Math.min(5,_count - _offset);
        try {
           filler2 = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler2",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 123;
      if(_offset + 13 > _count) return;
        try {
                d__ch_tot_auth_pend = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_tot_auth_pend",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 136;
      if(_offset + 13 > _count) return;
        try {
                d__ch_tot_dc_aleu = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_tot_dc_aleu",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 149;
      if(_offset + 13 > _count) return;
        try {
                d__ch_tot_dc_steu = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_tot_dc_steu",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 162;
      if(_offset + 14 > _count) return;
        try {
           d__ch_tx_time_r = DataConversion.NumStrToJavaStr(_buffer,_offset,14, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_tx_time_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 176;
      if(_offset >= _count) return;
      _fieldSize = Math.min(43,_count - _offset);
        try {
           filler3 = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler3",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 219;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_sale_max_tx = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_sale_max_tx",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 231;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_cash_max_tx = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_cash_max_tx",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 243;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_sale_max_tx = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_sale_max_tx",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 255;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_cash_max_tx = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_cash_max_tx",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 267;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_sale_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_sale_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 279;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_cash_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_cash_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 291;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_tot_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_tot_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 303;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_sale_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_sale_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 315;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_cash_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_cash_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 327;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_tot_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_tot_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 339;
      if(_offset + 12 > _count) return;
        try {
           d__ch_sale_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_sale_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 351;
      if(_offset + 12 > _count) return;
        try {
           d__ch_cash_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_cash_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 363;
      if(_offset + 12 > _count) return;
        try {
           d__ch_tot_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_tot_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 375;
      if(_offset + 4 > _count) return;
        try {
           d__ch_card_use_max_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,4, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_card_use_max_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 379;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_sale_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_sale_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 391;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_cash_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_cash_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 403;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_tot_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_tot_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 415;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_sale_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_sale_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 427;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_cash_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_cash_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 439;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_tot_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_tot_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 451;
      if(_offset + 12 > _count) return;
        try {
           d__ch_sale_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_sale_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 463;
      if(_offset + 12 > _count) return;
        try {
           d__ch_cash_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_cash_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 475;
      if(_offset + 12 > _count) return;
        try {
           d__ch_tot_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_tot_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 487;
      if(_offset + 4 > _count) return;
        try {
           d__ch_card_use_max_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,4, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_card_use_max_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 491;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_sale_cur_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_sale_cur_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 503;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_cash_cur_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_cash_cur_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 515;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_sale_cur_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_sale_cur_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 527;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_cash_cur_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_cash_cur_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 539;
      if(_offset + 4 > _count) return;
        try {
           d__ch_card_use_cur_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,4, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_card_use_cur_24h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 543;
      if(_offset + 2 > _count) return;
        try {
           d__ch_pointer_24h = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_pointer_24h",dce);
           } else { 
              throw dce;
           }
        }
      for(int _i0 = 0; _i0 < 6; _i0++) {

        _offset = 545 + (_i0 * 52);
          if(_offset + 12 > _count) return;
          try {
             d__ch__cur_4h[_i0].d__ch__cur_4h_dom_sale = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_4h[_i0].d__ch__cur_4h_dom_sale",dce);
             } else { 
                throw dce;
             }
          }

        _offset = 557 + (_i0 * 52);
          if(_offset + 12 > _count) return;
          try {
             d__ch__cur_4h[_i0].d__ch__cur_4h_dom_cash = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_4h[_i0].d__ch__cur_4h_dom_cash",dce);
             } else { 
                throw dce;
             }
          }

        _offset = 569 + (_i0 * 52);
          if(_offset + 12 > _count) return;
          try {
             d__ch__cur_4h[_i0].d__ch__cur_4h_int_sale = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_4h[_i0].d__ch__cur_4h_int_sale",dce);
             } else { 
                throw dce;
             }
          }

        _offset = 581 + (_i0 * 52);
          if(_offset + 12 > _count) return;
          try {
             d__ch__cur_4h[_i0].d__ch__cur_4h_int_cash = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_4h[_i0].d__ch__cur_4h_int_cash",dce);
             } else { 
                throw dce;
             }
          }

        _offset = 593 + (_i0 * 52);
          if(_offset + 4 > _count) return;
          try {
             d__ch__cur_4h[_i0].d__ch__cur_4h_card_use = DataConversion.NumStrToJavaStr(_buffer,_offset,4, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_4h[_i0].d__ch__cur_4h_card_use",dce);
             } else { 
                throw dce;
             }
          }
      }

      _offset = 857;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_sale_cur_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_sale_cur_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 869;
      if(_offset + 12 > _count) return;
        try {
           d__ch_dom_cash_cur_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dom_cash_cur_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 881;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_sale_cur_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_sale_cur_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 893;
      if(_offset + 12 > _count) return;
        try {
           d__ch_int_cash_cur_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_int_cash_cur_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 905;
      if(_offset + 4 > _count) return;
        try {
           d__ch_card_use_cur_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,4, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_card_use_cur_7d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 909;
      if(_offset + 2 > _count) return;
        try {
           d__ch_pointer_7d = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_pointer_7d",dce);
           } else { 
              throw dce;
           }
        }
      for(int _i0 = 0; _i0 < 7; _i0++) {

        _offset = 911 + (_i0 * 52);
          if(_offset + 12 > _count) return;
          try {
             d__ch__cur_day[_i0].d__ch__cur_day_dom_sale = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_day[_i0].d__ch__cur_day_dom_sale",dce);
             } else { 
                throw dce;
             }
          }

        _offset = 923 + (_i0 * 52);
          if(_offset + 12 > _count) return;
          try {
             d__ch__cur_day[_i0].d__ch__cur_day_dom_cash = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_day[_i0].d__ch__cur_day_dom_cash",dce);
             } else { 
                throw dce;
             }
          }

        _offset = 935 + (_i0 * 52);
          if(_offset + 12 > _count) return;
          try {
             d__ch__cur_day[_i0].d__ch__cur_day_int_sale = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_day[_i0].d__ch__cur_day_int_sale",dce);
             } else { 
                throw dce;
             }
          }

        _offset = 947 + (_i0 * 52);
          if(_offset + 12 > _count) return;
          try {
             d__ch__cur_day[_i0].d__ch__cur_day_int_cash = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_day[_i0].d__ch__cur_day_int_cash",dce);
             } else { 
                throw dce;
             }
          }

        _offset = 959 + (_i0 * 52);
          if(_offset + 4 > _count) return;
          try {
             d__ch__cur_day[_i0].d__ch__cur_day_card_use = DataConversion.NumStrToJavaStr(_buffer,_offset,4, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch__cur_day[_i0].d__ch__cur_day_card_use",dce);
             } else { 
                throw dce;
             }
          }
      }

      _offset = 1275;
      if(_offset >= _count) return;
      _fieldSize = Math.min(3,_count - _offset);
        try {
           user_class = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("user_class",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1278;
      if(_offset >= _count) return;
      _fieldSize = Math.min(8,_count - _offset);
        try {
           user_id = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("user_id",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1286;
      if(_offset + 1 > _count) return;
        try {
           state = DataConversion.NumStrToJavaStr(_buffer,_offset,1, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("state",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1287;
      if(_offset + 1 > _count) return;
        try {
           disable_reason = DataConversion.NumStrToJavaStr(_buffer,_offset,1, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("disable_reason",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1288;
      if(_offset + 10 > _count) return;
        try {
           creation_time_r = DataConversion.NumStrToJavaStr(_buffer,_offset,10, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("creation_time_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1298;
      if(_offset + 10 > _count) return;
        try {
           disable_time_r = DataConversion.NumStrToJavaStr(_buffer,_offset,10, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("disable_time_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1308;
      if(_offset + 10 > _count) return;
        try {
           modif_time_r = DataConversion.NumStrToJavaStr(_buffer,_offset,10, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("modif_time_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1318;
      if(_offset + 2 > _count) return;
        try {
            d__ch_curr_pvv = DataConversion.BIN16ToJavaShort(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_curr_pvv",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1320;
      if(_offset + 2 > _count) return;
        try {
            d__ch_temp_pvv = DataConversion.BIN16ToJavaShort(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_temp_pvv",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1322;
      if(_offset + 1 > _count) return;
        try {
           d__ch_pin_err_cnt = DataConversion.NumStrToJavaStr(_buffer,_offset,1, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_pin_err_cnt",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1323;
      if(_offset + 1 > _count) return;
        try {
           d__ch_pin_disable = DataConversion.NumStrToJavaStr(_buffer,_offset,1, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_pin_disable",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1324;
      if(_offset + 4 > _count) return;
        try {
           d__ch_updt_nr = DataConversion.NumStrToJavaStr(_buffer,_offset,4, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_updt_nr",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1328;
      if(_offset >= _count) return;
      _fieldSize = Math.min(6,_count - _offset);
        try {
           trace_nr = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("trace_nr",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1334;
      if(_offset >= _count) return;
      _fieldSize = Math.min(32,_count - _offset);
        try {
           compl_code = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("compl_code",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1366;
      if(_offset + 2 > _count) return;
        try {
            reply_code = DataConversion.BIN16ToJavaShort(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("reply_code",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1368;
      if(_offset + 13 > _count) return;
        try {
                amt = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("amt",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1381;
      if(_offset + 2 > _count) return;
        try {
           codfin = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("codfin",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1383;
      if(_offset + 2 > _count) return;
        try {
           tx_type = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("tx_type",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1385;
      if(_offset + 10 > _count) return;
        try {
           datim_r = DataConversion.NumStrToJavaStr(_buffer,_offset,10, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("datim_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1395;
      if(_offset + 1 > _count) return;
        try {
           iso2_ind = DataConversion.NumStrToJavaStr(_buffer,_offset,1, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("iso2_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1396;
      if(_offset >= _count) return;
      _fieldSize = Math.min(10,_count - _offset);
        try {
           mid = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("mid",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1406;
      if(_offset >= _count) return;
      _fieldSize = Math.min(3,_count - _offset);
        try {
           me_brand = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("me_brand",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1409;
      if(_offset + 2 > _count) return;
        try {
           card_exp_date_year = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("card_exp_date_year",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1411;
      if(_offset + 2 > _count) return;
        try {
           card_exp_date_month = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("card_exp_date_month",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1413;
      if(_offset >= _count) return;
      _fieldSize = Math.min(10,_count - _offset);
        try {
           uid = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("uid",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1423;
      if(_offset >= _count) return;
      _fieldSize = Math.min(3,_count - _offset);
        try {
           te_brand = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("te_brand",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1426;
      if(_offset >= _count) return;
      _fieldSize = Math.min(3,_count - _offset);
        try {
           filler4 = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler4",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1429;
      if(_offset + 2 > _count) return;
        try {
           response_table = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("response_table",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1431;
      if(_offset + 2 > _count) return;
        try {
           decision_table = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("decision_table",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1433;
      if(_offset + 6 > _count) return;
        try {
           d__ch_atm_last_date_r = DataConversion.NumStrToJavaStr(_buffer,_offset,6, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_atm_last_date_r",dce);
           } else { 
              throw dce;
           }
        }
      for(int _i0 = 0; _i0 < 4; _i0++) {

        _offset = 1439 + (_i0 * 14);
          if(_offset + 12 > _count) return;
          try {
             d__ch_atm_tot_curr_tx[_i0].d__ch_tot_tx_amount = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch_atm_tot_curr_tx[_i0].d__ch_tot_tx_amount",dce);
             } else { 
                throw dce;
             }
          }

        _offset = 1451 + (_i0 * 14);
          if(_offset + 2 > _count) return;
          try {
             d__ch_atm_tot_curr_tx[_i0].d__ch_tot_nb_tx = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
          }catch (DataConversionException dce) {
             _numConversionErrors++;
             if(_allowErrors) {
                _errorDetail.put("d__ch_atm_tot_curr_tx[_i0].d__ch_tot_nb_tx",dce);
             } else { 
                throw dce;
             }
          }
      }

      _offset = 1495;
      if(_offset + 1 > _count) return;
        try {
           d__ch_pin_ch_allowed_ind = DataConversion.NumStrToJavaStr(_buffer,_offset,1, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_pin_ch_allowed_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1496;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_pin_change_busy_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_pin_change_busy_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1497;
      if(_offset + 2 > _count) return;
        try {
           d__ch_exp_yy_last_appr_tx = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_exp_yy_last_appr_tx",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1499;
      if(_offset + 12 > _count) return;
        try {
           d__ch_curr_pvv_date_time_r = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_curr_pvv_date_time_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1511;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_curr_pvki = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_curr_pvki",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1512;
      if(_offset + 12 > _count) return;
        try {
           d__ch_temp_pvv_date_time_r = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_temp_pvv_date_time_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1524;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_temp_pvki = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_temp_pvki",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1525;
      if(_offset + 2 > _count) return;
        try {
           d__ch_try_pin_change = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_try_pin_change",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1527;
      if(_offset + 6 > _count) return;
        try {
           d__ch_iss_id = DataConversion.NumStrToJavaStr(_buffer,_offset,6, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_iss_id",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1533;
      if(_offset >= _count) return;
      _fieldSize = Math.min(2,_count - _offset);
        try {
           d__ch_visa_key_set = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_visa_key_set",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1535;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_cash_limit_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_cash_limit_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1536;
      if(_offset + 12 > _count) return;
        try {
           d__ch_cash_limit = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_cash_limit",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1548;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_account_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_account_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1549;
      if(_offset >= _count) return;
      _fieldSize = Math.min(18,_count - _offset);
        try {
           d__ch_account = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_account",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1567;
      if(_offset + 12 > _count) return;
        try {
           d__ch_cash_limit_bank = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_cash_limit_bank",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1579;
      if(_offset + 6 > _count) return;
        try {
           d__ch_cash_limit_date_r = DataConversion.NumStrToJavaStr(_buffer,_offset,6, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_cash_limit_date_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1585;
      if(_offset >= _count) return;
      _fieldSize = Math.min(2,_count - _offset);
        try {
           d__ch_emv_sd_id = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_sd_id",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1587;
      if(_offset >= _count) return;
      _fieldSize = Math.min(2,_count - _offset);
        try {
           d__ch_emv_app_inst = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_app_inst",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1589;
      if(_offset >= _count) return;
      _fieldSize = Math.min(2,_count - _offset);
        try {
           d__ch_emv_mk_ver = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_mk_ver",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1591;
      if(_offset >= _count) return;
      _fieldSize = Math.min(4,_count - _offset);
        try {
           d__ch_emv_atc = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_atc",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1595;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_pin_synchro = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_pin_synchro",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1596;
      if(_offset >= _count) return;
      _fieldSize = Math.min(8,_count - _offset);
        try {
           d__ch_crit_script_script_number = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_crit_script_script_number",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1604;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_crit_script_flag_script_ready = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_crit_script_flag_script_ready",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1605;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_crit_script_flag_script_sent = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_crit_script_flag_script_sent",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1606;
      if(_offset >= _count) return;
      _fieldSize = Math.min(8,_count - _offset);
        try {
           d__ch_script_pri_1_script_number = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_script_pri_1_script_number",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1614;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_script_pri_1_flag_script_ready = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_script_pri_1_flag_script_ready",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1615;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_script_pri_1_flag_script_sent = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_script_pri_1_flag_script_sent",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1616;
      if(_offset >= _count) return;
      _fieldSize = Math.min(8,_count - _offset);
        try {
           d__ch_script_pri_2_script_number = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_script_pri_2_script_number",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1624;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_script_pri_2_flag_script_ready = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_script_pri_2_flag_script_ready",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1625;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_script_pri_2_flag_script_sent = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_script_pri_2_flag_script_sent",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1626;
      if(_offset >= _count) return;
      _fieldSize = Math.min(12,_count - _offset);
        try {
           d__ch_emv_card_nr = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_card_nr",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1638;
      if(_offset >= _count) return;
      _fieldSize = Math.min(4,_count - _offset);
        try {
           d__ch_calc_counter = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_calc_counter",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1642;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_oltb_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_oltb_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1643;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_second_card_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_second_card_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1644;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_old_icvv_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_old_icvv_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1645;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_new_icvv_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_new_icvv_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1646;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_wng_icvv_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_wng_icvv_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1647;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_emv_card_type = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_card_type",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1648;
      if(_offset + 6 > _count) return;
        try {
           d__ch_cust_nr = DataConversion.NumStrToJavaStr(_buffer,_offset,6, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_cust_nr",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1654;
      if(_offset + 1 > _count) return;
        try {
           d__ch_bor_sec_code_try = DataConversion.NumStrToJavaStr(_buffer,_offset,1, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_bor_sec_code_try",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1655;
      if(_offset + 12 > _count) return;
        try {
           d__ch_emv_load_sum = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_load_sum",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1667;
      if(_offset + 12 > _count) return;
        try {
           d__ch_emv_spent_sum = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_spent_sum",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1679;
      if(_offset + 4 > _count) return;
        try {
           d__ch_emv_offline_tx = DataConversion.NumStrToJavaStr(_buffer,_offset,4, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_offline_tx",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1683;
      if(_offset + 1 > _count) return;
        try {
           d__ch_emv_cntless_ind = DataConversion.NumStrToJavaStr(_buffer,_offset,1, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_emv_cntless_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1684;
      if(_offset >= _count) return;
      _fieldSize = Math.min(16,_count - _offset);
        try {
           d__ch_new_emue = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_new_emue",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1700;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_dkvk_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dkvk_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1701;
      if(_offset + 14 > _count) return;
        try {
           d__ch_dkvk_time_r = DataConversion.NumStrToJavaStr(_buffer,_offset,14, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dkvk_time_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1715;
      if(_offset >= _count) return;
      _fieldSize = Math.min(4,_count - _offset);
        try {
           d__ch_dkvk_ym = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dkvk_ym",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1719;
      if(_offset >= _count) return;
      _fieldSize = Math.min(3,_count - _offset);
        try {
           d__ch_dkvk_sc = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dkvk_sc",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1722;
      if(_offset + 3 > _count) return;
        try {
           d__ch_dkvk_min = DataConversion.NumStrToJavaStr(_buffer,_offset,3, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dkvk_min",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1725;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_dkvk_static_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_dkvk_static_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1726;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_act_flag1_old = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_act_flag1_old",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1727;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_act_flag2_old = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_act_flag2_old",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1728;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_act_flag1_new = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_act_flag1_new",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1729;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_act_flag2_new = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_act_flag2_new",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1730;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_pvv_cvv_ind_old = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_pvv_cvv_ind_old",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1731;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_pvv_cvv_ind_new = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_pvv_cvv_ind_new",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1732;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_internet_ind_old = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_internet_ind_old",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1733;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_internet_ind_new = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_internet_ind_new",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1734;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__ch_act_flag3 = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_act_flag3",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1735;
      if(_offset + 2 > _count) return;
        try {
           d__ch_sca_count = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_sca_count",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1737;
      if(_offset + 2 > _count) return;
        try {
           d__ch_sca_count_3d = DataConversion.NumStrToJavaStr(_buffer,_offset,2, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_sca_count_3d",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1739;
      if(_offset + 12 > _count) return;
        try {
           d__ch_sca_amt = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__ch_sca_amt",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 1751;
      if(_offset >= _count) return;
      _fieldSize = Math.min(279,_count - _offset);
        try {
           filler5 = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler5",dce);
           } else { 
              throw dce;
           }
        }
    }
/**
Moves and converts the data from the instance variables to a byte array
@return a byte array containing the converted data.
@exception com.tandem.ext.util.DataConversionException if an instance
variable fails to convert successfully.
**/

    public byte[] marshal()
        throws com.tandem.ext.util.DataConversionException, NumberFormatException {

        byte [] _buffer = new byte[_bufferLen];
        marshal(_buffer);
        return _buffer;
    }

/**
Moves and converts the data from the instance variables to a byte array
@param _buffer the byte array to which the data is to be moved.
@return a byte array containing the converted data.
@exception com.tandem.guardian.DataConversionException if the length of the
supplied byte array is not greater than or equal to the minimum required
length or if an instance variable fails to convert successfully.
**/

    public byte[] marshal(byte [] _buffer)
        throws com.tandem.ext.util.DataConversionException {
      if(_buffer.length < _bufferLen) 
         throw new DataConversionException(DataConversionException.ConvError.RANGE,
          "Buffer length is less than minimum required buffer length");

      int _offset;


      _offset = 0;
        if(d__ch_card_pan_r != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_card_pan_r,_offset,19);
        }

      _offset = 19;
        if(filler0 != null) {
        DataConversion.JavaStrToCStr(_buffer,filler0,_offset,1);
        }

      _offset = 20;
        if(filler1 != null) {
        DataConversion.JavaStrToCStr(_buffer,filler1,_offset,3);
        }

      _offset = 23;
        if(d__ch_name != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_name,_offset,26);
        }

      _offset = 49;
        if(d__ch_curcy_code != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_curcy_code, _offset, 3, 0, 16);

      _offset = 52;
        DataConversion.JavaShortToBIN16(_buffer,d__ch_except_ind_int,_offset);

      _offset = 54;
        DataConversion.JavaShortToBIN16(_buffer,d__ch_except_ind_dom,_offset);

      _offset = 56;
        if(d__ch_purge_date_year != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_purge_date_year, _offset, 2, 0, 16);

      _offset = 58;
        if(d__ch_purge_date_month != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_purge_date_month, _offset, 2, 0, 16);

      _offset = 60;
        if(d__ch_region_code != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_region_code,_offset,9);
        }

      _offset = 69;
        if(d__ch_exp_date_year != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_exp_date_year, _offset, 2, 0, 16);

      _offset = 71;
        if(d__ch_exp_date_month != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_exp_date_month, _offset, 2, 0, 16);

      _offset = 73;
        if(d__ch_saldo_on_host != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__ch_saldo_on_host, _offset,13, 0, 12);

      _offset = 86;
        if(d__ch_crac_limit != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__ch_crac_limit, _offset,13, 0, 12);

      _offset = 99;
        if(d__ch_temp_disp_increm != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__ch_temp_disp_increm, _offset,13, 0, 12);

      _offset = 112;
        if(d__ch_max_date_increm_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_max_date_increm_r, _offset, 6, 0, 16);

      _offset = 118;
        if(filler2 != null) {
        DataConversion.JavaStrToCStr(_buffer,filler2,_offset,5);
        }

      _offset = 123;
        if(d__ch_tot_auth_pend != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__ch_tot_auth_pend, _offset,13, 0, 12);

      _offset = 136;
        if(d__ch_tot_dc_aleu != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__ch_tot_dc_aleu, _offset,13, 0, 12);

      _offset = 149;
        if(d__ch_tot_dc_steu != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__ch_tot_dc_steu, _offset,13, 0, 12);

      _offset = 162;
        if(d__ch_tx_time_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_tx_time_r, _offset, 14, 0, 16);

      _offset = 176;
        if(filler3 != null) {
        DataConversion.JavaStrToCStr(_buffer,filler3,_offset,43);
        }

      _offset = 219;
        if(d__ch_dom_sale_max_tx != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_sale_max_tx, _offset, 12, 0, 16);

      _offset = 231;
        if(d__ch_dom_cash_max_tx != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_cash_max_tx, _offset, 12, 0, 16);

      _offset = 243;
        if(d__ch_int_sale_max_tx != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_sale_max_tx, _offset, 12, 0, 16);

      _offset = 255;
        if(d__ch_int_cash_max_tx != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_cash_max_tx, _offset, 12, 0, 16);

      _offset = 267;
        if(d__ch_dom_sale_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_sale_max_24h, _offset, 12, 0, 16);

      _offset = 279;
        if(d__ch_dom_cash_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_cash_max_24h, _offset, 12, 0, 16);

      _offset = 291;
        if(d__ch_dom_tot_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_tot_max_24h, _offset, 12, 0, 16);

      _offset = 303;
        if(d__ch_int_sale_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_sale_max_24h, _offset, 12, 0, 16);

      _offset = 315;
        if(d__ch_int_cash_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_cash_max_24h, _offset, 12, 0, 16);

      _offset = 327;
        if(d__ch_int_tot_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_tot_max_24h, _offset, 12, 0, 16);

      _offset = 339;
        if(d__ch_sale_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_sale_max_24h, _offset, 12, 0, 16);

      _offset = 351;
        if(d__ch_cash_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_cash_max_24h, _offset, 12, 0, 16);

      _offset = 363;
        if(d__ch_tot_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_tot_max_24h, _offset, 12, 0, 16);

      _offset = 375;
        if(d__ch_card_use_max_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_card_use_max_24h, _offset, 4, 0, 16);

      _offset = 379;
        if(d__ch_dom_sale_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_sale_max_7d, _offset, 12, 0, 16);

      _offset = 391;
        if(d__ch_dom_cash_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_cash_max_7d, _offset, 12, 0, 16);

      _offset = 403;
        if(d__ch_dom_tot_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_tot_max_7d, _offset, 12, 0, 16);

      _offset = 415;
        if(d__ch_int_sale_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_sale_max_7d, _offset, 12, 0, 16);

      _offset = 427;
        if(d__ch_int_cash_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_cash_max_7d, _offset, 12, 0, 16);

      _offset = 439;
        if(d__ch_int_tot_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_tot_max_7d, _offset, 12, 0, 16);

      _offset = 451;
        if(d__ch_sale_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_sale_max_7d, _offset, 12, 0, 16);

      _offset = 463;
        if(d__ch_cash_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_cash_max_7d, _offset, 12, 0, 16);

      _offset = 475;
        if(d__ch_tot_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_tot_max_7d, _offset, 12, 0, 16);

      _offset = 487;
        if(d__ch_card_use_max_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_card_use_max_7d, _offset, 4, 0, 16);

      _offset = 491;
        if(d__ch_dom_sale_cur_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_sale_cur_24h, _offset, 12, 0, 16);

      _offset = 503;
        if(d__ch_dom_cash_cur_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_cash_cur_24h, _offset, 12, 0, 16);

      _offset = 515;
        if(d__ch_int_sale_cur_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_sale_cur_24h, _offset, 12, 0, 16);

      _offset = 527;
        if(d__ch_int_cash_cur_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_cash_cur_24h, _offset, 12, 0, 16);

      _offset = 539;
        if(d__ch_card_use_cur_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_card_use_cur_24h, _offset, 4, 0, 16);

      _offset = 543;
        if(d__ch_pointer_24h != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_pointer_24h, _offset, 2, 0, 16);
      for(int _i0 = 0; _i0 < 6; _i0++) {

        _offset = 545 + (_i0 * 52);
          if(d__ch__cur_4h[_i0].d__ch__cur_4h_dom_sale != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_4h[_i0].d__ch__cur_4h_dom_sale, _offset, 12, 0, 16);

        _offset = 557 + (_i0 * 52);
          if(d__ch__cur_4h[_i0].d__ch__cur_4h_dom_cash != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_4h[_i0].d__ch__cur_4h_dom_cash, _offset, 12, 0, 16);

        _offset = 569 + (_i0 * 52);
          if(d__ch__cur_4h[_i0].d__ch__cur_4h_int_sale != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_4h[_i0].d__ch__cur_4h_int_sale, _offset, 12, 0, 16);

        _offset = 581 + (_i0 * 52);
          if(d__ch__cur_4h[_i0].d__ch__cur_4h_int_cash != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_4h[_i0].d__ch__cur_4h_int_cash, _offset, 12, 0, 16);

        _offset = 593 + (_i0 * 52);
          if(d__ch__cur_4h[_i0].d__ch__cur_4h_card_use != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_4h[_i0].d__ch__cur_4h_card_use, _offset, 4, 0, 16);
      }

      _offset = 857;
        if(d__ch_dom_sale_cur_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_sale_cur_7d, _offset, 12, 0, 16);

      _offset = 869;
        if(d__ch_dom_cash_cur_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dom_cash_cur_7d, _offset, 12, 0, 16);

      _offset = 881;
        if(d__ch_int_sale_cur_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_sale_cur_7d, _offset, 12, 0, 16);

      _offset = 893;
        if(d__ch_int_cash_cur_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_int_cash_cur_7d, _offset, 12, 0, 16);

      _offset = 905;
        if(d__ch_card_use_cur_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_card_use_cur_7d, _offset, 4, 0, 16);

      _offset = 909;
        if(d__ch_pointer_7d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_pointer_7d, _offset, 2, 0, 16);
      for(int _i0 = 0; _i0 < 7; _i0++) {

        _offset = 911 + (_i0 * 52);
          if(d__ch__cur_day[_i0].d__ch__cur_day_dom_sale != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_day[_i0].d__ch__cur_day_dom_sale, _offset, 12, 0, 16);

        _offset = 923 + (_i0 * 52);
          if(d__ch__cur_day[_i0].d__ch__cur_day_dom_cash != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_day[_i0].d__ch__cur_day_dom_cash, _offset, 12, 0, 16);

        _offset = 935 + (_i0 * 52);
          if(d__ch__cur_day[_i0].d__ch__cur_day_int_sale != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_day[_i0].d__ch__cur_day_int_sale, _offset, 12, 0, 16);

        _offset = 947 + (_i0 * 52);
          if(d__ch__cur_day[_i0].d__ch__cur_day_int_cash != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_day[_i0].d__ch__cur_day_int_cash, _offset, 12, 0, 16);

        _offset = 959 + (_i0 * 52);
          if(d__ch__cur_day[_i0].d__ch__cur_day_card_use != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch__cur_day[_i0].d__ch__cur_day_card_use, _offset, 4, 0, 16);
      }

      _offset = 1275;
        if(user_class != null) {
        DataConversion.JavaStrToCStr(_buffer,user_class,_offset,3);
        }

      _offset = 1278;
        if(user_id != null) {
        DataConversion.JavaStrToCStr(_buffer,user_id,_offset,8);
        }

      _offset = 1286;
        if(state != null) 
          DataConversion.JavaStrToNumStr(_buffer,state, _offset, 1, 0, 16);

      _offset = 1287;
        if(disable_reason != null) 
          DataConversion.JavaStrToNumStr(_buffer,disable_reason, _offset, 1, 0, 16);

      _offset = 1288;
        if(creation_time_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,creation_time_r, _offset, 10, 0, 16);

      _offset = 1298;
        if(disable_time_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,disable_time_r, _offset, 10, 0, 16);

      _offset = 1308;
        if(modif_time_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,modif_time_r, _offset, 10, 0, 16);

      _offset = 1318;
        DataConversion.JavaShortToBIN16(_buffer,d__ch_curr_pvv,_offset);

      _offset = 1320;
        DataConversion.JavaShortToBIN16(_buffer,d__ch_temp_pvv,_offset);

      _offset = 1322;
        if(d__ch_pin_err_cnt != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_pin_err_cnt, _offset, 1, 0, 16);

      _offset = 1323;
        if(d__ch_pin_disable != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_pin_disable, _offset, 1, 0, 16);

      _offset = 1324;
        if(d__ch_updt_nr != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_updt_nr, _offset, 4, 0, 16);

      _offset = 1328;
        if(trace_nr != null) {
        DataConversion.JavaStrToCStr(_buffer,trace_nr,_offset,6);
        }

      _offset = 1334;
        if(compl_code != null) {
        DataConversion.JavaStrToCStr(_buffer,compl_code,_offset,32);
        }

      _offset = 1366;
        DataConversion.JavaShortToBIN16(_buffer,reply_code,_offset);

      _offset = 1368;
        if(amt != null) 
        DataConversion.JavaStrToNumStr(_buffer, amt, _offset,13, 0, 12);

      _offset = 1381;
        if(codfin != null) 
          DataConversion.JavaStrToNumStr(_buffer,codfin, _offset, 2, 0, 16);

      _offset = 1383;
        if(tx_type != null) 
          DataConversion.JavaStrToNumStr(_buffer,tx_type, _offset, 2, 0, 16);

      _offset = 1385;
        if(datim_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,datim_r, _offset, 10, 0, 16);

      _offset = 1395;
        if(iso2_ind != null) 
          DataConversion.JavaStrToNumStr(_buffer,iso2_ind, _offset, 1, 0, 16);

      _offset = 1396;
        if(mid != null) {
        DataConversion.JavaStrToCStr(_buffer,mid,_offset,10);
        }

      _offset = 1406;
        if(me_brand != null) {
        DataConversion.JavaStrToCStr(_buffer,me_brand,_offset,3);
        }

      _offset = 1409;
        if(card_exp_date_year != null) 
          DataConversion.JavaStrToNumStr(_buffer,card_exp_date_year, _offset, 2, 0, 16);

      _offset = 1411;
        if(card_exp_date_month != null) 
          DataConversion.JavaStrToNumStr(_buffer,card_exp_date_month, _offset, 2, 0, 16);

      _offset = 1413;
        if(uid != null) {
        DataConversion.JavaStrToCStr(_buffer,uid,_offset,10);
        }

      _offset = 1423;
        if(te_brand != null) {
        DataConversion.JavaStrToCStr(_buffer,te_brand,_offset,3);
        }

      _offset = 1426;
        if(filler4 != null) {
        DataConversion.JavaStrToCStr(_buffer,filler4,_offset,3);
        }

      _offset = 1429;
        if(response_table != null) 
          DataConversion.JavaStrToNumStr(_buffer,response_table, _offset, 2, 0, 16);

      _offset = 1431;
        if(decision_table != null) 
          DataConversion.JavaStrToNumStr(_buffer,decision_table, _offset, 2, 0, 16);

      _offset = 1433;
        if(d__ch_atm_last_date_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_atm_last_date_r, _offset, 6, 0, 16);
      for(int _i0 = 0; _i0 < 4; _i0++) {

        _offset = 1439 + (_i0 * 14);
          if(d__ch_atm_tot_curr_tx[_i0].d__ch_tot_tx_amount != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch_atm_tot_curr_tx[_i0].d__ch_tot_tx_amount, _offset, 12, 0, 16);

        _offset = 1451 + (_i0 * 14);
          if(d__ch_atm_tot_curr_tx[_i0].d__ch_tot_nb_tx != null) 
            DataConversion.JavaStrToNumStr(_buffer,d__ch_atm_tot_curr_tx[_i0].d__ch_tot_nb_tx, _offset, 2, 0, 16);
      }

      _offset = 1495;
        if(d__ch_pin_ch_allowed_ind != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_pin_ch_allowed_ind, _offset, 1, 0, 16);

      _offset = 1496;
        if(d__ch_pin_change_busy_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_pin_change_busy_ind,_offset,1);
        }

      _offset = 1497;
        if(d__ch_exp_yy_last_appr_tx != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_exp_yy_last_appr_tx, _offset, 2, 0, 16);

      _offset = 1499;
        if(d__ch_curr_pvv_date_time_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_curr_pvv_date_time_r, _offset, 12, 0, 16);

      _offset = 1511;
        if(d__ch_curr_pvki != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_curr_pvki,_offset,1);
        }

      _offset = 1512;
        if(d__ch_temp_pvv_date_time_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_temp_pvv_date_time_r, _offset, 12, 0, 16);

      _offset = 1524;
        if(d__ch_temp_pvki != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_temp_pvki,_offset,1);
        }

      _offset = 1525;
        if(d__ch_try_pin_change != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_try_pin_change, _offset, 2, 0, 16);

      _offset = 1527;
        if(d__ch_iss_id != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_iss_id, _offset, 6, 0, 16);

      _offset = 1533;
        if(d__ch_visa_key_set != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_visa_key_set,_offset,2);
        }

      _offset = 1535;
        if(d__ch_cash_limit_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_cash_limit_ind,_offset,1);
        }

      _offset = 1536;
        if(d__ch_cash_limit != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_cash_limit, _offset, 12, 0, 16);

      _offset = 1548;
        if(d__ch_account_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_account_ind,_offset,1);
        }

      _offset = 1549;
        if(d__ch_account != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_account,_offset,18);
        }

      _offset = 1567;
        if(d__ch_cash_limit_bank != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_cash_limit_bank, _offset, 12, 0, 16);

      _offset = 1579;
        if(d__ch_cash_limit_date_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_cash_limit_date_r, _offset, 6, 0, 16);

      _offset = 1585;
        if(d__ch_emv_sd_id != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_emv_sd_id,_offset,2);
        }

      _offset = 1587;
        if(d__ch_emv_app_inst != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_emv_app_inst,_offset,2);
        }

      _offset = 1589;
        if(d__ch_emv_mk_ver != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_emv_mk_ver,_offset,2);
        }

      _offset = 1591;
        if(d__ch_emv_atc != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_emv_atc,_offset,4);
        }

      _offset = 1595;
        if(d__ch_pin_synchro != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_pin_synchro,_offset,1);
        }

      _offset = 1596;
        if(d__ch_crit_script_script_number != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_crit_script_script_number,_offset,8);
        }

      _offset = 1604;
        if(d__ch_crit_script_flag_script_ready != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_crit_script_flag_script_ready,_offset,1);
        }

      _offset = 1605;
        if(d__ch_crit_script_flag_script_sent != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_crit_script_flag_script_sent,_offset,1);
        }

      _offset = 1606;
        if(d__ch_script_pri_1_script_number != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_script_pri_1_script_number,_offset,8);
        }

      _offset = 1614;
        if(d__ch_script_pri_1_flag_script_ready != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_script_pri_1_flag_script_ready,_offset,1);
        }

      _offset = 1615;
        if(d__ch_script_pri_1_flag_script_sent != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_script_pri_1_flag_script_sent,_offset,1);
        }

      _offset = 1616;
        if(d__ch_script_pri_2_script_number != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_script_pri_2_script_number,_offset,8);
        }

      _offset = 1624;
        if(d__ch_script_pri_2_flag_script_ready != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_script_pri_2_flag_script_ready,_offset,1);
        }

      _offset = 1625;
        if(d__ch_script_pri_2_flag_script_sent != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_script_pri_2_flag_script_sent,_offset,1);
        }

      _offset = 1626;
        if(d__ch_emv_card_nr != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_emv_card_nr,_offset,12);
        }

      _offset = 1638;
        if(d__ch_calc_counter != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_calc_counter,_offset,4);
        }

      _offset = 1642;
        if(d__ch_oltb_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_oltb_ind,_offset,1);
        }

      _offset = 1643;
        if(d__ch_second_card_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_second_card_ind,_offset,1);
        }

      _offset = 1644;
        if(d__ch_old_icvv_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_old_icvv_ind,_offset,1);
        }

      _offset = 1645;
        if(d__ch_new_icvv_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_new_icvv_ind,_offset,1);
        }

      _offset = 1646;
        if(d__ch_wng_icvv_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_wng_icvv_ind,_offset,1);
        }

      _offset = 1647;
        if(d__ch_emv_card_type != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_emv_card_type,_offset,1);
        }

      _offset = 1648;
        if(d__ch_cust_nr != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_cust_nr, _offset, 6, 0, 16);

      _offset = 1654;
        if(d__ch_bor_sec_code_try != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_bor_sec_code_try, _offset, 1, 0, 16);

      _offset = 1655;
        if(d__ch_emv_load_sum != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_emv_load_sum, _offset, 12, 0, 16);

      _offset = 1667;
        if(d__ch_emv_spent_sum != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_emv_spent_sum, _offset, 12, 0, 16);

      _offset = 1679;
        if(d__ch_emv_offline_tx != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_emv_offline_tx, _offset, 4, 0, 16);

      _offset = 1683;
        if(d__ch_emv_cntless_ind != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_emv_cntless_ind, _offset, 1, 0, 16);

      _offset = 1684;
        if(d__ch_new_emue != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_new_emue,_offset,16);
        }

      _offset = 1700;
        if(d__ch_dkvk_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_dkvk_ind,_offset,1);
        }

      _offset = 1701;
        if(d__ch_dkvk_time_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dkvk_time_r, _offset, 14, 0, 16);

      _offset = 1715;
        if(d__ch_dkvk_ym != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_dkvk_ym,_offset,4);
        }

      _offset = 1719;
        if(d__ch_dkvk_sc != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_dkvk_sc,_offset,3);
        }

      _offset = 1722;
        if(d__ch_dkvk_min != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_dkvk_min, _offset, 3, 0, 16);

      _offset = 1725;
        if(d__ch_dkvk_static_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_dkvk_static_ind,_offset,1);
        }

      _offset = 1726;
        if(d__ch_act_flag1_old != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_act_flag1_old,_offset,1);
        }

      _offset = 1727;
        if(d__ch_act_flag2_old != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_act_flag2_old,_offset,1);
        }

      _offset = 1728;
        if(d__ch_act_flag1_new != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_act_flag1_new,_offset,1);
        }

      _offset = 1729;
        if(d__ch_act_flag2_new != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_act_flag2_new,_offset,1);
        }

      _offset = 1730;
        if(d__ch_pvv_cvv_ind_old != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_pvv_cvv_ind_old,_offset,1);
        }

      _offset = 1731;
        if(d__ch_pvv_cvv_ind_new != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_pvv_cvv_ind_new,_offset,1);
        }

      _offset = 1732;
        if(d__ch_internet_ind_old != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_internet_ind_old,_offset,1);
        }

      _offset = 1733;
        if(d__ch_internet_ind_new != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_internet_ind_new,_offset,1);
        }

      _offset = 1734;
        if(d__ch_act_flag3 != null) {
        DataConversion.JavaStrToCStr(_buffer,d__ch_act_flag3,_offset,1);
        }

      _offset = 1735;
        if(d__ch_sca_count != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_sca_count, _offset, 2, 0, 16);

      _offset = 1737;
        if(d__ch_sca_count_3d != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_sca_count_3d, _offset, 2, 0, 16);

      _offset = 1739;
        if(d__ch_sca_amt != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__ch_sca_amt, _offset, 12, 0, 16);

      _offset = 1751;
        if(filler5 != null) {
        DataConversion.JavaStrToCStr(_buffer,filler5,_offset,278);
        }
      return _buffer;
    }
  }
