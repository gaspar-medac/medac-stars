package medac.stars.model; 
 
/** 
 * Clase que representa una arena en el sistema. 
 * Una arena tiene un nombre, una descripción, una imagen, y puede tener barreras y cuenta regresiva. 
 *  
 * @autor gaspar 
 */ 
public class Arena { 
 
    private String name;         // Nombre de la arena 
    private boolean countdown;   // Indica si la arena tiene cuenta regresiva 
    private String description;  // Descripción de la arena 
    private String image;        // Imagen de la arena 
    private int barriers;        // Número de barreras en la arena 
 
    /** 
     * Constructor que inicializa los datos de la arena. 
     * 
     * @param name        Nombre de la arena 
     * @param countdown   Indica si la arena tiene cuenta regresiva 
     * @param description Descripción de la arena 
     * @param image       Imagen de la arena 
     * @param barriers    Número de barreras en la arena 
     */ 
    public Arena(String name, boolean countdown, String description, String image, int barriers) { 
        this.name = name; 
        this.countdown = countdown; 
        this.description = description; 
        this.image = image; 
        this.barriers = barriers; 
    } 
 
    /** 
     * Obtener el nombre de la arena. 
     * 
     * @return Nombre de la arena 
     */ 
    public String getName() { 
        return name; 
    } 
 
    /** 
     * Establecer el nombre de la arena. 
     * 
     * @param name Nombre de la arena 
     */ 
    public void setName(String name) { 
        this.name = name; 
    } 
 
    /** 
     * Indica si la arena tiene cuenta regresiva. 
     * 
     * @return true si la arena tiene cuenta regresiva, false en caso contrario 
     */ 
    public boolean isCountdown() { 
        return countdown; 
    } 
 
    /** 
     * Establecer si la arena tiene cuenta regresiva. 
     * 
     * @param countdown true si la arena tiene cuenta regresiva, false en caso contrario 
     */ 
    public void setCountdown(boolean countdown) { 
        this.countdown = countdown; 
    } 
 
    /** 
     * Obtener la descripción de la arena. 
     * 
     * @return Descripción de la arena 
     */ 
    public String getDescription() { 
        return description; 
    } 
 
    /** 
     * Establecer la descripción de la arena. 
     * 
     * @param description Descripción de la arena 
     */ 
    public void setDescription(String description) { 
        this.description = description; 
    } 
 
    /** 
     * Obtener la imagen de la arena. 
     * 
     * @return Imagen de la arena 
     */ 
    public String getImage() { 
        return image; 
    } 
 
    /** 
     * Establecer la imagen de la arena. 
     * 
     * @param image Imagen de la arena 
     */ 
    public void setImage(String image) { 
        this.image = image; 
    } 
 
    /** 
     * Obtener el número de barreras en la arena. 
     * 
     * @return Número de barreras en la arena 
     */ 
    public int getBarriers() { 
        return barriers; 
    } 
 
    /** 
     * Establecer el número de barreras en la arena. 
     * 
     * @param barriers Número de barreras en la arena 
     */ 
    public void setBarriers(int barriers) { 
        this.barriers = barriers; 
    } 
} 