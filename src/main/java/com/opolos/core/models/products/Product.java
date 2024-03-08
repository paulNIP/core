package com.opolos.core.models.products;
import jakarta.persistence.*;

@Entity
@Table(name = "products", 
    uniqueConstraints = { 
      @UniqueConstraint(columnNames = "id")
    })
public class Product {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id")
  private long id;

  
    private String Type;
    private String Android_SKU;
    private String IOS_SKU;
    private String Name;
    private String Published;
    private String Is_featured;
    private String Visibility_in_catalog;
    private String Short_description;
    private String Description;
    private String Date_sale_price_starts;
    private String Date_sale_price_ends;
    private String Tax_status;
    private String Tax_class;
    private String In_stock;
    private String Stock;
    private String Backorders_allowed;
    private String Sold_individually;
    private String Weight_lbs;
    private String Length_in;
    private String Width_in;
    private String Height_in;
    private String Allow_customer_reviews;
    private String Purchase_note;
    private String Sale_price;
    private String Regular_price;
    private String Categories;
    private String Tags;
    private String Shipping_class;
    private String Images;
    private String Download_limit;
    private String Download_expiry_days;
    private String Parent;
    private String Grouped_products;
    private String Upsells;
    private String Cross_sells;
    private String External_URL;
    private String Button_text;
    private String Position;
    private String Attribute_1_name;
    private String Attribute_1_value;
    private String Attribute_1_visible;
    private String Attribute_1_global;
    private String Attribute_2_name;
    private String Attribute_2_value;
    private String Attribute_2_visible;
    private String Attribute_2_global;
    private String __wpcom_is_markdown;
    private String Download_1_name;
    private String Download_1_URL;
    private String Download_2_name;
    private String Download_2_UR;
    private String company;
    private String status;
    private String instance_name;

  public Product() {


  }


    public Product(String type, String android_SKU, String iOS_SKU, String name, String published, String is_featured,
        String visibility_in_catalog, String short_description, String description, String date_sale_price_starts,
        String date_sale_price_ends, String tax_status, String tax_class, String in_stock, String stock,
        String backorders_allowed, String sold_individually, String weight_lbs, String length_in, String width_in,
        String height_in, String allow_customer_reviews, String purchase_note, String sale_price, String regular_price,
        String categories, String tags, String shipping_class, String images, String download_limit,
        String download_expiry_days, String parent, String grouped_products, String upsells, String cross_sells,
        String external_URL, String button_text, String position, String attribute_1_name, String attribute_1_value,
        String attribute_1_visible, String attribute_1_global, String attribute_2_name, String attribute_2_value,
        String attribute_2_visible, String attribute_2_global, String __wpcom_is_markdown, String download_1_name,
        String download_1_URL, String download_2_name, String download_2_UR, String company, String status,
        String instance_name) {
    Type = type;
    Android_SKU = android_SKU;
    IOS_SKU = iOS_SKU;
    Name = name;
    Published = published;
    Is_featured = is_featured;
    Visibility_in_catalog = visibility_in_catalog;
    Short_description = short_description;
    Description = description;
    Date_sale_price_starts = date_sale_price_starts;
    Date_sale_price_ends = date_sale_price_ends;
    Tax_status = tax_status;
    Tax_class = tax_class;
    In_stock = in_stock;
    Stock = stock;
    Backorders_allowed = backorders_allowed;
    Sold_individually = sold_individually;
    Weight_lbs = weight_lbs;
    Length_in = length_in;
    Width_in = width_in;
    Height_in = height_in;
    Allow_customer_reviews = allow_customer_reviews;
    Purchase_note = purchase_note;
    Sale_price = sale_price;
    Regular_price = regular_price;
    Categories = categories;
    Tags = tags;
    Shipping_class = shipping_class;
    Images = images;
    Download_limit = download_limit;
    Download_expiry_days = download_expiry_days;
    Parent = parent;
    Grouped_products = grouped_products;
    Upsells = upsells;
    Cross_sells = cross_sells;
    External_URL = external_URL;
    Button_text = button_text;
    Position = position;
    Attribute_1_name = attribute_1_name;
    Attribute_1_value = attribute_1_value;
    Attribute_1_visible = attribute_1_visible;
    Attribute_1_global = attribute_1_global;
    Attribute_2_name = attribute_2_name;
    Attribute_2_value = attribute_2_value;
    Attribute_2_visible = attribute_2_visible;
    Attribute_2_global = attribute_2_global;
    this.__wpcom_is_markdown = __wpcom_is_markdown;
    Download_1_name = download_1_name;
    Download_1_URL = download_1_URL;
    Download_2_name = download_2_name;
    Download_2_UR = download_2_UR;
    this.company = company;
    this.status = status;
    this.instance_name = instance_name;
}




    public String getType() {
        return Type;
    }




    public void setType(String type) {
        Type = type;
    }




    public String getAndroid_SKU() {
        return Android_SKU;
    }




    public void setAndroid_SKU(String android_SKU) {
        Android_SKU = android_SKU;
    }




    public String getIOS_SKU() {
        return IOS_SKU;
    }




    public void setIOS_SKU(String iOS_SKU) {
        IOS_SKU = iOS_SKU;
    }




    public String getName() {
        return Name;
    }




    public void setName(String name) {
        Name = name;
    }




    public String getPublished() {
        return Published;
    }




    public void setPublished(String published) {
        Published = published;
    }




    public String getIs_featured() {
        return Is_featured;
    }




    public void setIs_featured(String is_featured) {
        Is_featured = is_featured;
    }




    public String getVisibility_in_catalog() {
        return Visibility_in_catalog;
    }




    public void setVisibility_in_catalog(String visibility_in_catalog) {
        Visibility_in_catalog = visibility_in_catalog;
    }




    public String getShort_description() {
        return Short_description;
    }




    public void setShort_description(String short_description) {
        Short_description = short_description;
    }




    public String getDescription() {
        return Description;
    }




    public void setDescription(String description) {
        Description = description;
    }




    public String getDate_sale_price_starts() {
        return Date_sale_price_starts;
    }




    public void setDate_sale_price_starts(String date_sale_price_starts) {
        Date_sale_price_starts = date_sale_price_starts;
    }




    public String getDate_sale_price_ends() {
        return Date_sale_price_ends;
    }




    public void setDate_sale_price_ends(String date_sale_price_ends) {
        Date_sale_price_ends = date_sale_price_ends;
    }




    public String getTax_status() {
        return Tax_status;
    }




    public void setTax_status(String tax_status) {
        Tax_status = tax_status;
    }




    public String getTax_class() {
        return Tax_class;
    }




    public void setTax_class(String tax_class) {
        Tax_class = tax_class;
    }




    public String getIn_stock() {
        return In_stock;
    }




    public void setIn_stock(String in_stock) {
        In_stock = in_stock;
    }




    public String getStock() {
        return Stock;
    }




    public void setStock(String stock) {
        Stock = stock;
    }




    public String getBackorders_allowed() {
        return Backorders_allowed;
    }




    public void setBackorders_allowed(String backorders_allowed) {
        Backorders_allowed = backorders_allowed;
    }




    public String getSold_individually() {
        return Sold_individually;
    }




    public void setSold_individually(String sold_individually) {
        Sold_individually = sold_individually;
    }




    public String getWeight_lbs() {
        return Weight_lbs;
    }




    public void setWeight_lbs(String weight_lbs) {
        Weight_lbs = weight_lbs;
    }




    public String getLength_in() {
        return Length_in;
    }




    public void setLength_in(String length_in) {
        Length_in = length_in;
    }




    public String getWidth_in() {
        return Width_in;
    }




    public void setWidth_in(String width_in) {
        Width_in = width_in;
    }




    public String getHeight_in() {
        return Height_in;
    }




    public void setHeight_in(String height_in) {
        Height_in = height_in;
    }




    public String getAllow_customer_reviews() {
        return Allow_customer_reviews;
    }




    public void setAllow_customer_reviews(String allow_customer_reviews) {
        Allow_customer_reviews = allow_customer_reviews;
    }




    public String getPurchase_note() {
        return Purchase_note;
    }




    public void setPurchase_note(String purchase_note) {
        Purchase_note = purchase_note;
    }




    public String getSale_price() {
        return Sale_price;
    }




    public void setSale_price(String sale_price) {
        Sale_price = sale_price;
    }




    public String getRegular_price() {
        return Regular_price;
    }




    public void setRegular_price(String regular_price) {
        Regular_price = regular_price;
    }




    public String getCategories() {
        return Categories;
    }




    public void setCategories(String categories) {
        Categories = categories;
    }




    public String getTags() {
        return Tags;
    }




    public void setTags(String tags) {
        Tags = tags;
    }




    public String getShipping_class() {
        return Shipping_class;
    }




    public void setShipping_class(String shipping_class) {
        Shipping_class = shipping_class;
    }




    public String getImages() {
        return Images;
    }




    public void setImages(String images) {
        Images = images;
    }




    public String getDownload_limit() {
        return Download_limit;
    }




    public void setDownload_limit(String download_limit) {
        Download_limit = download_limit;
    }




    public String getDownload_expiry_days() {
        return Download_expiry_days;
    }




    public void setDownload_expiry_days(String download_expiry_days) {
        Download_expiry_days = download_expiry_days;
    }




    public String getParent() {
        return Parent;
    }




    public void setParent(String parent) {
        Parent = parent;
    }




    public String getGrouped_products() {
        return Grouped_products;
    }




    public void setGrouped_products(String grouped_products) {
        Grouped_products = grouped_products;
    }




    public String getUpsells() {
        return Upsells;
    }




    public void setUpsells(String upsells) {
        Upsells = upsells;
    }




    public String getCross_sells() {
        return Cross_sells;
    }




    public void setCross_sells(String cross_sells) {
        Cross_sells = cross_sells;
    }




    public String getExternal_URL() {
        return External_URL;
    }




    public void setExternal_URL(String external_URL) {
        External_URL = external_URL;
    }




    public String getButton_text() {
        return Button_text;
    }




    public void setButton_text(String button_text) {
        Button_text = button_text;
    }




    public String getPosition() {
        return Position;
    }




    public void setPosition(String position) {
        Position = position;
    }




    public String getAttribute_1_name() {
        return Attribute_1_name;
    }




    public void setAttribute_1_name(String attribute_1_name) {
        Attribute_1_name = attribute_1_name;
    }




    public String getAttribute_1_value() {
        return Attribute_1_value;
    }




    public void setAttribute_1_value(String attribute_1_value) {
        Attribute_1_value = attribute_1_value;
    }




    public String getAttribute_1_visible() {
        return Attribute_1_visible;
    }




    public void setAttribute_1_visible(String attribute_1_visible) {
        Attribute_1_visible = attribute_1_visible;
    }




    public String getAttribute_1_global() {
        return Attribute_1_global;
    }




    public void setAttribute_1_global(String attribute_1_global) {
        Attribute_1_global = attribute_1_global;
    }




    public String getAttribute_2_name() {
        return Attribute_2_name;
    }




    public void setAttribute_2_name(String attribute_2_name) {
        Attribute_2_name = attribute_2_name;
    }




    public String getAttribute_2_value() {
        return Attribute_2_value;
    }




    public void setAttribute_2_value(String attribute_2_value) {
        Attribute_2_value = attribute_2_value;
    }




    public String getAttribute_2_visible() {
        return Attribute_2_visible;
    }




    public void setAttribute_2_visible(String attribute_2_visible) {
        Attribute_2_visible = attribute_2_visible;
    }




    public String getAttribute_2_global() {
        return Attribute_2_global;
    }




    public void setAttribute_2_global(String attribute_2_global) {
        Attribute_2_global = attribute_2_global;
    }




    public String get__wpcom_is_markdown() {
        return __wpcom_is_markdown;
    }




    public void set__wpcom_is_markdown(String __wpcom_is_markdown) {
        this.__wpcom_is_markdown = __wpcom_is_markdown;
    }




    public String getDownload_1_name() {
        return Download_1_name;
    }




    public void setDownload_1_name(String download_1_name) {
        Download_1_name = download_1_name;
    }




    public String getDownload_1_URL() {
        return Download_1_URL;
    }




    public void setDownload_1_URL(String download_1_URL) {
        Download_1_URL = download_1_URL;
    }




    public String getDownload_2_name() {
        return Download_2_name;
    }




    public void setDownload_2_name(String download_2_name) {
        Download_2_name = download_2_name;
    }




    public String getDownload_2_UR() {
        return Download_2_UR;
    }




    public void setDownload_2_UR(String download_2_UR) {
        Download_2_UR = download_2_UR;
    }




    public String getCompany() {
        return company;
    }




    public void setCompany(String company) {
        this.company = company;
    }




    public String getStatus() {
        return status;
    }




    public void setStatus(String status) {
        this.status = status;
    }




    public String getInstance_name() {
        return instance_name;
    }




    public void setInstance_name(String instance_name) {
        this.instance_name = instance_name;
    }



  
}

