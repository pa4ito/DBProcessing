package dpkg;
import java.util.Vector;
import java.util.Hashtable;
import java.io.CharConversionException;
import java.util.HashMap;
import java.util.MissingResourceException;
import com.tandem.ext.guardian.*;
import com.tandem.ext.util.*;
import java.math.BigDecimal;
/**
IO_Pac class was generated for DDL Rec/Def: pac on: 8/27/24 at: 22:13:31.
This is an INPUT/OUTPUT class which can be used to read and write data.*/

  public class IO_Pac implements com.tandem.ext.guardian.GuardianInput, 
            com.tandem.ext.guardian.GuardianOutput {
    protected int _numConversionErrors;
    protected boolean _allowErrors = false;
    protected HashMap _errorDetail;

    protected int _bufferLen = 150;
    public String d__pac_account_id;
    public String d__pac_avail_state;
    public String d__pac_avail_amt;
    public String d__pac_tot_auth_pend;
    public String d__pac_tot_dc_aleu;
    public String d__pac_tot_dc_steu;
    public String d__pac_avail_date_r;
    public String d__pac_cash_limit_ind;
    public String d__pac_cash_limit;
    public String d__pac_cash_limit_bank;
    public String d__pac_cash_limit_date_r;
    public String d__pac_curcy_code;
    public String d__pac_filler;

/**
IO_Pac Constructor
*/
   public IO_Pac() {
        _errorDetail = new HashMap();
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
Used to set a value for d__pac_account_id.
@param value  the value to be set.
*/
    public void setD__pac_account_id(String value) {
      d__pac_account_id = value;
    }
/**
Used to set a value for d__pac_avail_state.
@param value  the value to be set.
*/
    public void setD__pac_avail_state(String value) {
      d__pac_avail_state = value;
    }
/**
Used to set a value for d__pac_avail_amt.
@param value  the value to be set.
*/
    public void setD__pac_avail_amt(String value) {
      d__pac_avail_amt = value;
    }
/**
Used to set a value for d__pac_tot_auth_pend.
@param value  the value to be set.
*/
    public void setD__pac_tot_auth_pend(String value) {
      d__pac_tot_auth_pend = value;
    }
/**
Used to set a value for d__pac_tot_dc_aleu.
@param value  the value to be set.
*/
    public void setD__pac_tot_dc_aleu(String value) {
      d__pac_tot_dc_aleu = value;
    }
/**
Used to set a value for d__pac_tot_dc_steu.
@param value  the value to be set.
*/
    public void setD__pac_tot_dc_steu(String value) {
      d__pac_tot_dc_steu = value;
    }
/**
Used to set a value for d__pac_avail_date_r.
@param value  the value to be set.
*/
    public void setD__pac_avail_date_r(String value) {
      d__pac_avail_date_r = value;
    }
/**
Used to set a value for d__pac_cash_limit_ind.
@param value  the value to be set.
*/
    public void setD__pac_cash_limit_ind(String value) {
      d__pac_cash_limit_ind = value;
    }
/**
Used to set a value for d__pac_cash_limit.
@param value  the value to be set.
*/
    public void setD__pac_cash_limit(String value) {
      d__pac_cash_limit = value;
    }
/**
Used to set a value for d__pac_cash_limit_bank.
@param value  the value to be set.
*/
    public void setD__pac_cash_limit_bank(String value) {
      d__pac_cash_limit_bank = value;
    }
/**
Used to set a value for d__pac_cash_limit_date_r.
@param value  the value to be set.
*/
    public void setD__pac_cash_limit_date_r(String value) {
      d__pac_cash_limit_date_r = value;
    }
/**
Used to set a value for d__pac_curcy_code.
@param value  the value to be set.
*/
    public void setD__pac_curcy_code(String value) {
      d__pac_curcy_code = value;
    }
/**
Used to set a value for d__pac_filler.
@param value  the value to be set.
*/
    public void setD__pac_filler(String value) {
      d__pac_filler = value;
    }

/**
Used to clear any existing values for d__pac_account_id.
*/
    public void clearD__pac_account_id() {
        d__pac_account_id = null;
    }
/**
Used to clear any existing values for d__pac_avail_state.
*/
    public void clearD__pac_avail_state() {
        d__pac_avail_state = null;
    }
/**
Used to clear any existing values for d__pac_avail_amt.
*/
    public void clearD__pac_avail_amt() {
        d__pac_avail_amt = null;
    }
/**
Used to clear any existing values for d__pac_tot_auth_pend.
*/
    public void clearD__pac_tot_auth_pend() {
        d__pac_tot_auth_pend = null;
    }
/**
Used to clear any existing values for d__pac_tot_dc_aleu.
*/
    public void clearD__pac_tot_dc_aleu() {
        d__pac_tot_dc_aleu = null;
    }
/**
Used to clear any existing values for d__pac_tot_dc_steu.
*/
    public void clearD__pac_tot_dc_steu() {
        d__pac_tot_dc_steu = null;
    }
/**
Used to clear any existing values for d__pac_avail_date_r.
*/
    public void clearD__pac_avail_date_r() {
        d__pac_avail_date_r = null;
    }
/**
Used to clear any existing values for d__pac_cash_limit_ind.
*/
    public void clearD__pac_cash_limit_ind() {
        d__pac_cash_limit_ind = null;
    }
/**
Used to clear any existing values for d__pac_cash_limit.
*/
    public void clearD__pac_cash_limit() {
        d__pac_cash_limit = null;
    }
/**
Used to clear any existing values for d__pac_cash_limit_bank.
*/
    public void clearD__pac_cash_limit_bank() {
        d__pac_cash_limit_bank = null;
    }
/**
Used to clear any existing values for d__pac_cash_limit_date_r.
*/
    public void clearD__pac_cash_limit_date_r() {
        d__pac_cash_limit_date_r = null;
    }
/**
Used to clear any existing values for d__pac_curcy_code.
*/
    public void clearD__pac_curcy_code() {
        d__pac_curcy_code = null;
    }
/**
Used to clear any existing values for d__pac_filler.
*/
    public void clearD__pac_filler() {
        d__pac_filler = null;
    }
/** Used to clear the values of all instance variables in this class.
*/
  public void clear_All() {
      d__pac_account_id = null;
      d__pac_avail_state = null;
      d__pac_avail_amt = null;
      d__pac_tot_auth_pend = null;
      d__pac_tot_dc_aleu = null;
      d__pac_tot_dc_steu = null;
      d__pac_avail_date_r = "0";
      d__pac_cash_limit_ind = null;
      d__pac_cash_limit = "0";
      d__pac_cash_limit_bank = "0";
      d__pac_cash_limit_date_r = "0";
      d__pac_curcy_code = "0";
      d__pac_filler = null;
  }

/**
Used to obtain the value of d__pac_account_id.
@return the value for d__pac_account_id.
*/
    public String getD__pac_account_id() {
      return(d__pac_account_id);
    }
/**
Used to obtain the value of d__pac_avail_state.
@return the value for d__pac_avail_state.
*/
    public String getD__pac_avail_state() {
      return(d__pac_avail_state);
    }
/**
Used to obtain the value of d__pac_avail_amt.
@return the value for d__pac_avail_amt.
*/
    public String getD__pac_avail_amt() {
      return(d__pac_avail_amt);
    }
/**
Used to obtain the value of d__pac_tot_auth_pend.
@return the value for d__pac_tot_auth_pend.
*/
    public String getD__pac_tot_auth_pend() {
      return(d__pac_tot_auth_pend);
    }
/**
Used to obtain the value of d__pac_tot_dc_aleu.
@return the value for d__pac_tot_dc_aleu.
*/
    public String getD__pac_tot_dc_aleu() {
      return(d__pac_tot_dc_aleu);
    }
/**
Used to obtain the value of d__pac_tot_dc_steu.
@return the value for d__pac_tot_dc_steu.
*/
    public String getD__pac_tot_dc_steu() {
      return(d__pac_tot_dc_steu);
    }
/**
Used to obtain the value of d__pac_avail_date_r.
@return the value for d__pac_avail_date_r.
*/
    public String getD__pac_avail_date_r() {
      return(d__pac_avail_date_r);
    }
/**
Used to obtain the value of d__pac_cash_limit_ind.
@return the value for d__pac_cash_limit_ind.
*/
    public String getD__pac_cash_limit_ind() {
      return(d__pac_cash_limit_ind);
    }
/**
Used to obtain the value of d__pac_cash_limit.
@return the value for d__pac_cash_limit.
*/
    public String getD__pac_cash_limit() {
      return(d__pac_cash_limit);
    }
/**
Used to obtain the value of d__pac_cash_limit_bank.
@return the value for d__pac_cash_limit_bank.
*/
    public String getD__pac_cash_limit_bank() {
      return(d__pac_cash_limit_bank);
    }
/**
Used to obtain the value of d__pac_cash_limit_date_r.
@return the value for d__pac_cash_limit_date_r.
*/
    public String getD__pac_cash_limit_date_r() {
      return(d__pac_cash_limit_date_r);
    }
/**
Used to obtain the value of d__pac_curcy_code.
@return the value for d__pac_curcy_code.
*/
    public String getD__pac_curcy_code() {
      return(d__pac_curcy_code);
    }
/**
Used to obtain the value of d__pac_filler.
@return the value for d__pac_filler.
*/
    public String getD__pac_filler() {
      return(d__pac_filler);
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
      _fieldSize = Math.min(18,_count - _offset);
        try {
           d__pac_account_id = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_account_id",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 18;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__pac_avail_state = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_avail_state",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 19;
      if(_offset + 13 > _count) return;
        try {
                d__pac_avail_amt = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_avail_amt",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 32;
      if(_offset + 13 > _count) return;
        try {
                d__pac_tot_auth_pend = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_tot_auth_pend",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 45;
      if(_offset + 13 > _count) return;
        try {
                d__pac_tot_dc_aleu = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_tot_dc_aleu",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 58;
      if(_offset + 13 > _count) return;
        try {
                d__pac_tot_dc_steu = DataConversion.NumStrToJavaStr(_buffer,_offset, 13,(short) 0,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_tot_dc_steu",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 71;
      if(_offset + 6 > _count) return;
        try {
           d__pac_avail_date_r = DataConversion.NumStrToJavaStr(_buffer,_offset,6, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_avail_date_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 77;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
        try {
           d__pac_cash_limit_ind = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_cash_limit_ind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 78;
      if(_offset + 12 > _count) return;
        try {
           d__pac_cash_limit = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_cash_limit",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 90;
      if(_offset + 12 > _count) return;
        try {
           d__pac_cash_limit_bank = DataConversion.NumStrToJavaStr(_buffer,_offset,12, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_cash_limit_bank",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 102;
      if(_offset + 6 > _count) return;
        try {
           d__pac_cash_limit_date_r = DataConversion.NumStrToJavaStr(_buffer,_offset,6, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_cash_limit_date_r",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 108;
      if(_offset + 3 > _count) return;
        try {
           d__pac_curcy_code = DataConversion.NumStrToJavaStr(_buffer,_offset,3, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_curcy_code",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 111;
      if(_offset >= _count) return;
      _fieldSize = Math.min(39,_count - _offset);
        try {
           d__pac_filler = DataConversion.CStrToJavaStr(_buffer,_offset,_fieldSize);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("d__pac_filler",dce);
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
        if(d__pac_account_id != null) {
        DataConversion.JavaStrToCStr(_buffer,d__pac_account_id,_offset,18);
        }

      _offset = 18;
        if(d__pac_avail_state != null) {
        DataConversion.JavaStrToCStr(_buffer,d__pac_avail_state,_offset,1);
        }

      _offset = 19;
        if(d__pac_avail_amt != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__pac_avail_amt, _offset,13, 0, 12);

      _offset = 32;
        if(d__pac_tot_auth_pend != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__pac_tot_auth_pend, _offset,13, 0, 12);

      _offset = 45;
        if(d__pac_tot_dc_aleu != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__pac_tot_dc_aleu, _offset,13, 0, 12);

      _offset = 58;
        if(d__pac_tot_dc_steu != null) 
        DataConversion.JavaStrToNumStr(_buffer, d__pac_tot_dc_steu, _offset,13, 0, 12);

      _offset = 71;
        if(d__pac_avail_date_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__pac_avail_date_r, _offset, 6, 0, 16);

      _offset = 77;
        if(d__pac_cash_limit_ind != null) {
        DataConversion.JavaStrToCStr(_buffer,d__pac_cash_limit_ind,_offset,1);
        }

      _offset = 78;
        if(d__pac_cash_limit != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__pac_cash_limit, _offset, 12, 0, 16);

      _offset = 90;
        if(d__pac_cash_limit_bank != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__pac_cash_limit_bank, _offset, 12, 0, 16);

      _offset = 102;
        if(d__pac_cash_limit_date_r != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__pac_cash_limit_date_r, _offset, 6, 0, 16);

      _offset = 108;
        if(d__pac_curcy_code != null) 
          DataConversion.JavaStrToNumStr(_buffer,d__pac_curcy_code, _offset, 3, 0, 16);

      _offset = 111;
        if(d__pac_filler != null) {
        DataConversion.JavaStrToCStr(_buffer,d__pac_filler,_offset,39);
        }
      return _buffer;
    }
  }
