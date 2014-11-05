//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.05 at 02:41:54 AM ART 
//


package despacho.xml.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idModulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="items">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="articulo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idSolicitud",
    "idModulo",
    "items"
})
@XmlRootElement(name = "solicitudArticulos")
public class SolicitudArticulos {

    @XmlElement(required = true)
    protected String idSolicitud;
    @XmlElement(required = true)
    protected String idModulo;
    @XmlElement(required = true)
    protected SolicitudArticulos.Items items;

    /**
     * Gets the value of the idSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * Sets the value of the idSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSolicitud(String value) {
        this.idSolicitud = value;
    }

    /**
     * Gets the value of the idModulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdModulo() {
        return idModulo;
    }

    /**
     * Sets the value of the idModulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdModulo(String value) {
        this.idModulo = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudArticulos.Items }
     *     
     */
    public SolicitudArticulos.Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudArticulos.Items }
     *     
     */
    public void setItems(SolicitudArticulos.Items value) {
        this.items = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="articulo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "articulo"
    })
    public static class Items {

        @XmlElement(required = true)
        protected SolicitudArticulos.Items.Articulo articulo;

        /**
         * Gets the value of the articulo property.
         * 
         * @return
         *     possible object is
         *     {@link SolicitudArticulos.Items.Articulo }
         *     
         */
        public SolicitudArticulos.Items.Articulo getArticulo() {
            return articulo;
        }

        /**
         * Sets the value of the articulo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SolicitudArticulos.Items.Articulo }
         *     
         */
        public void setArticulo(SolicitudArticulos.Items.Articulo value) {
            this.articulo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "codigo",
            "cantidad"
        })
        public static class Articulo {

            @XmlElement(required = true)
            protected String codigo;
            protected int cantidad;

            /**
             * Gets the value of the codigo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * Sets the value of the codigo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

            /**
             * Gets the value of the cantidad property.
             * 
             */
            public int getCantidad() {
                return cantidad;
            }

            /**
             * Sets the value of the cantidad property.
             * 
             */
            public void setCantidad(int value) {
                this.cantidad = value;
            }

        }

    }

}
