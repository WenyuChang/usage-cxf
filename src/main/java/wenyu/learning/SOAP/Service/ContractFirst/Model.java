/**
 * Model.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wenyu.learning.SOAP.Service.ContractFirst;

@SuppressWarnings("serial")
public class Model implements java.io.Serializable {
    private java.lang.String modelName;

    private java.lang.String modelId;

    public Model() {
    }

    public Model(
           java.lang.String modelName,
           java.lang.String modelId) {
           this.modelName = modelName;
           this.modelId = modelId;
    }


    /**
     * Gets the modelName value for this Model.
     * 
     * @return modelName
     */
    public java.lang.String getModelName() {
        return modelName;
    }


    /**
     * Sets the modelName value for this Model.
     * 
     * @param modelName
     */
    public void setModelName(java.lang.String modelName) {
        this.modelName = modelName;
    }


    /**
     * Gets the modelId value for this Model.
     * 
     * @return modelId
     */
    public java.lang.String getModelId() {
        return modelId;
    }


    /**
     * Sets the modelId value for this Model.
     * 
     * @param modelId
     */
    public void setModelId(java.lang.String modelId) {
        this.modelId = modelId;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Model)) return false;
        Model other = (Model) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelName==null && other.getModelName()==null) || 
             (this.modelName!=null &&
              this.modelName.equals(other.getModelName()))) &&
            ((this.modelId==null && other.getModelId()==null) || 
             (this.modelId!=null &&
              this.modelId.equals(other.getModelId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getModelName() != null) {
            _hashCode += getModelName().hashCode();
        }
        if (getModelId() != null) {
            _hashCode += getModelId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Model.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ContractFirst.Service.SOAP.learning.wenyu/", "model"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    @SuppressWarnings("rawtypes")
	public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    @SuppressWarnings("rawtypes")
	public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

    public String execute() {
		String str = "";
		str += "Contract First Model(:" + this.hashCode() + ")" + this.getClass().getSimpleName();
		str += " [" + modelName + "/" + modelId + "]"; 
		return str;
	}
}
