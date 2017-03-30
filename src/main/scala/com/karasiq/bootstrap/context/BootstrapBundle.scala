package com.karasiq.bootstrap.context

import com.karasiq.bootstrap.alert.Alerts
import com.karasiq.bootstrap.buttons.Buttons
import com.karasiq.bootstrap.carousel.Carousels
import com.karasiq.bootstrap.collapse.Collapses
import com.karasiq.bootstrap.components.BootstrapComponents
import com.karasiq.bootstrap.dropdown.Dropdowns
import com.karasiq.bootstrap.form.Forms
import com.karasiq.bootstrap.grid.Grids
import com.karasiq.bootstrap.icons.Icons
import com.karasiq.bootstrap.modal.Modals
import com.karasiq.bootstrap.navbar.NavigationBars
import com.karasiq.bootstrap.panel.Panels
import com.karasiq.bootstrap.popover.Popovers
import com.karasiq.bootstrap.progressbar.ProgressBars
import com.karasiq.bootstrap.table.{PagedTables, Tables}
import com.karasiq.bootstrap.tooltip.Tooltips
import com.karasiq.bootstrap.utils.{ClassModifiers, Utils}

import scala.language.postfixOps

trait BootstrapBundle extends RenderingContext with BootstrapComponents with ClassModifiers with Alerts with Buttons
  with Carousels with Collapses with Dropdowns with Forms with Grids with Icons with Modals
  with NavigationBars with Panels with Popovers with ProgressBars with Tables with PagedTables with Tooltips with Utils {
}
