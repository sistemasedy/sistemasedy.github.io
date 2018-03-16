   private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMousePressed
        // TODO add your handling code here:
          if(evt.getClickCount()==2){
            int fila= tablalistado.getSelectedRow();
            
            String cod;
            String valor;
            String valor2;
            String valor3;
            
            cod=tablalistado.getValueAt(fila, 0).toString();
            valor=tablalistado.getValueAt(fila, 4).toString();
            valor2=tablalistado.getValueAt(fila, 9).toString();
            valor3=tablalistado.getValueAt(fila, 11).toString();
            frmdetalle_positivo.txtidarticulo.setText(cod);
            frmdetalle_positivo.txtarticulo.setText(valor);
            frmdetalle_positivo.txtstock.setText(valor2);
            frmdetalle_positivo.txtprecio_venta.setText(valor3);
            
            this.setVisible(false);
        }
        
        
        
    }//GEN-LAST:event_tablalistadoMousePressed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        // TODO add your handling code here:
        char oTeclaPresionada=evt.getKeyChar();
        
        if(oTeclaPresionada==KeyEvent.VK_ENTER){
            btnbuscar.doClick();
            txtbuscar.transferFocus();
            btnbuscar.transferFocus();
            btnsalir.transferFocus();
            //tablalistado.transferFocus();
            
        }
        
        
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void tablalistadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablalistadoKeyTyped
        // TODO add your handling code here:
        char oTeclaPresionada=evt.getKeyChar();
        
        if(oTeclaPresionada==KeyEvent.VK_ENTER){
            int fila= tablalistado.getSelectedRow();
            
            String cod;
            String valor;
            String valor2;
            String valor3;
            
            cod=tablalistado.getValueAt(fila, 0).toString();
            valor=tablalistado.getValueAt(fila, 4).toString();
            valor2=tablalistado.getValueAt(fila, 9).toString();
            valor3=tablalistado.getValueAt(fila, 11).toString();
            frmdetalle_positivo.txtidarticulo.setText(cod);
            frmdetalle_positivo.txtarticulo.setText(valor);
            frmdetalle_positivo.txtstock.setText(valor2);
            frmdetalle_positivo.txtprecio_venta.setText(valor3);
            
            this.setVisible(false);
            
        
        }
    }//GEN-LAST:event_tablalistadoKeyTyped